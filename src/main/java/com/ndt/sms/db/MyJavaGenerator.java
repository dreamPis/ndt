package com.ndt.sms.db;

import org.jooq.util.*;

/**
 * @Author ser7en
 * @Date 2018-10-15 14:11
 * @version：
 * @Desc：
 */
public class MyJavaGenerator extends JavaGenerator {

    public MyJavaGenerator() {
        super();
        setStrategy(new MyPrefixGeneratorStrategy());
    }

    //类注解
    @Override
    protected void printClassAnnotations(JavaWriter out, SchemaDefinition schema) {
        super.printClassAnnotations(out, schema);
    }

    @Override
    protected void printTableJPAAnnotation(JavaWriter out, TableDefinition table) {
        super.printTableJPAAnnotation(out, table);
    }

    @Override
    protected void printPackage(JavaWriter out, Definition definition, GeneratorStrategy.Mode mode) {
        super.printPackage(out, definition,mode);

    }

    @Override
    protected void printColumnJPAAnnotation(JavaWriter out, ColumnDefinition column) {
        super.printColumnJPAAnnotation(out, column);
    }

}
