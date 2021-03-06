/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TDiscountScaleInfo;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 各个区县贴息比例
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDiscountScaleInfoRecord extends UpdatableRecordImpl<TDiscountScaleInfoRecord> implements Record5<BigDecimal, BigDecimal, String, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -493703601;

    /**
     * Setter for <code>ndt.t_discount_scale_info.id</code>. 主键
     */
    public TDiscountScaleInfoRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_discount_scale_info.id</code>. 主键
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_discount_scale_info.division_id</code>. 区域ID
     */
    public TDiscountScaleInfoRecord setDivisionId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_discount_scale_info.division_id</code>. 区域ID
     */
    public BigDecimal getDivisionId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_discount_scale_info.division_name</code>. 区域名称
     */
    public TDiscountScaleInfoRecord setDivisionName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_discount_scale_info.division_name</code>. 区域名称
     */
    public String getDivisionName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_discount_scale_info.city</code>. 市财政贴息比例
     */
    public TDiscountScaleInfoRecord setCity(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_discount_scale_info.city</code>. 市财政贴息比例
     */
    public BigDecimal getCity() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_discount_scale_info.district</code>. 区县财政贴息比例
     */
    public TDiscountScaleInfoRecord setDistrict(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_discount_scale_info.district</code>. 区县财政贴息比例
     */
    public BigDecimal getDistrict() {
        return (BigDecimal) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<BigDecimal, BigDecimal, String, BigDecimal, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<BigDecimal, BigDecimal, String, BigDecimal, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TDiscountScaleInfo.T_DISCOUNT_SCALE_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TDiscountScaleInfo.T_DISCOUNT_SCALE_INFO.DIVISION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TDiscountScaleInfo.T_DISCOUNT_SCALE_INFO.DIVISION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TDiscountScaleInfo.T_DISCOUNT_SCALE_INFO.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return TDiscountScaleInfo.T_DISCOUNT_SCALE_INFO.DISTRICT;
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
        return getDivisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDivisionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getDistrict();
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
        return getDivisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDivisionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getDistrict();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDiscountScaleInfoRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDiscountScaleInfoRecord value2(BigDecimal value) {
        setDivisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDiscountScaleInfoRecord value3(String value) {
        setDivisionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDiscountScaleInfoRecord value4(BigDecimal value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDiscountScaleInfoRecord value5(BigDecimal value) {
        setDistrict(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDiscountScaleInfoRecord values(BigDecimal value1, BigDecimal value2, String value3, BigDecimal value4, BigDecimal value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TDiscountScaleInfoRecord
     */
    public TDiscountScaleInfoRecord() {
        super(TDiscountScaleInfo.T_DISCOUNT_SCALE_INFO);
    }

    /**
     * Create a detached, initialised TDiscountScaleInfoRecord
     */
    public TDiscountScaleInfoRecord(BigDecimal id, BigDecimal divisionId, String divisionName, BigDecimal city, BigDecimal district) {
        super(TDiscountScaleInfo.T_DISCOUNT_SCALE_INFO);

        set(0, id);
        set(1, divisionId);
        set(2, divisionName);
        set(3, city);
        set(4, district);
    }
}
