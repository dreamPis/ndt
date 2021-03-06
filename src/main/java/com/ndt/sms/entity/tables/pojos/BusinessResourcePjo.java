/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.annotation.Generated;


/**
 * 业务资源表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessResourcePjo implements Serializable {

    private static final long serialVersionUID = -742876751;

    private BigDecimal   id;
    private BigDecimal   userId;
    private BigDecimal[] fileIds;
    private BigDecimal[] divisions;
    private String       remark;
    private Short        status;
    private BigDecimal   createUser;
    private Timestamp    createTime;
    private BigDecimal   updateUser;
    private Timestamp    updateTime;
    private String       name;

    public BusinessResourcePjo() {}

    public BusinessResourcePjo(BusinessResourcePjo value) {
        this.id = value.id;
        this.userId = value.userId;
        this.fileIds = value.fileIds;
        this.divisions = value.divisions;
        this.remark = value.remark;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
        this.name = value.name;
    }

    public BusinessResourcePjo(
        BigDecimal   id,
        BigDecimal   userId,
        BigDecimal[] fileIds,
        BigDecimal[] divisions,
        String       remark,
        Short        status,
        BigDecimal   createUser,
        Timestamp    createTime,
        BigDecimal   updateUser,
        Timestamp    updateTime,
        String       name
    ) {
        this.id = id;
        this.userId = userId;
        this.fileIds = fileIds;
        this.divisions = divisions;
        this.remark = remark;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.name = name;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public BusinessResourcePjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public BusinessResourcePjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public BigDecimal[] getFileIds() {
        return this.fileIds;
    }

    public BusinessResourcePjo setFileIds(BigDecimal... fileIds) {
        this.fileIds = fileIds;
        return this;
    }

    public BigDecimal[] getDivisions() {
        return this.divisions;
    }

    public BusinessResourcePjo setDivisions(BigDecimal... divisions) {
        this.divisions = divisions;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public BusinessResourcePjo setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public BusinessResourcePjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public BusinessResourcePjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public BusinessResourcePjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public BusinessResourcePjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public BusinessResourcePjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public BusinessResourcePjo setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessResourcePjo (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(Arrays.toString(fileIds));
        sb.append(", ").append(Arrays.toString(divisions));
        sb.append(", ").append(remark);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}
