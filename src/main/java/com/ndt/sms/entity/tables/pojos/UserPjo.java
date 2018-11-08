/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.annotation.Generated;


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
public class UserPjo implements Serializable {

    private static final long serialVersionUID = 1551107853;

    private BigDecimal id;
    private String     loginName;
    private String     salt;
    private String     password;
    private String     name;
    private Integer    gender;
    private String     mobile;
    private String     imageUrl;
    private Integer    userType;
    private BigDecimal adminDivisionId;
    private BigDecimal orgId;
    private BigDecimal userDetailId;
    private Integer[]  subscriptionTypes;
    private Integer    accountState;
    private Short      status;
    private BigDecimal createBy;
    private Timestamp  createAt;
    private BigDecimal updateBy;
    private Timestamp  updateAt;
    private Timestamp  lastLoginTime;
    private Integer    sourceId;
    private Boolean    isFarm;
    private Boolean    isCooperation;
    private Boolean    isLeadingEnterprice;
    private Boolean    isLargeAgriculturalFamily;
    private Boolean    isMajarProject;
    private String     contactPhone;

    public UserPjo() {}

    public UserPjo(UserPjo value) {
        this.id = value.id;
        this.loginName = value.loginName;
        this.salt = value.salt;
        this.password = value.password;
        this.name = value.name;
        this.gender = value.gender;
        this.mobile = value.mobile;
        this.imageUrl = value.imageUrl;
        this.userType = value.userType;
        this.adminDivisionId = value.adminDivisionId;
        this.orgId = value.orgId;
        this.userDetailId = value.userDetailId;
        this.subscriptionTypes = value.subscriptionTypes;
        this.accountState = value.accountState;
        this.status = value.status;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
        this.updateBy = value.updateBy;
        this.updateAt = value.updateAt;
        this.lastLoginTime = value.lastLoginTime;
        this.sourceId = value.sourceId;
        this.isFarm = value.isFarm;
        this.isCooperation = value.isCooperation;
        this.isLeadingEnterprice = value.isLeadingEnterprice;
        this.isLargeAgriculturalFamily = value.isLargeAgriculturalFamily;
        this.isMajarProject = value.isMajarProject;
        this.contactPhone = value.contactPhone;
    }

    public UserPjo(
        BigDecimal id,
        String     loginName,
        String     salt,
        String     password,
        String     name,
        Integer    gender,
        String     mobile,
        String     imageUrl,
        Integer    userType,
        BigDecimal adminDivisionId,
        BigDecimal orgId,
        BigDecimal userDetailId,
        Integer[]  subscriptionTypes,
        Integer    accountState,
        Short      status,
        BigDecimal createBy,
        Timestamp  createAt,
        BigDecimal updateBy,
        Timestamp  updateAt,
        Timestamp  lastLoginTime,
        Integer    sourceId,
        Boolean    isFarm,
        Boolean    isCooperation,
        Boolean    isLeadingEnterprice,
        Boolean    isLargeAgriculturalFamily,
        Boolean    isMajarProject,
        String     contactPhone
    ) {
        this.id = id;
        this.loginName = loginName;
        this.salt = salt;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.imageUrl = imageUrl;
        this.userType = userType;
        this.adminDivisionId = adminDivisionId;
        this.orgId = orgId;
        this.userDetailId = userDetailId;
        this.subscriptionTypes = subscriptionTypes;
        this.accountState = accountState;
        this.status = status;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
        this.lastLoginTime = lastLoginTime;
        this.sourceId = sourceId;
        this.isFarm = isFarm;
        this.isCooperation = isCooperation;
        this.isLeadingEnterprice = isLeadingEnterprice;
        this.isLargeAgriculturalFamily = isLargeAgriculturalFamily;
        this.isMajarProject = isMajarProject;
        this.contactPhone = contactPhone;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public UserPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public UserPjo setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public String getSalt() {
        return this.salt;
    }

    public UserPjo setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public UserPjo setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public UserPjo setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getGender() {
        return this.gender;
    }

    public UserPjo setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    public String getMobile() {
        return this.mobile;
    }

    public UserPjo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public UserPjo setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public UserPjo setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

    public BigDecimal getAdminDivisionId() {
        return this.adminDivisionId;
    }

    public UserPjo setAdminDivisionId(BigDecimal adminDivisionId) {
        this.adminDivisionId = adminDivisionId;
        return this;
    }

    public BigDecimal getOrgId() {
        return this.orgId;
    }

    public UserPjo setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
        return this;
    }

    public BigDecimal getUserDetailId() {
        return this.userDetailId;
    }

    public UserPjo setUserDetailId(BigDecimal userDetailId) {
        this.userDetailId = userDetailId;
        return this;
    }

    public Integer[] getSubscriptionTypes() {
        return this.subscriptionTypes;
    }

    public UserPjo setSubscriptionTypes(Integer... subscriptionTypes) {
        this.subscriptionTypes = subscriptionTypes;
        return this;
    }

    public Integer getAccountState() {
        return this.accountState;
    }

    public UserPjo setAccountState(Integer accountState) {
        this.accountState = accountState;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public UserPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public UserPjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public UserPjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public BigDecimal getUpdateBy() {
        return this.updateBy;
    }

    public UserPjo setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public UserPjo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    public Timestamp getLastLoginTime() {
        return this.lastLoginTime;
    }

    public UserPjo setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    public UserPjo setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Boolean getIsFarm() {
        return this.isFarm;
    }

    public UserPjo setIsFarm(Boolean isFarm) {
        this.isFarm = isFarm;
        return this;
    }

    public Boolean getIsCooperation() {
        return this.isCooperation;
    }

    public UserPjo setIsCooperation(Boolean isCooperation) {
        this.isCooperation = isCooperation;
        return this;
    }

    public Boolean getIsLeadingEnterprice() {
        return this.isLeadingEnterprice;
    }

    public UserPjo setIsLeadingEnterprice(Boolean isLeadingEnterprice) {
        this.isLeadingEnterprice = isLeadingEnterprice;
        return this;
    }

    public Boolean getIsLargeAgriculturalFamily() {
        return this.isLargeAgriculturalFamily;
    }

    public UserPjo setIsLargeAgriculturalFamily(Boolean isLargeAgriculturalFamily) {
        this.isLargeAgriculturalFamily = isLargeAgriculturalFamily;
        return this;
    }

    public Boolean getIsMajarProject() {
        return this.isMajarProject;
    }

    public UserPjo setIsMajarProject(Boolean isMajarProject) {
        this.isMajarProject = isMajarProject;
        return this;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }

    public UserPjo setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserPjo (");

        sb.append(id);
        sb.append(", ").append(loginName);
        sb.append(", ").append(salt);
        sb.append(", ").append(password);
        sb.append(", ").append(name);
        sb.append(", ").append(gender);
        sb.append(", ").append(mobile);
        sb.append(", ").append(imageUrl);
        sb.append(", ").append(userType);
        sb.append(", ").append(adminDivisionId);
        sb.append(", ").append(orgId);
        sb.append(", ").append(userDetailId);
        sb.append(", ").append(Arrays.toString(subscriptionTypes));
        sb.append(", ").append(accountState);
        sb.append(", ").append(status);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(lastLoginTime);
        sb.append(", ").append(sourceId);
        sb.append(", ").append(isFarm);
        sb.append(", ").append(isCooperation);
        sb.append(", ").append(isLeadingEnterprice);
        sb.append(", ").append(isLargeAgriculturalFamily);
        sb.append(", ").append(isMajarProject);
        sb.append(", ").append(contactPhone);

        sb.append(")");
        return sb.toString();
    }
}
