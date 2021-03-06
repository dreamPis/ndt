/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TPropertyRightsTrading;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class TPropertyRightsTradingRecord extends UpdatableRecordImpl<TPropertyRightsTradingRecord> {

    private static final long serialVersionUID = -1195183363;

    /**
     * Setter for <code>ndt.t_property_rights_trading.id</code>. 主键
     */
    public TPropertyRightsTradingRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.id</code>. 主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.article_title</code>. 项目名称
     */
    public TPropertyRightsTradingRecord setArticleTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.article_title</code>. 项目名称
     */
    public String getArticleTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.project_no</code>. 项目编号
     */
    public TPropertyRightsTradingRecord setProjectNo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.project_no</code>. 项目编号
     */
    public String getProjectNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.expected_deal_type</code>. 拟交易方式
     */
    public TPropertyRightsTradingRecord setExpectedDealType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.expected_deal_type</code>. 拟交易方式
     */
    public String getExpectedDealType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.expected_deal_period</code>. 拟交易期限
     */
    public TPropertyRightsTradingRecord setExpectedDealPeriod(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.expected_deal_period</code>. 拟交易期限
     */
    public String getExpectedDealPeriod() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.owner_name</code>. 权利人名称/姓名
     */
    public TPropertyRightsTradingRecord setOwnerName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.owner_name</code>. 权利人名称/姓名
     */
    public String getOwnerName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.expected_price</code>. 拟交易价格
     */
    public TPropertyRightsTradingRecord setExpectedPrice(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.expected_price</code>. 拟交易价格
     */
    public String getExpectedPrice() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.property_type</code>. 产权类型
     */
    public TPropertyRightsTradingRecord setPropertyType(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.property_type</code>. 产权类型
     */
    public Integer getPropertyType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.property_location</code>. 坐落位置
     */
    public TPropertyRightsTradingRecord setPropertyLocation(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.property_location</code>. 坐落位置
     */
    public String getPropertyLocation() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.property_area</code>. 产权面积
     */
    public TPropertyRightsTradingRecord setPropertyArea(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.property_area</code>. 产权面积
     */
    public String getPropertyArea() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.ownership_type</code>. 权属类型
     */
    public TPropertyRightsTradingRecord setOwnershipType(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.ownership_type</code>. 权属类型
     */
    public String getOwnershipType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.land_nature</code>. 土地性质
     */
    public TPropertyRightsTradingRecord setLandNature(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.land_nature</code>. 土地性质
     */
    public String getLandNature() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.groud_materail</code>. 地上物情况
     */
    public TPropertyRightsTradingRecord setGroudMaterail(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.groud_materail</code>. 地上物情况
     */
    public String getGroudMaterail() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.transportation</code>. 交通情况
     */
    public TPropertyRightsTradingRecord setTransportation(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.transportation</code>. 交通情况
     */
    public String getTransportation() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.is_mortgaged</code>. 是否存在抵押信息
     */
    public TPropertyRightsTradingRecord setIsMortgaged(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.is_mortgaged</code>. 是否存在抵押信息
     */
    public String getIsMortgaged() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.is_seized</code>. 是否存在查封信息
     */
    public TPropertyRightsTradingRecord setIsSeized(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.is_seized</code>. 是否存在查封信息
     */
    public String getIsSeized() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.transferor_name</code>. 转让方姓名/名称
     */
    public TPropertyRightsTradingRecord setTransferorName(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.transferor_name</code>. 转让方姓名/名称
     */
    public String getTransferorName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.transferor_code</code>. 身份证号/营业执照号
     */
    public TPropertyRightsTradingRecord setTransferorCode(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.transferor_code</code>. 身份证号/营业执照号
     */
    public String getTransferorCode() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.transferor_address</code>. 住所/办公地址
     */
    public TPropertyRightsTradingRecord setTransferorAddress(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.transferor_address</code>. 住所/办公地址
     */
    public String getTransferorAddress() {
        return (String) get(18);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.target_price</code>. 标的价格
     */
    public TPropertyRightsTradingRecord setTargetPrice(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.target_price</code>. 标的价格
     */
    public String getTargetPrice() {
        return (String) get(19);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.payment_method</code>. 价款支付方式
     */
    public TPropertyRightsTradingRecord setPaymentMethod(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.payment_method</code>. 价款支付方式
     */
    public String getPaymentMethod() {
        return (String) get(20);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.payment_deadline</code>. 价款支付期限
     */
    public TPropertyRightsTradingRecord setPaymentDeadline(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.payment_deadline</code>. 价款支付期限
     */
    public String getPaymentDeadline() {
        return (String) get(21);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.additional_requirement</code>. 其他交易条件
     */
    public TPropertyRightsTradingRecord setAdditionalRequirement(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.additional_requirement</code>. 其他交易条件
     */
    public String getAdditionalRequirement() {
        return (String) get(22);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.phone</code>. 联系电话
     */
    public TPropertyRightsTradingRecord setPhone(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.phone</code>. 联系电话
     */
    public String getPhone() {
        return (String) get(23);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.fax</code>. 联系传真
     */
    public TPropertyRightsTradingRecord setFax(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.fax</code>. 联系传真
     */
    public String getFax() {
        return (String) get(24);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.email</code>. 电子邮件
     */
    public TPropertyRightsTradingRecord setEmail(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.email</code>. 电子邮件
     */
    public String getEmail() {
        return (String) get(25);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.QQ_MSN</code>. QQ_MSN
     */
    public TPropertyRightsTradingRecord setQqMsn(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.QQ_MSN</code>. QQ_MSN
     */
    public String getQqMsn() {
        return (String) get(26);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.pub_time</code>. 发布时间
     */
    public TPropertyRightsTradingRecord setPubTime(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.pub_time</code>. 发布时间
     */
    public String getPubTime() {
        return (String) get(27);
    }

    /**
     * Setter for <code>ndt.t_property_rights_trading.cjj</code>. 成交价格
     */
    public TPropertyRightsTradingRecord setCjj(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_property_rights_trading.cjj</code>. 成交价格
     */
    public String getCjj() {
        return (String) get(28);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPropertyRightsTradingRecord
     */
    public TPropertyRightsTradingRecord() {
        super(TPropertyRightsTrading.T_PROPERTY_RIGHTS_TRADING);
    }

    /**
     * Create a detached, initialised TPropertyRightsTradingRecord
     */
    public TPropertyRightsTradingRecord(Integer id, String articleTitle, String projectNo, String expectedDealType, String expectedDealPeriod, String ownerName, String expectedPrice, Integer propertyType, String propertyLocation, String propertyArea, String ownershipType, String landNature, String groudMaterail, String transportation, String isMortgaged, String isSeized, String transferorName, String transferorCode, String transferorAddress, String targetPrice, String paymentMethod, String paymentDeadline, String additionalRequirement, String phone, String fax, String email, String qqMsn, String pubTime, String cjj) {
        super(TPropertyRightsTrading.T_PROPERTY_RIGHTS_TRADING);

        set(0, id);
        set(1, articleTitle);
        set(2, projectNo);
        set(3, expectedDealType);
        set(4, expectedDealPeriod);
        set(5, ownerName);
        set(6, expectedPrice);
        set(7, propertyType);
        set(8, propertyLocation);
        set(9, propertyArea);
        set(10, ownershipType);
        set(11, landNature);
        set(12, groudMaterail);
        set(13, transportation);
        set(14, isMortgaged);
        set(15, isSeized);
        set(16, transferorName);
        set(17, transferorCode);
        set(18, transferorAddress);
        set(19, targetPrice);
        set(20, paymentMethod);
        set(21, paymentDeadline);
        set(22, additionalRequirement);
        set(23, phone);
        set(24, fax);
        set(25, email);
        set(26, qqMsn);
        set(27, pubTime);
        set(28, cjj);
    }
}
