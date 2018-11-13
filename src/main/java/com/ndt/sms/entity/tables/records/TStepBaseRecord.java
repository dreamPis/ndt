/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TStepBase;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 步骤主表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TStepBaseRecord extends UpdatableRecordImpl<TStepBaseRecord> implements Record11<BigDecimal, String, String, BigDecimal[], BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal, Short, Short> {

    private static final long serialVersionUID = -275453087;

    /**
     * Setter for <code>ndt.t_step_base.id</code>. 主键
     */
    public TStepBaseRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.id</code>. 主键
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_step_base.step_name</code>. 步骤简写名称
     */
    public TStepBaseRecord setStepName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.step_name</code>. 步骤简写名称
     */
    public String getStepName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_step_base.step_full_name</code>. 步骤全名
     */
    public TStepBaseRecord setStepFullName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.step_full_name</code>. 步骤全名
     */
    public String getStepFullName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_step_base.step_role</code>. 步骤权限
     */
    public TStepBaseRecord setStepRole(BigDecimal... value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.step_role</code>. 步骤权限
     */
    public BigDecimal[] getStepRole() {
        return (BigDecimal[]) get(3);
    }

    /**
     * Setter for <code>ndt.t_step_base.policy_id</code>. 政策申办ID
     */
    public TStepBaseRecord setPolicyId(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.policy_id</code>. 政策申办ID
     */
    public BigDecimal getPolicyId() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>ndt.t_step_base.create_at</code>. 创建时间
     */
    public TStepBaseRecord setCreateAt(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ndt.t_step_base.create_by</code>. 创建人
     */
    public TStepBaseRecord setCreateBy(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.create_by</code>. 创建人
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ndt.t_step_base.update_at</code>. 修改时间
     */
    public TStepBaseRecord setUpdateAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.update_at</code>. 修改时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ndt.t_step_base.update_by</code>. 修改人
     */
    public TStepBaseRecord setUpdateBy(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.update_by</code>. 修改人
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ndt.t_step_base.status</code>. 状态
     */
    public TStepBaseRecord setStatus(Short value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.status</code>. 状态
     */
    public Short getStatus() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>ndt.t_step_base.sort</code>. 步骤排序
     */
    public TStepBaseRecord setSort(Short value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_step_base.sort</code>. 步骤排序
     */
    public Short getSort() {
        return (Short) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<BigDecimal, String, String, BigDecimal[], BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal, Short, Short> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<BigDecimal, String, String, BigDecimal[], BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal, Short, Short> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TStepBase.T_STEP_BASE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TStepBase.T_STEP_BASE.STEP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TStepBase.T_STEP_BASE.STEP_FULL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal[]> field4() {
        return TStepBase.T_STEP_BASE.STEP_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return TStepBase.T_STEP_BASE.POLICY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TStepBase.T_STEP_BASE.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TStepBase.T_STEP_BASE.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TStepBase.T_STEP_BASE.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return TStepBase.T_STEP_BASE.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return TStepBase.T_STEP_BASE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field11() {
        return TStepBase.T_STEP_BASE.SORT;
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
    public String component2() {
        return getStepName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getStepFullName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] component4() {
        return getStepRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getPolicyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getUpdateBy();
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
    public Short component11() {
        return getSort();
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
    public String value2() {
        return getStepName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStepFullName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] value4() {
        return getStepRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getPolicyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getUpdateBy();
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
    public Short value11() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value2(String value) {
        setStepName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value3(String value) {
        setStepFullName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value4(BigDecimal... value) {
        setStepRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value5(BigDecimal value) {
        setPolicyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value6(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value7(BigDecimal value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value8(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value9(BigDecimal value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value10(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord value11(Short value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStepBaseRecord values(BigDecimal value1, String value2, String value3, BigDecimal[] value4, BigDecimal value5, Timestamp value6, BigDecimal value7, Timestamp value8, BigDecimal value9, Short value10, Short value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TStepBaseRecord
     */
    public TStepBaseRecord() {
        super(TStepBase.T_STEP_BASE);
    }

    /**
     * Create a detached, initialised TStepBaseRecord
     */
    public TStepBaseRecord(BigDecimal id, String stepName, String stepFullName, BigDecimal[] stepRole, BigDecimal policyId, Timestamp createAt, BigDecimal createBy, Timestamp updateAt, BigDecimal updateBy, Short status, Short sort) {
        super(TStepBase.T_STEP_BASE);

        set(0, id);
        set(1, stepName);
        set(2, stepFullName);
        set(3, stepRole);
        set(4, policyId);
        set(5, createAt);
        set(6, createBy);
        set(7, updateAt);
        set(8, updateBy);
        set(9, status);
        set(10, sort);
    }
}
