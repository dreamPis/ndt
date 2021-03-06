/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 文件表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilePjo implements Serializable {

    private static final long serialVersionUID = -842525867;

    private BigDecimal id;
    private String     path;
    private String     name;
    private String     fileType;
    private Long       size;
    private BigDecimal createBy;
    private Timestamp  createAt;

    public FilePjo() {}

    public FilePjo(FilePjo value) {
        this.id = value.id;
        this.path = value.path;
        this.name = value.name;
        this.fileType = value.fileType;
        this.size = value.size;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
    }

    public FilePjo(
        BigDecimal id,
        String     path,
        String     name,
        String     fileType,
        Long       size,
        BigDecimal createBy,
        Timestamp  createAt
    ) {
        this.id = id;
        this.path = path;
        this.name = name;
        this.fileType = fileType;
        this.size = size;
        this.createBy = createBy;
        this.createAt = createAt;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public FilePjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    public FilePjo setPath(String path) {
        this.path = path;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public FilePjo setName(String name) {
        this.name = name;
        return this;
    }

    public String getFileType() {
        return this.fileType;
    }

    public FilePjo setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    public Long getSize() {
        return this.size;
    }

    public FilePjo setSize(Long size) {
        this.size = size;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public FilePjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public FilePjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FilePjo (");

        sb.append(id);
        sb.append(", ").append(path);
        sb.append(", ").append(name);
        sb.append(", ").append(fileType);
        sb.append(", ").append(size);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);

        sb.append(")");
        return sb.toString();
    }
}
