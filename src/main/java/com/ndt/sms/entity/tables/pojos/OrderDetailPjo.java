/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;


/**
 * 订单详情表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderDetailPjo implements Serializable {

    private static final long serialVersionUID = -1423859075;

    private String     orderCode;
    private BigDecimal wareCode;
    private Integer    wareNum;

    public OrderDetailPjo() {}

    public OrderDetailPjo(OrderDetailPjo value) {
        this.orderCode = value.orderCode;
        this.wareCode = value.wareCode;
        this.wareNum = value.wareNum;
    }

    public OrderDetailPjo(
        String     orderCode,
        BigDecimal wareCode,
        Integer    wareNum
    ) {
        this.orderCode = orderCode;
        this.wareCode = wareCode;
        this.wareNum = wareNum;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public OrderDetailPjo setOrderCode(String orderCode) {
        this.orderCode = orderCode;
        return this;
    }

    public BigDecimal getWareCode() {
        return this.wareCode;
    }

    public OrderDetailPjo setWareCode(BigDecimal wareCode) {
        this.wareCode = wareCode;
        return this;
    }

    public Integer getWareNum() {
        return this.wareNum;
    }

    public OrderDetailPjo setWareNum(Integer wareNum) {
        this.wareNum = wareNum;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OrderDetailPjo (");

        sb.append(orderCode);
        sb.append(", ").append(wareCode);
        sb.append(", ").append(wareNum);

        sb.append(")");
        return sb.toString();
    }
}
