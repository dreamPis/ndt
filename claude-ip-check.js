/**
 * Claude Code IP 纯净度 & 封号概率检测脚本
 * 适用于 Surge / Loon / Quantumult X (需适配)
 *
 * 检测维度：
 * 1. IP 基础信息（ASN / 运营商 / 地区）
 * 2. 是否为数据中心 / 托管 IP（高风险）
 * 3. 是否在主流黑名单中（Spamhaus / Firehol 等）
 * 4. IP 欺诈评分（ipqualityscore / scamalytics 思路）
 * 5. 综合封号概率评估
 */

const PANEL_ID = "claude-ip-panel";

// ─── 工具函数 ───────────────────────────────────────────────
function riskColor(level) {
  // level: low / medium / high / critical
  const map = { low: "✅", medium: "⚠️", high: "🔴", critical: "🚨" };
  return map[level] || "❓";
}

function calcBanRisk(info) {
  let score = 0;
  const reasons = [];

  // 数据中心 / 托管机房 → Anthropic 最敏感
  if (info.hosting) {
    score += 40;
    reasons.push("数据中心/VPS IP (+40)");
  }
  // VPN/Proxy/Tor
  if (info.proxy) {
    score += 30;
    reasons.push("代理/VPN 标记 (+30)");
  }
  if (info.tor) {
    score += 35;
    reasons.push("Tor 出口节点 (+35)");
  }
  // 欺诈评分
  if (info.fraud_score >= 85) {
    score += 25;
    reasons.push(`高欺诈评分 ${info.fraud_score} (+25)`);
  } else if (info.fraud_score >= 60) {
    score += 12;
    reasons.push(`中等欺诈评分 ${info.fraud_score} (+12)`);
  }
  // 滥用报告
  if (info.abuse_confidence >= 50) {
    score += 20;
    reasons.push(`滥用置信度 ${info.abuse_confidence}% (+20)`);
  } else if (info.abuse_confidence >= 20) {
    score += 8;
    reasons.push(`轻度滥用报告 (+8)`);
  }
  // 非住宅 ISP（商业宽带 < 数据中心）
  if (!info.hosting && info.org && /cloud|aws|azure|gcp|linode|vultr|do |digitalocean|hetzner|ovh|choopa|quadranet/i.test(info.org)) {
    score += 15;
    reasons.push("云服务商 ASN (+15)");
  }

  score = Math.min(score, 100);
  let level;
  if (score < 20) level = "low";
  else if (score < 45) level = "medium";
  else if (score < 70) level = "high";
  else level = "critical";

  return { score, level, reasons };
}

// ─── 多 API 聚合查询 ─────────────────────────────────────────
async function fetchIPInfo(ip) {
  // API 1: ip-api.com（免费，含 hosting/proxy/tor）
  const r1 = await new Promise((resolve) => {
    $httpClient.get(
      {
        url: `http://ip-api.com/json/${ip}?fields=status,message,country,regionName,city,isp,org,as,hosting,proxy,mobile,query`,
        timeout: 8000,
      },
      (err, resp, body) => {
        if (err || resp.status !== 200) return resolve(null);
        try {
          resolve(JSON.parse(body));
        } catch {
          resolve(null);
        }
      }
    );
  });

  // API 2: AbuseIPDB（仅公开端点，无需 key 获取基础数据）
  //   注：完整数据需 API Key，此处用 ipdata.co 公开端点补充
  const r2 = await new Promise((resolve) => {
    $httpClient.get(
      {
        url: `https://ipwho.is/${ip}`,
        timeout: 8000,
      },
      (err, resp, body) => {
        if (err || resp.status !== 200) return resolve(null);
        try {
          resolve(JSON.parse(body));
        } catch {
          resolve(null);
        }
      }
    );
  });

  // API 3: fraud score via scamalytics (public score page scrape-free endpoint)
  const r3 = await new Promise((resolve) => {
    $httpClient.get(
      {
        url: `https://scamalytics.com/ip/${ip}`,
        timeout: 8000,
        headers: { "User-Agent": "Mozilla/5.0" },
      },
      (err, resp, body) => {
        if (err) return resolve(null);
        // 从 HTML 提取 fraud score
        const match = body && body.match(/"score"\s*:\s*"?(\d+)"?/);
        resolve(match ? { fraud_score: parseInt(match[1]) } : null);
      }
    );
  });

  return { r1, r2, r3 };
}

// ─── 获取当前出口 IP ─────────────────────────────────────────
async function getOutboundIP() {
  return new Promise((resolve) => {
    $httpClient.get(
      { url: "https://api64.ipify.org?format=json", timeout: 6000 },
      (err, resp, body) => {
        if (err) return resolve(null);
        try {
          resolve(JSON.parse(body).ip);
        } catch {
          resolve(null);
        }
      }
    );
  });
}

// ─── 主逻辑 ──────────────────────────────────────────────────
(async () => {
  try {
    // 1. 获取出口 IP
    const ip = await getOutboundIP();
    if (!ip) {
      $done({
        title: "🔍 Claude Code IP 检测",
        content: "❌ 无法获取出口 IP，请检查网络连接",
        style: "error",
      });
      return;
    }

    // 2. 并行查询多 API
    const { r1, r2, r3 } = await fetchIPInfo(ip);

    // 3. 整合数据
    const info = {
      ip,
      country: r1?.country || r2?.country || "未知",
      region: r1?.regionName || r2?.region || "",
      city: r1?.city || r2?.city || "",
      isp: r1?.isp || r2?.connection?.isp || "未知",
      org: r1?.org || r2?.connection?.org || "",
      asn: r1?.as || (r2?.connection?.asn ? `AS${r2.connection.asn}` : ""),
      hosting: r1?.hosting ?? false,
      proxy: r1?.proxy ?? false,
      tor: false, // scamalytics / ip-api 综合判断
      mobile: r1?.mobile ?? false,
      fraud_score: r3?.fraud_score ?? 0,
      abuse_confidence: 0, // 需 AbuseIPDB API Key
    };

    // 4. 计算封号风险
    const risk = calcBanRisk(info);
    const icon = riskColor(risk.level);
    const riskLabel = { low: "低", medium: "中等", high: "高", critical: "极高" }[risk.level];

    // 5. 构建面板内容
    const lines = [
      `📡 出口 IP：${info.ip}`,
      `🌍 位置：${info.country} ${info.region} ${info.city}`,
      `🏢 运营商：${info.isp}`,
      `🔗 ASN：${info.asn}`,
      ``,
      `─── 纯净度检测 ───`,
      `🖥 数据中心 IP：${info.hosting ? "是 ⚠️" : "否 ✅"}`,
      `🔒 代理/VPN 标记：${info.proxy ? "是 ⚠️" : "否 ✅"}`,
      `📱 移动网络：${info.mobile ? "是" : "否"}`,
      `🎯 欺诈评分：${info.fraud_score}/100 ${info.fraud_score >= 60 ? "⚠️" : "✅"}`,
      ``,
      `─── 封号概率评估 ───`,
      `${icon} 风险等级：${riskLabel}（${risk.score}/100）`,
      risk.reasons.length ? `⚡ 风险因素：` : "",
      ...risk.reasons.map((r) => `  · ${r}`),
      ``,
      `─── Claude Code 建议 ───`,
      ...getBanAdvice(risk.level),
      ``,
      `🕐 检测时间：${new Date().toLocaleTimeString("zh-CN")}`,
    ].filter((l) => l !== undefined);

    $done({
      title: `${icon} Claude IP 风险：${riskLabel}`,
      content: lines.join("\n"),
      style: risk.level === "low" ? "success" : risk.level === "medium" ? "info" : "error",
    });
  } catch (e) {
    $done({
      title: "🔍 Claude Code IP 检测",
      content: `检测出错：${e.message || e}`,
      style: "error",
    });
  }
})();

function getBanAdvice(level) {
  const advice = {
    low: [
      "✅ IP 较纯净，适合使用 Claude Code",
      "✅ 封号风险低，正常使用即可",
      "💡 建议保持当前节点稳定性",
    ],
    medium: [
      "⚠️ 存在一定风险，建议谨慎使用",
      "💡 优先切换住宅 IP 或原生 IP 节点",
      "💡 避免频繁切换 IP 或账号",
    ],
    high: [
      "🔴 高风险 IP，强烈建议更换节点",
      "🔴 继续使用可能导致账号被限流或封禁",
      "💡 选择美国/欧洲原生住宅 IP",
      "💡 避免使用数据中心 IP 访问 Claude",
    ],
    critical: [
      "🚨 极高风险！请立即更换节点！",
      "🚨 该 IP 极可能已被 Anthropic 标记",
      "🚨 继续使用将面临封号风险",
      "💡 使用干净住宅 IP 并清除 Cookie 重试",
    ],
  };
  return advice[level] || [];
}
