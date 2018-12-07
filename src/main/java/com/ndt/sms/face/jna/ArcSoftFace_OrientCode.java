package com.ndt.sms.face.jna;

/**
 * @Author ser7en
 * @Date 2018-12-07 13:36
 * @version：
 * @Desc：
 */
public enum ArcSoftFace_OrientCode {

    ASF_OC_0(0x1),
    ASF_OC_90(0x2),
    ASF_OC_270(0x3),
    ASF_OC_180(0x4),
    ASF_OC_30(0x5),
    ASF_OC_60(0x6),
    ASF_OC_120(0x7),
    ASF_OC_150(0x8),
    ASF_OC_210(0x9),
    ASF_OC_240(0xa),
    ASF_OC_300(0xb),
    ASF_OC_330(0xc),
    ;

    public int code;

    ArcSoftFace_OrientCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }}
