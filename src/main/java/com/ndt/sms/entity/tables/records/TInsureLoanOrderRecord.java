/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TInsureLoanOrder;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 保险信贷订单
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInsureLoanOrderRecord extends UpdatableRecordImpl<TInsureLoanOrderRecord> implements Record18<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, String, BigDecimal, BigDecimal, Integer, Timestamp, Timestamp, String, Integer, Integer, Timestamp, Integer, Integer> {

    private static final long serialVersionUID = 1609999871;

    /**
     * Setter for <code>ndt.t_insure_loan_order.id</code>. 订单id
     */
    public TInsureLoanOrderRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.id</code>. 订单id
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.product_id</code>. 信贷产品ID
     */
    public TInsureLoanOrderRecord setProductId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.product_id</code>. 信贷产品ID
     */
    public BigDecimal getProductId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.user_id</code>. 申请用户ID
     */
    public TInsureLoanOrderRecord setUserId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.user_id</code>. 申请用户ID
     */
    public BigDecimal getUserId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.company_id</code>. 企业ID
     */
    public TInsureLoanOrderRecord setCompanyId(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.company_id</code>. 企业ID
     */
    public BigDecimal getCompanyId() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.user_mobile</code>. 用户手机号
     */
    public TInsureLoanOrderRecord setUserMobile(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.user_mobile</code>. 用户手机号
     */
    public String getUserMobile() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.identity_id</code>. 身份证号
     */
    public TInsureLoanOrderRecord setIdentityId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.identity_id</code>. 身份证号
     */
    public String getIdentityId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.address_now</code>. 现住地址
     */
    public TInsureLoanOrderRecord setAddressNow(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.address_now</code>. 现住地址
     */
    public String getAddressNow() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.apply_amount</code>. 申请贷款金额
     */
    public TInsureLoanOrderRecord setApplyAmount(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.apply_amount</code>. 申请贷款金额
     */
    public BigDecimal getApplyAmount() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.actual_amount</code>. 实际放款金额
     */
    public TInsureLoanOrderRecord setActualAmount(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.actual_amount</code>. 实际放款金额
     */
    public BigDecimal getActualAmount() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.credit_period</code>. 贷款期限
     */
    public TInsureLoanOrderRecord setCreditPeriod(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.credit_period</code>. 贷款期限
     */
    public Integer getCreditPeriod() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.accept_time</code>. 受理时间
     */
    public TInsureLoanOrderRecord setAcceptTime(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.accept_time</code>. 受理时间
     */
    public Timestamp getAcceptTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.create_at</code>. 创建时间
     */
    public TInsureLoanOrderRecord setCreateAt(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.rate</code>. 贷款利率
     */
    public TInsureLoanOrderRecord setRate(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.rate</code>. 贷款利率
     */
    public String getRate() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.status</code>. 贷款所处状态
     */
    public TInsureLoanOrderRecord setStatus(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.status</code>. 贷款所处状态
     */
    public Integer getStatus() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.state</code>. 2删除,1可见
     */
    public TInsureLoanOrderRecord setState(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.state</code>. 2删除,1可见
     */
    public Integer getState() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.done_time</code>. 放款时间
     */
    public TInsureLoanOrderRecord setDoneTime(Timestamp value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.done_time</code>. 放款时间
     */
    public Timestamp getDoneTime() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.term_unit</code>.   贷款期限单位
     */
    public TInsureLoanOrderRecord setTermUnit(Integer value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.term_unit</code>.   贷款期限单位
     */
    public Integer getTermUnit() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_order.period</code>. 当前订单状态阶段
     */
    public TInsureLoanOrderRecord setPeriod(Integer value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_order.period</code>. 当前订单状态阶段
     */
    public Integer getPeriod() {
        return (Integer) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, String, BigDecimal, BigDecimal, Integer, Timestamp, Timestamp, String, Integer, Integer, Timestamp, Integer, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, String, BigDecimal, BigDecimal, Integer, Timestamp, Timestamp, String, Integer, Integer, Timestamp, Integer, Integer> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.USER_MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.IDENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.ADDRESS_NOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.APPLY_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.ACTUAL_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.CREDIT_PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.ACCEPT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.DONE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.TERM_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return TInsureLoanOrder.T_INSURE_LOAN_ORDER.PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUserMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getIdentityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAddressNow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getApplyAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getActualAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getCreditPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getAcceptTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getDoneTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component17() {
        return getTermUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUserMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getIdentityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAddressNow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getApplyAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getActualAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getCreditPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getAcceptTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getDoneTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getTermUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value2(BigDecimal value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value3(BigDecimal value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value4(BigDecimal value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value5(String value) {
        setUserMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value6(String value) {
        setIdentityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value7(String value) {
        setAddressNow(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value8(BigDecimal value) {
        setApplyAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value9(BigDecimal value) {
        setActualAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value10(Integer value) {
        setCreditPeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value11(Timestamp value) {
        setAcceptTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value12(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value13(String value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value14(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value15(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value16(Timestamp value) {
        setDoneTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value17(Integer value) {
        setTermUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord value18(Integer value) {
        setPeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanOrderRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, String value5, String value6, String value7, BigDecimal value8, BigDecimal value9, Integer value10, Timestamp value11, Timestamp value12, String value13, Integer value14, Integer value15, Timestamp value16, Integer value17, Integer value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TInsureLoanOrderRecord
     */
    public TInsureLoanOrderRecord() {
        super(TInsureLoanOrder.T_INSURE_LOAN_ORDER);
    }

    /**
     * Create a detached, initialised TInsureLoanOrderRecord
     */
    public TInsureLoanOrderRecord(BigDecimal id, BigDecimal productId, BigDecimal userId, BigDecimal companyId, String userMobile, String identityId, String addressNow, BigDecimal applyAmount, BigDecimal actualAmount, Integer creditPeriod, Timestamp acceptTime, Timestamp createAt, String rate, Integer status, Integer state, Timestamp doneTime, Integer termUnit, Integer period) {
        super(TInsureLoanOrder.T_INSURE_LOAN_ORDER);

        set(0, id);
        set(1, productId);
        set(2, userId);
        set(3, companyId);
        set(4, userMobile);
        set(5, identityId);
        set(6, addressNow);
        set(7, applyAmount);
        set(8, actualAmount);
        set(9, creditPeriod);
        set(10, acceptTime);
        set(11, createAt);
        set(12, rate);
        set(13, status);
        set(14, state);
        set(15, doneTime);
        set(16, termUnit);
        set(17, period);
    }
}