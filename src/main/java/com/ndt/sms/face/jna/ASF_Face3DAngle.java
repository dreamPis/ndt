package com.ndt.sms.face.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ser7en
 * @Date 2018-12-07 13:53
 * @version：
 * @Desc：
 */
public class ASF_Face3DAngle extends Structure {

    public FloatByReference roll; //横滚角
    public FloatByReference yaw; //偏航角
    public FloatByReference pitch; //俯仰角
    public IntByReference status; //0: 正常，其他数值：出错
    public int num; //检测的人脸个数

    public ASF_Face3DAngle() {
        super();
    }

    public ASF_Face3DAngle(final Pointer p) {
        super(p);
        read();
    }

    public static class ByReference extends ASF_Face3DAngle implements Structure.ByReference{
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("roll", "yaw", "pitch", "status", "num");
    }
}
