/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TUserCredittaskLog;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户信用任务日志
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUserCredittaskLogRecord extends UpdatableRecordImpl<TUserCredittaskLogRecord> implements Record4<BigDecimal, BigDecimal, BigDecimal, Timestamp> {

    private static final long serialVersionUID = -411762867;

    /**
     * Setter for <code>ndt.t_user_credittask_log.id</code>.
     */
    public TUserCredittaskLogRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credittask_log.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_user_credittask_log.user_id</code>. 用户id
     */
    public TUserCredittaskLogRecord setUserId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credittask_log.user_id</code>. 用户id
     */
    public BigDecimal getUserId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_user_credittask_log.credittask_id</code>. 任务id
     */
    public TUserCredittaskLogRecord setCredittaskId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credittask_log.credittask_id</code>. 任务id
     */
    public BigDecimal getCredittaskId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_user_credittask_log.create_time</code>.
     */
    public TUserCredittaskLogRecord setCreateTime(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credittask_log.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<BigDecimal, BigDecimal, BigDecimal, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<BigDecimal, BigDecimal, BigDecimal, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TUserCredittaskLog.T_USER_CREDITTASK_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TUserCredittaskLog.T_USER_CREDITTASK_LOG.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TUserCredittaskLog.T_USER_CREDITTASK_LOG.CREDITTASK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TUserCredittaskLog.T_USER_CREDITTASK_LOG.CREATE_TIME;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getCredittaskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreateTime();
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getCredittaskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCredittaskLogRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCredittaskLogRecord value2(BigDecimal value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCredittaskLogRecord value3(BigDecimal value) {
        setCredittaskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCredittaskLogRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCredittaskLogRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TUserCredittaskLogRecord
     */
    public TUserCredittaskLogRecord() {
        super(TUserCredittaskLog.T_USER_CREDITTASK_LOG);
    }

    /**
     * Create a detached, initialised TUserCredittaskLogRecord
     */
    public TUserCredittaskLogRecord(BigDecimal id, BigDecimal userId, BigDecimal credittaskId, Timestamp createTime) {
        super(TUserCredittaskLog.T_USER_CREDITTASK_LOG);

        set(0, id);
        set(1, userId);
        set(2, credittaskId);
        set(3, createTime);
    }
}