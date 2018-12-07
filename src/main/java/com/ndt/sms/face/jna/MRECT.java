package com.ndt.sms.face.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import org.springframework.security.core.parameters.P;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ser7en
 * @Date 2018-12-04 10:02
 * @version：
 * @Desc：
 */
public class MRECT extends Structure {
    public int left;
    public int top;
    public int right;
    public int bottom;

    public MRECT() {
        super();
    }

    public MRECT(final Pointer p) {
        super(p);
        read();
    }

    public static class ByReference extends MRECT implements Structure.ByReference{
        public ByReference() {
        }

        public ByReference(final Pointer p) {
            super(p);
        }
    }

    public static class ByValue extends MRECT implements Structure.ByValue{
        public ByValue() {
        }

        public ByValue(final Pointer p) {
            super(p);
        }
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("left",  "top", "right" ,"bottom");
    }
}
