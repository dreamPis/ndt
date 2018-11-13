/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 村站采集的公司经营信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillageCompanyBusinessPjo implements Serializable {

    private static final long serialVersionUID = 986319521;

    private BigDecimal id;
    private BigDecimal villageCompanyInfoId;
    private Integer    businessType;
    private Integer    businessArea;
    private Integer    businessAreaUnit;
    private String     remark;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;

    public VillageCompanyBusinessPjo() {}

    public VillageCompanyBusinessPjo(VillageCompanyBusinessPjo value) {
        this.id = value.id;
        this.villageCompanyInfoId = value.villageCompanyInfoId;
        this.businessType = value.businessType;
        this.businessArea = value.businessArea;
        this.businessAreaUnit = value.businessAreaUnit;
        this.remark = value.remark;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
    }

    public VillageCompanyBusinessPjo(
        BigDecimal id,
        BigDecimal villageCompanyInfoId,
        Integer    businessType,
        Integer    businessArea,
        Integer    businessAreaUnit,
        String     remark,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.villageCompanyInfoId = villageCompanyInfoId;
        this.businessType = businessType;
        this.businessArea = businessArea;
        this.businessAreaUnit = businessAreaUnit;
        this.remark = remark;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillageCompanyBusinessPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getVillageCompanyInfoId() {
        return this.villageCompanyInfoId;
    }

    public VillageCompanyBusinessPjo setVillageCompanyInfoId(BigDecimal villageCompanyInfoId) {
        this.villageCompanyInfoId = villageCompanyInfoId;
        return this;
    }

    public Integer getBusinessType() {
        return this.businessType;
    }

    public VillageCompanyBusinessPjo setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }

    public Integer getBusinessArea() {
        return this.businessArea;
    }

    public VillageCompanyBusinessPjo setBusinessArea(Integer businessArea) {
        this.businessArea = businessArea;
        return this;
    }

    public Integer getBusinessAreaUnit() {
        return this.businessAreaUnit;
    }

    public VillageCompanyBusinessPjo setBusinessAreaUnit(Integer businessAreaUnit) {
        this.businessAreaUnit = businessAreaUnit;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public VillageCompanyBusinessPjo setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillageCompanyBusinessPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillageCompanyBusinessPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillageCompanyBusinessPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillageCompanyBusinessPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillageCompanyBusinessPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillageCompanyBusinessPjo (");

        sb.append(id);
        sb.append(", ").append(villageCompanyInfoId);
        sb.append(", ").append(businessType);
        sb.append(", ").append(businessArea);
        sb.append(", ").append(businessAreaUnit);
        sb.append(", ").append(remark);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
