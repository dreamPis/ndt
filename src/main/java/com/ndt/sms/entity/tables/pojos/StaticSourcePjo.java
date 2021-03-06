/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;


/**
 * 静态资源对应fastdfs表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StaticSourcePjo implements Serializable {

    private static final long serialVersionUID = -1405909507;

    private BigDecimal id;
    private String     name;
    private String     sourcePath;
    private String     targetPath;
    private Integer    sourceW;
    private Integer    sourceH;

    public StaticSourcePjo() {}

    public StaticSourcePjo(StaticSourcePjo value) {
        this.id = value.id;
        this.name = value.name;
        this.sourcePath = value.sourcePath;
        this.targetPath = value.targetPath;
        this.sourceW = value.sourceW;
        this.sourceH = value.sourceH;
    }

    public StaticSourcePjo(
        BigDecimal id,
        String     name,
        String     sourcePath,
        String     targetPath,
        Integer    sourceW,
        Integer    sourceH
    ) {
        this.id = id;
        this.name = name;
        this.sourcePath = sourcePath;
        this.targetPath = targetPath;
        this.sourceW = sourceW;
        this.sourceH = sourceH;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public StaticSourcePjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public StaticSourcePjo setName(String name) {
        this.name = name;
        return this;
    }

    public String getSourcePath() {
        return this.sourcePath;
    }

    public StaticSourcePjo setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    public String getTargetPath() {
        return this.targetPath;
    }

    public StaticSourcePjo setTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }

    public Integer getSourceW() {
        return this.sourceW;
    }

    public StaticSourcePjo setSourceW(Integer sourceW) {
        this.sourceW = sourceW;
        return this;
    }

    public Integer getSourceH() {
        return this.sourceH;
    }

    public StaticSourcePjo setSourceH(Integer sourceH) {
        this.sourceH = sourceH;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StaticSourcePjo (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(sourcePath);
        sb.append(", ").append(targetPath);
        sb.append(", ").append(sourceW);
        sb.append(", ").append(sourceH);

        sb.append(")");
        return sb.toString();
    }
}
