/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TRole;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 角色表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRoleRecord extends UpdatableRecordImpl<TRoleRecord> implements Record6<BigDecimal, String, String, Boolean, Timestamp, BigDecimal> {

    private static final long serialVersionUID = 2047884589;

    /**
     * Setter for <code>ndt.t_role.id</code>.
     */
    public TRoleRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_role.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_role.name</code>. 角色名称
     */
    public TRoleRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_role.name</code>. 角色名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_role.description</code>. 描述
     */
    public TRoleRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_role.description</code>. 描述
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_role.is_admin</code>. 是否是管理员
     */
    public TRoleRecord setIsAdmin(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_role.is_admin</code>. 是否是管理员
     */
    public Boolean getIsAdmin() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>ndt.t_role.create_at</code>. 创建时间
     */
    public TRoleRecord setCreateAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_role.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>ndt.t_role.create_by</code>. 创建人
     */
    public TRoleRecord setCreateBy(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_role.create_by</code>. 创建人
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(5);
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
    public Row6<BigDecimal, String, String, Boolean, Timestamp, BigDecimal> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<BigDecimal, String, String, Boolean, Timestamp, BigDecimal> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TRole.T_ROLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TRole.T_ROLE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TRole.T_ROLE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return TRole.T_ROLE.IS_ADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TRole.T_ROLE.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TRole.T_ROLE.CREATE_BY;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getIsAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreateAt();
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
    public BigDecimal value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getIsAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateAt();
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
    public TRoleRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord value4(Boolean value) {
        setIsAdmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord value5(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord value6(BigDecimal value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord values(BigDecimal value1, String value2, String value3, Boolean value4, Timestamp value5, BigDecimal value6) {
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
     * Create a detached TRoleRecord
     */
    public TRoleRecord() {
        super(TRole.T_ROLE);
    }

    /**
     * Create a detached, initialised TRoleRecord
     */
    public TRoleRecord(BigDecimal id, String name, String description, Boolean isAdmin, Timestamp createAt, BigDecimal createBy) {
        super(TRole.T_ROLE);

        set(0, id);
        set(1, name);
        set(2, description);
        set(3, isAdmin);
        set(4, createAt);
        set(5, createBy);
    }
}
