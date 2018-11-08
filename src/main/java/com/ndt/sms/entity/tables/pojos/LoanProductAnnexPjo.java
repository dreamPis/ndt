/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

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
public class LoanProductAnnexPjo implements Serializable {

    private static final long serialVersionUID = -1573869459;

    private BigDecimal id;
    private BigDecimal productId;
    private Integer    annexType;
    private String     annexPath;
    private Short      state;

    public LoanProductAnnexPjo() {}

    public LoanProductAnnexPjo(LoanProductAnnexPjo value) {
        this.id = value.id;
        this.productId = value.productId;
        this.annexType = value.annexType;
        this.annexPath = value.annexPath;
        this.state = value.state;
    }

    public LoanProductAnnexPjo(
        BigDecimal id,
        BigDecimal productId,
        Integer    annexType,
        String     annexPath,
        Short      state
    ) {
        this.id = id;
        this.productId = productId;
        this.annexType = annexType;
        this.annexPath = annexPath;
        this.state = state;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public LoanProductAnnexPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getProductId() {
        return this.productId;
    }

    public LoanProductAnnexPjo setProductId(BigDecimal productId) {
        this.productId = productId;
        return this;
    }

    public Integer getAnnexType() {
        return this.annexType;
    }

    public LoanProductAnnexPjo setAnnexType(Integer annexType) {
        this.annexType = annexType;
        return this;
    }

    public String getAnnexPath() {
        return this.annexPath;
    }

    public LoanProductAnnexPjo setAnnexPath(String annexPath) {
        this.annexPath = annexPath;
        return this;
    }

    public Short getState() {
        return this.state;
    }

    public LoanProductAnnexPjo setState(Short state) {
        this.state = state;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LoanProductAnnexPjo (");

        sb.append(id);
        sb.append(", ").append(productId);
        sb.append(", ").append(annexType);
        sb.append(", ").append(annexPath);
        sb.append(", ").append(state);

        sb.append(")");
        return sb.toString();
    }
}