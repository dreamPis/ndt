/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 公司经营状况表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanyManagementPjo implements Serializable {

    private static final long serialVersionUID = -1785053410;

    private BigDecimal id;
    private BigDecimal companyDetailId;
    private String     runningAddress;
    private String     calendarYear;
    private BigDecimal socialSecurityAmt;
    private String     managementEvaluation;
    private String     localTaxEvaluation;
    private String     nationalTaxEvaluation;
    private Boolean    courtBlackList;
    private Boolean    commerceBlackList;
    private Short      status;
    private BigDecimal createBy;
    private Timestamp  createAt;
    private BigDecimal updateBy;
    private Timestamp  updateAt;

    public CompanyManagementPjo() {}

    public CompanyManagementPjo(CompanyManagementPjo value) {
        this.id = value.id;
        this.companyDetailId = value.companyDetailId;
        this.runningAddress = value.runningAddress;
        this.calendarYear = value.calendarYear;
        this.socialSecurityAmt = value.socialSecurityAmt;
        this.managementEvaluation = value.managementEvaluation;
        this.localTaxEvaluation = value.localTaxEvaluation;
        this.nationalTaxEvaluation = value.nationalTaxEvaluation;
        this.courtBlackList = value.courtBlackList;
        this.commerceBlackList = value.commerceBlackList;
        this.status = value.status;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
        this.updateBy = value.updateBy;
        this.updateAt = value.updateAt;
    }

    public CompanyManagementPjo(
        BigDecimal id,
        BigDecimal companyDetailId,
        String     runningAddress,
        String     calendarYear,
        BigDecimal socialSecurityAmt,
        String     managementEvaluation,
        String     localTaxEvaluation,
        String     nationalTaxEvaluation,
        Boolean    courtBlackList,
        Boolean    commerceBlackList,
        Short      status,
        BigDecimal createBy,
        Timestamp  createAt,
        BigDecimal updateBy,
        Timestamp  updateAt
    ) {
        this.id = id;
        this.companyDetailId = companyDetailId;
        this.runningAddress = runningAddress;
        this.calendarYear = calendarYear;
        this.socialSecurityAmt = socialSecurityAmt;
        this.managementEvaluation = managementEvaluation;
        this.localTaxEvaluation = localTaxEvaluation;
        this.nationalTaxEvaluation = nationalTaxEvaluation;
        this.courtBlackList = courtBlackList;
        this.commerceBlackList = commerceBlackList;
        this.status = status;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public CompanyManagementPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getCompanyDetailId() {
        return this.companyDetailId;
    }

    public CompanyManagementPjo setCompanyDetailId(BigDecimal companyDetailId) {
        this.companyDetailId = companyDetailId;
        return this;
    }

    public String getRunningAddress() {
        return this.runningAddress;
    }

    public CompanyManagementPjo setRunningAddress(String runningAddress) {
        this.runningAddress = runningAddress;
        return this;
    }

    public String getCalendarYear() {
        return this.calendarYear;
    }

    public CompanyManagementPjo setCalendarYear(String calendarYear) {
        this.calendarYear = calendarYear;
        return this;
    }

    public BigDecimal getSocialSecurityAmt() {
        return this.socialSecurityAmt;
    }

    public CompanyManagementPjo setSocialSecurityAmt(BigDecimal socialSecurityAmt) {
        this.socialSecurityAmt = socialSecurityAmt;
        return this;
    }

    public String getManagementEvaluation() {
        return this.managementEvaluation;
    }

    public CompanyManagementPjo setManagementEvaluation(String managementEvaluation) {
        this.managementEvaluation = managementEvaluation;
        return this;
    }

    public String getLocalTaxEvaluation() {
        return this.localTaxEvaluation;
    }

    public CompanyManagementPjo setLocalTaxEvaluation(String localTaxEvaluation) {
        this.localTaxEvaluation = localTaxEvaluation;
        return this;
    }

    public String getNationalTaxEvaluation() {
        return this.nationalTaxEvaluation;
    }

    public CompanyManagementPjo setNationalTaxEvaluation(String nationalTaxEvaluation) {
        this.nationalTaxEvaluation = nationalTaxEvaluation;
        return this;
    }

    public Boolean getCourtBlackList() {
        return this.courtBlackList;
    }

    public CompanyManagementPjo setCourtBlackList(Boolean courtBlackList) {
        this.courtBlackList = courtBlackList;
        return this;
    }

    public Boolean getCommerceBlackList() {
        return this.commerceBlackList;
    }

    public CompanyManagementPjo setCommerceBlackList(Boolean commerceBlackList) {
        this.commerceBlackList = commerceBlackList;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public CompanyManagementPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public CompanyManagementPjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public CompanyManagementPjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public BigDecimal getUpdateBy() {
        return this.updateBy;
    }

    public CompanyManagementPjo setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public CompanyManagementPjo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CompanyManagementPjo (");

        sb.append(id);
        sb.append(", ").append(companyDetailId);
        sb.append(", ").append(runningAddress);
        sb.append(", ").append(calendarYear);
        sb.append(", ").append(socialSecurityAmt);
        sb.append(", ").append(managementEvaluation);
        sb.append(", ").append(localTaxEvaluation);
        sb.append(", ").append(nationalTaxEvaluation);
        sb.append(", ").append(courtBlackList);
        sb.append(", ").append(commerceBlackList);
        sb.append(", ").append(status);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateAt);

        sb.append(")");
        return sb.toString();
    }
}
