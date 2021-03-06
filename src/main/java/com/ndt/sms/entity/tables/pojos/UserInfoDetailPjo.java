/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;


/**
 * 用户详细数据
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoDetailPjo implements Serializable {

    private static final long serialVersionUID = -1755590625;

    private BigDecimal userId;
    private BigDecimal faceFileId;
    private Integer    score;
    private String     identityFileIds;
    private Integer    state;
    private Short      source;

    public UserInfoDetailPjo() {}

    public UserInfoDetailPjo(UserInfoDetailPjo value) {
        this.userId = value.userId;
        this.faceFileId = value.faceFileId;
        this.score = value.score;
        this.identityFileIds = value.identityFileIds;
        this.state = value.state;
        this.source = value.source;
    }

    public UserInfoDetailPjo(
        BigDecimal userId,
        BigDecimal faceFileId,
        Integer    score,
        String     identityFileIds,
        Integer    state,
        Short      source
    ) {
        this.userId = userId;
        this.faceFileId = faceFileId;
        this.score = score;
        this.identityFileIds = identityFileIds;
        this.state = state;
        this.source = source;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public UserInfoDetailPjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public BigDecimal getFaceFileId() {
        return this.faceFileId;
    }

    public UserInfoDetailPjo setFaceFileId(BigDecimal faceFileId) {
        this.faceFileId = faceFileId;
        return this;
    }

    public Integer getScore() {
        return this.score;
    }

    public UserInfoDetailPjo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public String getIdentityFileIds() {
        return this.identityFileIds;
    }

    public UserInfoDetailPjo setIdentityFileIds(String identityFileIds) {
        this.identityFileIds = identityFileIds;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public UserInfoDetailPjo setState(Integer state) {
        this.state = state;
        return this;
    }

    public Short getSource() {
        return this.source;
    }

    public UserInfoDetailPjo setSource(Short source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserInfoDetailPjo (");

        sb.append(userId);
        sb.append(", ").append(faceFileId);
        sb.append(", ").append(score);
        sb.append(", ").append(identityFileIds);
        sb.append(", ").append(state);
        sb.append(", ").append(source);

        sb.append(")");
        return sb.toString();
    }
}
