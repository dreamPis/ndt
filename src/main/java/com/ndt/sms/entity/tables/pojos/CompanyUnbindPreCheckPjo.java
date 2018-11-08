/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class CompanyUnbindPreCheckPjo implements Serializable {

    private static final long serialVersionUID = -1606112016;

    private BigDecimal id;
    private BigDecimal userId;
    private BigDecimal companyId;
    private String     authorizePic;
    private Integer    state;
    private BigDecimal authBy;
    private Timestamp  authAt;

    public CompanyUnbindPreCheckPjo() {}

    public CompanyUnbindPreCheckPjo(CompanyUnbindPreCheckPjo value) {
        this.id = value.id;
        this.userId = value.userId;
        this.companyId = value.companyId;
        this.authorizePic = value.authorizePic;
        this.state = value.state;
        this.authBy = value.authBy;
        this.authAt = value.authAt;
    }

    public CompanyUnbindPreCheckPjo(
        BigDecimal id,
        BigDecimal userId,
        BigDecimal companyId,
        String     authorizePic,
        Integer    state,
        BigDecimal authBy,
        Timestamp  authAt
    ) {
        this.id = id;
        this.userId = userId;
        this.companyId = companyId;
        this.authorizePic = authorizePic;
        this.state = state;
        this.authBy = authBy;
        this.authAt = authAt;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public CompanyUnbindPreCheckPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public CompanyUnbindPreCheckPjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public BigDecimal getCompanyId() {
        return this.companyId;
    }

    public CompanyUnbindPreCheckPjo setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getAuthorizePic() {
        return this.authorizePic;
    }

    public CompanyUnbindPreCheckPjo setAuthorizePic(String authorizePic) {
        this.authorizePic = authorizePic;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public CompanyUnbindPreCheckPjo setState(Integer state) {
        this.state = state;
        return this;
    }

    public BigDecimal getAuthBy() {
        return this.authBy;
    }

    public CompanyUnbindPreCheckPjo setAuthBy(BigDecimal authBy) {
        this.authBy = authBy;
        return this;
    }

    public Timestamp getAuthAt() {
        return this.authAt;
    }

    public CompanyUnbindPreCheckPjo setAuthAt(Timestamp authAt) {
        this.authAt = authAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CompanyUnbindPreCheckPjo (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(authorizePic);
        sb.append(", ").append(state);
        sb.append(", ").append(authBy);
        sb.append(", ").append(authAt);

        sb.append(")");
        return sb.toString();
    }
}