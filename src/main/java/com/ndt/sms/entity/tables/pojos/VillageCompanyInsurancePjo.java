/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 村站采集的公司参保信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillageCompanyInsurancePjo implements Serializable {

    private static final long serialVersionUID = -439850134;

    private BigDecimal id;
    private BigDecimal villageCompanyInfoId;
    private String     insuranceName;
    private String     insuranceType;
    private String     beneficiary;
    private BigDecimal insuranceAmt;
    private String     insuranceTime;
    private String     insuranceDuetime;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;

    public VillageCompanyInsurancePjo() {}

    public VillageCompanyInsurancePjo(VillageCompanyInsurancePjo value) {
        this.id = value.id;
        this.villageCompanyInfoId = value.villageCompanyInfoId;
        this.insuranceName = value.insuranceName;
        this.insuranceType = value.insuranceType;
        this.beneficiary = value.beneficiary;
        this.insuranceAmt = value.insuranceAmt;
        this.insuranceTime = value.insuranceTime;
        this.insuranceDuetime = value.insuranceDuetime;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
    }

    public VillageCompanyInsurancePjo(
        BigDecimal id,
        BigDecimal villageCompanyInfoId,
        String     insuranceName,
        String     insuranceType,
        String     beneficiary,
        BigDecimal insuranceAmt,
        String     insuranceTime,
        String     insuranceDuetime,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.villageCompanyInfoId = villageCompanyInfoId;
        this.insuranceName = insuranceName;
        this.insuranceType = insuranceType;
        this.beneficiary = beneficiary;
        this.insuranceAmt = insuranceAmt;
        this.insuranceTime = insuranceTime;
        this.insuranceDuetime = insuranceDuetime;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillageCompanyInsurancePjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getVillageCompanyInfoId() {
        return this.villageCompanyInfoId;
    }

    public VillageCompanyInsurancePjo setVillageCompanyInfoId(BigDecimal villageCompanyInfoId) {
        this.villageCompanyInfoId = villageCompanyInfoId;
        return this;
    }

    public String getInsuranceName() {
        return this.insuranceName;
    }

    public VillageCompanyInsurancePjo setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
        return this;
    }

    public String getInsuranceType() {
        return this.insuranceType;
    }

    public VillageCompanyInsurancePjo setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }

    public String getBeneficiary() {
        return this.beneficiary;
    }

    public VillageCompanyInsurancePjo setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    public BigDecimal getInsuranceAmt() {
        return this.insuranceAmt;
    }

    public VillageCompanyInsurancePjo setInsuranceAmt(BigDecimal insuranceAmt) {
        this.insuranceAmt = insuranceAmt;
        return this;
    }

    public String getInsuranceTime() {
        return this.insuranceTime;
    }

    public VillageCompanyInsurancePjo setInsuranceTime(String insuranceTime) {
        this.insuranceTime = insuranceTime;
        return this;
    }

    public String getInsuranceDuetime() {
        return this.insuranceDuetime;
    }

    public VillageCompanyInsurancePjo setInsuranceDuetime(String insuranceDuetime) {
        this.insuranceDuetime = insuranceDuetime;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillageCompanyInsurancePjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillageCompanyInsurancePjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillageCompanyInsurancePjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillageCompanyInsurancePjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillageCompanyInsurancePjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillageCompanyInsurancePjo (");

        sb.append(id);
        sb.append(", ").append(villageCompanyInfoId);
        sb.append(", ").append(insuranceName);
        sb.append(", ").append(insuranceType);
        sb.append(", ").append(beneficiary);
        sb.append(", ").append(insuranceAmt);
        sb.append(", ").append(insuranceTime);
        sb.append(", ").append(insuranceDuetime);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}