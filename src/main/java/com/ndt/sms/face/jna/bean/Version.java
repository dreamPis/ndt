package com.ndt.sms.face.jna.bean;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

import lombok.ToString;

/**
 * 版本信息
 */
@ToString
public class Version extends Structure {

	// 版本号
	public String Version;
	// 构建日期
	public String BuildDate;
	// 版权信息
	public String CopyRight;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("Version", "BuildDate", "CopyRight");
	}

}
