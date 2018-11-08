/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TLoanProduct;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 贷款产品
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLoanProductRecord extends UpdatableRecordImpl<TLoanProductRecord> {

    private static final long serialVersionUID = -1551390951;

    /**
     * Setter for <code>ndt.t_loan_product.id</code>.
     */
    public TLoanProductRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_loan_product.name</code>. 产品名称
     */
    public TLoanProductRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.name</code>. 产品名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_loan_product.org_id</code>. 金融机构ID
     */
    public TLoanProductRecord setOrgId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.org_id</code>. 金融机构ID
     */
    public BigDecimal getOrgId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_loan_product.logo_image_url</code>. 产品LOGO地址
     */
    public TLoanProductRecord setLogoImageUrl(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.logo_image_url</code>. 产品LOGO地址
     */
    public String getLogoImageUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_loan_product.product_type</code>. 产品类型,参考码表大类33
     */
    public TLoanProductRecord setProductType(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.product_type</code>. 产品类型,参考码表大类33
     */
    public BigDecimal getProductType() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>ndt.t_loan_product.product_code</code>. 产品代码
     */
    public TLoanProductRecord setProductCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.product_code</code>. 产品代码
     */
    public String getProductCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_loan_product.mix_amount</code>. 最小额度
     */
    public TLoanProductRecord setMixAmount(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.mix_amount</code>. 最小额度
     */
    public BigDecimal getMixAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ndt.t_loan_product.mix_amount_unit</code>. 最小金额单位
     */
    public TLoanProductRecord setMixAmountUnit(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.mix_amount_unit</code>. 最小金额单位
     */
    public Integer getMixAmountUnit() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ndt.t_loan_product.max_amount</code>. 最大额度
     */
    public TLoanProductRecord setMaxAmount(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.max_amount</code>. 最大额度
     */
    public BigDecimal getMaxAmount() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ndt.t_loan_product.max_amount_unit</code>. 最大金额单位
     */
    public TLoanProductRecord setMaxAmountUnit(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.max_amount_unit</code>. 最大金额单位
     */
    public Integer getMaxAmountUnit() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ndt.t_loan_product.mix_term</code>. 最小期限
     */
    public TLoanProductRecord setMixTerm(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.mix_term</code>. 最小期限
     */
    public BigDecimal getMixTerm() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>ndt.t_loan_product.mix_term_unit</code>. 最小期限单位
     */
    public TLoanProductRecord setMixTermUnit(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.mix_term_unit</code>. 最小期限单位
     */
    public Integer getMixTermUnit() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>ndt.t_loan_product.max_term</code>. 最大期限
     */
    public TLoanProductRecord setMaxTerm(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.max_term</code>. 最大期限
     */
    public BigDecimal getMaxTerm() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>ndt.t_loan_product.max_term_unit</code>. 最大期限单位
     */
    public TLoanProductRecord setMaxTermUnit(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.max_term_unit</code>. 最大期限单位
     */
    public Integer getMaxTermUnit() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>ndt.t_loan_product.only_ndt</code>. 农贷通专属产品
     */
    public TLoanProductRecord setOnlyNdt(Boolean value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.only_ndt</code>. 农贷通专属产品
     */
    public Boolean getOnlyNdt() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>ndt.t_loan_product.rate</code>. 利率
     */
    public TLoanProductRecord setRate(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.rate</code>. 利率
     */
    public String getRate() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ndt.t_loan_product.product_to</code>. 贷款对象
     */
    public TLoanProductRecord setProductTo(Integer... value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.product_to</code>. 贷款对象
     */
    public Integer[] getProductTo() {
        return (Integer[]) get(16);
    }

    /**
     * Setter for <code>ndt.t_loan_product.loan_types</code>. 贷款方式
     */
    public TLoanProductRecord setLoanTypes(Integer... value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.loan_types</code>. 贷款方式
     */
    public Integer[] getLoanTypes() {
        return (Integer[]) get(17);
    }

    /**
     * Setter for <code>ndt.t_loan_product.labels</code>. 产品标签
     */
    public TLoanProductRecord setLabels(Integer... value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.labels</code>. 产品标签
     */
    public Integer[] getLabels() {
        return (Integer[]) get(18);
    }

    /**
     * Setter for <code>ndt.t_loan_product.payback_type</code>. 还款方式
     */
    public TLoanProductRecord setPaybackType(Integer value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.payback_type</code>. 还款方式
     */
    public Integer getPaybackType() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>ndt.t_loan_product.support_policy</code>. 扶持支持政策
     */
    public TLoanProductRecord setSupportPolicy(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.support_policy</code>. 扶持支持政策
     */
    public String getSupportPolicy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>ndt.t_loan_product.remark</code>. 描述
     */
    public TLoanProductRecord setRemark(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.remark</code>. 描述
     */
    public String getRemark() {
        return (String) get(21);
    }

    /**
     * Setter for <code>ndt.t_loan_product.priority</code>. 优先级,1~100,数值越大优先级越高
     */
    public TLoanProductRecord setPriority(Short value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.priority</code>. 优先级,1~100,数值越大优先级越高
     */
    public Short getPriority() {
        return (Short) get(22);
    }

    /**
     * Setter for <code>ndt.t_loan_product.state</code>. 产品状态,参考码表大类34
     */
    public TLoanProductRecord setState(Integer value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.state</code>. 产品状态,参考码表大类34
     */
    public Integer getState() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>ndt.t_loan_product.divisions</code>. 服务区域
     */
    public TLoanProductRecord setDivisions(BigDecimal... value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.divisions</code>. 服务区域
     */
    public BigDecimal[] getDivisions() {
        return (BigDecimal[]) get(24);
    }

    /**
     * Setter for <code>ndt.t_loan_product.status</code>. 记录状态
     */
    public TLoanProductRecord setStatus(Short value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.status</code>. 记录状态
     */
    public Short getStatus() {
        return (Short) get(25);
    }

    /**
     * Setter for <code>ndt.t_loan_product.create_by</code>. 创建人
     */
    public TLoanProductRecord setCreateBy(BigDecimal value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.create_by</code>. 创建人
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(26);
    }

    /**
     * Setter for <code>ndt.t_loan_product.create_at</code>. 创建时间
     */
    public TLoanProductRecord setCreateAt(Timestamp value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(27);
    }

    /**
     * Setter for <code>ndt.t_loan_product.update_by</code>. 更新人
     */
    public TLoanProductRecord setUpdateBy(BigDecimal value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.update_by</code>. 更新人
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(28);
    }

    /**
     * Setter for <code>ndt.t_loan_product.update_at</code>. 更新时间
     */
    public TLoanProductRecord setUpdateAt(Timestamp value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(29);
    }

    /**
     * Setter for <code>ndt.t_loan_product.index</code>. 排序顺序
     */
    public TLoanProductRecord setIndex(Integer value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.index</code>. 排序顺序
     */
    public Integer getIndex() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>ndt.t_loan_product.square_logo</code>. 正方形logo
     */
    public TLoanProductRecord setSquareLogo(BigDecimal value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.square_logo</code>. 正方形logo
     */
    public BigDecimal getSquareLogo() {
        return (BigDecimal) get(31);
    }

    /**
     * Setter for <code>ndt.t_loan_product.credit_rating</code>. 信用评级
     */
    public TLoanProductRecord setCreditRating(Integer value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.credit_rating</code>. 信用评级
     */
    public Integer getCreditRating() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>ndt.t_loan_product.base_rate</code>. 基准利率
     */
    public TLoanProductRecord setBaseRate(BigDecimal value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.base_rate</code>. 基准利率
     */
    public BigDecimal getBaseRate() {
        return (BigDecimal) get(33);
    }

    /**
     * Setter for <code>ndt.t_loan_product.float_prop</code>. 上浮比例
     */
    public TLoanProductRecord setFloatProp(BigDecimal value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_product.float_prop</code>. 上浮比例
     */
    public BigDecimal getFloatProp() {
        return (BigDecimal) get(34);
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
     * Create a detached TLoanProductRecord
     */
    public TLoanProductRecord() {
        super(TLoanProduct.T_LOAN_PRODUCT);
    }

    /**
     * Create a detached, initialised TLoanProductRecord
     */
    public TLoanProductRecord(BigDecimal id, String name, BigDecimal orgId, String logoImageUrl, BigDecimal productType, String productCode, BigDecimal mixAmount, Integer mixAmountUnit, BigDecimal maxAmount, Integer maxAmountUnit, BigDecimal mixTerm, Integer mixTermUnit, BigDecimal maxTerm, Integer maxTermUnit, Boolean onlyNdt, String rate, Integer[] productTo, Integer[] loanTypes, Integer[] labels, Integer paybackType, String supportPolicy, String remark, Short priority, Integer state, BigDecimal[] divisions, Short status, BigDecimal createBy, Timestamp createAt, BigDecimal updateBy, Timestamp updateAt, Integer index, BigDecimal squareLogo, Integer creditRating, BigDecimal baseRate, BigDecimal floatProp) {
        super(TLoanProduct.T_LOAN_PRODUCT);

        set(0, id);
        set(1, name);
        set(2, orgId);
        set(3, logoImageUrl);
        set(4, productType);
        set(5, productCode);
        set(6, mixAmount);
        set(7, mixAmountUnit);
        set(8, maxAmount);
        set(9, maxAmountUnit);
        set(10, mixTerm);
        set(11, mixTermUnit);
        set(12, maxTerm);
        set(13, maxTermUnit);
        set(14, onlyNdt);
        set(15, rate);
        set(16, productTo);
        set(17, loanTypes);
        set(18, labels);
        set(19, paybackType);
        set(20, supportPolicy);
        set(21, remark);
        set(22, priority);
        set(23, state);
        set(24, divisions);
        set(25, status);
        set(26, createBy);
        set(27, createAt);
        set(28, updateBy);
        set(29, updateAt);
        set(30, index);
        set(31, squareLogo);
        set(32, creditRating);
        set(33, baseRate);
        set(34, floatProp);
    }
}