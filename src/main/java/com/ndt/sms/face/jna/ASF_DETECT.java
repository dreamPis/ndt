package com.ndt.sms.face.jna;

/**
 * @Author ser7en
 * @Date 2018-12-10 10:16
 * @version：
 * @Desc：
 */
public enum ASF_DETECT {
    ASF_NONE(0x00000000),
    ASF_FACE_DETECT(0x00000001),
    ASF_FACERECOGNITION(0x00000004),
    ASF_AGE(0x00000008),
    ASF_GENDER(0x00000010),
    ASF_FACE3DANGLE(0x00000020),
    ;

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    ASF_DETECT(int code) {
        this.code = code;
    }
}
