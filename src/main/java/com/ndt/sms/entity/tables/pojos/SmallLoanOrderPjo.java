/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 小V贷款订单
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmallLoanOrderPjo implements Serializable {

    private static final long serialVersionUID = 1579465253;

    private BigDecimal id;
    private BigDecimal productId;
    private BigDecimal userId;
    private BigDecimal companyId;
    private String     userMobile;
    private String     identityId;
    private String     addressNow;
    private BigDecimal applyAmount;
    private BigDecimal actualAmount;
    private Integer    creditPeriod;
    private Timestamp  acceptTime;
    private Timestamp  createAt;
    private String     rate;
    private Integer    status;
    private Integer    state;
    private Timestamp  doneTime;
    private Integer    termUnit;
    private Integer    period;
    private BigDecimal floatProp;
    private BigDecimal costAmount;
    private BigDecimal repaymentAmount;
    private Integer    repaymentMethod;
    private Integer    applyPurpose;

    public SmallLoanOrderPjo() {}

    public SmallLoanOrderPjo(SmallLoanOrderPjo value) {
        this.id = value.id;
        this.productId = value.productId;
        this.userId = value.userId;
        this.companyId = value.companyId;
        this.userMobile = value.userMobile;
        this.identityId = value.identityId;
        this.addressNow = value.addressNow;
        this.applyAmount = value.applyAmount;
        this.actualAmount = value.actualAmount;
        this.creditPeriod = value.creditPeriod;
        this.acceptTime = value.acceptTime;
        this.createAt = value.createAt;
        this.rate = value.rate;
        this.status = value.status;
        this.state = value.state;
        this.doneTime = value.doneTime;
        this.termUnit = value.termUnit;
        this.period = value.period;
        this.floatProp = value.floatProp;
        this.costAmount = value.costAmount;
        this.repaymentAmount = value.repaymentAmount;
        this.repaymentMethod = value.repaymentMethod;
        this.applyPurpose = value.applyPurpose;
    }

    public SmallLoanOrderPjo(
        BigDecimal id,
        BigDecimal productId,
        BigDecimal userId,
        BigDecimal companyId,
        String     userMobile,
        String     identityId,
        String     addressNow,
        BigDecimal applyAmount,
        BigDecimal actualAmount,
        Integer    creditPeriod,
        Timestamp  acceptTime,
        Timestamp  createAt,
        String     rate,
        Integer    status,
        Integer    state,
        Timestamp  doneTime,
        Integer    termUnit,
        Integer    period,
        BigDecimal floatProp,
        BigDecimal costAmount,
        BigDecimal repaymentAmount,
        Integer    repaymentMethod,
        Integer    applyPurpose
    ) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.companyId = companyId;
        this.userMobile = userMobile;
        this.identityId = identityId;
        this.addressNow = addressNow;
        this.applyAmount = applyAmount;
        this.actualAmount = actualAmount;
        this.creditPeriod = creditPeriod;
        this.acceptTime = acceptTime;
        this.createAt = createAt;
        this.rate = rate;
        this.status = status;
        this.state = state;
        this.doneTime = doneTime;
        this.termUnit = termUnit;
        this.period = period;
        this.floatProp = floatProp;
        this.costAmount = costAmount;
        this.repaymentAmount = repaymentAmount;
        this.repaymentMethod = repaymentMethod;
        this.applyPurpose = applyPurpose;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public SmallLoanOrderPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getProductId() {
        return this.productId;
    }

    public SmallLoanOrderPjo setProductId(BigDecimal productId) {
        this.productId = productId;
        return this;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public SmallLoanOrderPjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public BigDecimal getCompanyId() {
        return this.companyId;
    }

    public SmallLoanOrderPjo setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getUserMobile() {
        return this.userMobile;
    }

    public SmallLoanOrderPjo setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public SmallLoanOrderPjo setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    public String getAddressNow() {
        return this.addressNow;
    }

    public SmallLoanOrderPjo setAddressNow(String addressNow) {
        this.addressNow = addressNow;
        return this;
    }

    public BigDecimal getApplyAmount() {
        return this.applyAmount;
    }

    public SmallLoanOrderPjo setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
        return this;
    }

    public BigDecimal getActualAmount() {
        return this.actualAmount;
    }

    public SmallLoanOrderPjo setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
        return this;
    }

    public Integer getCreditPeriod() {
        return this.creditPeriod;
    }

    public SmallLoanOrderPjo setCreditPeriod(Integer creditPeriod) {
        this.creditPeriod = creditPeriod;
        return this;
    }

    public Timestamp getAcceptTime() {
        return this.acceptTime;
    }

    public SmallLoanOrderPjo setAcceptTime(Timestamp acceptTime) {
        this.acceptTime = acceptTime;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public SmallLoanOrderPjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public String getRate() {
        return this.rate;
    }

    public SmallLoanOrderPjo setRate(String rate) {
        this.rate = rate;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public SmallLoanOrderPjo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public SmallLoanOrderPjo setState(Integer state) {
        this.state = state;
        return this;
    }

    public Timestamp getDoneTime() {
        return this.doneTime;
    }

    public SmallLoanOrderPjo setDoneTime(Timestamp doneTime) {
        this.doneTime = doneTime;
        return this;
    }

    public Integer getTermUnit() {
        return this.termUnit;
    }

    public SmallLoanOrderPjo setTermUnit(Integer termUnit) {
        this.termUnit = termUnit;
        return this;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public SmallLoanOrderPjo setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    public BigDecimal getFloatProp() {
        return this.floatProp;
    }

    public SmallLoanOrderPjo setFloatProp(BigDecimal floatProp) {
        this.floatProp = floatProp;
        return this;
    }

    public BigDecimal getCostAmount() {
        return this.costAmount;
    }

    public SmallLoanOrderPjo setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
        return this;
    }

    public BigDecimal getRepaymentAmount() {
        return this.repaymentAmount;
    }

    public SmallLoanOrderPjo setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
        return this;
    }

    public Integer getRepaymentMethod() {
        return this.repaymentMethod;
    }

    public SmallLoanOrderPjo setRepaymentMethod(Integer repaymentMethod) {
        this.repaymentMethod = repaymentMethod;
        return this;
    }

    public Integer getApplyPurpose() {
        return this.applyPurpose;
    }

    public SmallLoanOrderPjo setApplyPurpose(Integer applyPurpose) {
        this.applyPurpose = applyPurpose;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmallLoanOrderPjo (");

        sb.append(id);
        sb.append(", ").append(productId);
        sb.append(", ").append(userId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(userMobile);
        sb.append(", ").append(identityId);
        sb.append(", ").append(addressNow);
        sb.append(", ").append(applyAmount);
        sb.append(", ").append(actualAmount);
        sb.append(", ").append(creditPeriod);
        sb.append(", ").append(acceptTime);
        sb.append(", ").append(createAt);
        sb.append(", ").append(rate);
        sb.append(", ").append(status);
        sb.append(", ").append(state);
        sb.append(", ").append(doneTime);
        sb.append(", ").append(termUnit);
        sb.append(", ").append(period);
        sb.append(", ").append(floatProp);
        sb.append(", ").append(costAmount);
        sb.append(", ").append(repaymentAmount);
        sb.append(", ").append(repaymentMethod);
        sb.append(", ").append(applyPurpose);

        sb.append(")");
        return sb.toString();
    }
}