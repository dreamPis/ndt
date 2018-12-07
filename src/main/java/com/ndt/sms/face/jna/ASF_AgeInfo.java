package com.ndt.sms.face.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ser7en
 * @Date 2018-12-07 13:47
 * @version：
 * @Desc：
 */
public class ASF_AgeInfo extends Structure {

    public IntByReference ageArray; // 0代表未知，大于0的数值即检测的年龄结果
    public int num; // 检测的人脸个数

    public ASF_AgeInfo() {
        super();
    }

    public ASF_AgeInfo(final Pointer p) {
        super(p);
        read();
    }

    public static class ByReference extends ASF_AgeInfo implements Structure.ByReference{
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("ageArray", "num");
    }
}
