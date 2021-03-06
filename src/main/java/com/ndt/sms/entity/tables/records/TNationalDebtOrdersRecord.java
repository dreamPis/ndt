/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TNationalDebtOrders;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 国债产品
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TNationalDebtOrdersRecord extends UpdatableRecordImpl<TNationalDebtOrdersRecord> implements Record14<BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, String, String, String, String, Timestamp, Integer, Timestamp, Integer, BigDecimal> {

    private static final long serialVersionUID = -138412162;

    /**
     * Setter for <code>ndt.t_national_debt_orders.id</code>. 国债id
     */
    public TNationalDebtOrdersRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.id</code>. 国债id
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.product_id</code>. 国债产品id
     */
    public TNationalDebtOrdersRecord setProductId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.product_id</code>. 国债产品id
     */
    public BigDecimal getProductId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.buy_user_id</code>. 购买者
     */
    public TNationalDebtOrdersRecord setBuyUserId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.buy_user_id</code>. 购买者
     */
    public BigDecimal getBuyUserId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.buy_issue_period</code>. 购买年限(发行期限id)
     */
    public TNationalDebtOrdersRecord setBuyIssuePeriod(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.buy_issue_period</code>. 购买年限(发行期限id)
     */
    public BigDecimal getBuyIssuePeriod() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.buy_sum</code>. 购买数量
     */
    public TNationalDebtOrdersRecord setBuySum(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.buy_sum</code>. 购买数量
     */
    public Integer getBuySum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.buy_name</code>. 购买者姓名
     */
    public TNationalDebtOrdersRecord setBuyName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.buy_name</code>. 购买者姓名
     */
    public String getBuyName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.buy_identity</code>. 购买者身份证
     */
    public TNationalDebtOrdersRecord setBuyIdentity(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.buy_identity</code>. 购买者身份证
     */
    public String getBuyIdentity() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.buy_mobile</code>. 购买者手机
     */
    public TNationalDebtOrdersRecord setBuyMobile(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.buy_mobile</code>. 购买者手机
     */
    public String getBuyMobile() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.buy_credit_card</code>. 银行卡号
     */
    public TNationalDebtOrdersRecord setBuyCreditCard(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.buy_credit_card</code>. 银行卡号
     */
    public String getBuyCreditCard() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.buy_time</code>. 购买时间
     */
    public TNationalDebtOrdersRecord setBuyTime(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.buy_time</code>. 购买时间
     */
    public Timestamp getBuyTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.state</code>. 是否受理
     */
    public TNationalDebtOrdersRecord setState(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.state</code>. 是否受理
     */
    public Integer getState() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.operate_time</code>. 操作时间
     */
    public TNationalDebtOrdersRecord setOperateTime(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.operate_time</code>. 操作时间
     */
    public Timestamp getOperateTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.variety</code>. 国债品种编码
     */
    public TNationalDebtOrdersRecord setVariety(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.variety</code>. 国债品种编码
     */
    public Integer getVariety() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>ndt.t_national_debt_orders.company_id</code>. 企业id
     */
    public TNationalDebtOrdersRecord setCompanyId(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_orders.company_id</code>. 企业id
     */
    public BigDecimal getCompanyId() {
        return (BigDecimal) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, String, String, String, String, Timestamp, Integer, Timestamp, Integer, BigDecimal> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, String, String, String, String, Timestamp, Integer, Timestamp, Integer, BigDecimal> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.BUY_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.BUY_ISSUE_PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.BUY_SUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.BUY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.BUY_IDENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.BUY_MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.BUY_CREDIT_CARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.BUY_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.OPERATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.VARIETY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS.COMPANY_ID;
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
        return getBuyUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getBuyIssuePeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getBuySum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getBuyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBuyIdentity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getBuyMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBuyCreditCard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getBuyTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getOperateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getVariety();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getCompanyId();
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
        return getBuyUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getBuyIssuePeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getBuySum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBuyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBuyIdentity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getBuyMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBuyCreditCard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getBuyTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getOperateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getVariety();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value2(BigDecimal value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value3(BigDecimal value) {
        setBuyUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value4(BigDecimal value) {
        setBuyIssuePeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value5(Integer value) {
        setBuySum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value6(String value) {
        setBuyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value7(String value) {
        setBuyIdentity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value8(String value) {
        setBuyMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value9(String value) {
        setBuyCreditCard(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value10(Timestamp value) {
        setBuyTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value11(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value12(Timestamp value) {
        setOperateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value13(Integer value) {
        setVariety(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord value14(BigDecimal value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrdersRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, Integer value5, String value6, String value7, String value8, String value9, Timestamp value10, Integer value11, Timestamp value12, Integer value13, BigDecimal value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TNationalDebtOrdersRecord
     */
    public TNationalDebtOrdersRecord() {
        super(TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS);
    }

    /**
     * Create a detached, initialised TNationalDebtOrdersRecord
     */
    public TNationalDebtOrdersRecord(BigDecimal id, BigDecimal productId, BigDecimal buyUserId, BigDecimal buyIssuePeriod, Integer buySum, String buyName, String buyIdentity, String buyMobile, String buyCreditCard, Timestamp buyTime, Integer state, Timestamp operateTime, Integer variety, BigDecimal companyId) {
        super(TNationalDebtOrders.T_NATIONAL_DEBT_ORDERS);

        set(0, id);
        set(1, productId);
        set(2, buyUserId);
        set(3, buyIssuePeriod);
        set(4, buySum);
        set(5, buyName);
        set(6, buyIdentity);
        set(7, buyMobile);
        set(8, buyCreditCard);
        set(9, buyTime);
        set(10, state);
        set(11, operateTime);
        set(12, variety);
        set(13, companyId);
    }
}
