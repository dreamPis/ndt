/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TVillageCompanyDetail;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 村站采集的公司信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyDetailRecord extends UpdatableRecordImpl<TVillageCompanyDetailRecord> {

    private static final long serialVersionUID = -1637594412;

    /**
     * Setter for <code>ndt.t_village_company_detail.id</code>.
     */
    public TVillageCompanyDetailRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.certificate_type</code>. 证件类型
     */
    public TVillageCompanyDetailRecord setCertificateType(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.certificate_type</code>. 证件类型
     */
    public Integer getCertificateType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.name</code>. 企业名称
     */
    public TVillageCompanyDetailRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.name</code>. 企业名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.code</code>. 统一社会信用代码或注册号
     */
    public TVillageCompanyDetailRecord setCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.code</code>. 统一社会信用代码或注册号
     */
    public String getCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.address</code>. 注册地址
     */
    public TVillageCompanyDetailRecord setAddress(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.address</code>. 注册地址
     */
    public String getAddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.company_type</code>. 企业类型
     */
    public TVillageCompanyDetailRecord setCompanyType(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.company_type</code>. 企业类型
     */
    public Integer getCompanyType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.division_id</code>.
     */
    public TVillageCompanyDetailRecord setDivisionId(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.division_id</code>.
     */
    public BigDecimal getDivisionId() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.industry_type</code>. 所属行业
     */
    public TVillageCompanyDetailRecord setIndustryType(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.industry_type</code>. 所属行业
     */
    public Integer getIndustryType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.setup_time</code>. 成立时间
     */
    public TVillageCompanyDetailRecord setSetupTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.setup_time</code>. 成立时间
     */
    public Timestamp getSetupTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.business_scope</code>. 经营范围
     */
    public TVillageCompanyDetailRecord setBusinessScope(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.business_scope</code>. 经营范围
     */
    public String getBusinessScope() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.business_deadline</code>. 经营期限
     */
    public TVillageCompanyDetailRecord setBusinessDeadline(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.business_deadline</code>. 经营期限
     */
    public Timestamp getBusinessDeadline() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.registered_capital</code>. 注册资本
     */
    public TVillageCompanyDetailRecord setRegisteredCapital(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.registered_capital</code>. 注册资本
     */
    public String getRegisteredCapital() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.is_emerging</code>. 是否为新兴经营主体
     */
    public TVillageCompanyDetailRecord setIsEmerging(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.is_emerging</code>. 是否为新兴经营主体
     */
    public Boolean getIsEmerging() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.legal_person</code>. 法人
     */
    public TVillageCompanyDetailRecord setLegalPerson(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.legal_person</code>. 法人
     */
    public String getLegalPerson() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.legal_person_identity_id</code>. 法人身份证
     */
    public TVillageCompanyDetailRecord setLegalPersonIdentityId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.legal_person_identity_id</code>. 法人身份证
     */
    public String getLegalPersonIdentityId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.legal_person_id_deadline</code>. 法人身份证截止时间
     */
    public TVillageCompanyDetailRecord setLegalPersonIdDeadline(Timestamp value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.legal_person_id_deadline</code>. 法人身份证截止时间
     */
    public Timestamp getLegalPersonIdDeadline() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.related_img_urls</code>. 相关照片
     */
    public TVillageCompanyDetailRecord setRelatedImgUrls(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.related_img_urls</code>. 相关照片
     */
    public String getRelatedImgUrls() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.state</code>.
     */
    public TVillageCompanyDetailRecord setState(Integer value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.state</code>.
     */
    public Integer getState() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.status</code>.
     */
    public TVillageCompanyDetailRecord setStatus(Short value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.status</code>.
     */
    public Short getStatus() {
        return (Short) get(18);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.create_by</code>.
     */
    public TVillageCompanyDetailRecord setCreateBy(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.create_by</code>.
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.create_at</code>.
     */
    public TVillageCompanyDetailRecord setCreateAt(Timestamp value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.create_at</code>.
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.update_by</code>.
     */
    public TVillageCompanyDetailRecord setUpdateBy(BigDecimal value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.update_by</code>.
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>ndt.t_village_company_detail.update_at</code>.
     */
    public TVillageCompanyDetailRecord setUpdateAt(Timestamp value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_detail.update_at</code>.
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(22);
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
     * Create a detached TVillageCompanyDetailRecord
     */
    public TVillageCompanyDetailRecord() {
        super(TVillageCompanyDetail.T_VILLAGE_COMPANY_DETAIL);
    }

    /**
     * Create a detached, initialised TVillageCompanyDetailRecord
     */
    public TVillageCompanyDetailRecord(BigDecimal id, Integer certificateType, String name, String code, String address, Integer companyType, BigDecimal divisionId, Integer industryType, Timestamp setupTime, String businessScope, Timestamp businessDeadline, String registeredCapital, Boolean isEmerging, String legalPerson, String legalPersonIdentityId, Timestamp legalPersonIdDeadline, String relatedImgUrls, Integer state, Short status, BigDecimal createBy, Timestamp createAt, BigDecimal updateBy, Timestamp updateAt) {
        super(TVillageCompanyDetail.T_VILLAGE_COMPANY_DETAIL);

        set(0, id);
        set(1, certificateType);
        set(2, name);
        set(3, code);
        set(4, address);
        set(5, companyType);
        set(6, divisionId);
        set(7, industryType);
        set(8, setupTime);
        set(9, businessScope);
        set(10, businessDeadline);
        set(11, registeredCapital);
        set(12, isEmerging);
        set(13, legalPerson);
        set(14, legalPersonIdentityId);
        set(15, legalPersonIdDeadline);
        set(16, relatedImgUrls);
        set(17, state);
        set(18, status);
        set(19, createBy);
        set(20, createAt);
        set(21, updateBy);
        set(22, updateAt);
    }
}
