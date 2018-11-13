/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TVillageCompanyCredit;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 村站采集的公司信用称号信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyCreditRecord extends UpdatableRecordImpl<TVillageCompanyCreditRecord> implements Record10<BigDecimal, BigDecimal, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal[]> {

    private static final long serialVersionUID = -1690382066;

    /**
     * Setter for <code>ndt.t_village_company_credit.id</code>.
     */
    public TVillageCompanyCreditRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_credit.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_company_credit.village_company_info_id</code>. 公司详情ID
     */
    public TVillageCompanyCreditRecord setVillageCompanyInfoId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_credit.village_company_info_id</code>. 公司详情ID
     */
    public BigDecimal getVillageCompanyInfoId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_company_credit.situation</code>. 信用情况
     */
    public TVillageCompanyCreditRecord setSituation(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_credit.situation</code>. 信用情况
     */
    public String getSituation() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_company_credit.year</code>. 取得信用称号年度
     */
    public TVillageCompanyCreditRecord setYear(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_credit.year</code>. 取得信用称号年度
     */
    public String getYear() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_company_credit.status</code>.
     */
    public TVillageCompanyCreditRecord setStatus(Short value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_credit.status</code>.
     */
    public Short getStatus() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_company_credit.create_user</code>.
     */
    public TVillageCompanyCreditRecord setCreateUser(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_credit.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_company_credit.create_time</code>.
     */
    public TVillageCompanyCreditRecord setCreateTime(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_credit.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_company_credit.update_user</code>.
     */
    public TVillageCompanyCreditRecord setUpdateUser(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_credit.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_company_credit.update_time</code>.
     */
    public TVillageCompanyCreditRecord setUpdateTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_credit.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_company_credit.honor_img</code>. 荣誉凭证图片
     */
    public TVillageCompanyCreditRecord setHonorImg(BigDecimal... value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_credit.honor_img</code>. 荣誉凭证图片
     */
    public BigDecimal[] getHonorImg() {
        return (BigDecimal[]) get(9);
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
    public Row10<BigDecimal, BigDecimal, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal[]> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, BigDecimal, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal[]> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT.VILLAGE_COMPANY_INFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT.SITUATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT.YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal[]> field10() {
        return TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT.HONOR_IMG;
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
        return getVillageCompanyInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSituation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getYear();
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
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] component10() {
        return getHonorImg();
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
        return getVillageCompanyInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSituation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getYear();
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
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] value10() {
        return getHonorImg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord value2(BigDecimal value) {
        setVillageCompanyInfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord value3(String value) {
        setSituation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord value4(String value) {
        setYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord value5(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord value6(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord value8(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord value10(BigDecimal... value) {
        setHonorImg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyCreditRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, Short value5, BigDecimal value6, Timestamp value7, BigDecimal value8, Timestamp value9, BigDecimal[] value10) {
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
     * Create a detached TVillageCompanyCreditRecord
     */
    public TVillageCompanyCreditRecord() {
        super(TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT);
    }

    /**
     * Create a detached, initialised TVillageCompanyCreditRecord
     */
    public TVillageCompanyCreditRecord(BigDecimal id, BigDecimal villageCompanyInfoId, String situation, String year, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime, BigDecimal[] honorImg) {
        super(TVillageCompanyCredit.T_VILLAGE_COMPANY_CREDIT);

        set(0, id);
        set(1, villageCompanyInfoId);
        set(2, situation);
        set(3, year);
        set(4, status);
        set(5, createUser);
        set(6, createTime);
        set(7, updateUser);
        set(8, updateTime);
        set(9, honorImg);
    }
}
