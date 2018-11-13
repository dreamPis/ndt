/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TFinancialApply;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TFinancialApplyRecord extends UpdatableRecordImpl<TFinancialApplyRecord> {

    private static final long serialVersionUID = 456545318;

    /**
     * Setter for <code>ndt.t_financial_apply.id</code>. 主键
     */
    public TFinancialApplyRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.id</code>. 主键
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.user_id</code>. 申请用户ID
     */
    public TFinancialApplyRecord setUserId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.user_id</code>. 申请用户ID
     */
    public BigDecimal getUserId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.company_id</code>. 申请用户公司ID
     */
    public TFinancialApplyRecord setCompanyId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.company_id</code>. 申请用户公司ID
     */
    public BigDecimal getCompanyId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.org_id</code>. 机构ID
     */
    public TFinancialApplyRecord setOrgId(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.org_id</code>. 机构ID
     */
    public BigDecimal getOrgId() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.product_id</code>. 产品ID
     */
    public TFinancialApplyRecord setProductId(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.product_id</code>. 产品ID
     */
    public BigDecimal getProductId() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.amount</code>. 申请金额
     */
    public TFinancialApplyRecord setAmount(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.amount</code>. 申请金额
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.period</code>. 贷款状态(参照码表38)
     */
    public TFinancialApplyRecord setPeriod(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.period</code>. 贷款状态(参照码表38)
     */
    public Integer getPeriod() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.accept_time</code>. 受理时间
     */
    public TFinancialApplyRecord setAcceptTime(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.accept_time</code>. 受理时间
     */
    public Timestamp getAcceptTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.last_update_time</code>. 最后修改时间
     */
    public TFinancialApplyRecord setLastUpdateTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.last_update_time</code>. 最后修改时间
     */
    public Timestamp getLastUpdateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.state</code>. 流程状态
     */
    public TFinancialApplyRecord setState(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.state</code>. 流程状态
     */
    public Integer getState() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.create_by</code>. 创建人
     */
    public TFinancialApplyRecord setCreateBy(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.create_by</code>. 创建人
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.source_id</code>. 申请来源(参照码表70)
     */
    public TFinancialApplyRecord setSourceId(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.source_id</code>. 申请来源(参照码表70)
     */
    public Integer getSourceId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.diviison_id</code>. 申请所属区域ID
     */
    public TFinancialApplyRecord setDiviisonId(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.diviison_id</code>. 申请所属区域ID
     */
    public BigDecimal getDiviisonId() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.division_name</code>. 申请区域名
     */
    public TFinancialApplyRecord setDivisionName(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.division_name</code>. 申请区域名
     */
    public String getDivisionName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.accept_amount</code>. 受理金额
     */
    public TFinancialApplyRecord setAcceptAmount(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.accept_amount</code>. 受理金额
     */
    public BigDecimal getAcceptAmount() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.bank_org_id</code>. 放款银行机构ID
     */
    public TFinancialApplyRecord setBankOrgId(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.bank_org_id</code>. 放款银行机构ID
     */
    public BigDecimal getBankOrgId() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.apply_time</code>. 申请时间
     */
    public TFinancialApplyRecord setApplyTime(Timestamp value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.apply_time</code>. 申请时间
     */
    public Timestamp getApplyTime() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.bank_accept_state</code>. 银行受理流程状态
     */
    public TFinancialApplyRecord setBankAcceptState(Integer value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.bank_accept_state</code>. 银行受理流程状态
     */
    public Integer getBankAcceptState() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.bank_accept_period</code>. 银行受理状态(参照码表38)
     */
    public TFinancialApplyRecord setBankAcceptPeriod(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.bank_accept_period</code>. 银行受理状态(参照码表38)
     */
    public Integer getBankAcceptPeriod() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.apply_purpost</code>. 申请用途(参照码表21)
     */
    public TFinancialApplyRecord setApplyPurpost(Integer value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.apply_purpost</code>. 申请用途(参照码表21)
     */
    public Integer getApplyPurpost() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.apply_term</code>. 申请期限
     */
    public TFinancialApplyRecord setApplyTerm(Integer value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.apply_term</code>. 申请期限
     */
    public Integer getApplyTerm() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.remark</code>. 担保描述
     */
    public TFinancialApplyRecord setRemark(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.remark</code>. 担保描述
     */
    public String getRemark() {
        return (String) get(21);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.apply_type</code>. 申请类型(参照码表82)
     */
    public TFinancialApplyRecord setApplyType(Integer value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.apply_type</code>. 申请类型(参照码表82)
     */
    public Integer getApplyType() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.bank_accept_amount</code>. 银行受理金额
     */
    public TFinancialApplyRecord setBankAcceptAmount(BigDecimal value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.bank_accept_amount</code>. 银行受理金额
     */
    public BigDecimal getBankAcceptAmount() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.apply_term_unit</code>. 申请期限单位
     */
    public TFinancialApplyRecord setApplyTermUnit(Integer value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.apply_term_unit</code>. 申请期限单位
     */
    public Integer getApplyTermUnit() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>ndt.t_financial_apply.apply_amount_unit</code>. 申请金额单位
     */
    public TFinancialApplyRecord setApplyAmountUnit(Integer value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_financial_apply.apply_amount_unit</code>. 申请金额单位
     */
    public Integer getApplyAmountUnit() {
        return (Integer) get(25);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<BigDecimal> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TFinancialApplyRecord
     */
    public TFinancialApplyRecord() {
        super(TFinancialApply.T_FINANCIAL_APPLY);
    }

    /**
     * Create a detached, initialised TFinancialApplyRecord
     */
    public TFinancialApplyRecord(BigDecimal id, BigDecimal userId, BigDecimal companyId, BigDecimal orgId, BigDecimal productId, BigDecimal amount, Integer period, Timestamp acceptTime, Timestamp lastUpdateTime, Integer state, BigDecimal createBy, Integer sourceId, BigDecimal diviisonId, String divisionName, BigDecimal acceptAmount, BigDecimal bankOrgId, Timestamp applyTime, Integer bankAcceptState, Integer bankAcceptPeriod, Integer applyPurpost, Integer applyTerm, String remark, Integer applyType, BigDecimal bankAcceptAmount, Integer applyTermUnit, Integer applyAmountUnit) {
        super(TFinancialApply.T_FINANCIAL_APPLY);

        set(0, id);
        set(1, userId);
        set(2, companyId);
        set(3, orgId);
        set(4, productId);
        set(5, amount);
        set(6, period);
        set(7, acceptTime);
        set(8, lastUpdateTime);
        set(9, state);
        set(10, createBy);
        set(11, sourceId);
        set(12, diviisonId);
        set(13, divisionName);
        set(14, acceptAmount);
        set(15, bankOrgId);
        set(16, applyTime);
        set(17, bankAcceptState);
        set(18, bankAcceptPeriod);
        set(19, applyPurpost);
        set(20, applyTerm);
        set(21, remark);
        set(22, applyType);
        set(23, bankAcceptAmount);
        set(24, applyTermUnit);
        set(25, applyAmountUnit);
    }
}
