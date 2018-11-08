/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TPolicyServiceSync;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 政策服务流程处理
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPolicyServiceSyncRecord extends UpdatableRecordImpl<TPolicyServiceSyncRecord> implements Record9<BigDecimal, BigDecimal, BigDecimal, Integer, String, Timestamp, Timestamp, String, Integer> {

    private static final long serialVersionUID = 1888570536;

    /**
     * Setter for <code>ndt.t_policy_service_sync.id</code>. 自增id
     */
    public TPolicyServiceSyncRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_sync.id</code>. 自增id
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_policy_service_sync.apply_id</code>. 申请id
     */
    public TPolicyServiceSyncRecord setApplyId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_sync.apply_id</code>. 申请id
     */
    public BigDecimal getApplyId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_policy_service_sync.create_by</code>. 操作者
     */
    public TPolicyServiceSyncRecord setCreateBy(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_sync.create_by</code>. 操作者
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_policy_service_sync.apply_state</code>. 申请状态
     */
    public TPolicyServiceSyncRecord setApplyState(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_sync.apply_state</code>. 申请状态
     */
    public Integer getApplyState() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ndt.t_policy_service_sync.apply_state_name</code>. 状态名称
     */
    public TPolicyServiceSyncRecord setApplyStateName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_sync.apply_state_name</code>. 状态名称
     */
    public String getApplyStateName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_policy_service_sync.create_time</code>. 创建时间
     */
    public TPolicyServiceSyncRecord setCreateTime(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_sync.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ndt.t_policy_service_sync.update_time</code>. 更新时间
     */
    public TPolicyServiceSyncRecord setUpdateTime(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_sync.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ndt.t_policy_service_sync.note</code>. 备注
     */
    public TPolicyServiceSyncRecord setNote(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_sync.note</code>. 备注
     */
    public String getNote() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.t_policy_service_sync.status</code>. 通过状态
     */
    public TPolicyServiceSyncRecord setStatus(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_sync.status</code>. 通过状态
     */
    public Integer getStatus() {
        return (Integer) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<BigDecimal, BigDecimal, BigDecimal, Integer, String, Timestamp, Timestamp, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<BigDecimal, BigDecimal, BigDecimal, Integer, String, Timestamp, Timestamp, String, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TPolicyServiceSync.T_POLICY_SERVICE_SYNC.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TPolicyServiceSync.T_POLICY_SERVICE_SYNC.APPLY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TPolicyServiceSync.T_POLICY_SERVICE_SYNC.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TPolicyServiceSync.T_POLICY_SERVICE_SYNC.APPLY_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TPolicyServiceSync.T_POLICY_SERVICE_SYNC.APPLY_STATE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TPolicyServiceSync.T_POLICY_SERVICE_SYNC.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TPolicyServiceSync.T_POLICY_SERVICE_SYNC.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TPolicyServiceSync.T_POLICY_SERVICE_SYNC.NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return TPolicyServiceSync.T_POLICY_SERVICE_SYNC.STATUS;
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
        return getApplyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getApplyState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getApplyStateName();
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
    public Timestamp component7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getStatus();
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
        return getApplyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getApplyState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getApplyStateName();
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
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSyncRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSyncRecord value2(BigDecimal value) {
        setApplyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSyncRecord value3(BigDecimal value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSyncRecord value4(Integer value) {
        setApplyState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSyncRecord value5(String value) {
        setApplyStateName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSyncRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSyncRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSyncRecord value8(String value) {
        setNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSyncRecord value9(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSyncRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, Integer value4, String value5, Timestamp value6, Timestamp value7, String value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPolicyServiceSyncRecord
     */
    public TPolicyServiceSyncRecord() {
        super(TPolicyServiceSync.T_POLICY_SERVICE_SYNC);
    }

    /**
     * Create a detached, initialised TPolicyServiceSyncRecord
     */
    public TPolicyServiceSyncRecord(BigDecimal id, BigDecimal applyId, BigDecimal createBy, Integer applyState, String applyStateName, Timestamp createTime, Timestamp updateTime, String note, Integer status) {
        super(TPolicyServiceSync.T_POLICY_SERVICE_SYNC);

        set(0, id);
        set(1, applyId);
        set(2, createBy);
        set(3, applyState);
        set(4, applyStateName);
        set(5, createTime);
        set(6, updateTime);
        set(7, note);
        set(8, status);
    }
}