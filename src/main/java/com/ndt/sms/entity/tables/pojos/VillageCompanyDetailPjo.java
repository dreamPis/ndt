/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 村站采集的公司信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillageCompanyDetailPjo implements Serializable {

    private static final long serialVersionUID = 53848233;

    private BigDecimal id;
    private Integer    certificateType;
    private String     name;
    private String     code;
    private String     address;
    private Integer    companyType;
    private BigDecimal divisionId;
    private Integer    industryType;
    private Timestamp  setupTime;
    private String     businessScope;
    private Timestamp  businessDeadline;
    private String     registeredCapital;
    private Boolean    isEmerging;
    private String     legalPerson;
    private String     legalPersonIdentityId;
    private Timestamp  legalPersonIdDeadline;
    private String     relatedImgUrls;
    private Integer    state;
    private Short      status;
    private BigDecimal createBy;
    private Timestamp  createAt;
    private BigDecimal updateBy;
    private Timestamp  updateAt;

    public VillageCompanyDetailPjo() {}

    public VillageCompanyDetailPjo(VillageCompanyDetailPjo value) {
        this.id = value.id;
        this.certificateType = value.certificateType;
        this.name = value.name;
        this.code = value.code;
        this.address = value.address;
        this.companyType = value.companyType;
        this.divisionId = value.divisionId;
        this.industryType = value.industryType;
        this.setupTime = value.setupTime;
        this.businessScope = value.businessScope;
        this.businessDeadline = value.businessDeadline;
        this.registeredCapital = value.registeredCapital;
        this.isEmerging = value.isEmerging;
        this.legalPerson = value.legalPerson;
        this.legalPersonIdentityId = value.legalPersonIdentityId;
        this.legalPersonIdDeadline = value.legalPersonIdDeadline;
        this.relatedImgUrls = value.relatedImgUrls;
        this.state = value.state;
        this.status = value.status;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
        this.updateBy = value.updateBy;
        this.updateAt = value.updateAt;
    }

    public VillageCompanyDetailPjo(
        BigDecimal id,
        Integer    certificateType,
        String     name,
        String     code,
        String     address,
        Integer    companyType,
        BigDecimal divisionId,
        Integer    industryType,
        Timestamp  setupTime,
        String     businessScope,
        Timestamp  businessDeadline,
        String     registeredCapital,
        Boolean    isEmerging,
        String     legalPerson,
        String     legalPersonIdentityId,
        Timestamp  legalPersonIdDeadline,
        String     relatedImgUrls,
        Integer    state,
        Short      status,
        BigDecimal createBy,
        Timestamp  createAt,
        BigDecimal updateBy,
        Timestamp  updateAt
    ) {
        this.id = id;
        this.certificateType = certificateType;
        this.name = name;
        this.code = code;
        this.address = address;
        this.companyType = companyType;
        this.divisionId = divisionId;
        this.industryType = industryType;
        this.setupTime = setupTime;
        this.businessScope = businessScope;
        this.businessDeadline = businessDeadline;
        this.registeredCapital = registeredCapital;
        this.isEmerging = isEmerging;
        this.legalPerson = legalPerson;
        this.legalPersonIdentityId = legalPersonIdentityId;
        this.legalPersonIdDeadline = legalPersonIdDeadline;
        this.relatedImgUrls = relatedImgUrls;
        this.state = state;
        this.status = status;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillageCompanyDetailPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public Integer getCertificateType() {
        return this.certificateType;
    }

    public VillageCompanyDetailPjo setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public VillageCompanyDetailPjo setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public VillageCompanyDetailPjo setCode(String code) {
        this.code = code;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public VillageCompanyDetailPjo setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getCompanyType() {
        return this.companyType;
    }

    public VillageCompanyDetailPjo setCompanyType(Integer companyType) {
        this.companyType = companyType;
        return this;
    }

    public BigDecimal getDivisionId() {
        return this.divisionId;
    }

    public VillageCompanyDetailPjo setDivisionId(BigDecimal divisionId) {
        this.divisionId = divisionId;
        return this;
    }

    public Integer getIndustryType() {
        return this.industryType;
    }

    public VillageCompanyDetailPjo setIndustryType(Integer industryType) {
        this.industryType = industryType;
        return this;
    }

    public Timestamp getSetupTime() {
        return this.setupTime;
    }

    public VillageCompanyDetailPjo setSetupTime(Timestamp setupTime) {
        this.setupTime = setupTime;
        return this;
    }

    public String getBusinessScope() {
        return this.businessScope;
    }

    public VillageCompanyDetailPjo setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
        return this;
    }

    public Timestamp getBusinessDeadline() {
        return this.businessDeadline;
    }

    public VillageCompanyDetailPjo setBusinessDeadline(Timestamp businessDeadline) {
        this.businessDeadline = businessDeadline;
        return this;
    }

    public String getRegisteredCapital() {
        return this.registeredCapital;
    }

    public VillageCompanyDetailPjo setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
        return this;
    }

    public Boolean getIsEmerging() {
        return this.isEmerging;
    }

    public VillageCompanyDetailPjo setIsEmerging(Boolean isEmerging) {
        this.isEmerging = isEmerging;
        return this;
    }

    public String getLegalPerson() {
        return this.legalPerson;
    }

    public VillageCompanyDetailPjo setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }

    public String getLegalPersonIdentityId() {
        return this.legalPersonIdentityId;
    }

    public VillageCompanyDetailPjo setLegalPersonIdentityId(String legalPersonIdentityId) {
        this.legalPersonIdentityId = legalPersonIdentityId;
        return this;
    }

    public Timestamp getLegalPersonIdDeadline() {
        return this.legalPersonIdDeadline;
    }

    public VillageCompanyDetailPjo setLegalPersonIdDeadline(Timestamp legalPersonIdDeadline) {
        this.legalPersonIdDeadline = legalPersonIdDeadline;
        return this;
    }

    public String getRelatedImgUrls() {
        return this.relatedImgUrls;
    }

    public VillageCompanyDetailPjo setRelatedImgUrls(String relatedImgUrls) {
        this.relatedImgUrls = relatedImgUrls;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public VillageCompanyDetailPjo setState(Integer state) {
        this.state = state;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillageCompanyDetailPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public VillageCompanyDetailPjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public VillageCompanyDetailPjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public BigDecimal getUpdateBy() {
        return this.updateBy;
    }

    public VillageCompanyDetailPjo setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public VillageCompanyDetailPjo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillageCompanyDetailPjo (");

        sb.append(id);
        sb.append(", ").append(certificateType);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(address);
        sb.append(", ").append(companyType);
        sb.append(", ").append(divisionId);
        sb.append(", ").append(industryType);
        sb.append(", ").append(setupTime);
        sb.append(", ").append(businessScope);
        sb.append(", ").append(businessDeadline);
        sb.append(", ").append(registeredCapital);
        sb.append(", ").append(isEmerging);
        sb.append(", ").append(legalPerson);
        sb.append(", ").append(legalPersonIdentityId);
        sb.append(", ").append(legalPersonIdDeadline);
        sb.append(", ").append(relatedImgUrls);
        sb.append(", ").append(state);
        sb.append(", ").append(status);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateAt);

        sb.append(")");
        return sb.toString();
    }
}
