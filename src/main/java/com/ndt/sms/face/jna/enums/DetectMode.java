package com.ndt.sms.face.jna.enums;

/**
 * 人脸检测模式常量
 *
 * @author Jastar·Wang
 * @email jastar_wang@163.com
 * @date 2018-12-4
 * @since 2.0
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
