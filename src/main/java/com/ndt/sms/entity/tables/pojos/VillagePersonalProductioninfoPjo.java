/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 生产资料信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillagePersonalProductioninfoPjo implements Serializable {

    private static final long serialVersionUID = 409773536;

    private BigDecimal id;
    private BigDecimal baseinfoId;
    private String     cultivatedVarieties;
    private String     cultivatedArea;
    private BigDecimal firstHalfRevenue;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;

    public VillagePersonalProductioninfoPjo() {}

    public VillagePersonalProductioninfoPjo(VillagePersonalProductioninfoPjo value) {
        this.id = value.id;
        this.baseinfoId = value.baseinfoId;
        this.cultivatedVarieties = value.cultivatedVarieties;
        this.cultivatedArea = value.cultivatedArea;
        this.firstHalfRevenue = value.firstHalfRevenue;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
    }

    public VillagePersonalProductioninfoPjo(
        BigDecimal id,
        BigDecimal baseinfoId,
        String     cultivatedVarieties,
        String     cultivatedArea,
        BigDecimal firstHalfRevenue,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.baseinfoId = baseinfoId;
        this.cultivatedVarieties = cultivatedVarieties;
        this.cultivatedArea = cultivatedArea;
        this.firstHalfRevenue = firstHalfRevenue;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillagePersonalProductioninfoPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getBaseinfoId() {
        return this.baseinfoId;
    }

    public VillagePersonalProductioninfoPjo setBaseinfoId(BigDecimal baseinfoId) {
        this.baseinfoId = baseinfoId;
        return this;
    }

    public String getCultivatedVarieties() {
        return this.cultivatedVarieties;
    }

    public VillagePersonalProductioninfoPjo setCultivatedVarieties(String cultivatedVarieties) {
        this.cultivatedVarieties = cultivatedVarieties;
        return this;
    }

    public String getCultivatedArea() {
        return this.cultivatedArea;
    }

    public VillagePersonalProductioninfoPjo setCultivatedArea(String cultivatedArea) {
        this.cultivatedArea = cultivatedArea;
        return this;
    }

    public BigDecimal getFirstHalfRevenue() {
        return this.firstHalfRevenue;
    }

    public VillagePersonalProductioninfoPjo setFirstHalfRevenue(BigDecimal firstHalfRevenue) {
        this.firstHalfRevenue = firstHalfRevenue;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillagePersonalProductioninfoPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillagePersonalProductioninfoPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillagePersonalProductioninfoPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillagePersonalProductioninfoPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillagePersonalProductioninfoPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillagePersonalProductioninfoPjo (");

        sb.append(id);
        sb.append(", ").append(baseinfoId);
        sb.append(", ").append(cultivatedVarieties);
        sb.append(", ").append(cultivatedArea);
        sb.append(", ").append(firstHalfRevenue);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
