/**
 * Surge Panel Script: IPv6 出口检测
 * ─────────────────────────────────
 * 通过当前活跃代理请求双栈 API，实时显示出口 IP 及是否走 IPv6。
 *
 * 配置项（修改下方 CONFIG）：
 *   POLICY - 指定用哪个策略组发出检测请求。
 *            留空 "" 则跟随 Surge 当前默认策略。
 *            例：'🚀 节点选择'、'Proxy' 等
 */

const CONFIG = {
  POLICY: '',   // ← 填入你的策略组名，例如 '🚀 节点选择'
};

// 检测端点列表（按优先级依次尝试）
const ENDPOINTS = [
  { url: 'https://api64.ipify.org?format=json',  parse: b => JSON.parse(b).ip },
  { url: 'https://4or6.com/which.php',            parse: b => b.trim() },
  { url: 'https://ip.me',                         parse: b => b.trim().split('\n')[0] },
];

function isIPv6(ip) {
  return typeof ip === 'string' && ip.includes(':');
}

function request(endpoint) {
  return new Promise((resolve, reject) => {
    const opts = {
      url: endpoint.url,
      timeout: 8,
    };
    if (CONFIG.POLICY) opts.policy = CONFIG.POLICY;

    $httpClient.get(opts, (err, _resp, body) => {
      if (err) return reject(err);
      try {
        resolve(endpoint.parse(body));
      } catch {
        reject(new Error('parse failed'));
      }
    });
  });
}

async function check() {
  for (const ep of ENDPOINTS) {
    try {
      const ip = await request(ep);
      if (ip && ip.length > 0) return ip;
    } catch {
      // 继续尝试下一个端点
    }
  }
  return null;
}

(async () => {
  const policyLabel = CONFIG.POLICY ? `策略: ${CONFIG.POLICY}` : '当前策略';

  try {
    const ip = await check();

    if (!ip) {
      $done({
        title: 'IPv6 出口检测',
        content: `❌ 所有端点均不可达\n${policyLabel}`,
        icon: 'wifi.slash',
        'icon-color': '#FF3B30',
      });
      return;
    }

    const v6 = isIPv6(ip);
    $done({
      title: 'IPv6 出口检测',
      content: v6
        ? `✅ IPv6 出口\n${ip}\n${policyLabel}`
        : `⚠️  IPv4 出口\n${ip}\n${policyLabel}`,
      icon: v6 ? 'network' : 'network.slash',
      'icon-color': v6 ? '#34C759' : '#FF9500',
    });
  } catch (e) {
    $done({
      title: 'IPv6 出口检测',
      content: `❌ 检测出错\n${e.message || e}`,
      icon: 'exclamationmark.triangle',
      'icon-color': '#FF3B30',
    });
  }
})();
