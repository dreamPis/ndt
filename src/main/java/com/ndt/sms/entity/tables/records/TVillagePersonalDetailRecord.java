/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TVillagePersonalDetail;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 村站个人信息采集表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalDetailRecord extends UpdatableRecordImpl<TVillagePersonalDetailRecord> implements Record18<BigDecimal, String, BigDecimal, String, String, String, Integer, Integer, String, Boolean, Integer, Short, Short, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 248552761;

    /**
     * Setter for <code>ndt.t_village_personal_detail.id</code>.
     */
    public TVillagePersonalDetailRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.name</code>. 姓名
     */
    public TVillagePersonalDetailRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.name</code>. 姓名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.admin_division_id</code>. 行政区ID，参考行政区表
     */
    public TVillagePersonalDetailRecord setAdminDivisionId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.admin_division_id</code>. 行政区ID，参考行政区表
     */
    public BigDecimal getAdminDivisionId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.mobile</code>. 电话号码
     */
    public TVillagePersonalDetailRecord setMobile(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.mobile</code>. 电话号码
     */
    public String getMobile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.identity_id</code>. 身份证
     */
    public TVillagePersonalDetailRecord setIdentityId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.identity_id</code>. 身份证
     */
    public String getIdentityId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.address</code>. 地址
     */
    public TVillagePersonalDetailRecord setAddress(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.address</code>. 地址
     */
    public String getAddress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.marital_status</code>. 婚姻状况,参考码表
     */
    public TVillagePersonalDetailRecord setMaritalStatus(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.marital_status</code>. 婚姻状况,参考码表
     */
    public Integer getMaritalStatus() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.evaluate</code>. 道德评价,参考码表
     */
    public TVillagePersonalDetailRecord setEvaluate(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.evaluate</code>. 道德评价,参考码表
     */
    public Integer getEvaluate() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.badhabits</code>. 不良嗜好描述
     */
    public TVillagePersonalDetailRecord setBadhabits(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.badhabits</code>. 不良嗜好描述
     */
    public String getBadhabits() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.is_crimed</code>. 是否有犯罪记录
     */
    public TVillagePersonalDetailRecord setIsCrimed(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.is_crimed</code>. 是否有犯罪记录
     */
    public Boolean getIsCrimed() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.education</code>. 学历,参考码表
     */
    public TVillagePersonalDetailRecord setEducation(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.education</code>. 学历,参考码表
     */
    public Integer getEducation() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.support_num</code>. 赡养人数
     */
    public TVillagePersonalDetailRecord setSupportNum(Short value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.support_num</code>. 赡养人数
     */
    public Short getSupportNum() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.monitor_children</code>. 未成年子女数
     */
    public TVillagePersonalDetailRecord setMonitorChildren(Short value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.monitor_children</code>. 未成年子女数
     */
    public Short getMonitorChildren() {
        return (Short) get(12);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.status</code>.
     */
    public TVillagePersonalDetailRecord setStatus(Short value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.status</code>.
     */
    public Short getStatus() {
        return (Short) get(13);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.create_by</code>.
     */
    public TVillagePersonalDetailRecord setCreateBy(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.create_by</code>.
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.create_at</code>.
     */
    public TVillagePersonalDetailRecord setCreateAt(Timestamp value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.create_at</code>.
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.update_by</code>.
     */
    public TVillagePersonalDetailRecord setUpdateBy(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.update_by</code>.
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>ndt.t_village_personal_detail.update_at</code>.
     */
    public TVillagePersonalDetailRecord setUpdateAt(Timestamp value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_detail.update_at</code>.
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<BigDecimal, String, BigDecimal, String, String, String, Integer, Integer, String, Boolean, Integer, Short, Short, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<BigDecimal, String, BigDecimal, String, String, String, Integer, Integer, String, Boolean, Integer, Short, Short, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.ADMIN_DIVISION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.IDENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.MARITAL_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.EVALUATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.BADHABITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.IS_CRIMED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.EDUCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.SUPPORT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field13() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.MONITOR_CHILDREN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field14() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field17() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL.UPDATE_AT;
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
    public BigDecimal component3() {
        return getAdminDivisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIdentityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getMaritalStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getEvaluate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBadhabits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getIsCrimed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getEducation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getSupportNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component13() {
        return getMonitorChildren();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component15() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component17() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getUpdateAt();
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
    public BigDecimal value3() {
        return getAdminDivisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIdentityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getMaritalStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getEvaluate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBadhabits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getIsCrimed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getEducation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getSupportNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value13() {
        return getMonitorChildren();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value17() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value3(BigDecimal value) {
        setAdminDivisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value4(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value5(String value) {
        setIdentityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value6(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value7(Integer value) {
        setMaritalStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value8(Integer value) {
        setEvaluate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value9(String value) {
        setBadhabits(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value10(Boolean value) {
        setIsCrimed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value11(Integer value) {
        setEducation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value12(Short value) {
        setSupportNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value13(Short value) {
        setMonitorChildren(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value14(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value15(BigDecimal value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value16(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value17(BigDecimal value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord value18(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalDetailRecord values(BigDecimal value1, String value2, BigDecimal value3, String value4, String value5, String value6, Integer value7, Integer value8, String value9, Boolean value10, Integer value11, Short value12, Short value13, Short value14, BigDecimal value15, Timestamp value16, BigDecimal value17, Timestamp value18) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TVillagePersonalDetailRecord
     */
    public TVillagePersonalDetailRecord() {
        super(TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL);
    }

    /**
     * Create a detached, initialised TVillagePersonalDetailRecord
     */
    public TVillagePersonalDetailRecord(BigDecimal id, String name, BigDecimal adminDivisionId, String mobile, String identityId, String address, Integer maritalStatus, Integer evaluate, String badhabits, Boolean isCrimed, Integer education, Short supportNum, Short monitorChildren, Short status, BigDecimal createBy, Timestamp createAt, BigDecimal updateBy, Timestamp updateAt) {
        super(TVillagePersonalDetail.T_VILLAGE_PERSONAL_DETAIL);

        set(0, id);
        set(1, name);
        set(2, adminDivisionId);
        set(3, mobile);
        set(4, identityId);
        set(5, address);
        set(6, maritalStatus);
        set(7, evaluate);
        set(8, badhabits);
        set(9, isCrimed);
        set(10, education);
        set(11, supportNum);
        set(12, monitorChildren);
        set(13, status);
        set(14, createBy);
        set(15, createAt);
        set(16, updateBy);
        set(17, updateAt);
    }
}