/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 公司荣誉资质
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanyHonorPjo implements Serializable {

    private static final long serialVersionUID = 2062281586;

    private BigDecimal id;
    private BigDecimal companyDetailId;
    private String     honorName;
    private String     honorNo;
    private String     awardUnit;
    private String     level;
    private Timestamp  awardDate;
    private Short      status;
    private BigDecimal createBy;
    private Timestamp  createAt;
    private BigDecimal updateBy;
    private Timestamp  updateAt;

    public CompanyHonorPjo() {}

    public CompanyHonorPjo(CompanyHonorPjo value) {
        this.id = value.id;
        this.companyDetailId = value.companyDetailId;
        this.honorName = value.honorName;
        this.honorNo = value.honorNo;
        this.awardUnit = value.awardUnit;
        this.level = value.level;
        this.awardDate = value.awardDate;
        this.status = value.status;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
        this.updateBy = value.updateBy;
        this.updateAt = value.updateAt;
    }

    public CompanyHonorPjo(
        BigDecimal id,
        BigDecimal companyDetailId,
        String     honorName,
        String     honorNo,
        String     awardUnit,
        String     level,
        Timestamp  awardDate,
        Short      status,
        BigDecimal createBy,
        Timestamp  createAt,
        BigDecimal updateBy,
        Timestamp  updateAt
    ) {
        this.id = id;
        this.companyDetailId = companyDetailId;
        this.honorName = honorName;
        this.honorNo = honorNo;
        this.awardUnit = awardUnit;
        this.level = level;
        this.awardDate = awardDate;
        this.status = status;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public CompanyHonorPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getCompanyDetailId() {
        return this.companyDetailId;
    }

    public CompanyHonorPjo setCompanyDetailId(BigDecimal companyDetailId) {
        this.companyDetailId = companyDetailId;
        return this;
    }

    public String getHonorName() {
        return this.honorName;
    }

    public CompanyHonorPjo setHonorName(String honorName) {
        this.honorName = honorName;
        return this;
    }

    public String getHonorNo() {
        return this.honorNo;
    }

    public CompanyHonorPjo setHonorNo(String honorNo) {
        this.honorNo = honorNo;
        return this;
    }

    public String getAwardUnit() {
        return this.awardUnit;
    }

    public CompanyHonorPjo setAwardUnit(String awardUnit) {
        this.awardUnit = awardUnit;
        return this;
    }

    public String getLevel() {
        return this.level;
    }

    public CompanyHonorPjo setLevel(String level) {
        this.level = level;
        return this;
    }

    public Timestamp getAwardDate() {
        return this.awardDate;
    }

    public CompanyHonorPjo setAwardDate(Timestamp awardDate) {
        this.awardDate = awardDate;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public CompanyHonorPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public CompanyHonorPjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public CompanyHonorPjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public BigDecimal getUpdateBy() {
        return this.updateBy;
    }

    public CompanyHonorPjo setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public CompanyHonorPjo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CompanyHonorPjo (");

        sb.append(id);
        sb.append(", ").append(companyDetailId);
        sb.append(", ").append(honorName);
        sb.append(", ").append(honorNo);
        sb.append(", ").append(awardUnit);
        sb.append(", ").append(level);
        sb.append(", ").append(awardDate);
        sb.append(", ").append(status);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateAt);

        sb.append(")");
        return sb.toString();
    }
}
