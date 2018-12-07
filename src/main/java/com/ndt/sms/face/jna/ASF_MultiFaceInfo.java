package com.ndt.sms.face.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ser7en
 * @Date 2018-12-04 10:33
 * @version：
 * @Desc：
 */
public class ASF_MultiFaceInfo extends Structure {

    public ASF_MultiFaceInfo() {
        super();
    }

    public ASF_MultiFaceInfo(final Pointer p) {
        super(p);
        read();
    }

    public static class ByReference extends ASF_MultiFaceInfo implements Structure.ByReference{
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public MRECT.ByReference faceRect; // 人脸框数组
    public IntByReference faceOrient;// 人脸角度数组
    public int faceNum;// 检测到的人脸个数

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("faceRect", "faceOrient", "faceNum");
    }
}
