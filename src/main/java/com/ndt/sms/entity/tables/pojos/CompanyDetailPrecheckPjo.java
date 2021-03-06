/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 待审核企业信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanyDetailPrecheckPjo implements Serializable {

    private static final long serialVersionUID = -1252150827;

    private BigDecimal id;
    private String     contactName;
    private String     bindTelephone;
    private String     salt;
    private String     password;
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
    private String     legalPerson;
    private String     legalPersonIdentityId;
    private Timestamp  legalPersonIdDeadline;
    private String     relatedImgUrls;
    private Integer    state;
    private Timestamp  createTime;
    private String     contactIdentityId;
    private BigDecimal checkNameId;
    private Timestamp  checkTime;
    private Integer    sourceId;
    private BigDecimal userId;
    private Short      isLegalPerson;

    public CompanyDetailPrecheckPjo() {}

    public CompanyDetailPrecheckPjo(CompanyDetailPrecheckPjo value) {
        this.id = value.id;
        this.contactName = value.contactName;
        this.bindTelephone = value.bindTelephone;
        this.salt = value.salt;
        this.password = value.password;
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
        this.legalPerson = value.legalPerson;
        this.legalPersonIdentityId = value.legalPersonIdentityId;
        this.legalPersonIdDeadline = value.legalPersonIdDeadline;
        this.relatedImgUrls = value.relatedImgUrls;
        this.state = value.state;
        this.createTime = value.createTime;
        this.contactIdentityId = value.contactIdentityId;
        this.checkNameId = value.checkNameId;
        this.checkTime = value.checkTime;
        this.sourceId = value.sourceId;
        this.userId = value.userId;
        this.isLegalPerson = value.isLegalPerson;
    }

    public CompanyDetailPrecheckPjo(
        BigDecimal id,
        String     contactName,
        String     bindTelephone,
        String     salt,
        String     password,
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
        String     legalPerson,
        String     legalPersonIdentityId,
        Timestamp  legalPersonIdDeadline,
        String     relatedImgUrls,
        Integer    state,
        Timestamp  createTime,
        String     contactIdentityId,
        BigDecimal checkNameId,
        Timestamp  checkTime,
        Integer    sourceId,
        BigDecimal userId,
        Short      isLegalPerson
    ) {
        this.id = id;
        this.contactName = contactName;
        this.bindTelephone = bindTelephone;
        this.salt = salt;
        this.password = password;
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
        this.legalPerson = legalPerson;
        this.legalPersonIdentityId = legalPersonIdentityId;
        this.legalPersonIdDeadline = legalPersonIdDeadline;
        this.relatedImgUrls = relatedImgUrls;
        this.state = state;
        this.createTime = createTime;
        this.contactIdentityId = contactIdentityId;
        this.checkNameId = checkNameId;
        this.checkTime = checkTime;
        this.sourceId = sourceId;
        this.userId = userId;
        this.isLegalPerson = isLegalPerson;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public CompanyDetailPrecheckPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getContactName() {
        return this.contactName;
    }

    public CompanyDetailPrecheckPjo setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public String getBindTelephone() {
        return this.bindTelephone;
    }

    public CompanyDetailPrecheckPjo setBindTelephone(String bindTelephone) {
        this.bindTelephone = bindTelephone;
        return this;
    }

    public String getSalt() {
        return this.salt;
    }

    public CompanyDetailPrecheckPjo setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public CompanyDetailPrecheckPjo setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getCertificateType() {
        return this.certificateType;
    }

    public CompanyDetailPrecheckPjo setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CompanyDetailPrecheckPjo setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public CompanyDetailPrecheckPjo setCode(String code) {
        this.code = code;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public CompanyDetailPrecheckPjo setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getCompanyType() {
        return this.companyType;
    }

    public CompanyDetailPrecheckPjo setCompanyType(Integer companyType) {
        this.companyType = companyType;
        return this;
    }

    public BigDecimal getDivisionId() {
        return this.divisionId;
    }

    public CompanyDetailPrecheckPjo setDivisionId(BigDecimal divisionId) {
        this.divisionId = divisionId;
        return this;
    }

    public Integer getIndustryType() {
        return this.industryType;
    }

    public CompanyDetailPrecheckPjo setIndustryType(Integer industryType) {
        this.industryType = industryType;
        return this;
    }

    public Timestamp getSetupTime() {
        return this.setupTime;
    }

    public CompanyDetailPrecheckPjo setSetupTime(Timestamp setupTime) {
        this.setupTime = setupTime;
        return this;
    }

    public String getBusinessScope() {
        return this.businessScope;
    }

    public CompanyDetailPrecheckPjo setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
        return this;
    }

    public Timestamp getBusinessDeadline() {
        return this.businessDeadline;
    }

    public CompanyDetailPrecheckPjo setBusinessDeadline(Timestamp businessDeadline) {
        this.businessDeadline = businessDeadline;
        return this;
    }

    public String getRegisteredCapital() {
        return this.registeredCapital;
    }

    public CompanyDetailPrecheckPjo setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
        return this;
    }

    public String getLegalPerson() {
        return this.legalPerson;
    }

    public CompanyDetailPrecheckPjo setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }

    public String getLegalPersonIdentityId() {
        return this.legalPersonIdentityId;
    }

    public CompanyDetailPrecheckPjo setLegalPersonIdentityId(String legalPersonIdentityId) {
        this.legalPersonIdentityId = legalPersonIdentityId;
        return this;
    }

    public Timestamp getLegalPersonIdDeadline() {
        return this.legalPersonIdDeadline;
    }

    public CompanyDetailPrecheckPjo setLegalPersonIdDeadline(Timestamp legalPersonIdDeadline) {
        this.legalPersonIdDeadline = legalPersonIdDeadline;
        return this;
    }

    public String getRelatedImgUrls() {
        return this.relatedImgUrls;
    }

    public CompanyDetailPrecheckPjo setRelatedImgUrls(String relatedImgUrls) {
        this.relatedImgUrls = relatedImgUrls;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public CompanyDetailPrecheckPjo setState(Integer state) {
        this.state = state;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public CompanyDetailPrecheckPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getContactIdentityId() {
        return this.contactIdentityId;
    }

    public CompanyDetailPrecheckPjo setContactIdentityId(String contactIdentityId) {
        this.contactIdentityId = contactIdentityId;
        return this;
    }

    public BigDecimal getCheckNameId() {
        return this.checkNameId;
    }

    public CompanyDetailPrecheckPjo setCheckNameId(BigDecimal checkNameId) {
        this.checkNameId = checkNameId;
        return this;
    }

    public Timestamp getCheckTime() {
        return this.checkTime;
    }

    public CompanyDetailPrecheckPjo setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    public CompanyDetailPrecheckPjo setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public CompanyDetailPrecheckPjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public Short getIsLegalPerson() {
        return this.isLegalPerson;
    }

    public CompanyDetailPrecheckPjo setIsLegalPerson(Short isLegalPerson) {
        this.isLegalPerson = isLegalPerson;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CompanyDetailPrecheckPjo (");

        sb.append(id);
        sb.append(", ").append(contactName);
        sb.append(", ").append(bindTelephone);
        sb.append(", ").append(salt);
        sb.append(", ").append(password);
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
        sb.append(", ").append(legalPerson);
        sb.append(", ").append(legalPersonIdentityId);
        sb.append(", ").append(legalPersonIdDeadline);
        sb.append(", ").append(relatedImgUrls);
        sb.append(", ").append(state);
        sb.append(", ").append(createTime);
        sb.append(", ").append(contactIdentityId);
        sb.append(", ").append(checkNameId);
        sb.append(", ").append(checkTime);
        sb.append(", ").append(sourceId);
        sb.append(", ").append(userId);
        sb.append(", ").append(isLegalPerson);

        sb.append(")");
        return sb.toString();
    }
}
