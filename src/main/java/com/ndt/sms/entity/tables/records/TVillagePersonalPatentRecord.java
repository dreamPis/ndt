/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TVillagePersonalPatent;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 专利资质信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalPatentRecord extends UpdatableRecordImpl<TVillagePersonalPatentRecord> implements Record10<BigDecimal, BigDecimal, String, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 1674837650;

    /**
     * Setter for <code>ndt.t_village_personal_patent.id</code>.
     */
    public TVillagePersonalPatentRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_patent.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_personal_patent.baseinfo_id</code>. 对应用户基本信息id
     */
    public TVillagePersonalPatentRecord setBaseinfoId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_patent.baseinfo_id</code>. 对应用户基本信息id
     */
    public BigDecimal getBaseinfoId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_personal_patent.patent_name</code>. 专利资质名称
     */
    public TVillagePersonalPatentRecord setPatentName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_patent.patent_name</code>. 专利资质名称
     */
    public String getPatentName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_personal_patent.patent_id</code>. 专利资质编号
     */
    public TVillagePersonalPatentRecord setPatentId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_patent.patent_id</code>. 专利资质编号
     */
    public String getPatentId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_personal_patent.patent_get_time</code>. 专利资质获得时间
     */
    public TVillagePersonalPatentRecord setPatentGetTime(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_patent.patent_get_time</code>. 专利资质获得时间
     */
    public String getPatentGetTime() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_personal_patent.status</code>.
     */
    public TVillagePersonalPatentRecord setStatus(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_patent.status</code>.
     */
    public Short getStatus() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_personal_patent.create_user</code>.
     */
    public TVillagePersonalPatentRecord setCreateUser(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_patent.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_personal_patent.create_time</code>.
     */
    public TVillagePersonalPatentRecord setCreateTime(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_patent.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_personal_patent.update_user</code>.
     */
    public TVillagePersonalPatentRecord setUpdateUser(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_patent.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_personal_patent.update_time</code>.
     */
    public TVillagePersonalPatentRecord setUpdateTime(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_patent.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
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
    public Row10<BigDecimal, BigDecimal, String, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, BigDecimal, String, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT.BASEINFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT.PATENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT.PATENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT.PATENT_GET_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT.UPDATE_TIME;
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
        return getBaseinfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPatentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPatentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPatentGetTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdateTime();
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
        return getBaseinfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPatentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPatentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPatentGetTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord value2(BigDecimal value) {
        setBaseinfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord value3(String value) {
        setPatentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord value4(String value) {
        setPatentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord value5(String value) {
        setPatentGetTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord value6(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord value7(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord value9(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPatentRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, String value5, Short value6, BigDecimal value7, Timestamp value8, BigDecimal value9, Timestamp value10) {
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
     * Create a detached TVillagePersonalPatentRecord
     */
    public TVillagePersonalPatentRecord() {
        super(TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT);
    }

    /**
     * Create a detached, initialised TVillagePersonalPatentRecord
     */
    public TVillagePersonalPatentRecord(BigDecimal id, BigDecimal baseinfoId, String patentName, String patentId, String patentGetTime, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime) {
        super(TVillagePersonalPatent.T_VILLAGE_PERSONAL_PATENT);

        set(0, id);
        set(1, baseinfoId);
        set(2, patentName);
        set(3, patentId);
        set(4, patentGetTime);
        set(5, status);
        set(6, createUser);
        set(7, createTime);
        set(8, updateUser);
        set(9, updateTime);
    }
}