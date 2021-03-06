/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.ActHiDetail;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class ActHiDetailRecord extends UpdatableRecordImpl<ActHiDetailRecord> implements Record15<String, String, String, String, String, String, String, String, Integer, Timestamp, String, Double, Long, String, String> {

    private static final long serialVersionUID = 1612548194;

    /**
     * Setter for <code>ndt.act_hi_detail.id_</code>.
     */
    public ActHiDetailRecord setId_(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.id_</code>.
     */
    public String getId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.type_</code>.
     */
    public ActHiDetailRecord setType_(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.type_</code>.
     */
    public String getType_() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.proc_inst_id_</code>.
     */
    public ActHiDetailRecord setProcInstId_(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.proc_inst_id_</code>.
     */
    public String getProcInstId_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.execution_id_</code>.
     */
    public ActHiDetailRecord setExecutionId_(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.execution_id_</code>.
     */
    public String getExecutionId_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.task_id_</code>.
     */
    public ActHiDetailRecord setTaskId_(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.task_id_</code>.
     */
    public String getTaskId_() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.act_inst_id_</code>.
     */
    public ActHiDetailRecord setActInstId_(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.act_inst_id_</code>.
     */
    public String getActInstId_() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.name_</code>.
     */
    public ActHiDetailRecord setName_(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.name_</code>.
     */
    public String getName_() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.var_type_</code>.
     */
    public ActHiDetailRecord setVarType_(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.var_type_</code>.
     */
    public String getVarType_() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.rev_</code>.
     */
    public ActHiDetailRecord setRev_(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.rev_</code>.
     */
    public Integer getRev_() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.time_</code>.
     */
    public ActHiDetailRecord setTime_(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.time_</code>.
     */
    public Timestamp getTime_() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.bytearray_id_</code>.
     */
    public ActHiDetailRecord setBytearrayId_(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.bytearray_id_</code>.
     */
    public String getBytearrayId_() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.double_</code>.
     */
    public ActHiDetailRecord setDouble_(Double value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.double_</code>.
     */
    public Double getDouble_() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.long_</code>.
     */
    public ActHiDetailRecord setLong_(Long value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.long_</code>.
     */
    public Long getLong_() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.text_</code>.
     */
    public ActHiDetailRecord setText_(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.text_</code>.
     */
    public String getText_() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ndt.act_hi_detail.text2_</code>.
     */
    public ActHiDetailRecord setText2_(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_hi_detail.text2_</code>.
     */
    public String getText2_() {
        return (String) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, String, String, String, String, String, String, String, Integer, Timestamp, String, Double, Long, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, String, String, String, String, String, String, String, Integer, Timestamp, String, Double, Long, String, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ActHiDetail.ACT_HI_DETAIL.ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ActHiDetail.ACT_HI_DETAIL.TYPE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ActHiDetail.ACT_HI_DETAIL.PROC_INST_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ActHiDetail.ACT_HI_DETAIL.EXECUTION_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ActHiDetail.ACT_HI_DETAIL.TASK_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ActHiDetail.ACT_HI_DETAIL.ACT_INST_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ActHiDetail.ACT_HI_DETAIL.NAME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ActHiDetail.ACT_HI_DETAIL.VAR_TYPE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ActHiDetail.ACT_HI_DETAIL.REV_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return ActHiDetail.ACT_HI_DETAIL.TIME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ActHiDetail.ACT_HI_DETAIL.BYTEARRAY_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return ActHiDetail.ACT_HI_DETAIL.DOUBLE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return ActHiDetail.ACT_HI_DETAIL.LONG_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ActHiDetail.ACT_HI_DETAIL.TEXT_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ActHiDetail.ACT_HI_DETAIL.TEXT2_;
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
    public String component3() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getExecutionId_();
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
        return getActInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getVarType_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getRev_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getBytearrayId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component12() {
        return getDouble_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component13() {
        return getLong_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getText_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getText2_();
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
    public String value3() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getExecutionId_();
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
        return getActInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getVarType_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getRev_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getBytearrayId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getDouble_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getLong_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getText_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getText2_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value1(String value) {
        setId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value2(String value) {
        setType_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value3(String value) {
        setProcInstId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value4(String value) {
        setExecutionId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value5(String value) {
        setTaskId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value6(String value) {
        setActInstId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value7(String value) {
        setName_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value8(String value) {
        setVarType_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value9(Integer value) {
        setRev_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value10(Timestamp value) {
        setTime_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value11(String value) {
        setBytearrayId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value12(Double value) {
        setDouble_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value13(Long value) {
        setLong_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value14(String value) {
        setText_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord value15(String value) {
        setText2_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiDetailRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Integer value9, Timestamp value10, String value11, Double value12, Long value13, String value14, String value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActHiDetailRecord
     */
    public ActHiDetailRecord() {
        super(ActHiDetail.ACT_HI_DETAIL);
    }

    /**
     * Create a detached, initialised ActHiDetailRecord
     */
    public ActHiDetailRecord(String id_, String type_, String procInstId_, String executionId_, String taskId_, String actInstId_, String name_, String varType_, Integer rev_, Timestamp time_, String bytearrayId_, Double double_, Long long_, String text_, String text2_) {
        super(ActHiDetail.ACT_HI_DETAIL);

        set(0, id_);
        set(1, type_);
        set(2, procInstId_);
        set(3, executionId_);
        set(4, taskId_);
        set(5, actInstId_);
        set(6, name_);
        set(7, varType_);
        set(8, rev_);
        set(9, time_);
        set(10, bytearrayId_);
        set(11, double_);
        set(12, long_);
        set(13, text_);
        set(14, text2_);
    }
}
