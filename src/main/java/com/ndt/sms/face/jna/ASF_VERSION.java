package com.ndt.sms.face.jna;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ser7en
 * @Date 2018-12-04 09:40
 * @version：
 * @Desc：
 */
public class ASF_VERSION extends Structure {

    public String Version;// 版本号
    public String BuildDate;// 构建日期
    public String CopyRight;// 版权说明

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("Version", "BuildDate", "CopyRight");
    }
}
