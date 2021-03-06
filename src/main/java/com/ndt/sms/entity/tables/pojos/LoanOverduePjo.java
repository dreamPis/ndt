/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 贷款逾期
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoanOverduePjo implements Serializable {

    private static final long serialVersionUID = -823976630;

    private BigDecimal id;
    private BigDecimal loanApplyId;
    private BigDecimal loanDoneId;
    private Timestamp  loanAddTime;
    private Timestamp  loanDoneTime;
    private Timestamp  endTime;
    private BigDecimal loanMoney;
    private String     basicAnnualRate;
    private String     floatingRate;
    private String     exeAnnualRate;
    private Timestamp  overdueTime;
    private Integer    overdueType;
    private BigDecimal overdueMoney;
    private Timestamp  createTime;
    private Timestamp  updateTime;
    private BigDecimal operatorUserId;

    public LoanOverduePjo() {}

    public LoanOverduePjo(LoanOverduePjo value) {
        this.id = value.id;
        this.loanApplyId = value.loanApplyId;
        this.loanDoneId = value.loanDoneId;
        this.loanAddTime = value.loanAddTime;
        this.loanDoneTime = value.loanDoneTime;
        this.endTime = value.endTime;
        this.loanMoney = value.loanMoney;
        this.basicAnnualRate = value.basicAnnualRate;
        this.floatingRate = value.floatingRate;
        this.exeAnnualRate = value.exeAnnualRate;
        this.overdueTime = value.overdueTime;
        this.overdueType = value.overdueType;
        this.overdueMoney = value.overdueMoney;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.operatorUserId = value.operatorUserId;
    }

    public LoanOverduePjo(
        BigDecimal id,
        BigDecimal loanApplyId,
        BigDecimal loanDoneId,
        Timestamp  loanAddTime,
        Timestamp  loanDoneTime,
        Timestamp  endTime,
        BigDecimal loanMoney,
        String     basicAnnualRate,
        String     floatingRate,
        String     exeAnnualRate,
        Timestamp  overdueTime,
        Integer    overdueType,
        BigDecimal overdueMoney,
        Timestamp  createTime,
        Timestamp  updateTime,
        BigDecimal operatorUserId
    ) {
        this.id = id;
        this.loanApplyId = loanApplyId;
        this.loanDoneId = loanDoneId;
        this.loanAddTime = loanAddTime;
        this.loanDoneTime = loanDoneTime;
        this.endTime = endTime;
        this.loanMoney = loanMoney;
        this.basicAnnualRate = basicAnnualRate;
        this.floatingRate = floatingRate;
        this.exeAnnualRate = exeAnnualRate;
        this.overdueTime = overdueTime;
        this.overdueType = overdueType;
        this.overdueMoney = overdueMoney;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.operatorUserId = operatorUserId;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public LoanOverduePjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getLoanApplyId() {
        return this.loanApplyId;
    }

    public LoanOverduePjo setLoanApplyId(BigDecimal loanApplyId) {
        this.loanApplyId = loanApplyId;
        return this;
    }

    public BigDecimal getLoanDoneId() {
        return this.loanDoneId;
    }

    public LoanOverduePjo setLoanDoneId(BigDecimal loanDoneId) {
        this.loanDoneId = loanDoneId;
        return this;
    }

    public Timestamp getLoanAddTime() {
        return this.loanAddTime;
    }

    public LoanOverduePjo setLoanAddTime(Timestamp loanAddTime) {
        this.loanAddTime = loanAddTime;
        return this;
    }

    public Timestamp getLoanDoneTime() {
        return this.loanDoneTime;
    }

    public LoanOverduePjo setLoanDoneTime(Timestamp loanDoneTime) {
        this.loanDoneTime = loanDoneTime;
        return this;
    }

    public Timestamp getEndTime() {
        return this.endTime;
    }

    public LoanOverduePjo setEndTime(Timestamp endTime) {
        this.endTime = endTime;
        return this;
    }

    public BigDecimal getLoanMoney() {
        return this.loanMoney;
    }

    public LoanOverduePjo setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
        return this;
    }

    public String getBasicAnnualRate() {
        return this.basicAnnualRate;
    }

    public LoanOverduePjo setBasicAnnualRate(String basicAnnualRate) {
        this.basicAnnualRate = basicAnnualRate;
        return this;
    }

    public String getFloatingRate() {
        return this.floatingRate;
    }

    public LoanOverduePjo setFloatingRate(String floatingRate) {
        this.floatingRate = floatingRate;
        return this;
    }

    public String getExeAnnualRate() {
        return this.exeAnnualRate;
    }

    public LoanOverduePjo setExeAnnualRate(String exeAnnualRate) {
        this.exeAnnualRate = exeAnnualRate;
        return this;
    }

    public Timestamp getOverdueTime() {
        return this.overdueTime;
    }

    public LoanOverduePjo setOverdueTime(Timestamp overdueTime) {
        this.overdueTime = overdueTime;
        return this;
    }

    public Integer getOverdueType() {
        return this.overdueType;
    }

    public LoanOverduePjo setOverdueType(Integer overdueType) {
        this.overdueType = overdueType;
        return this;
    }

    public BigDecimal getOverdueMoney() {
        return this.overdueMoney;
    }

    public LoanOverduePjo setOverdueMoney(BigDecimal overdueMoney) {
        this.overdueMoney = overdueMoney;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public LoanOverduePjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public LoanOverduePjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public BigDecimal getOperatorUserId() {
        return this.operatorUserId;
    }

    public LoanOverduePjo setOperatorUserId(BigDecimal operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LoanOverduePjo (");

        sb.append(id);
        sb.append(", ").append(loanApplyId);
        sb.append(", ").append(loanDoneId);
        sb.append(", ").append(loanAddTime);
        sb.append(", ").append(loanDoneTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(loanMoney);
        sb.append(", ").append(basicAnnualRate);
        sb.append(", ").append(floatingRate);
        sb.append(", ").append(exeAnnualRate);
        sb.append(", ").append(overdueTime);
        sb.append(", ").append(overdueType);
        sb.append(", ").append(overdueMoney);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(operatorUserId);

        sb.append(")");
        return sb.toString();
    }
}
