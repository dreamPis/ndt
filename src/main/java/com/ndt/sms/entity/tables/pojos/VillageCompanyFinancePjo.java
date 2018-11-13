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
 * 村站采集的公司年度财务表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillageCompanyFinancePjo implements Serializable {

    private static final long serialVersionUID = 1623077108;

    private BigDecimal   id;
    private BigDecimal   villageCompanyInfoId;
    private String       calendarYear;
    private BigDecimal   incomeAmt;
    private Integer      employeeNumber;
    private String       financeData;
    private BigDecimal   totalAssetAmt;
    private BigDecimal   netAssetAmt;
    private String       mainBusiness;
    private BigDecimal   mainBusinessAmt;
    private BigDecimal   netProfitAmt;
    private BigDecimal   grossProfitAmt;
    private BigDecimal   taxAmt;
    private BigDecimal   debtAmt;
    private BigDecimal   loanBalance;
    private Integer      creditorNumber;
    private String       ownerEquity;
    private Short        status;
    private BigDecimal   createUser;
    private Timestamp    createTime;
    private BigDecimal   updateUser;
    private Timestamp    updateTime;
    private BigDecimal[] financeImg;

    public VillageCompanyFinancePjo() {}

    public VillageCompanyFinancePjo(VillageCompanyFinancePjo value) {
        this.id = value.id;
        this.villageCompanyInfoId = value.villageCompanyInfoId;
        this.calendarYear = value.calendarYear;
        this.incomeAmt = value.incomeAmt;
        this.employeeNumber = value.employeeNumber;
        this.financeData = value.financeData;
        this.totalAssetAmt = value.totalAssetAmt;
        this.netAssetAmt = value.netAssetAmt;
        this.mainBusiness = value.mainBusiness;
        this.mainBusinessAmt = value.mainBusinessAmt;
        this.netProfitAmt = value.netProfitAmt;
        this.grossProfitAmt = value.grossProfitAmt;
        this.taxAmt = value.taxAmt;
        this.debtAmt = value.debtAmt;
        this.loanBalance = value.loanBalance;
        this.creditorNumber = value.creditorNumber;
        this.ownerEquity = value.ownerEquity;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
        this.financeImg = value.financeImg;
    }

    public VillageCompanyFinancePjo(
        BigDecimal   id,
        BigDecimal   villageCompanyInfoId,
        String       calendarYear,
        BigDecimal   incomeAmt,
        Integer      employeeNumber,
        String       financeData,
        BigDecimal   totalAssetAmt,
        BigDecimal   netAssetAmt,
        String       mainBusiness,
        BigDecimal   mainBusinessAmt,
        BigDecimal   netProfitAmt,
        BigDecimal   grossProfitAmt,
        BigDecimal   taxAmt,
        BigDecimal   debtAmt,
        BigDecimal   loanBalance,
        Integer      creditorNumber,
        String       ownerEquity,
        Short        status,
        BigDecimal   createUser,
        Timestamp    createTime,
        BigDecimal   updateUser,
        Timestamp    updateTime,
        BigDecimal[] financeImg
    ) {
        this.id = id;
        this.villageCompanyInfoId = villageCompanyInfoId;
        this.calendarYear = calendarYear;
        this.incomeAmt = incomeAmt;
        this.employeeNumber = employeeNumber;
        this.financeData = financeData;
        this.totalAssetAmt = totalAssetAmt;
        this.netAssetAmt = netAssetAmt;
        this.mainBusiness = mainBusiness;
        this.mainBusinessAmt = mainBusinessAmt;
        this.netProfitAmt = netProfitAmt;
        this.grossProfitAmt = grossProfitAmt;
        this.taxAmt = taxAmt;
        this.debtAmt = debtAmt;
        this.loanBalance = loanBalance;
        this.creditorNumber = creditorNumber;
        this.ownerEquity = ownerEquity;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.financeImg = financeImg;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillageCompanyFinancePjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getVillageCompanyInfoId() {
        return this.villageCompanyInfoId;
    }

    public VillageCompanyFinancePjo setVillageCompanyInfoId(BigDecimal villageCompanyInfoId) {
        this.villageCompanyInfoId = villageCompanyInfoId;
        return this;
    }

    public String getCalendarYear() {
        return this.calendarYear;
    }

    public VillageCompanyFinancePjo setCalendarYear(String calendarYear) {
        this.calendarYear = calendarYear;
        return this;
    }

    public BigDecimal getIncomeAmt() {
        return this.incomeAmt;
    }

    public VillageCompanyFinancePjo setIncomeAmt(BigDecimal incomeAmt) {
        this.incomeAmt = incomeAmt;
        return this;
    }

    public Integer getEmployeeNumber() {
        return this.employeeNumber;
    }

    public VillageCompanyFinancePjo setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    public String getFinanceData() {
        return this.financeData;
    }

    public VillageCompanyFinancePjo setFinanceData(String financeData) {
        this.financeData = financeData;
        return this;
    }

    public BigDecimal getTotalAssetAmt() {
        return this.totalAssetAmt;
    }

    public VillageCompanyFinancePjo setTotalAssetAmt(BigDecimal totalAssetAmt) {
        this.totalAssetAmt = totalAssetAmt;
        return this;
    }

    public BigDecimal getNetAssetAmt() {
        return this.netAssetAmt;
    }

    public VillageCompanyFinancePjo setNetAssetAmt(BigDecimal netAssetAmt) {
        this.netAssetAmt = netAssetAmt;
        return this;
    }

    public String getMainBusiness() {
        return this.mainBusiness;
    }

    public VillageCompanyFinancePjo setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness;
        return this;
    }

    public BigDecimal getMainBusinessAmt() {
        return this.mainBusinessAmt;
    }

    public VillageCompanyFinancePjo setMainBusinessAmt(BigDecimal mainBusinessAmt) {
        this.mainBusinessAmt = mainBusinessAmt;
        return this;
    }

    public BigDecimal getNetProfitAmt() {
        return this.netProfitAmt;
    }

    public VillageCompanyFinancePjo setNetProfitAmt(BigDecimal netProfitAmt) {
        this.netProfitAmt = netProfitAmt;
        return this;
    }

    public BigDecimal getGrossProfitAmt() {
        return this.grossProfitAmt;
    }

    public VillageCompanyFinancePjo setGrossProfitAmt(BigDecimal grossProfitAmt) {
        this.grossProfitAmt = grossProfitAmt;
        return this;
    }

    public BigDecimal getTaxAmt() {
        return this.taxAmt;
    }

    public VillageCompanyFinancePjo setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
        return this;
    }

    public BigDecimal getDebtAmt() {
        return this.debtAmt;
    }

    public VillageCompanyFinancePjo setDebtAmt(BigDecimal debtAmt) {
        this.debtAmt = debtAmt;
        return this;
    }

    public BigDecimal getLoanBalance() {
        return this.loanBalance;
    }

    public VillageCompanyFinancePjo setLoanBalance(BigDecimal loanBalance) {
        this.loanBalance = loanBalance;
        return this;
    }

    public Integer getCreditorNumber() {
        return this.creditorNumber;
    }

    public VillageCompanyFinancePjo setCreditorNumber(Integer creditorNumber) {
        this.creditorNumber = creditorNumber;
        return this;
    }

    public String getOwnerEquity() {
        return this.ownerEquity;
    }

    public VillageCompanyFinancePjo setOwnerEquity(String ownerEquity) {
        this.ownerEquity = ownerEquity;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillageCompanyFinancePjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillageCompanyFinancePjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillageCompanyFinancePjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillageCompanyFinancePjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillageCompanyFinancePjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public BigDecimal[] getFinanceImg() {
        return this.financeImg;
    }

    public VillageCompanyFinancePjo setFinanceImg(BigDecimal... financeImg) {
        this.financeImg = financeImg;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillageCompanyFinancePjo (");

        sb.append(id);
        sb.append(", ").append(villageCompanyInfoId);
        sb.append(", ").append(calendarYear);
        sb.append(", ").append(incomeAmt);
        sb.append(", ").append(employeeNumber);
        sb.append(", ").append(financeData);
        sb.append(", ").append(totalAssetAmt);
        sb.append(", ").append(netAssetAmt);
        sb.append(", ").append(mainBusiness);
        sb.append(", ").append(mainBusinessAmt);
        sb.append(", ").append(netProfitAmt);
        sb.append(", ").append(grossProfitAmt);
        sb.append(", ").append(taxAmt);
        sb.append(", ").append(debtAmt);
        sb.append(", ").append(loanBalance);
        sb.append(", ").append(creditorNumber);
        sb.append(", ").append(ownerEquity);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(Arrays.toString(financeImg));

        sb.append(")");
        return sb.toString();
    }
}
