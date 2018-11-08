/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用工信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillagePersonalRecruitmentPjo implements Serializable {

    private static final long serialVersionUID = -1551702197;

    private BigDecimal id;
    private BigDecimal baseinfoId;
    private Integer    recruitmentNum;
    private String     recruitmentTime;
    private BigDecimal recruitmentMoney;
    private String     imageUrl;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;

    public VillagePersonalRecruitmentPjo() {}

    public VillagePersonalRecruitmentPjo(VillagePersonalRecruitmentPjo value) {
        this.id = value.id;
        this.baseinfoId = value.baseinfoId;
        this.recruitmentNum = value.recruitmentNum;
        this.recruitmentTime = value.recruitmentTime;
        this.recruitmentMoney = value.recruitmentMoney;
        this.imageUrl = value.imageUrl;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
    }

    public VillagePersonalRecruitmentPjo(
        BigDecimal id,
        BigDecimal baseinfoId,
        Integer    recruitmentNum,
        String     recruitmentTime,
        BigDecimal recruitmentMoney,
        String     imageUrl,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.baseinfoId = baseinfoId;
        this.recruitmentNum = recruitmentNum;
        this.recruitmentTime = recruitmentTime;
        this.recruitmentMoney = recruitmentMoney;
        this.imageUrl = imageUrl;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillagePersonalRecruitmentPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getBaseinfoId() {
        return this.baseinfoId;
    }

    public VillagePersonalRecruitmentPjo setBaseinfoId(BigDecimal baseinfoId) {
        this.baseinfoId = baseinfoId;
        return this;
    }

    public Integer getRecruitmentNum() {
        return this.recruitmentNum;
    }

    public VillagePersonalRecruitmentPjo setRecruitmentNum(Integer recruitmentNum) {
        this.recruitmentNum = recruitmentNum;
        return this;
    }

    public String getRecruitmentTime() {
        return this.recruitmentTime;
    }

    public VillagePersonalRecruitmentPjo setRecruitmentTime(String recruitmentTime) {
        this.recruitmentTime = recruitmentTime;
        return this;
    }

    public BigDecimal getRecruitmentMoney() {
        return this.recruitmentMoney;
    }

    public VillagePersonalRecruitmentPjo setRecruitmentMoney(BigDecimal recruitmentMoney) {
        this.recruitmentMoney = recruitmentMoney;
        return this;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public VillagePersonalRecruitmentPjo setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillagePersonalRecruitmentPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillagePersonalRecruitmentPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillagePersonalRecruitmentPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillagePersonalRecruitmentPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillagePersonalRecruitmentPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillagePersonalRecruitmentPjo (");

        sb.append(id);
        sb.append(", ").append(baseinfoId);
        sb.append(", ").append(recruitmentNum);
        sb.append(", ").append(recruitmentTime);
        sb.append(", ").append(recruitmentMoney);
        sb.append(", ").append(imageUrl);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}