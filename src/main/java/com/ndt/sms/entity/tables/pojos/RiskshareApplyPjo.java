/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 风险分担申请
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RiskshareApplyPjo implements Serializable {

    private static final long serialVersionUID = 1510416537;

    private BigDecimal id;
    private BigDecimal orgId;
    private Integer    type;
    private BigDecimal loanApplyId;
    private Timestamp  loanApplyTime;
    private BigDecimal invitationId;
    private String     invitationCode;
    private BigDecimal invitationUserId;
    private Integer    invitationUserType;
    private BigDecimal userAdmindivisionId;
    private BigDecimal loanDoneAmount;
    private BigDecimal applyAmount;
    private String     files;
    private Integer    state;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;
    private Short      status;

    public RiskshareApplyPjo() {}

    public RiskshareApplyPjo(RiskshareApplyPjo value) {
        this.id = value.id;
        this.orgId = value.orgId;
        this.type = value.type;
        this.loanApplyId = value.loanApplyId;
        this.loanApplyTime = value.loanApplyTime;
        this.invitationId = value.invitationId;
        this.invitationCode = value.invitationCode;
        this.invitationUserId = value.invitationUserId;
        this.invitationUserType = value.invitationUserType;
        this.userAdmindivisionId = value.userAdmindivisionId;
        this.loanDoneAmount = value.loanDoneAmount;
        this.applyAmount = value.applyAmount;
        this.files = value.files;
        this.state = value.state;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
        this.status = value.status;
    }

    public RiskshareApplyPjo(
        BigDecimal id,
        BigDecimal orgId,
        Integer    type,
        BigDecimal loanApplyId,
        Timestamp  loanApplyTime,
        BigDecimal invitationId,
        String     invitationCode,
        BigDecimal invitationUserId,
        Integer    invitationUserType,
        BigDecimal userAdmindivisionId,
        BigDecimal loanDoneAmount,
        BigDecimal applyAmount,
        String     files,
        Integer    state,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime,
        Short      status
    ) {
        this.id = id;
        this.orgId = orgId;
        this.type = type;
        this.loanApplyId = loanApplyId;
        this.loanApplyTime = loanApplyTime;
        this.invitationId = invitationId;
        this.invitationCode = invitationCode;
        this.invitationUserId = invitationUserId;
        this.invitationUserType = invitationUserType;
        this.userAdmindivisionId = userAdmindivisionId;
        this.loanDoneAmount = loanDoneAmount;
        this.applyAmount = applyAmount;
        this.files = files;
        this.state = state;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.status = status;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public RiskshareApplyPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getOrgId() {
        return this.orgId;
    }

    public RiskshareApplyPjo setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public RiskshareApplyPjo setType(Integer type) {
        this.type = type;
        return this;
    }

    public BigDecimal getLoanApplyId() {
        return this.loanApplyId;
    }

    public RiskshareApplyPjo setLoanApplyId(BigDecimal loanApplyId) {
        this.loanApplyId = loanApplyId;
        return this;
    }

    public Timestamp getLoanApplyTime() {
        return this.loanApplyTime;
    }

    public RiskshareApplyPjo setLoanApplyTime(Timestamp loanApplyTime) {
        this.loanApplyTime = loanApplyTime;
        return this;
    }

    public BigDecimal getInvitationId() {
        return this.invitationId;
    }

    public RiskshareApplyPjo setInvitationId(BigDecimal invitationId) {
        this.invitationId = invitationId;
        return this;
    }

    public String getInvitationCode() {
        return this.invitationCode;
    }

    public RiskshareApplyPjo setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
        return this;
    }

    public BigDecimal getInvitationUserId() {
        return this.invitationUserId;
    }

    public RiskshareApplyPjo setInvitationUserId(BigDecimal invitationUserId) {
        this.invitationUserId = invitationUserId;
        return this;
    }

    public Integer getInvitationUserType() {
        return this.invitationUserType;
    }

    public RiskshareApplyPjo setInvitationUserType(Integer invitationUserType) {
        this.invitationUserType = invitationUserType;
        return this;
    }

    public BigDecimal getUserAdmindivisionId() {
        return this.userAdmindivisionId;
    }

    public RiskshareApplyPjo setUserAdmindivisionId(BigDecimal userAdmindivisionId) {
        this.userAdmindivisionId = userAdmindivisionId;
        return this;
    }

    public BigDecimal getLoanDoneAmount() {
        return this.loanDoneAmount;
    }

    public RiskshareApplyPjo setLoanDoneAmount(BigDecimal loanDoneAmount) {
        this.loanDoneAmount = loanDoneAmount;
        return this;
    }

    public BigDecimal getApplyAmount() {
        return this.applyAmount;
    }

    public RiskshareApplyPjo setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
        return this;
    }

    public String getFiles() {
        return this.files;
    }

    public RiskshareApplyPjo setFiles(String files) {
        this.files = files;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public RiskshareApplyPjo setState(Integer state) {
        this.state = state;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public RiskshareApplyPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public RiskshareApplyPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public RiskshareApplyPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public RiskshareApplyPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public RiskshareApplyPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RiskshareApplyPjo (");

        sb.append(id);
        sb.append(", ").append(orgId);
        sb.append(", ").append(type);
        sb.append(", ").append(loanApplyId);
        sb.append(", ").append(loanApplyTime);
        sb.append(", ").append(invitationId);
        sb.append(", ").append(invitationCode);
        sb.append(", ").append(invitationUserId);
        sb.append(", ").append(invitationUserType);
        sb.append(", ").append(userAdmindivisionId);
        sb.append(", ").append(loanDoneAmount);
        sb.append(", ").append(applyAmount);
        sb.append(", ").append(files);
        sb.append(", ").append(state);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
