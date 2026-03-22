// Sub-Store Script Operator
// 功能：通过 DNS-over-HTTPS 检测节点服务器是否有 AAAA 记录
// 有 AAAA 记录 → 打 [IPv6] 标签；无则过滤或保留原名

async function operator(proxies) {
  const DOH_URL = 'https://1.1.1.1/dns-query';

  async function hasAAAA(hostname) {
    // 如果本身就是 IPv6 地址，直接返回 true
    if (/^[\da-fA-F:]+$/.test(hostname)) return true;
    // IPv4 直接返回 false
    if (/^\d+\.\d+\.\d+\.\d+$/.test(hostname)) return false;

    try {
      const resp = await $httpClient.get({
        url: `${DOH_URL}?name=${hostname}&type=AAAA`,
        headers: { 'Accept': 'application/dns-json' },
        timeout: 5000,
      });
      const data = JSON.parse(resp.body);
      return Array.isArray(data.Answer) && data.Answer.some(r => r.type === 28);
    } catch {
      return false;
    }
  }

  const results = await Promise.all(
    proxies.map(async (proxy) => {
      const server = proxy.server;
      const ipv6 = await hasAAAA(server);
      if (ipv6) {
        proxy.name = `[IPv6] ${proxy.name}`;
        // 也可以写入 tag 供后续 filter 使用
        proxy['_ipv6'] = true;
      }
      return proxy;
    })
  );

  return results;
}
