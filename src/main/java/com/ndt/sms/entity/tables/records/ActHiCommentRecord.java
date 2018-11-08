/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.ActHiComment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class ActHiCommentRecord extends UpdatableRecordImpl<ActHiCommentRecord> implements Record9<String, String, Timestamp, String, String, String, String, String, byte[]> {

    private static final long serialVersionUID = 1906663790;

    /**
     * Setter for <code>ndt.act_hi_comment.id_</code>.
     */
    public ActHiCommentRecord setId_(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_comment.id_</code>.
     */
    public String getId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ndt.act_hi_comment.type_</code>.
     */
    public ActHiCommentRecord setType_(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_comment.type_</code>.
     */
    public String getType_() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.act_hi_comment.time_</code>.
     */
    public ActHiCommentRecord setTime_(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_comment.time_</code>.
     */
    public Timestamp getTime_() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>ndt.act_hi_comment.user_id_</code>.
     */
    public ActHiCommentRecord setUserId_(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_comment.user_id_</code>.
     */
    public String getUserId_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.act_hi_comment.task_id_</code>.
     */
    public ActHiCommentRecord setTaskId_(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_comment.task_id_</code>.
     */
    public String getTaskId_() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.act_hi_comment.proc_inst_id_</code>.
     */
    public ActHiCommentRecord setProcInstId_(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_comment.proc_inst_id_</code>.
     */
    public String getProcInstId_() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.act_hi_comment.action_</code>.
     */
    public ActHiCommentRecord setAction_(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_comment.action_</code>.
     */
    public String getAction_() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.act_hi_comment.message_</code>.
     */
    public ActHiCommentRecord setMessage_(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_comment.message_</code>.
     */
    public String getMessage_() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.act_hi_comment.full_msg_</code>.
     */
    public ActHiCommentRecord setFullMsg_(byte... value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_comment.full_msg_</code>.
     */
    public byte[] getFullMsg_() {
        return (byte[]) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Timestamp, String, String, String, String, String, byte[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Timestamp, String, String, String, String, String, byte[]> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ActHiComment.ACT_HI_COMMENT.ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ActHiComment.ACT_HI_COMMENT.TYPE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ActHiComment.ACT_HI_COMMENT.TIME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ActHiComment.ACT_HI_COMMENT.USER_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ActHiComment.ACT_HI_COMMENT.TASK_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ActHiComment.ACT_HI_COMMENT.PROC_INST_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ActHiComment.ACT_HI_COMMENT.ACTION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ActHiComment.ACT_HI_COMMENT.MESSAGE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field9() {
        return ActHiComment.ACT_HI_COMMENT.FULL_MSG_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getType_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUserId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTaskId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAction_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getMessage_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component9() {
        return getFullMsg_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getType_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUserId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTaskId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAction_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMessage_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value9() {
        return getFullMsg_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiCommentRecord value1(String value) {
        setId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiCommentRecord value2(String value) {
        setType_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiCommentRecord value3(Timestamp value) {
        setTime_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiCommentRecord value4(String value) {
        setUserId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiCommentRecord value5(String value) {
        setTaskId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiCommentRecord value6(String value) {
        setProcInstId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiCommentRecord value7(String value) {
        setAction_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiCommentRecord value8(String value) {
        setMessage_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiCommentRecord value9(byte... value) {
        setFullMsg_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiCommentRecord values(String value1, String value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, byte[] value9) {
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
     * Create a detached ActHiCommentRecord
     */
    public ActHiCommentRecord() {
        super(ActHiComment.ACT_HI_COMMENT);
    }

    /**
     * Create a detached, initialised ActHiCommentRecord
     */
    public ActHiCommentRecord(String id_, String type_, Timestamp time_, String userId_, String taskId_, String procInstId_, String action_, String message_, byte[] fullMsg_) {
        super(ActHiComment.ACT_HI_COMMENT);

        set(0, id_);
        set(1, type_);
        set(2, time_);
        set(3, userId_);
        set(4, taskId_);
        set(5, procInstId_);
        set(6, action_);
        set(7, message_);
        set(8, fullMsg_);
    }
}