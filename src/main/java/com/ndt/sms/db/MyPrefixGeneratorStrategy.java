package com.ndt.sms.db;

import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

/**
 * @Author ser7en
 * @Date 2018-10-15 14:12
 * @version：
 * @Desc：
 */
public class MyPrefixGeneratorStrategy extends DefaultGeneratorStrategy {

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        if(Mode.POJO.equals(mode)){
            String javaClassName = super.getJavaClassName(definition, mode);
            javaClassName = javaClassName.replaceFirst("T","");
            return javaClassName+"Pjo";
        }
        return super.getJavaClassName(definition, mode);
    }

}
