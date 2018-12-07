package com.ndt.sms.face.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.ByteByReference;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ser7en
 * @Date 2018-12-04 10:49
 * @version：
 * @Desc：
 */
public class ASF_FaceFeature extends Structure {

    public ASF_FaceFeature() {
        super();
    }

    public ASF_FaceFeature(Pointer p) {
        super(p);
        read();
    }

    public static class ByReference extends ASF_FaceFeature implements Structure.ByReference{
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public ByteByReference feature;
    public int featureSize;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("feature","featureSize");
    }
}
