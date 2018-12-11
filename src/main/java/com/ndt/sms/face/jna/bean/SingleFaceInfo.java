package com.ndt.sms.face.jna.bean;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

import lombok.ToString;

/**
 * 单人脸
 */
@ToString
public class SingleFaceInfo extends Structure {

	// 位置
	public Rect faceRect;

	// 角度，逆时针方向
	public int faceOrient;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("faceRect", "faceOrient");
	}

}
