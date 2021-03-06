/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TSiteMessage;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 站内消息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TSiteMessageRecord extends UpdatableRecordImpl<TSiteMessageRecord> implements Record4<BigDecimal, BigDecimal, BigDecimal, Boolean> {

    private static final long serialVersionUID = -1278190619;

    /**
     * Setter for <code>ndt.t_site_message.id</code>.
     */
    public TSiteMessageRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_site_message.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_site_message.message_id</code>. 消息ID
     */
    public TSiteMessageRecord setMessageId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_site_message.message_id</code>. 消息ID
     */
    public BigDecimal getMessageId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_site_message.accept_user_id</code>. 接收人ID
     */
    public TSiteMessageRecord setAcceptUserId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_site_message.accept_user_id</code>. 接收人ID
     */
    public BigDecimal getAcceptUserId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_site_message.is_read</code>. 是否已读
     */
    public TSiteMessageRecord setIsRead(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_site_message.is_read</code>. 是否已读
     */
    public Boolean getIsRead() {
        return (Boolean) get(3);
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
    public Row4<BigDecimal, BigDecimal, BigDecimal, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<BigDecimal, BigDecimal, BigDecimal, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TSiteMessage.T_SITE_MESSAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TSiteMessage.T_SITE_MESSAGE.MESSAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TSiteMessage.T_SITE_MESSAGE.ACCEPT_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return TSiteMessage.T_SITE_MESSAGE.IS_READ;
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
        return getMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getAcceptUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getIsRead();
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
        return getMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getAcceptUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getIsRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSiteMessageRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSiteMessageRecord value2(BigDecimal value) {
        setMessageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSiteMessageRecord value3(BigDecimal value) {
        setAcceptUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSiteMessageRecord value4(Boolean value) {
        setIsRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSiteMessageRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, Boolean value4) {
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
     * Create a detached TSiteMessageRecord
     */
    public TSiteMessageRecord() {
        super(TSiteMessage.T_SITE_MESSAGE);
    }

    /**
     * Create a detached, initialised TSiteMessageRecord
     */
    public TSiteMessageRecord(BigDecimal id, BigDecimal messageId, BigDecimal acceptUserId, Boolean isRead) {
        super(TSiteMessage.T_SITE_MESSAGE);

        set(0, id);
        set(1, messageId);
        set(2, acceptUserId);
        set(3, isRead);
    }
}
