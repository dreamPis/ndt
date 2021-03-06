/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TVillageCompanyPayment;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 村站采集的公司缴费信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyPaymentRecord extends UpdatableRecordImpl<TVillageCompanyPaymentRecord> implements Record14<BigDecimal, BigDecimal, String, BigDecimal, String, String, String, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 779459839;

    /**
     * Setter for <code>ndt.t_village_company_payment.id</code>.
     */
    public TVillageCompanyPaymentRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.village_company_info_id</code>. 村站采集的公司详情ID
     */
    public TVillageCompanyPaymentRecord setVillageCompanyInfoId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.village_company_info_id</code>. 村站采集的公司详情ID
     */
    public BigDecimal getVillageCompanyInfoId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.name</code>. 缴费名称
     */
    public TVillageCompanyPaymentRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.name</code>. 缴费名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.pay_amt</code>. 缴费金额
     */
    public TVillageCompanyPaymentRecord setPayAmt(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.pay_amt</code>. 缴费金额
     */
    public BigDecimal getPayAmt() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.pay_date</code>. 缴费日期
     */
    public TVillageCompanyPaymentRecord setPayDate(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.pay_date</code>. 缴费日期
     */
    public String getPayDate() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.pay_type</code>. 缴费类型
     */
    public TVillageCompanyPaymentRecord setPayType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.pay_type</code>. 缴费类型
     */
    public String getPayType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.consumption</code>. 缴费用量
     */
    public TVillageCompanyPaymentRecord setConsumption(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.consumption</code>. 缴费用量
     */
    public String getConsumption() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.goods_num</code>. 商品数量
     */
    public TVillageCompanyPaymentRecord setGoodsNum(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.goods_num</code>. 商品数量
     */
    public String getGoodsNum() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.img_url</code>. 缴费图片地址
     */
    public TVillageCompanyPaymentRecord setImgUrl(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.img_url</code>. 缴费图片地址
     */
    public String getImgUrl() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.status</code>.
     */
    public TVillageCompanyPaymentRecord setStatus(Short value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.status</code>.
     */
    public Short getStatus() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.create_user</code>.
     */
    public TVillageCompanyPaymentRecord setCreateUser(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.create_time</code>.
     */
    public TVillageCompanyPaymentRecord setCreateTime(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.update_user</code>.
     */
    public TVillageCompanyPaymentRecord setUpdateUser(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>ndt.t_village_company_payment.update_time</code>.
     */
    public TVillageCompanyPaymentRecord setUpdateTime(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_payment.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(13);
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
    public Row14<BigDecimal, BigDecimal, String, BigDecimal, String, String, String, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<BigDecimal, BigDecimal, String, BigDecimal, String, String, String, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.VILLAGE_COMPANY_INFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.PAY_AMT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.PAY_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.PAY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.CONSUMPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.GOODS_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.IMG_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT.UPDATE_TIME;
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
        return getVillageCompanyInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getPayAmt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPayDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPayType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getConsumption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getGoodsNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getUpdateTime();
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
        return getVillageCompanyInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getPayAmt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPayDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPayType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getConsumption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getGoodsNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value2(BigDecimal value) {
        setVillageCompanyInfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value4(BigDecimal value) {
        setPayAmt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value5(String value) {
        setPayDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value6(String value) {
        setPayType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value7(String value) {
        setConsumption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value8(String value) {
        setGoodsNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value9(String value) {
        setImgUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value10(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value11(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value12(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value13(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord value14(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPaymentRecord values(BigDecimal value1, BigDecimal value2, String value3, BigDecimal value4, String value5, String value6, String value7, String value8, String value9, Short value10, BigDecimal value11, Timestamp value12, BigDecimal value13, Timestamp value14) {
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
     * Create a detached TVillageCompanyPaymentRecord
     */
    public TVillageCompanyPaymentRecord() {
        super(TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT);
    }

    /**
     * Create a detached, initialised TVillageCompanyPaymentRecord
     */
    public TVillageCompanyPaymentRecord(BigDecimal id, BigDecimal villageCompanyInfoId, String name, BigDecimal payAmt, String payDate, String payType, String consumption, String goodsNum, String imgUrl, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime) {
        super(TVillageCompanyPayment.T_VILLAGE_COMPANY_PAYMENT);

        set(0, id);
        set(1, villageCompanyInfoId);
        set(2, name);
        set(3, payAmt);
        set(4, payDate);
        set(5, payType);
        set(6, consumption);
        set(7, goodsNum);
        set(8, imgUrl);
        set(9, status);
        set(10, createUser);
        set(11, createTime);
        set(12, updateUser);
        set(13, updateTime);
    }
}
