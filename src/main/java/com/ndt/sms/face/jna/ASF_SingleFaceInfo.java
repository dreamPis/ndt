package com.ndt.sms.face.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ser7en
 * @Date 2018-12-04 10:05
 * @version：
 * @Desc：
 */
public class ASF_SingleFaceInfo extends Structure {

    public ASF_SingleFaceInfo() {
        super();
    }

    public ASF_SingleFaceInfo(final Pointer p) {
        super(p);
        read();
    }

    public static class ByReference extends ASF_SingleFaceInfo implements Structure.ByReference{
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public MRECT faceRect;// 人脸框
    public int faceOrient;//人脸角度

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("faceRect", "faceOrient");
    }
}
