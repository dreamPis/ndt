/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;


/**
 * 国债产品期限
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NationalDebtTermPjo implements Serializable {

    private static final long serialVersionUID = 644238902;

    private BigDecimal id;
    private BigDecimal productId;
    private Integer    issuePeriod;
    private Integer    amount;
    private Integer    singleBuySum;
    private Integer    amountBalance;
    private String     annualInterestRate;

    public NationalDebtTermPjo() {}

    public NationalDebtTermPjo(NationalDebtTermPjo value) {
        this.id = value.id;
        this.productId = value.productId;
        this.issuePeriod = value.issuePeriod;
        this.amount = value.amount;
        this.singleBuySum = value.singleBuySum;
        this.amountBalance = value.amountBalance;
        this.annualInterestRate = value.annualInterestRate;
    }

    public NationalDebtTermPjo(
        BigDecimal id,
        BigDecimal productId,
        Integer    issuePeriod,
        Integer    amount,
        Integer    singleBuySum,
        Integer    amountBalance,
        String     annualInterestRate
    ) {
        this.id = id;
        this.productId = productId;
        this.issuePeriod = issuePeriod;
        this.amount = amount;
        this.singleBuySum = singleBuySum;
        this.amountBalance = amountBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public NationalDebtTermPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getProductId() {
        return this.productId;
    }

    public NationalDebtTermPjo setProductId(BigDecimal productId) {
        this.productId = productId;
        return this;
    }

    public Integer getIssuePeriod() {
        return this.issuePeriod;
    }

    public NationalDebtTermPjo setIssuePeriod(Integer issuePeriod) {
        this.issuePeriod = issuePeriod;
        return this;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public NationalDebtTermPjo setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public Integer getSingleBuySum() {
        return this.singleBuySum;
    }

    public NationalDebtTermPjo setSingleBuySum(Integer singleBuySum) {
        this.singleBuySum = singleBuySum;
        return this;
    }

    public Integer getAmountBalance() {
        return this.amountBalance;
    }

    public NationalDebtTermPjo setAmountBalance(Integer amountBalance) {
        this.amountBalance = amountBalance;
        return this;
    }

    public String getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public NationalDebtTermPjo setAnnualInterestRate(String annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NationalDebtTermPjo (");

        sb.append(id);
        sb.append(", ").append(productId);
        sb.append(", ").append(issuePeriod);
        sb.append(", ").append(amount);
        sb.append(", ").append(singleBuySum);
        sb.append(", ").append(amountBalance);
        sb.append(", ").append(annualInterestRate);

        sb.append(")");
        return sb.toString();
    }
}
