#!/bin/bash
set -euo pipefail

# ===== 配置区（根据实际情况修改） =====
TMP_DIR="/tmp/nikki_update"
LOG_DIR="/var/log/nikki_update"
LOG_FILE="$LOG_DIR/update_$(date '+%Y-%m-%d_%H-%M-%S').log"
BACKUP_DIR="/root/nikki_backup"
VERSION_URL="https://github.com/vernesong/mihomo/releases/download/Prerelease-Alpha/version.txt"
DOWNLOAD_TEMPLATE_AMD64="https://github.com/vernesong/mihomo/releases/download/Prerelease-Alpha/mihomo-linux-amd64-compatible-%s.gz"
DOWNLOAD_TEMPLATE_ARM64="https://github.com/vernesong/mihomo/releases/download/Prerelease-Alpha/mihomo-linux-arm64-compatible-%s.gz"
TARGET_BIN="/usr/bin/mihomo"
SERVICE_NAME="nikki"   # systemd unit 名称或 init 脚本名
RETRY=3
SLEEP_BETWEEN_RETRY=3
RESTART_ATTEMPTS=3
RESTART_SLEEP=2

# ===== 准备目录 =====
mkdir -p "$TMP_DIR" "$LOG_DIR" "$BACKUP_DIR"

log() {
    echo "[$(date '+%Y-%m-%d %H:%M:%S')] $*" | tee -a "$LOG_FILE"
}

cleanup() {
    rm -rf "$TMP_DIR"
}
trap cleanup EXIT

log "开始 Nikki Smart 内核更新流程"

# ===== 获取版本号 =====
log "获取内核版本号..."
version=""
for i in $(seq 1 $RETRY); do
    version=$(wget -qO - "$VERSION_URL" || true)
    if [ -n "$version" ]; then break; fi
    log "获取版本号失败，第 $i 次，等待 ${SLEEP_BETWEEN_RETRY}s 重试..."
    sleep $SLEEP_BETWEEN_RETRY
done

if [ -z "$version" ]; then
    log "❌ 获取版本号失败，终止更新"
    exit 1
fi
version=$(echo "$version" | tr -d ' \r\n')
log "获取的版本号为: $version"

# ===== 检查本地版本号 =====
if command -v mihomo >/dev/null 2>&1; then
    local_ver=$(mihomo -v 2>/dev/null | awk '{print $3}')
    log "检测到本地 Mihomo 版本: $local_ver"
    if [ "$local_ver" = "$version" ]; then
        log "✅ 本地内核版本 ($local_ver) 已是最新，无需更新。"
        exit 0
    fi
else
    log "⚠️ 未检测到本地 mihomo 可执行文件，将继续执行更新。"
fi

# ===== 架构检测（尽可能自动） =====
arch="$(uname -m)"
case "$arch" in
    x86_64|amd64) dl_template="$DOWNLOAD_TEMPLATE_AMD64"; bin_name="mihomo-linux-amd64" ;;
    aarch64|arm64) dl_template="$DOWNLOAD_TEMPLATE_ARM64"; bin_name="mihomo-linux-arm64" ;;
    *)
        log "⚠️ 无法自动识别架构 ($arch)，默认使用 amd64 模板"
        dl_template="$DOWNLOAD_TEMPLATE_AMD64"; bin_name="mihomo-linux-amd64"
        ;;
esac
download_url=$(printf "$dl_template" "$version")
log "识别架构: $arch，准备下载: $download_url"

# ===== 下载文件 =====
tmp_gz="$TMP_DIR/${bin_name}.gz"
for i in $(seq 1 $RETRY); do
    log "下载（尝试 $i/$RETRY）..."
    if wget -qO "$tmp_gz" "$download_url"; then
        log "下载成功"
        break
    else
        log "下载失败（第 $i 次）"
        sleep $SLEEP_BETWEEN_RETRY
    fi
done

if [ ! -s "$tmp_gz" ]; then
    log "❌ 内核下载失败或文件为空，终止更新"
    exit 1
fi

# ===== 可选：校验 gzip 文件完整性 =====
if ! gzip -t "$tmp_gz" 2>/dev/null; then
    log "❌ 下载文件 gzip 校验失败，终止更新"
    exit 1
fi
log "gzip 完整性检查通过"

# ===== 备份旧二进制 =====
backup_path=""
if [ -f "$TARGET_BIN" ]; then
    ts=$(date '+%Y%m%d_%H%M%S')
    backup_path="$BACKUP_DIR/$(basename $TARGET_BIN).${ts}.bak"
    log "备份旧二进制到: $backup_path"
    cp -a "$TARGET_BIN" "$backup_path"
fi

# ===== 解压并替换 =====
tmp_bin="$TMP_DIR/${bin_name}"
log "解压 $tmp_gz ..."
gzip -dc "$tmp_gz" > "$tmp_bin" || { log "❌ 解压失败"; exit 1; }
chmod +x "$tmp_bin"

# 简单体积校验
filesize=$(stat -c%s "$tmp_bin" 2>/dev/null || stat -f%z "$tmp_bin" 2>/dev/null || echo 0)
if [ "$filesize" -lt 10240 ]; then
    log "⚠️ 解压后的二进制体积异常小 (${filesize} bytes)，终止更新以避免替换为残缺文件"
    exit 1
fi

log "替换旧二进制 -> $TARGET_BIN"
mv -f "$tmp_bin" "$TARGET_BIN"
chmod +x "$TARGET_BIN"

# ===== 重启/刷新服务（带重试） =====
attempt=1
service_started=false

log "开始尝试重启服务: $SERVICE_NAME （最多 $RESTART_ATTEMPTS 次）"
while [ $attempt -le $RESTART_ATTEMPTS ]; do
    log "重启尝试 $attempt/$RESTART_ATTEMPTS..."
    # 优先使用 systemctl（若存在），否则尝试 service
    if command -v systemctl >/dev/null 2>&1; then
        # 尝试 reload/daemon-reload 以防 unit 改动（不会报错）
        systemctl daemon-reload 2>/dev/null || true
        if systemctl restart "$SERVICE_NAME".service 2>/dev/null; then
            log "systemctl restart 返回成功（或未报告错误）"
        else
            log "systemctl restart 返回非零或不可用，尝试使用 service 命令"
            service "$SERVICE_NAME" restart 2>/dev/null || true
        fi
    else
        service "$SERVICE_NAME" restart 2>/dev/null || true
    fi

    # 等待短时间让进程起来
    sleep $RESTART_SLEEP

    # 检查进程是否存在（按二进制名或 service 名）
    if pgrep -f "$(basename "$TARGET_BIN")" >/dev/null 2>&1 || pgrep -f "$SERVICE_NAME" >/dev/null 2>&1; then
        log "✅ 进程已检测到运行：$(basename "$TARGET_BIN") 或 $SERVICE_NAME"
        service_started=true
        break
    fi

    # 如果未运行，再尝试直接用 service 命令重启（用户手动执行能成功的那一步）
    log "⚠️ 第 $attempt 次重启后未检测到进程，尝试使用 'service $SERVICE_NAME restart' 强制重启一次"
    service "$SERVICE_NAME" restart 2>/dev/null || true
    sleep $RESTART_SLEEP

    if pgrep -f "$(basename "$TARGET_BIN")" >/dev/null 2>&1 || pgrep -f "$SERVICE_NAME" >/dev/null 2>&1; then
        log "✅ 通过 'service' 命令启动成功"
        service_started=true
        break
    fi

    attempt=$((attempt+1))
done

if ! $service_started; then
    log "❌ 在尝试 ${RESTART_ATTEMPTS} 次后仍未检测到服务启动。"
    if [ -n "$backup_path" ]; then
        log "建议手动检查日志或回滚：恢复备份并重启服务 -> cp -a $backup_path $TARGET_BIN && chmod +x $TARGET_BIN && service $SERVICE_NAME restart"
    else
        log "建议手动检查日志并尝试：service $SERVICE_NAME restart 或 systemctl restart $SERVICE_NAME"
    fi
else
    log "服务重启或启动成功，继续后续检查"
fi

# ===== 可选：再次确认进程/版本运行中 =====
sleep 1
if pgrep -f "$(basename "$TARGET_BIN")" >/dev/null 2>&1; then
    log "最终进程运行状态良好：$(basename "$TARGET_BIN")"
else
    log "⚠️ 未检测到进程（最终检查），请检查 $LOG_FILE 与服务日志"
fi

# ===== 清理与日志轮转 =====
log "清理临时文件..."
rm -rf "$TMP_DIR"

log "清理 15 天前的日志文件..."
find "$LOG_DIR" -type f -name "update_*.log" -mtime +15 -exec rm -f {} \;

log "更新流程结束。若需要回滚，请参考上面的回滚建议。"
