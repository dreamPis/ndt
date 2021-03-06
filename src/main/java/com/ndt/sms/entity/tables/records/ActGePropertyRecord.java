/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.ActGeProperty;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class ActGePropertyRecord extends UpdatableRecordImpl<ActGePropertyRecord> implements Record3<String, String, Integer> {

    private static final long serialVersionUID = 418910917;

    /**
     * Setter for <code>ndt.act_ge_property.name_</code>.
     */
    public ActGePropertyRecord setName_(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ge_property.name_</code>.
     */
    public String getName_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ndt.act_ge_property.value_</code>.
     */
    public ActGePropertyRecord setValue_(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ge_property.value_</code>.
     */
    public String getValue_() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.act_ge_property.rev_</code>.
     */
    public ActGePropertyRecord setRev_(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ge_property.rev_</code>.
     */
    public Integer getRev_() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ActGeProperty.ACT_GE_PROPERTY.NAME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ActGeProperty.ACT_GE_PROPERTY.VALUE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ActGeProperty.ACT_GE_PROPERTY.REV_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getValue_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getRev_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getValue_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRev_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActGePropertyRecord value1(String value) {
        setName_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActGePropertyRecord value2(String value) {
        setValue_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActGePropertyRecord value3(Integer value) {
        setRev_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActGePropertyRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActGePropertyRecord
     */
    public ActGePropertyRecord() {
        super(ActGeProperty.ACT_GE_PROPERTY);
    }

    /**
     * Create a detached, initialised ActGePropertyRecord
     */
    public ActGePropertyRecord(String name_, String value_, Integer rev_) {
        super(ActGeProperty.ACT_GE_PROPERTY);

        set(0, name_);
        set(1, value_);
        set(2, rev_);
    }
}
