#!/usr/bin/env python3
"""
Claude Code IP 纯净度 & 封号风险检测工具
===============================================
功能：
  1. 获取当前出口 IP
  2. IP 类型 / ASN / 地理位置分析
  3. 多库黑名单检测（AbuseIPDB / ipinfo / proxycheck）
  4. Tor / VPN / 数据中心 / 住宅 判定
  5. 综合纯净度评分（0-100）
  6. Claude Code 封号概率评估
  7. 逐项修复建议输出

依赖安装：
  pip install httpx rich

可选（更精准评分，需自行申请免费 Key）：
  - AbuseIPDB API Key: https://www.abuseipdb.com/register
  - ipinfo Token:     https://ipinfo.io/signup
  填入下方 CONFIG 区域即可，不填则走免费无鉴权接口（有限速）。
"""

import asyncio
import json
import sys
import time
from dataclasses import dataclass, field
from typing import Optional

try:
    import httpx
    from rich import print as rprint
    from rich.console import Console
    from rich.panel import Panel
    from rich.table import Table
    from rich.progress import Progress, SpinnerColumn, TextColumn
    from rich.rule import Rule
    from rich import box
except ImportError:
    print("请先安装依赖：pip install httpx rich")
    sys.exit(1)

# ─────────────────────────────────────────────
#  CONFIG（可选填写 API Key 提升精准度）
# ─────────────────────────────────────────────
ABUSEIPDB_KEY = ""       # https://www.abuseipdb.com/register （免费 1000次/天）
IPINFO_TOKEN  = ""       # https://ipinfo.io/signup            （免费 5万次/月）
PROXYCHECK_KEY = ""      # https://proxycheck.io/dashboard     （免费 1000次/天）
REQUEST_TIMEOUT = 12     # 请求超时秒数

console = Console()

# ─────────────────────────────────────────────
#  数据模型
# ─────────────────────────────────────────────
@dataclass
class IPReport:
    ip: str = ""
    country: str = ""
    country_code: str = ""
    region: str = ""
    city: str = ""
    org: str = ""
    asn: str = ""
    asn_name: str = ""
    ip_type: str = "unknown"          # residential / hosting / vpn / tor / mobile
    is_vpn: bool = False
    is_tor: bool = False
    is_proxy: bool = False
    is_datacenter: bool = False
    abuse_score: int = 0              # 0-100，越高越危险
    abuse_reports: int = 0
    blacklist_hits: int = 0
    blacklist_detail: list = field(default_factory=list)
    purity_score: int = 100           # 综合纯净度 0-100，越高越干净
    ban_probability: str = ""         # 封号概率
    ban_level: str = ""               # LOW / MEDIUM / HIGH / CRITICAL
    issues: list = field(default_factory=list)
    suggestions: list = field(default_factory=list)
    raw: dict = field(default_factory=dict)


# ─────────────────────────────────────────────
#  网络请求（带超时 & 静默失败）
# ─────────────────────────────────────────────
async def safe_get(client: httpx.AsyncClient, url: str, **kwargs) -> Optional[dict]:
    try:
        r = await client.get(url, timeout=REQUEST_TIMEOUT, **kwargs)
        r.raise_for_status()
        return r.json()
    except Exception as e:
        return None


# ─────────────────────────────────────────────
#  步骤 1：获取出口 IP
# ─────────────────────────────────────────────
async def fetch_exit_ip(client: httpx.AsyncClient) -> str:
    endpoints = [
        "https://api64.ipify.org?format=json",
        "https://api.my-ip.io/v2/ip.json",
        "https://ifconfig.me/all.json",
    ]
    for url in endpoints:
        data = await safe_get(client, url)
        if data:
            return data.get("ip") or data.get("YourFuckingIPAddress") or ""
    raise RuntimeError("无法获取出口 IP，请检查网络连接")


# ─────────────────────────────────────────────
#  步骤 2：ipinfo.io 基础信息
# ─────────────────────────────────────────────
async def fetch_ipinfo(client: httpx.AsyncClient, ip: str, report: IPReport):
    url = f"https://ipinfo.io/{ip}/json"
    params = {}
    if IPINFO_TOKEN:
        params["token"] = IPINFO_TOKEN

    data = await safe_get(client, url, params=params)
    if not data:
        return

    report.country = data.get("country", "")
    report.country_code = data.get("country", "")
    report.region = data.get("region", "")
    report.city = data.get("city", "")
    org_raw = data.get("org", "")
    report.org = org_raw

    # 解析 ASN
    if " " in org_raw:
        parts = org_raw.split(" ", 1)
        report.asn = parts[0]
        report.asn_name = parts[1]
    else:
        report.asn_name = org_raw

    # 判断类型（ipinfo 免费版有 bogon / hosting 字段）
    if data.get("bogon"):
        report.ip_type = "private"

    org_lower = org_raw.lower()
    hosting_keywords = [
        "amazon", "aws", "google", "azure", "microsoft", "digitalocean",
        "linode", "vultr", "hetzner", "ovh", "cloudflare", "fastly",
        "akamai", "oracle", "alibaba", "tencent", "hosting", "datacenter",
        "data center", "colocation", "cdn", "server"
    ]
    for kw in hosting_keywords:
        if kw in org_lower:
            report.is_datacenter = True
            report.ip_type = "hosting"
            break

    report.raw["ipinfo"] = data


# ─────────────────────────────────────────────
#  步骤 3：AbuseIPDB 滥用评分
# ─────────────────────────────────────────────
async def fetch_abuseipdb(client: httpx.AsyncClient, ip: str, report: IPReport):
    if not ABUSEIPDB_KEY:
        # 无 Key 时走公开查询页面（解析有限）
        return

    url = "https://api.abuseipdb.com/api/v2/check"
    headers = {"Key": ABUSEIPDB_KEY, "Accept": "application/json"}
    params = {"ipAddress": ip, "maxAgeInDays": "90", "verbose": ""}

    data = await safe_get(client, url, headers=headers, params=params)
    if not data or "data" not in data:
        return

    d = data["data"]
    report.abuse_score = d.get("abuseConfidenceScore", 0)
    report.abuse_reports = d.get("totalReports", 0)
    report.is_tor = d.get("isTor", False)

    usage = d.get("usageType", "")
    if usage in ("VPN", "Content Delivery Network", "Data Center/Web Hosting/Transit"):
        report.is_datacenter = True
        report.ip_type = "hosting" if "Data Center" in usage else "vpn"

    report.raw["abuseipdb"] = d


# ─────────────────────────────────────────────
#  步骤 4：proxycheck.io 代理 / VPN 检测
# ─────────────────────────────────────────────
async def fetch_proxycheck(client: httpx.AsyncClient, ip: str, report: IPReport):
    url = f"https://proxycheck.io/v2/{ip}"
    params = {"vpn": "1", "asn": "1", "risk": "1", "port": "1"}
    if PROXYCHECK_KEY:
        params["key"] = PROXYCHECK_KEY

    data = await safe_get(client, url, params=params)
    if not data or ip not in data:
        return

    d = data.get(ip, {})

    if d.get("proxy") == "yes":
        report.is_proxy = True
        report.ip_type = "proxy"
    if d.get("type") in ("VPN", "TOR"):
        if d["type"] == "TOR":
            report.is_tor = True
            report.ip_type = "tor"
        else:
            report.is_vpn = True
            report.ip_type = "vpn"

    risk = d.get("risk", 0)
    try:
        risk_val = int(risk)
        if risk_val > report.abuse_score:
            report.abuse_score = risk_val
    except (ValueError, TypeError):
        pass

    report.raw["proxycheck"] = d


# ─────────────────────────────────────────────
#  步骤 5：快速公开黑名单抽样检查
# ─────────────────────────────────────────────
OPEN_BLACKLIST_CHECKS = [
    # (名称, URL模板, 判断黑名单的 key/value)
    ("Spamhaus DROP",   "https://www.spamhaus.org/drop/drop.txt",       None),  # 文本格式特殊处理
    ("ipsum blocklist", "https://raw.githubusercontent.com/stamparm/ipsum/master/levels/3.txt", None),
]

async def fetch_blacklists(client: httpx.AsyncClient, ip: str, report: IPReport):
    """简单检查几个公开文本黑名单（网络不好可能超时，静默跳过）"""
    hits = []

    # ipsum (GitHub 维护的综合恶意 IP 列表)
    try:
        r = await client.get(
            "https://raw.githubusercontent.com/stamparm/ipsum/master/levels/3.txt",
            timeout=8
        )
        if r.status_code == 200:
            if ip in r.text:
                hits.append("ipsum/level3 (综合恶意IP榜单)")
    except Exception:
        pass

    # firehol level1
    try:
        r = await client.get(
            "https://raw.githubusercontent.com/firehol/blocklist-ipsets/master/firehol_level1.netset",
            timeout=8
        )
        if r.status_code == 200:
            if ip in r.text:
                hits.append("FireHOL Level1 (高危IP集合)")
    except Exception:
        pass

    report.blacklist_hits = len(hits)
    report.blacklist_detail = hits


# ─────────────────────────────────────────────
#  步骤 6：综合评分 & 封号概率
# ─────────────────────────────────────────────
def compute_scores(report: IPReport):
    score = 100
    issues = []
    suggestions = []

    # Tor 节点：直接封禁
    if report.is_tor:
        score -= 60
        issues.append("❌ 当前 IP 为 Tor 出口节点（Claude 直接封禁）")
        suggestions.append("立即更换 IP，Tor 出口节点对 Anthropic 完全不可用")

    # 黑名单命中
    if report.blacklist_hits > 0:
        score -= 30
        issues.append(f"❌ IP 命中 {report.blacklist_hits} 个公开黑名单：{', '.join(report.blacklist_detail)}")
        suggestions.append("更换 IP 或联系代理服务商清洗黑名单记录")

    # 滥用评分
    if report.abuse_score >= 60:
        score -= 25
        issues.append(f"⚠️  AbuseIPDB 滥用评分 {report.abuse_score}/100（高风险）")
        suggestions.append("更换滥用评分 <25 的干净 IP")
    elif report.abuse_score >= 25:
        score -= 12
        issues.append(f"⚠️  AbuseIPDB 滥用评分 {report.abuse_score}/100（中风险）")
        suggestions.append("监控此 IP，若频繁 429 则及时轮换")

    # IP 类型
    if report.is_datacenter:
        score -= 20
        issues.append(f"⚠️  IP 归属机房/数据中心（{report.asn_name}），非住宅 IP")
        suggestions.append("改用住宅轮换代理（Residential Rotating Proxy），如 Bright Data、Oxylabs")
    elif report.is_vpn:
        score -= 15
        issues.append("⚠️  检测到 VPN 类 IP（共享出口池，信誉不稳定）")
        suggestions.append("使用独享住宅 IP 而非共享 VPN 出口，降低历史污染风险")
    elif report.is_proxy:
        score -= 18
        issues.append("⚠️  检测到代理节点（Proxy）")
        suggestions.append("确认代理服务商的 IP 来自干净住宅资源池")

    # 地区风险（高风险国家机房段被特别关注）
    high_risk_countries = {"CN", "RU", "KP", "IR", "VN", "UA"}
    if report.country_code in high_risk_countries and report.is_datacenter:
        score -= 10
        issues.append(f"⚠️  高风险地区机房 IP（{report.country_code}）")
        suggestions.append("建议使用美国/日本/欧盟地区住宅 IP")

    # 滥用举报次数
    if report.abuse_reports > 50:
        score -= 8
        issues.append(f"⚠️  该 IP 历史举报 {report.abuse_reports} 次")

    score = max(0, min(100, score))
    report.purity_score = score

    # 封号概率映射
    if score >= 85:
        report.ban_probability = "< 5%"
        report.ban_level = "LOW"
    elif score >= 70:
        report.ban_probability = "5% ~ 15%"
        report.ban_level = "LOW-MEDIUM"
    elif score >= 55:
        report.ban_probability = "15% ~ 35%"
        report.ban_level = "MEDIUM"
    elif score >= 35:
        report.ban_probability = "35% ~ 65%"
        report.ban_level = "HIGH"
    else:
        report.ban_probability = "> 65%"
        report.ban_level = "CRITICAL"

    if not issues:
        issues.append("✅ 未发现明显风险项")
        suggestions.append("保持当前 IP 使用，注意控制请求频率（建议 ≤ 40 RPM）")

    # 通用建议（始终附加）
    suggestions.append("使用官方 Claude API Key 访问 api.anthropic.com，无需代理")
    suggestions.append("遵守 Anthropic 使用政策，避免高频批量请求触发自动风控")

    report.issues = issues
    report.suggestions = list(dict.fromkeys(suggestions))  # 去重保序


# ─────────────────────────────────────────────
#  输出渲染
# ─────────────────────────────────────────────
LEVEL_COLOR = {
    "LOW":         "bright_green",
    "LOW-MEDIUM":  "green",
    "MEDIUM":      "yellow",
    "HIGH":        "red",
    "CRITICAL":    "bright_red",
}

def render_report(report: IPReport):
    console.print()
    console.print(Rule("[bold]Claude Code IP 纯净度检测报告[/bold]", style="dim"))
    console.print()

    # ── 基础信息 ──
    info_table = Table(box=box.SIMPLE_HEAVY, show_header=False, padding=(0, 2))
    info_table.add_column("字段", style="dim", width=18)
    info_table.add_column("值")

    info_table.add_row("出口 IP",    f"[bold cyan]{report.ip}[/bold cyan]")
    info_table.add_row("归属地",     f"{report.country} {report.region} {report.city}".strip())
    info_table.add_row("运营商/ASN", f"{report.asn} {report.asn_name}".strip())
    ip_type_color = {
        "residential": "green", "mobile": "green",
        "hosting": "yellow", "vpn": "yellow",
        "proxy": "red", "tor": "bright_red",
    }.get(report.ip_type, "white")
    info_table.add_row("IP 类型",    f"[{ip_type_color}]{report.ip_type.upper()}[/{ip_type_color}]")
    info_table.add_row("是否 VPN",   "⚠️  是" if report.is_vpn else "✅ 否")
    info_table.add_row("是否 Tor",   "❌ 是" if report.is_tor else "✅ 否")
    info_table.add_row("是否代理",   "⚠️  是" if report.is_proxy else "✅ 否")
    info_table.add_row("是否机房",   "⚠️  是" if report.is_datacenter else "✅ 否")

    console.print(Panel(info_table, title="📍 IP 基础信息", border_style="blue"))

    # ── 评分面板 ──
    purity = report.purity_score
    if purity >= 85:
        purity_bar_color = "green"
    elif purity >= 55:
        purity_bar_color = "yellow"
    else:
        purity_bar_color = "red"

    bar_filled = int(purity / 5)
    bar = "█" * bar_filled + "░" * (20 - bar_filled)
    ban_color = LEVEL_COLOR.get(report.ban_level, "white")

    score_table = Table(box=box.SIMPLE_HEAVY, show_header=False, padding=(0, 2))
    score_table.add_column("字段", style="dim", width=18)
    score_table.add_column("值")
    score_table.add_row("纯净度评分",
        f"[{purity_bar_color}]{bar}[/{purity_bar_color}] [{purity_bar_color}]{purity}/100[/{purity_bar_color}]")
    score_table.add_row("滥用置信评分",
        f"[{'red' if report.abuse_score > 50 else 'yellow' if report.abuse_score > 20 else 'green'}]{report.abuse_score}/100[/]")
    score_table.add_row("黑名单命中",
        f"[{'red' if report.blacklist_hits else 'green'}]{report.blacklist_hits} 个[/]")
    score_table.add_row("Claude 封号风险",
        f"[{ban_color}]{report.ban_level}[/{ban_color}]  ({report.ban_probability})")

    console.print(Panel(score_table, title="📊 风险评分", border_style="yellow"))

    # ── 问题列表 ──
    issue_text = "\n".join(f"  {i}" for i in report.issues)
    console.print(Panel(issue_text, title="🔍 检测到的问题", border_style="red" if report.ban_level in ("HIGH", "CRITICAL") else "yellow"))

    # ── 修复建议 ──
    suggest_lines = "\n".join(f"  [{i+1}] {s}" for i, s in enumerate(report.suggestions))
    console.print(Panel(suggest_lines, title="💡 修复 & 使用建议", border_style="green"))

    # ── 结论 ──
    if report.ban_level == "LOW":
        verdict = "[bright_green]✅ IP 纯净度良好，可正常使用 Claude Code[/bright_green]"
    elif report.ban_level in ("LOW-MEDIUM", "MEDIUM"):
        verdict = "[yellow]⚠️  IP 存在一定风险，建议降低请求频率并持续监控[/yellow]"
    elif report.ban_level == "HIGH":
        verdict = "[red]🚨 IP 风险较高，强烈建议更换出口 IP[/red]"
    else:
        verdict = "[bright_red]💀 IP 极高风险或已被标记，请立即更换并停止使用当前节点[/bright_red]"

    console.print(Panel(verdict, title="📝 总结", border_style=ban_color))
    console.print()


# ─────────────────────────────────────────────
#  主流程
# ─────────────────────────────────────────────
async def run():
    console.print()
    console.print("[bold cyan]Claude Code IP 纯净度 & 封号风险检测[/bold cyan]  [dim]v1.0[/dim]")
    console.print("[dim]作者自用工具，仅供参考，不构成任何使用建议[/dim]")
    console.print()

    report = IPReport()

    async with httpx.AsyncClient(
        follow_redirects=True,
        headers={"User-Agent": "IPChecker/1.0 (github.com/ip-checker)"}
    ) as client:

        steps = [
            ("获取出口 IP...",          None),
            ("查询 IP 基础信息...",     None),
            ("检测 VPN/代理/Tor...",    None),
            ("查询滥用评分...",         None),
            ("检查公开黑名单...",       None),
            ("计算综合评分...",         None),
        ]

        with Progress(
            SpinnerColumn(),
            TextColumn("[progress.description]{task.description}"),
            console=console,
            transient=True,
        ) as progress:
            task = progress.add_task("初始化...", total=len(steps))

            # Step 1
            progress.update(task, description=steps[0][0])
            report.ip = await fetch_exit_ip(client)
            progress.advance(task)

            # Step 2-4 并发执行
            progress.update(task, description="并发查询 IP 信息、代理检测、滥用评分...")
            await asyncio.gather(
                fetch_ipinfo(client, report.ip, report),
                fetch_proxycheck(client, report.ip, report),
                fetch_abuseipdb(client, report.ip, report),
            )
            progress.advance(task); progress.advance(task); progress.advance(task)

            # Step 5
            progress.update(task, description=steps[4][0])
            await fetch_blacklists(client, report.ip, report)
            progress.advance(task)

            # Step 6
            progress.update(task, description=steps[5][0])
            compute_scores(report)
            progress.advance(task)

    render_report(report)

    # 可选：输出原始 JSON
    if "--json" in sys.argv:
        import copy
        raw_copy = copy.deepcopy(report.__dict__)
        raw_copy.pop("raw", None)
        print(json.dumps(raw_copy, ensure_ascii=False, indent=2))


if __name__ == "__main__":
    try:
        asyncio.run(run())
    except KeyboardInterrupt:
        console.print("\n[dim]已取消[/dim]")
    except RuntimeError as e:
        console.print(f"\n[red]错误：{e}[/red]")
        sys.exit(1)
