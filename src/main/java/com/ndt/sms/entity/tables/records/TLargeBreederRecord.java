/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TLargeBreeder;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 种养大户
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLargeBreederRecord extends UpdatableRecordImpl<TLargeBreederRecord> {

    private static final long serialVersionUID = -1198680813;

    /**
     * Setter for <code>ndt.t_large_breeder.id</code>. 主键
     */
    public TLargeBreederRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.id</code>. 主键
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.division_id</code>. 区县ID
     */
    public TLargeBreederRecord setDivisionId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.division_id</code>. 区县ID
     */
    public BigDecimal getDivisionId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.division_name</code>. 区（市）县
     */
    public TLargeBreederRecord setDivisionName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.division_name</code>. 区（市）县
     */
    public String getDivisionName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.large_code</code>. 种植代码/畜禽养殖代码/水产养殖代码
     */
    public TLargeBreederRecord setLargeCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.large_code</code>. 种植代码/畜禽养殖代码/水产养殖代码
     */
    public String getLargeCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.large_name</code>. 种植场户名称/养殖场户名称
     */
    public TLargeBreederRecord setLargeName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.large_name</code>. 种植场户名称/养殖场户名称
     */
    public String getLargeName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.large_area</code>. 经营耕地面积（亩）/养殖水面面积（亩）/年出栏规模（头、只、羽）
     */
    public TLargeBreederRecord setLargeArea(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.large_area</code>. 经营耕地面积（亩）/养殖水面面积（亩）/年出栏规模（头、只、羽）
     */
    public Integer getLargeArea() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.large_small_type</code>. 种植种类/养殖种类
     */
    public TLargeBreederRecord setLargeSmallType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.large_small_type</code>. 种植种类/养殖种类
     */
    public String getLargeSmallType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.large_main_product</code>. 主要品种
     */
    public TLargeBreederRecord setLargeMainProduct(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.large_main_product</code>. 主要品种
     */
    public String getLargeMainProduct() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.large_yield</code>. 种植产量（吨）
     */
    public TLargeBreederRecord setLargeYield(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.large_yield</code>. 种植产量（吨）
     */
    public Integer getLargeYield() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.large_address</code>. 种植场地址/养殖场地址
     */
    public TLargeBreederRecord setLargeAddress(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.large_address</code>. 种植场地址/养殖场地址
     */
    public String getLargeAddress() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.name</code>. 业主姓名
     */
    public TLargeBreederRecord setName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.name</code>. 业主姓名
     */
    public String getName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.phone</code>. 联系电话
     */
    public TLargeBreederRecord setPhone(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.phone</code>. 联系电话
     */
    public String getPhone() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.identity_code</code>. 身份证号码
     */
    public TLargeBreederRecord setIdentityCode(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.identity_code</code>. 身份证号码
     */
    public String getIdentityCode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.code</code>. 统一社会信用代码
     */
    public TLargeBreederRecord setCode(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.code</code>. 统一社会信用代码
     */
    public String getCode() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.large_succession_data</code>. 已连续种植时间（周年）/已连续养殖时间（周年）
     */
    public TLargeBreederRecord setLargeSuccessionData(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.large_succession_data</code>. 已连续种植时间（周年）/已连续养殖时间（周年）
     */
    public Integer getLargeSuccessionData() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.state</code>. 1、未审核，2、审核通过，3、审核不通过
     */
    public TLargeBreederRecord setState(Short value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.state</code>. 1、未审核，2、审核通过，3、审核不通过
     */
    public Short getState() {
        return (Short) get(15);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.is_major</code>. 是否新型经营主体
     */
    public TLargeBreederRecord setIsMajor(Boolean value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.is_major</code>. 是否新型经营主体
     */
    public Boolean getIsMajor() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.is_credit</code>. 是否信用主体
     */
    public TLargeBreederRecord setIsCredit(Boolean value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.is_credit</code>. 是否信用主体
     */
    public Boolean getIsCredit() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.large_type</code>. 1、种植，2、畜禽，3、水产
     */
    public TLargeBreederRecord setLargeType(Short value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.large_type</code>. 1、种植，2、畜禽，3、水产
     */
    public Short getLargeType() {
        return (Short) get(18);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.create_at</code>. 创建时间
     */
    public TLargeBreederRecord setCreateAt(Timestamp value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.create_by</code>. 创建人
     */
    public TLargeBreederRecord setCreateBy(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.create_by</code>. 创建人
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.update_at</code>. 修改时间
     */
    public TLargeBreederRecord setUpdateAt(Timestamp value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.update_at</code>. 修改时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.update_by</code>. 修改人
     */
    public TLargeBreederRecord setUpdateBy(BigDecimal value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.update_by</code>. 修改人
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.town</code>. 乡镇名称
     */
    public TLargeBreederRecord setTown(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.town</code>. 乡镇名称
     */
    public String getTown() {
        return (String) get(23);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.town_code</code>. 乡镇ID
     */
    public TLargeBreederRecord setTownCode(BigDecimal value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.town_code</code>. 乡镇ID
     */
    public BigDecimal getTownCode() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.community</code>. 村站
     */
    public TLargeBreederRecord setCommunity(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.community</code>. 村站
     */
    public String getCommunity() {
        return (String) get(25);
    }

    /**
     * Setter for <code>ndt.t_large_breeder.community_id</code>. 村站ID
     */
    public TLargeBreederRecord setCommunityId(BigDecimal value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_large_breeder.community_id</code>. 村站ID
     */
    public BigDecimal getCommunityId() {
        return (BigDecimal) get(26);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TLargeBreederRecord
     */
    public TLargeBreederRecord() {
        super(TLargeBreeder.T_LARGE_BREEDER);
    }

    /**
     * Create a detached, initialised TLargeBreederRecord
     */
    public TLargeBreederRecord(BigDecimal id, BigDecimal divisionId, String divisionName, String largeCode, String largeName, Integer largeArea, String largeSmallType, String largeMainProduct, Integer largeYield, String largeAddress, String name, String phone, String identityCode, String code, Integer largeSuccessionData, Short state, Boolean isMajor, Boolean isCredit, Short largeType, Timestamp createAt, BigDecimal createBy, Timestamp updateAt, BigDecimal updateBy, String town, BigDecimal townCode, String community, BigDecimal communityId) {
        super(TLargeBreeder.T_LARGE_BREEDER);

        set(0, id);
        set(1, divisionId);
        set(2, divisionName);
        set(3, largeCode);
        set(4, largeName);
        set(5, largeArea);
        set(6, largeSmallType);
        set(7, largeMainProduct);
        set(8, largeYield);
        set(9, largeAddress);
        set(10, name);
        set(11, phone);
        set(12, identityCode);
        set(13, code);
        set(14, largeSuccessionData);
        set(15, state);
        set(16, isMajor);
        set(17, isCredit);
        set(18, largeType);
        set(19, createAt);
        set(20, createBy);
        set(21, updateAt);
        set(22, updateBy);
        set(23, town);
        set(24, townCode);
        set(25, community);
        set(26, communityId);
    }
}
