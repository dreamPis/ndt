/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TPolicyService;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 政策服务
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPolicyServiceRecord extends UpdatableRecordImpl<TPolicyServiceRecord> implements Record20<BigDecimal, String, Integer, BigDecimal, String, String, BigDecimal[], String[], String, Integer, Integer, String, Timestamp, Timestamp, BigDecimal, BigDecimal, Timestamp, Timestamp, Integer, BigDecimal> {

    private static final long serialVersionUID = -1562273155;

    /**
     * Setter for <code>ndt.t_policy_service.id</code>.
     */
    public TPolicyServiceRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_policy_service.name</code>. 政策名称
     */
    public TPolicyServiceRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.name</code>. 政策名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_policy_service.type</code>. 政策类型
     */
    public TPolicyServiceRecord setType(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.type</code>. 政策类型
     */
    public Integer getType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ndt.t_policy_service.org_id</code>. 所属机构id
     */
    public TPolicyServiceRecord setOrgId(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.org_id</code>. 所属机构id
     */
    public BigDecimal getOrgId() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_policy_service.key_words</code>. 关键字
     */
    public TPolicyServiceRecord setKeyWords(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.key_words</code>. 关键字
     */
    public String getKeyWords() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_policy_service.accept_org_name</code>. 受理单位名称
     */
    public TPolicyServiceRecord setAcceptOrgName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.accept_org_name</code>. 受理单位名称
     */
    public String getAcceptOrgName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_policy_service.accept_division_ids</code>. 受理地区id
     */
    public TPolicyServiceRecord setAcceptDivisionIds(BigDecimal... value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.accept_division_ids</code>. 受理地区id
     */
    public BigDecimal[] getAcceptDivisionIds() {
        return (BigDecimal[]) get(6);
    }

    /**
     * Setter for <code>ndt.t_policy_service.accept_division_names</code>. 受理地区名称
     */
    public TPolicyServiceRecord setAcceptDivisionNames(String... value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.accept_division_names</code>. 受理地区名称
     */
    public String[] getAcceptDivisionNames() {
        return (String[]) get(7);
    }

    /**
     * Setter for <code>ndt.t_policy_service.fee_scale</code>. 收费标准
     */
    public TPolicyServiceRecord setFeeScale(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.fee_scale</code>. 收费标准
     */
    public String getFeeScale() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.t_policy_service.priority</code>. 优先级
     */
    public TPolicyServiceRecord setPriority(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.priority</code>. 优先级
     */
    public Integer getPriority() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ndt.t_policy_service.status</code>. 状态
     */
    public TPolicyServiceRecord setStatus(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.status</code>. 状态
     */
    public Integer getStatus() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>ndt.t_policy_service.content</code>. 内容介绍
     */
    public TPolicyServiceRecord setContent(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.content</code>. 内容介绍
     */
    public String getContent() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ndt.t_policy_service.accept_start_time</code>. 受理开始时间
     */
    public TPolicyServiceRecord setAcceptStartTime(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.accept_start_time</code>. 受理开始时间
     */
    public Timestamp getAcceptStartTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>ndt.t_policy_service.accept_end_time</code>. 受理结束时间
     */
    public TPolicyServiceRecord setAcceptEndTime(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.accept_end_time</code>. 受理结束时间
     */
    public Timestamp getAcceptEndTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>ndt.t_policy_service.create_user</code>.
     */
    public TPolicyServiceRecord setCreateUser(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>ndt.t_policy_service.update_user</code>.
     */
    public TPolicyServiceRecord setUpdateUser(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>ndt.t_policy_service.create_time</code>.
     */
    public TPolicyServiceRecord setCreateTime(Timestamp value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>ndt.t_policy_service.update_time</code>.
     */
    public TPolicyServiceRecord setUpdateTime(Timestamp value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>ndt.t_policy_service.accept_type</code>. 接受类型企业or个人
     */
    public TPolicyServiceRecord setAcceptType(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.accept_type</code>. 接受类型企业or个人
     */
    public Integer getAcceptType() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>ndt.t_policy_service.accept_org_id</code>. 受理机构id
     */
    public TPolicyServiceRecord setAcceptOrgId(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service.accept_org_id</code>. 受理机构id
     */
    public BigDecimal getAcceptOrgId() {
        return (BigDecimal) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<BigDecimal, String, Integer, BigDecimal, String, String, BigDecimal[], String[], String, Integer, Integer, String, Timestamp, Timestamp, BigDecimal, BigDecimal, Timestamp, Timestamp, Integer, BigDecimal> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<BigDecimal, String, Integer, BigDecimal, String, String, BigDecimal[], String[], String, Integer, Integer, String, Timestamp, Timestamp, BigDecimal, BigDecimal, Timestamp, Timestamp, Integer, BigDecimal> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TPolicyService.T_POLICY_SERVICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TPolicyService.T_POLICY_SERVICE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TPolicyService.T_POLICY_SERVICE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TPolicyService.T_POLICY_SERVICE.ORG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TPolicyService.T_POLICY_SERVICE.KEY_WORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TPolicyService.T_POLICY_SERVICE.ACCEPT_ORG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal[]> field7() {
        return TPolicyService.T_POLICY_SERVICE.ACCEPT_DIVISION_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field8() {
        return TPolicyService.T_POLICY_SERVICE.ACCEPT_DIVISION_NAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TPolicyService.T_POLICY_SERVICE.FEE_SCALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TPolicyService.T_POLICY_SERVICE.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return TPolicyService.T_POLICY_SERVICE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TPolicyService.T_POLICY_SERVICE.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return TPolicyService.T_POLICY_SERVICE.ACCEPT_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return TPolicyService.T_POLICY_SERVICE.ACCEPT_END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return TPolicyService.T_POLICY_SERVICE.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field16() {
        return TPolicyService.T_POLICY_SERVICE.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return TPolicyService.T_POLICY_SERVICE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return TPolicyService.T_POLICY_SERVICE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return TPolicyService.T_POLICY_SERVICE.ACCEPT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field20() {
        return TPolicyService.T_POLICY_SERVICE.ACCEPT_ORG_ID;
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
    public Integer component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getKeyWords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAcceptOrgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] component7() {
        return getAcceptDivisionIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component8() {
        return getAcceptDivisionNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getFeeScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getAcceptStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getAcceptEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component15() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component16() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component19() {
        return getAcceptType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component20() {
        return getAcceptOrgId();
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
    public Integer value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getKeyWords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAcceptOrgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] value7() {
        return getAcceptDivisionIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value8() {
        return getAcceptDivisionNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFeeScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getAcceptStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getAcceptEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value16() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getAcceptType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value20() {
        return getAcceptOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value3(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value4(BigDecimal value) {
        setOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value5(String value) {
        setKeyWords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value6(String value) {
        setAcceptOrgName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value7(BigDecimal... value) {
        setAcceptDivisionIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value8(String... value) {
        setAcceptDivisionNames(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value9(String value) {
        setFeeScale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value10(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value11(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value12(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value13(Timestamp value) {
        setAcceptStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value14(Timestamp value) {
        setAcceptEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value15(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value16(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value17(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value18(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value19(Integer value) {
        setAcceptType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord value20(BigDecimal value) {
        setAcceptOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceRecord values(BigDecimal value1, String value2, Integer value3, BigDecimal value4, String value5, String value6, BigDecimal[] value7, String[] value8, String value9, Integer value10, Integer value11, String value12, Timestamp value13, Timestamp value14, BigDecimal value15, BigDecimal value16, Timestamp value17, Timestamp value18, Integer value19, BigDecimal value20) {
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
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPolicyServiceRecord
     */
    public TPolicyServiceRecord() {
        super(TPolicyService.T_POLICY_SERVICE);
    }

    /**
     * Create a detached, initialised TPolicyServiceRecord
     */
    public TPolicyServiceRecord(BigDecimal id, String name, Integer type, BigDecimal orgId, String keyWords, String acceptOrgName, BigDecimal[] acceptDivisionIds, String[] acceptDivisionNames, String feeScale, Integer priority, Integer status, String content, Timestamp acceptStartTime, Timestamp acceptEndTime, BigDecimal createUser, BigDecimal updateUser, Timestamp createTime, Timestamp updateTime, Integer acceptType, BigDecimal acceptOrgId) {
        super(TPolicyService.T_POLICY_SERVICE);

        set(0, id);
        set(1, name);
        set(2, type);
        set(3, orgId);
        set(4, keyWords);
        set(5, acceptOrgName);
        set(6, acceptDivisionIds);
        set(7, acceptDivisionNames);
        set(8, feeScale);
        set(9, priority);
        set(10, status);
        set(11, content);
        set(12, acceptStartTime);
        set(13, acceptEndTime);
        set(14, createUser);
        set(15, updateUser);
        set(16, createTime);
        set(17, updateTime);
        set(18, acceptType);
        set(19, acceptOrgId);
    }
}