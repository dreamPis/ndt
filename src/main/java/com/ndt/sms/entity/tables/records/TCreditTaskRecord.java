/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TCreditTask;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 信用任务设置
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCreditTaskRecord extends UpdatableRecordImpl<TCreditTaskRecord> implements Record6<BigDecimal, Integer, Short, String, Integer, String> {

    private static final long serialVersionUID = -319746285;

    /**
     * Setter for <code>ndt.t_credit_task.id</code>.
     */
    public TCreditTaskRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_task.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_credit_task.user_type</code>. 用户类型
     */
    public TCreditTaskRecord setUserType(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_task.user_type</code>. 用户类型
     */
    public Integer getUserType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ndt.t_credit_task.index</code>. 任务顺序
     */
    public TCreditTaskRecord setIndex(Short value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_task.index</code>. 任务顺序
     */
    public Short getIndex() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>ndt.t_credit_task.name</code>. 任务名
     */
    public TCreditTaskRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_task.name</code>. 任务名
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_credit_task.score</code>. 任务分数
     */
    public TCreditTaskRecord setScore(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_task.score</code>. 任务分数
     */
    public Integer getScore() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_credit_task.to_link</code>. 任务内容
     */
    public TCreditTaskRecord setToLink(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_credit_task.to_link</code>. 任务内容
     */
    public String getToLink() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<BigDecimal, Integer, Short, String, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<BigDecimal, Integer, Short, String, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TCreditTask.T_CREDIT_TASK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TCreditTask.T_CREDIT_TASK.USER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TCreditTask.T_CREDIT_TASK.INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TCreditTask.T_CREDIT_TASK.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TCreditTask.T_CREDIT_TASK.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TCreditTask.T_CREDIT_TASK.TO_LINK;
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
    public Integer component2() {
        return getUserType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getToLink();
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
    public Integer value2() {
        return getUserType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getToLink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditTaskRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditTaskRecord value2(Integer value) {
        setUserType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditTaskRecord value3(Short value) {
        setIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditTaskRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditTaskRecord value5(Integer value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditTaskRecord value6(String value) {
        setToLink(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditTaskRecord values(BigDecimal value1, Integer value2, Short value3, String value4, Integer value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCreditTaskRecord
     */
    public TCreditTaskRecord() {
        super(TCreditTask.T_CREDIT_TASK);
    }

    /**
     * Create a detached, initialised TCreditTaskRecord
     */
    public TCreditTaskRecord(BigDecimal id, Integer userType, Short index, String name, Integer score, String toLink) {
        super(TCreditTask.T_CREDIT_TASK);

        set(0, id);
        set(1, userType);
        set(2, index);
        set(3, name);
        set(4, score);
        set(5, toLink);
    }
}
