/**
 * Sub-Store Script Operator
 * 功能：通过 DNS-over-HTTPS (Cloudflare / Google 双通道) 检测节点服务端是否具备 IPv6 (AAAA 记录)
 *
 * 使用方法：
 *   Sub-Store → 订阅 → 脚本操作符 → 类型选 "Script Operator" → 粘贴此文件内容
 *
 * 行为说明：
 *   - 检测到 AAAA 记录 → 节点名前缀加 [IPv6]，并写入内部属性 _ipv6: true
 *   - 未检测到          → 节点保持不变（如需过滤，搭配 ipv6-filter.js 使用）
 *   - 节点 server 本身是 IPv6 地址 → 直接视为支持
 *   - 节点 server 本身是 IPv4 地址 → 直接视为不支持（跳过 DNS 查询）
 *
 * 可调参数（见下方 CONFIG）：
 *   PREFIX        节点名前缀，默认 [IPv6]
 *   CONCURRENCY   并发请求数，过高会被 DoH 限速，建议 5~10
 *   TIMEOUT_MS    单次请求超时（毫秒）
 *   SKIP_TAGGED   true = 已有前缀的节点跳过重复检测
 */

const CONFIG = {
  PREFIX: '[IPv6] ',
  CONCURRENCY: 8,
  TIMEOUT_MS: 6000,
  SKIP_TAGGED: true,

  // DoH 端点，按顺序尝试，第一个失败自动 fallback
  DOH_ENDPOINTS: [
    'https://1.1.1.1/dns-query',   // Cloudflare
    'https://8.8.8.8/resolve',     // Google
  ],
};

// ─── 工具函数 ──────────────────────────────────────────────

const isIPv6Address = (s) => /^[\da-fA-F:]+$/.test(s);
const isIPv4Address = (s) => /^\d{1,3}(\.\d{1,3}){3}$/.test(s);

function httpGet(options) {
  return new Promise((resolve, reject) => {
    $httpClient.get(options, (err, _resp, body) => {
      if (err) return reject(err);
      resolve(body);
    });
  });
}

async function queryAAAA(hostname, endpoint) {
  const url = `${endpoint}?name=${encodeURIComponent(hostname)}&type=AAAA`;
  const body = await httpGet({
    url,
    headers: { Accept: 'application/dns-json' },
    timeout: CONFIG.TIMEOUT_MS,
  });
  const data = JSON.parse(body);
  // type 28 = AAAA
  return Array.isArray(data.Answer) && data.Answer.some((r) => r.type === 28);
}

async function hasAAAARecord(hostname) {
  if (isIPv6Address(hostname)) return true;
  if (isIPv4Address(hostname)) return false;

  for (const endpoint of CONFIG.DOH_ENDPOINTS) {
    try {
      return await queryAAAA(hostname, endpoint);
    } catch (_) {
      // fallback to next endpoint
    }
  }
  // 所有端点均失败，保守处理：视为不支持
  return false;
}

// 并发控制：每次最多 CONCURRENCY 个请求同时飞
async function pMap(arr, fn, concurrency) {
  const results = new Array(arr.length);
  let idx = 0;

  async function worker() {
    while (idx < arr.length) {
      const i = idx++;
      results[i] = await fn(arr[i], i);
    }
  }

  const workers = Array.from({ length: Math.min(concurrency, arr.length) }, worker);
  await Promise.all(workers);
  return results;
}

// ─── 主逻辑 ───────────────────────────────────────────────

async function operator(proxies) {
  const results = await pMap(
    proxies,
    async (proxy) => {
      // 跳过已打标签的节点
      if (CONFIG.SKIP_TAGGED && proxy.name.startsWith(CONFIG.PREFIX)) {
        proxy._ipv6 = true;
        return proxy;
      }

      const ipv6 = await hasAAAARecord(proxy.server);
      if (ipv6) {
        proxy.name = `${CONFIG.PREFIX}${proxy.name}`;
        proxy._ipv6 = true;
      } else {
        proxy._ipv6 = false;
      }
      return proxy;
    },
    CONFIG.CONCURRENCY
  );

  const total = results.length;
  const v6Count = results.filter((p) => p._ipv6).length;
  console.log(`[IPv6 Operator] 检测完成：${v6Count} / ${total} 个节点支持 IPv6`);

  return results;
}
