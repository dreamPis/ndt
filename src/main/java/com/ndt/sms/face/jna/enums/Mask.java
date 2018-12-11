package com.ndt.sms.face.jna.enums;

/**
 * SDK功能常量
 */
public interface Mask {
	int ASF_NONE = 0x00000000;
	int ASF_FACE_DETECT = 0x00000001;
	int ASF_FACERECOGNITION = 0x00000004;
	int ASF_AGE = 0x00000008;
	int ASF_GENDER = 0x00000010;
	int ASF_FACE3DANGLE = 0x00000020;
}
