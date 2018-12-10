package com.ndt.sms.face.jna;

/**
 * @Author ser7en
 * @Date 2018-12-10 10:14
 * @version：
 * @Desc：
 */
public enum ASF_DETECT_MODE {
    ASF_DETECT_MODE_VIDEO(0x00000000L),
    ASF_DETECT_MODE_IMAGE(0xFFFFFFFFL)
    ;

    public long code;

    ASF_DETECT_MODE(long code) {
        this.code = code;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }
}
