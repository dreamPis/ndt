/**
 * Sub-Store Script Operator: IPv6 AAAA 检测
 * ─────────────────────────────────────────
 * 通过 DNS-over-HTTPS 查询每个节点服务器是否具备 AAAA 记录，
 * 支持 IPv6 的节点名称前加 [IPv6] 标签，并写入 _ipv6 字段供
 * 后续 Filter 使用。
 *
 * 使用方式：
 *   Sub-Store → 订阅 → 脚本操作符 → 粘贴此文件内容
 *
 * 配置项（修改下方 CONFIG）：
 *   DOH_URL      - DNS-over-HTTPS 服务地址
 *   CONCURRENCY  - 并发请求数，节点多时建议 ≤ 10
 *   TIMEOUT_MS   - 单次请求超时（毫秒）
 *   ADD_TAG      - true = 名称前加 [IPv6] 标签
 *   FILTER_ONLY  - true = 只保留支持 IPv6 的节点（配合 filter 模式用）
 */

const CONFIG = {
  DOH_URL:     'https://1.1.1.1/dns-query',  // 可换 https://8.8.8.8/resolve
  CONCURRENCY: 10,
  TIMEOUT_MS:  5000,
  ADD_TAG:     true,
  FILTER_ONLY: false,
};

// ─── HTTP 兼容层 ─────────────────────────────────────────────────
// 兼容 Surge ($httpClient) 和 Node.js (fetch) 两种运行环境
async function httpGet(url, headers = {}) {
  // Surge 环境
  if (typeof $httpClient !== 'undefined') {
    return new Promise((resolve, reject) => {
      $httpClient.get(
        { url, headers, timeout: CONFIG.TIMEOUT_MS / 1000 },
        (err, _resp, body) => (err ? reject(err) : resolve(body))
      );
    });
  }
  // Node.js / sub-store-backend 环境
  if (typeof fetch !== 'undefined') {
    const ctrl = new AbortController();
    const timer = setTimeout(() => ctrl.abort(), CONFIG.TIMEOUT_MS);
    try {
      const resp = await fetch(url, { headers, signal: ctrl.signal });
      return await resp.text();
    } finally {
      clearTimeout(timer);
    }
  }
  throw new Error('No HTTP client available');
}

// ─── DNS AAAA 查询 ────────────────────────────────────────────────
async function hasAAAA(hostname) {
  // 已经是 IPv6 地址（含冒号）
  if (/^[0-9a-fA-F:]+$/.test(hostname) && hostname.includes(':')) return true;
  // IPv4 地址直接跳过
  if (/^\d{1,3}(\.\d{1,3}){3}$/.test(hostname)) return false;

  try {
    const body = await httpGet(
      `${CONFIG.DOH_URL}?name=${encodeURIComponent(hostname)}&type=AAAA`,
      { Accept: 'application/dns-json' }
    );
    const data = JSON.parse(body);
    // type=28 即 AAAA 记录
    return Array.isArray(data.Answer) && data.Answer.some(r => r.type === 28);
  } catch {
    return false;
  }
}

// ─── 并发控制 ─────────────────────────────────────────────────────
async function pLimit(tasks, concurrency) {
  const results = new Array(tasks.length);
  let idx = 0;
  async function worker() {
    while (idx < tasks.length) {
      const i = idx++;
      results[i] = await tasks[i]();
    }
  }
  const workers = Array.from({ length: Math.min(concurrency, tasks.length) }, worker);
  await Promise.all(workers);
  return results;
}

// ─── 主函数 ───────────────────────────────────────────────────────
async function operator(proxies) {
  console.log(`[IPv6 Operator] 开始检测 ${proxies.length} 个节点...`);

  const tasks = proxies.map((proxy, i) => async () => {
    const ipv6 = await hasAAAA(proxy.server);
    if (ipv6) {
      if (CONFIG.ADD_TAG && !proxy.name.startsWith('[IPv6]')) {
        proxy.name = `[IPv6] ${proxy.name}`;
      }
      proxy['_ipv6'] = true;
    } else {
      proxy['_ipv6'] = false;
    }
    console.log(`[IPv6 Operator] [${i + 1}/${proxies.length}] ${proxy.server} → ${ipv6 ? '✓ AAAA' : '✗'}`);
    return proxy;
  });

  const result = await pLimit(tasks, CONFIG.CONCURRENCY);

  const count = result.filter(p => p['_ipv6']).length;
  console.log(`[IPv6 Operator] 完成：${count}/${proxies.length} 个节点支持 IPv6`);

  return CONFIG.FILTER_ONLY ? result.filter(p => p['_ipv6']) : result;
}
