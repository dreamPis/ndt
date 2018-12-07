package com.ndt.sms.face.jna;

/**
 * @Author ser7en
 * @Date 2018-12-07 14:00
 * @version：
 * @Desc：
 */
public enum  ASF_COLOR_FORMAT {

    CP_PAF_NV21(0x802),
    ASVL_PAF_NV12(0x801),
    CP_PAF_BGR24(0x201),
    ASVL_PAF_I420(0x601),
    ASVL_PAF_YUYV(0x509),
    ;

    public int code;

    ASF_COLOR_FORMAT(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }}
