/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TCreditDivision;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class TCreditDivisionRecord extends UpdatableRecordImpl<TCreditDivisionRecord> implements Record8<BigDecimal, BigDecimal, Boolean, String, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 1279125660;

    /**
     * Setter for <code>ndt.t_credit_division.id</code>. 主键
     */
    public TCreditDivisionRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_division.id</code>. 主键
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_credit_division.division_id</code>. 区域ID
     */
    public TCreditDivisionRecord setDivisionId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_division.division_id</code>. 区域ID
     */
    public BigDecimal getDivisionId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_credit_division.is_credit</code>. 是否信用乡镇村
     */
    public TCreditDivisionRecord setIsCredit(Boolean value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_division.is_credit</code>. 是否信用乡镇村
     */
    public Boolean getIsCredit() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>ndt.t_credit_division.credit_year</code>. 年份
     */
    public TCreditDivisionRecord setCreditYear(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_division.credit_year</code>. 年份
     */
    public String getCreditYear() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_credit_division.create_user</code>.
     */
    public TCreditDivisionRecord setCreateUser(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_division.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>ndt.t_credit_division.create_time</code>.
     */
    public TCreditDivisionRecord setCreateTime(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_division.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ndt.t_credit_division.update_user</code>.
     */
    public TCreditDivisionRecord setUpdateUser(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_division.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ndt.t_credit_division.update_time</code>.
     */
    public TCreditDivisionRecord setUpdateTime(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_division.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<BigDecimal, BigDecimal, Boolean, String, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<BigDecimal, BigDecimal, Boolean, String, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TCreditDivision.T_CREDIT_DIVISION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TCreditDivision.T_CREDIT_DIVISION.DIVISION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return TCreditDivision.T_CREDIT_DIVISION.IS_CREDIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TCreditDivision.T_CREDIT_DIVISION.CREDIT_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return TCreditDivision.T_CREDIT_DIVISION.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TCreditDivision.T_CREDIT_DIVISION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TCreditDivision.T_CREDIT_DIVISION.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TCreditDivision.T_CREDIT_DIVISION.UPDATE_TIME;
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
    public Boolean component3() {
        return getIsCredit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCreditYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
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
        return getDivisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getIsCredit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCreditYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivisionRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivisionRecord value2(BigDecimal value) {
        setDivisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivisionRecord value3(Boolean value) {
        setIsCredit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivisionRecord value4(String value) {
        setCreditYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivisionRecord value5(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivisionRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivisionRecord value7(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivisionRecord value8(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivisionRecord values(BigDecimal value1, BigDecimal value2, Boolean value3, String value4, BigDecimal value5, Timestamp value6, BigDecimal value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCreditDivisionRecord
     */
    public TCreditDivisionRecord() {
        super(TCreditDivision.T_CREDIT_DIVISION);
    }

    /**
     * Create a detached, initialised TCreditDivisionRecord
     */
    public TCreditDivisionRecord(BigDecimal id, BigDecimal divisionId, Boolean isCredit, String creditYear, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime) {
        super(TCreditDivision.T_CREDIT_DIVISION);

        set(0, id);
        set(1, divisionId);
        set(2, isCredit);
        set(3, creditYear);
        set(4, createUser);
        set(5, createTime);
        set(6, updateUser);
        set(7, updateTime);
    }
}
