package com.ndt.sms.face.jna;

import com.sun.jna.Library;

/**
 * @Author ser7en
 * @Date 2018-12-07 14:38
 * @version：
 * @Desc：
 */
public interface Face extends Library {

    Face instance = LoadUtils.loadLibrary("linux_x64/libarcsoft_face.so", Face.class);

}
