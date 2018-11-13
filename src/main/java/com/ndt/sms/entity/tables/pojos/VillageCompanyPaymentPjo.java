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
 * 村站采集的公司缴费信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillageCompanyPaymentPjo implements Serializable {

    private static final long serialVersionUID = -1317987473;

    private BigDecimal   id;
    private BigDecimal   villageCompanyInfoId;
    private String       name;
    private BigDecimal   payAmt;
    private String       payDate;
    private String       payType;
    private String       consumption;
    private String       goodsNum;
    private String       imgUrl;
    private Short        status;
    private BigDecimal   createUser;
    private Timestamp    createTime;
    private BigDecimal   updateUser;
    private Timestamp    updateTime;
    private Object       payInfo;
    private BigDecimal[] paymentImg;

    public VillageCompanyPaymentPjo() {}

    public VillageCompanyPaymentPjo(VillageCompanyPaymentPjo value) {
        this.id = value.id;
        this.villageCompanyInfoId = value.villageCompanyInfoId;
        this.name = value.name;
        this.payAmt = value.payAmt;
        this.payDate = value.payDate;
        this.payType = value.payType;
        this.consumption = value.consumption;
        this.goodsNum = value.goodsNum;
        this.imgUrl = value.imgUrl;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
        this.payInfo = value.payInfo;
        this.paymentImg = value.paymentImg;
    }

    public VillageCompanyPaymentPjo(
        BigDecimal   id,
        BigDecimal   villageCompanyInfoId,
        String       name,
        BigDecimal   payAmt,
        String       payDate,
        String       payType,
        String       consumption,
        String       goodsNum,
        String       imgUrl,
        Short        status,
        BigDecimal   createUser,
        Timestamp    createTime,
        BigDecimal   updateUser,
        Timestamp    updateTime,
        Object       payInfo,
        BigDecimal[] paymentImg
    ) {
        this.id = id;
        this.villageCompanyInfoId = villageCompanyInfoId;
        this.name = name;
        this.payAmt = payAmt;
        this.payDate = payDate;
        this.payType = payType;
        this.consumption = consumption;
        this.goodsNum = goodsNum;
        this.imgUrl = imgUrl;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.payInfo = payInfo;
        this.paymentImg = paymentImg;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillageCompanyPaymentPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getVillageCompanyInfoId() {
        return this.villageCompanyInfoId;
    }

    public VillageCompanyPaymentPjo setVillageCompanyInfoId(BigDecimal villageCompanyInfoId) {
        this.villageCompanyInfoId = villageCompanyInfoId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public VillageCompanyPaymentPjo setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPayAmt() {
        return this.payAmt;
    }

    public VillageCompanyPaymentPjo setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
        return this;
    }

    public String getPayDate() {
        return this.payDate;
    }

    public VillageCompanyPaymentPjo setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }

    public String getPayType() {
        return this.payType;
    }

    public VillageCompanyPaymentPjo setPayType(String payType) {
        this.payType = payType;
        return this;
    }

    public String getConsumption() {
        return this.consumption;
    }

    public VillageCompanyPaymentPjo setConsumption(String consumption) {
        this.consumption = consumption;
        return this;
    }

    public String getGoodsNum() {
        return this.goodsNum;
    }

    public VillageCompanyPaymentPjo setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
        return this;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public VillageCompanyPaymentPjo setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillageCompanyPaymentPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillageCompanyPaymentPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillageCompanyPaymentPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillageCompanyPaymentPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillageCompanyPaymentPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPayInfo() {
        return this.payInfo;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public VillageCompanyPaymentPjo setPayInfo(Object payInfo) {
        this.payInfo = payInfo;
        return this;
    }

    public BigDecimal[] getPaymentImg() {
        return this.paymentImg;
    }

    public VillageCompanyPaymentPjo setPaymentImg(BigDecimal... paymentImg) {
        this.paymentImg = paymentImg;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillageCompanyPaymentPjo (");

        sb.append(id);
        sb.append(", ").append(villageCompanyInfoId);
        sb.append(", ").append(name);
        sb.append(", ").append(payAmt);
        sb.append(", ").append(payDate);
        sb.append(", ").append(payType);
        sb.append(", ").append(consumption);
        sb.append(", ").append(goodsNum);
        sb.append(", ").append(imgUrl);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(payInfo);
        sb.append(", ").append(Arrays.toString(paymentImg));

        sb.append(")");
        return sb.toString();
    }
}
