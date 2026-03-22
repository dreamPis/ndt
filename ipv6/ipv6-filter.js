/**
 * Sub-Store Script Filter: 仅保留 IPv6 节点
 * ─────────────────────────────────────────
 * 配合 ipv6-operator.js 使用。
 * 在同一订阅中，先运行 Operator 打标，再运行此 Filter 过滤，
 * 即可单独输出一份只含 IPv6 节点的订阅。
 *
 * 使用方式：
 *   Sub-Store → 订阅 → 脚本过滤器 → 粘贴此文件内容
 */

async function filter(proxies) {
  return proxies.filter(p => p['_ipv6'] === true);
}
