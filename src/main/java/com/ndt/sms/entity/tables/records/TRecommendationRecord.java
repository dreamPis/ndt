/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TRecommendation;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 推荐表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRecommendationRecord extends UpdatableRecordImpl<TRecommendationRecord> implements Record10<BigDecimal, Integer, Short, BigDecimal, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal> {

    private static final long serialVersionUID = 142932427;

    /**
     * Setter for <code>ndt.t_recommendation.id</code>.
     */
    public TRecommendationRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_recommendation.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_recommendation.type</code>. 类型
     */
    public TRecommendationRecord setType(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_recommendation.type</code>. 类型
     */
    public Integer getType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ndt.t_recommendation.index</code>. 顺序
     */
    public TRecommendationRecord setIndex(Short value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_recommendation.index</code>. 顺序
     */
    public Short getIndex() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>ndt.t_recommendation.ref_id</code>. 关联ID
     */
    public TRecommendationRecord setRefId(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_recommendation.ref_id</code>. 关联ID
     */
    public BigDecimal getRefId() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_recommendation.status</code>.
     */
    public TRecommendationRecord setStatus(Short value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_recommendation.status</code>.
     */
    public Short getStatus() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>ndt.t_recommendation.create_by</code>.
     */
    public TRecommendationRecord setCreateBy(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_recommendation.create_by</code>.
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>ndt.t_recommendation.create_at</code>.
     */
    public TRecommendationRecord setCreateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_recommendation.create_at</code>.
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ndt.t_recommendation.update_by</code>.
     */
    public TRecommendationRecord setUpdateBy(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_recommendation.update_by</code>.
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_recommendation.update_at</code>.
     */
    public TRecommendationRecord setUpdateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_recommendation.update_at</code>.
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_recommendation.division_id</code>. 行政区划id
     */
    public TRecommendationRecord setDivisionId(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_recommendation.division_id</code>. 行政区划id
     */
    public BigDecimal getDivisionId() {
        return (BigDecimal) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, Integer, Short, BigDecimal, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, Integer, Short, BigDecimal, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TRecommendation.T_RECOMMENDATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TRecommendation.T_RECOMMENDATION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TRecommendation.T_RECOMMENDATION.INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TRecommendation.T_RECOMMENDATION.REF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return TRecommendation.T_RECOMMENDATION.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TRecommendation.T_RECOMMENDATION.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TRecommendation.T_RECOMMENDATION.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TRecommendation.T_RECOMMENDATION.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TRecommendation.T_RECOMMENDATION.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return TRecommendation.T_RECOMMENDATION.DIVISION_ID;
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
        return getType();
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
    public BigDecimal component4() {
        return getRefId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getDivisionId();
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
        return getType();
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
    public BigDecimal value4() {
        return getRefId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getDivisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord value2(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord value3(Short value) {
        setIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord value4(BigDecimal value) {
        setRefId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord value5(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord value6(BigDecimal value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord value7(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord value8(BigDecimal value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord value9(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord value10(BigDecimal value) {
        setDivisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendationRecord values(BigDecimal value1, Integer value2, Short value3, BigDecimal value4, Short value5, BigDecimal value6, Timestamp value7, BigDecimal value8, Timestamp value9, BigDecimal value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRecommendationRecord
     */
    public TRecommendationRecord() {
        super(TRecommendation.T_RECOMMENDATION);
    }

    /**
     * Create a detached, initialised TRecommendationRecord
     */
    public TRecommendationRecord(BigDecimal id, Integer type, Short index, BigDecimal refId, Short status, BigDecimal createBy, Timestamp createAt, BigDecimal updateBy, Timestamp updateAt, BigDecimal divisionId) {
        super(TRecommendation.T_RECOMMENDATION);

        set(0, id);
        set(1, type);
        set(2, index);
        set(3, refId);
        set(4, status);
        set(5, createBy);
        set(6, createAt);
        set(7, updateBy);
        set(8, updateAt);
        set(9, divisionId);
    }
}
