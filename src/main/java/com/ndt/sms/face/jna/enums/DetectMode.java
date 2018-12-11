package com.ndt.sms.face.jna.enums;

/**
 * 人脸检测模式常量
 */
public interface DetectMode {
	/**
	 * 视频模式
	 */
	long ASF_DETECT_MODE_VIDEO = 0x00000000L;
	/**
	 * 图片模式
	 */
	long ASF_DETECT_MODE_IMAGE = 0xFFFFFFFFL;
}
