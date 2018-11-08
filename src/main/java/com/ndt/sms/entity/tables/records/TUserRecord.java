/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TUser;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUserRecord extends UpdatableRecordImpl<TUserRecord> {

    private static final long serialVersionUID = -1448329112;

    /**
     * Setter for <code>ndt.t_user.id</code>.
     */
    public TUserRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_user.login_name</code>. 用户表
     */
    public TUserRecord setLoginName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.login_name</code>. 用户表
     */
    public String getLoginName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_user.salt</code>. SALT
     */
    public TUserRecord setSalt(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.salt</code>. SALT
     */
    public String getSalt() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_user.password</code>. 密码
     */
    public TUserRecord setPassword(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.password</code>. 密码
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_user.name</code>. 姓名
     */
    public TUserRecord setName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.name</code>. 姓名
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_user.gender</code>. 性别
     */
    public TUserRecord setGender(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.gender</code>. 性别
     */
    public Integer getGender() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ndt.t_user.mobile</code>. 电话
     */
    public TUserRecord setMobile(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.mobile</code>. 电话
     */
    public String getMobile() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_user.image_url</code>. 用户头像
     */
    public TUserRecord setImageUrl(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.image_url</code>. 用户头像
     */
    public String getImageUrl() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.t_user.user_type</code>. 用户类型
     */
    public TUserRecord setUserType(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.user_type</code>. 用户类型
     */
    public Integer getUserType() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ndt.t_user.admin_division_id</code>. 行政区划ID
     */
    public TUserRecord setAdminDivisionId(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.admin_division_id</code>. 行政区划ID
     */
    public BigDecimal getAdminDivisionId() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>ndt.t_user.org_id</code>. 机构ID
     */
    public TUserRecord setOrgId(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.org_id</code>. 机构ID
     */
    public BigDecimal getOrgId() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>ndt.t_user.user_detail_id</code>. 详情信息ID
     */
    public TUserRecord setUserDetailId(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.user_detail_id</code>. 详情信息ID
     */
    public BigDecimal getUserDetailId() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>ndt.t_user.subscription_types</code>. 订阅信息类型
     */
    public TUserRecord setSubscriptionTypes(Integer... value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.subscription_types</code>. 订阅信息类型
     */
    public Integer[] getSubscriptionTypes() {
        return (Integer[]) get(12);
    }

    /**
     * Setter for <code>ndt.t_user.account_state</code>. 账号状态
     */
    public TUserRecord setAccountState(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.account_state</code>. 账号状态
     */
    public Integer getAccountState() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>ndt.t_user.status</code>. 记录状态
     */
    public TUserRecord setStatus(Short value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.status</code>. 记录状态
     */
    public Short getStatus() {
        return (Short) get(14);
    }

    /**
     * Setter for <code>ndt.t_user.create_by</code>. 创建人
     */
    public TUserRecord setCreateBy(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.create_by</code>. 创建人
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>ndt.t_user.create_at</code>. 创建时间
     */
    public TUserRecord setCreateAt(Timestamp value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>ndt.t_user.update_by</code>. 更新人
     */
    public TUserRecord setUpdateBy(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.update_by</code>. 更新人
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>ndt.t_user.update_at</code>. 更新时间
     */
    public TUserRecord setUpdateAt(Timestamp value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>ndt.t_user.last_login_time</code>. 用户最后登录时间
     */
    public TUserRecord setLastLoginTime(Timestamp value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.last_login_time</code>. 用户最后登录时间
     */
    public Timestamp getLastLoginTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>ndt.t_user.source_id</code>. 来源,PC app
     */
    public TUserRecord setSourceId(Integer value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.source_id</code>. 来源,PC app
     */
    public Integer getSourceId() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>ndt.t_user.is_farm</code>. 是否是家庭农场
     */
    public TUserRecord setIsFarm(Boolean value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.is_farm</code>. 是否是家庭农场
     */
    public Boolean getIsFarm() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>ndt.t_user.is_cooperation</code>. 是否是合作社
     */
    public TUserRecord setIsCooperation(Boolean value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.is_cooperation</code>. 是否是合作社
     */
    public Boolean getIsCooperation() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>ndt.t_user.is_leading_enterprice</code>. 是否是龙头企业
     */
    public TUserRecord setIsLeadingEnterprice(Boolean value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.is_leading_enterprice</code>. 是否是龙头企业
     */
    public Boolean getIsLeadingEnterprice() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>ndt.t_user.is_large_agricultural_family</code>. 是否是农业大户
     */
    public TUserRecord setIsLargeAgriculturalFamily(Boolean value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.is_large_agricultural_family</code>. 是否是农业大户
     */
    public Boolean getIsLargeAgriculturalFamily() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>ndt.t_user.is_majar_project</code>. 是否是重点扶持项目
     */
    public TUserRecord setIsMajarProject(Boolean value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.is_majar_project</code>. 是否是重点扶持项目
     */
    public Boolean getIsMajarProject() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>ndt.t_user.contact_phone</code>. 非个人用户联系方式
     */
    public TUserRecord setContactPhone(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user.contact_phone</code>. 非个人用户联系方式
     */
    public String getContactPhone() {
        return (String) get(26);
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
     * Create a detached TUserRecord
     */
    public TUserRecord() {
        super(TUser.T_USER);
    }

    /**
     * Create a detached, initialised TUserRecord
     */
    public TUserRecord(BigDecimal id, String loginName, String salt, String password, String name, Integer gender, String mobile, String imageUrl, Integer userType, BigDecimal adminDivisionId, BigDecimal orgId, BigDecimal userDetailId, Integer[] subscriptionTypes, Integer accountState, Short status, BigDecimal createBy, Timestamp createAt, BigDecimal updateBy, Timestamp updateAt, Timestamp lastLoginTime, Integer sourceId, Boolean isFarm, Boolean isCooperation, Boolean isLeadingEnterprice, Boolean isLargeAgriculturalFamily, Boolean isMajarProject, String contactPhone) {
        super(TUser.T_USER);

        set(0, id);
        set(1, loginName);
        set(2, salt);
        set(3, password);
        set(4, name);
        set(5, gender);
        set(6, mobile);
        set(7, imageUrl);
        set(8, userType);
        set(9, adminDivisionId);
        set(10, orgId);
        set(11, userDetailId);
        set(12, subscriptionTypes);
        set(13, accountState);
        set(14, status);
        set(15, createBy);
        set(16, createAt);
        set(17, updateBy);
        set(18, updateAt);
        set(19, lastLoginTime);
        set(20, sourceId);
        set(21, isFarm);
        set(22, isCooperation);
        set(23, isLeadingEnterprice);
        set(24, isLargeAgriculturalFamily);
        set(25, isMajarProject);
        set(26, contactPhone);
    }
}
