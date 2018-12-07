package com.ndt.sms.face.jna;

/**
 * @Author ser7en
 * @Date 2018-12-07 13:30
 * @version：
 * @Desc：
 */
public enum ArcSoftFace_OrientPriority {

    ASF_OP_0_ONLY(0x1),
    ASF_OP_90_ONLY(0x2),
    ASF_OP_270_ONLY(0x3),
    ASF_OP_180_ONLY(0x4),
    ASF_OP_0_HIGHER_EXT(0x5)
    ;

    public int code;

    ArcSoftFace_OrientPriority(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }}
