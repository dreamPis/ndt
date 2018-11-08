/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class VillagePersonalDetailPjo implements Serializable {

    private static final long serialVersionUID = 1892729414;

    private BigDecimal id;
    private String     name;
    private BigDecimal adminDivisionId;
    private String     mobile;
    private String     identityId;
    private String     address;
    private Integer    maritalStatus;
    private Integer    evaluate;
    private String     badhabits;
    private Boolean    isCrimed;
    private Integer    education;
    private Short      supportNum;
    private Short      monitorChildren;
    private Short      status;
    private BigDecimal createBy;
    private Timestamp  createAt;
    private BigDecimal updateBy;
    private Timestamp  updateAt;

    public VillagePersonalDetailPjo() {}

    public VillagePersonalDetailPjo(VillagePersonalDetailPjo value) {
        this.id = value.id;
        this.name = value.name;
        this.adminDivisionId = value.adminDivisionId;
        this.mobile = value.mobile;
        this.identityId = value.identityId;
        this.address = value.address;
        this.maritalStatus = value.maritalStatus;
        this.evaluate = value.evaluate;
        this.badhabits = value.badhabits;
        this.isCrimed = value.isCrimed;
        this.education = value.education;
        this.supportNum = value.supportNum;
        this.monitorChildren = value.monitorChildren;
        this.status = value.status;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
        this.updateBy = value.updateBy;
        this.updateAt = value.updateAt;
    }

    public VillagePersonalDetailPjo(
        BigDecimal id,
        String     name,
        BigDecimal adminDivisionId,
        String     mobile,
        String     identityId,
        String     address,
        Integer    maritalStatus,
        Integer    evaluate,
        String     badhabits,
        Boolean    isCrimed,
        Integer    education,
        Short      supportNum,
        Short      monitorChildren,
        Short      status,
        BigDecimal createBy,
        Timestamp  createAt,
        BigDecimal updateBy,
        Timestamp  updateAt
    ) {
        this.id = id;
        this.name = name;
        this.adminDivisionId = adminDivisionId;
        this.mobile = mobile;
        this.identityId = identityId;
        this.address = address;
        this.maritalStatus = maritalStatus;
        this.evaluate = evaluate;
        this.badhabits = badhabits;
        this.isCrimed = isCrimed;
        this.education = education;
        this.supportNum = supportNum;
        this.monitorChildren = monitorChildren;
        this.status = status;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillagePersonalDetailPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public VillagePersonalDetailPjo setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getAdminDivisionId() {
        return this.adminDivisionId;
    }

    public VillagePersonalDetailPjo setAdminDivisionId(BigDecimal adminDivisionId) {
        this.adminDivisionId = adminDivisionId;
        return this;
    }

    public String getMobile() {
        return this.mobile;
    }

    public VillagePersonalDetailPjo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public VillagePersonalDetailPjo setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public VillagePersonalDetailPjo setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getMaritalStatus() {
        return this.maritalStatus;
    }

    public VillagePersonalDetailPjo setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public Integer getEvaluate() {
        return this.evaluate;
    }

    public VillagePersonalDetailPjo setEvaluate(Integer evaluate) {
        this.evaluate = evaluate;
        return this;
    }

    public String getBadhabits() {
        return this.badhabits;
    }

    public VillagePersonalDetailPjo setBadhabits(String badhabits) {
        this.badhabits = badhabits;
        return this;
    }

    public Boolean getIsCrimed() {
        return this.isCrimed;
    }

    public VillagePersonalDetailPjo setIsCrimed(Boolean isCrimed) {
        this.isCrimed = isCrimed;
        return this;
    }

    public Integer getEducation() {
        return this.education;
    }

    public VillagePersonalDetailPjo setEducation(Integer education) {
        this.education = education;
        return this;
    }

    public Short getSupportNum() {
        return this.supportNum;
    }

    public VillagePersonalDetailPjo setSupportNum(Short supportNum) {
        this.supportNum = supportNum;
        return this;
    }

    public Short getMonitorChildren() {
        return this.monitorChildren;
    }

    public VillagePersonalDetailPjo setMonitorChildren(Short monitorChildren) {
        this.monitorChildren = monitorChildren;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillagePersonalDetailPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public VillagePersonalDetailPjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public VillagePersonalDetailPjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public BigDecimal getUpdateBy() {
        return this.updateBy;
    }

    public VillagePersonalDetailPjo setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public VillagePersonalDetailPjo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillagePersonalDetailPjo (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(adminDivisionId);
        sb.append(", ").append(mobile);
        sb.append(", ").append(identityId);
        sb.append(", ").append(address);
        sb.append(", ").append(maritalStatus);
        sb.append(", ").append(evaluate);
        sb.append(", ").append(badhabits);
        sb.append(", ").append(isCrimed);
        sb.append(", ").append(education);
        sb.append(", ").append(supportNum);
        sb.append(", ").append(monitorChildren);
        sb.append(", ").append(status);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateAt);

        sb.append(")");
        return sb.toString();
    }
}
