/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TInsureLoanProduct;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 保险信贷产品
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInsureLoanProductRecord extends UpdatableRecordImpl<TInsureLoanProductRecord> implements Record22<BigDecimal, String, BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, Integer, String, Integer[], Integer[], Integer[], Integer, String, BigDecimal[], BigDecimal, Timestamp, BigDecimal, Timestamp, Integer> {

    private static final long serialVersionUID = -1852600889;

    /**
     * Setter for <code>ndt.t_insure_loan_product.id</code>.
     */
    public TInsureLoanProductRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.name</code>. 产品名称
     */
    public TInsureLoanProductRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.name</code>. 产品名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.org_id</code>. 金融机构ID
     */
    public TInsureLoanProductRecord setOrgId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.org_id</code>. 金融机构ID
     */
    public BigDecimal getOrgId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.logo_img_id</code>. 产品LOGO文件id
     */
    public TInsureLoanProductRecord setLogoImgId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.logo_img_id</code>. 产品LOGO文件id
     */
    public String getLogoImgId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.product_type</code>. 产品类型,参考码表大类33
     */
    public TInsureLoanProductRecord setProductType(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.product_type</code>. 产品类型,参考码表大类33
     */
    public BigDecimal getProductType() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.product_code</code>. 产品代码
     */
    public TInsureLoanProductRecord setProductCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.product_code</code>. 产品代码
     */
    public String getProductCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.mix_amount</code>. 最小额度
     */
    public TInsureLoanProductRecord setMixAmount(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.mix_amount</code>. 最小额度
     */
    public BigDecimal getMixAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.max_amount</code>. 最大额度
     */
    public TInsureLoanProductRecord setMaxAmount(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.max_amount</code>. 最大额度
     */
    public BigDecimal getMaxAmount() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.term</code>. 贷款期限
     */
    public TInsureLoanProductRecord setTerm(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.term</code>. 贷款期限
     */
    public BigDecimal getTerm() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.term_unit</code>. 期限单位
     */
    public TInsureLoanProductRecord setTermUnit(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.term_unit</code>. 期限单位
     */
    public Integer getTermUnit() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.rate</code>. 利率
     */
    public TInsureLoanProductRecord setRate(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.rate</code>. 利率
     */
    public String getRate() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.product_to</code>. 贷款对象
     */
    public TInsureLoanProductRecord setProductTo(Integer... value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.product_to</code>. 贷款对象
     */
    public Integer[] getProductTo() {
        return (Integer[]) get(11);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.loan_type</code>. 贷款方式
     */
    public TInsureLoanProductRecord setLoanType(Integer... value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.loan_type</code>. 贷款方式
     */
    public Integer[] getLoanType() {
        return (Integer[]) get(12);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.labels</code>. 产品标签
     */
    public TInsureLoanProductRecord setLabels(Integer... value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.labels</code>. 产品标签
     */
    public Integer[] getLabels() {
        return (Integer[]) get(13);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.payback_type</code>. 还款方式
     */
    public TInsureLoanProductRecord setPaybackType(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.payback_type</code>. 还款方式
     */
    public Integer getPaybackType() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.remark</code>. 描述
     */
    public TInsureLoanProductRecord setRemark(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.remark</code>. 描述
     */
    public String getRemark() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.divisions</code>. 服务区域
     */
    public TInsureLoanProductRecord setDivisions(BigDecimal... value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.divisions</code>. 服务区域
     */
    public BigDecimal[] getDivisions() {
        return (BigDecimal[]) get(16);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.create_by</code>. 创建人
     */
    public TInsureLoanProductRecord setCreateBy(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.create_by</code>. 创建人
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.create_at</code>. 创建时间
     */
    public TInsureLoanProductRecord setCreateAt(Timestamp value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.update_by</code>. 更新人
     */
    public TInsureLoanProductRecord setUpdateBy(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.update_by</code>. 更新人
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.update_at</code>. 更新时间
     */
    public TInsureLoanProductRecord setUpdateAt(Timestamp value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>ndt.t_insure_loan_product.status</code>. 产品状态
     */
    public TInsureLoanProductRecord setStatus(Integer value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_insure_loan_product.status</code>. 产品状态
     */
    public Integer getStatus() {
        return (Integer) get(21);
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
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<BigDecimal, String, BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, Integer, String, Integer[], Integer[], Integer[], Integer, String, BigDecimal[], BigDecimal, Timestamp, BigDecimal, Timestamp, Integer> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<BigDecimal, String, BigDecimal, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, Integer, String, Integer[], Integer[], Integer[], Integer, String, BigDecimal[], BigDecimal, Timestamp, BigDecimal, Timestamp, Integer> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.ORG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.LOGO_IMG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.PRODUCT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.PRODUCT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.MIX_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.MAX_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.TERM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.TERM_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field12() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.PRODUCT_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field13() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.LOAN_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field14() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.LABELS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.PAYBACK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal[]> field17() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.DIVISIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field18() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field20() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field21() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field22() {
        return TInsureLoanProduct.T_INSURE_LOAN_PRODUCT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLogoImgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getProductType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProductCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getMixAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getMaxAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getTerm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getTermUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] component12() {
        return getProductTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] component13() {
        return getLoanType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] component14() {
        return getLabels();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getPaybackType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] component17() {
        return getDivisions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component18() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component20() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component21() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component22() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLogoImgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getProductType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProductCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getMixAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getMaxAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getTerm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getTermUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value12() {
        return getProductTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value13() {
        return getLoanType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value14() {
        return getLabels();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getPaybackType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] value17() {
        return getDivisions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value18() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value20() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value21() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value22() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value3(BigDecimal value) {
        setOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value4(String value) {
        setLogoImgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value5(BigDecimal value) {
        setProductType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value6(String value) {
        setProductCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value7(BigDecimal value) {
        setMixAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value8(BigDecimal value) {
        setMaxAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value9(BigDecimal value) {
        setTerm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value10(Integer value) {
        setTermUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value11(String value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value12(Integer... value) {
        setProductTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value13(Integer... value) {
        setLoanType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value14(Integer... value) {
        setLabels(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value15(Integer value) {
        setPaybackType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value16(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value17(BigDecimal... value) {
        setDivisions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value18(BigDecimal value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value19(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value20(BigDecimal value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value21(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord value22(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanProductRecord values(BigDecimal value1, String value2, BigDecimal value3, String value4, BigDecimal value5, String value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, Integer value10, String value11, Integer[] value12, Integer[] value13, Integer[] value14, Integer value15, String value16, BigDecimal[] value17, BigDecimal value18, Timestamp value19, BigDecimal value20, Timestamp value21, Integer value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TInsureLoanProductRecord
     */
    public TInsureLoanProductRecord() {
        super(TInsureLoanProduct.T_INSURE_LOAN_PRODUCT);
    }

    /**
     * Create a detached, initialised TInsureLoanProductRecord
     */
    public TInsureLoanProductRecord(BigDecimal id, String name, BigDecimal orgId, String logoImgId, BigDecimal productType, String productCode, BigDecimal mixAmount, BigDecimal maxAmount, BigDecimal term, Integer termUnit, String rate, Integer[] productTo, Integer[] loanType, Integer[] labels, Integer paybackType, String remark, BigDecimal[] divisions, BigDecimal createBy, Timestamp createAt, BigDecimal updateBy, Timestamp updateAt, Integer status) {
        super(TInsureLoanProduct.T_INSURE_LOAN_PRODUCT);

        set(0, id);
        set(1, name);
        set(2, orgId);
        set(3, logoImgId);
        set(4, productType);
        set(5, productCode);
        set(6, mixAmount);
        set(7, maxAmount);
        set(8, term);
        set(9, termUnit);
        set(10, rate);
        set(11, productTo);
        set(12, loanType);
        set(13, labels);
        set(14, paybackType);
        set(15, remark);
        set(16, divisions);
        set(17, createBy);
        set(18, createAt);
        set(19, updateBy);
        set(20, updateAt);
        set(21, status);
    }
}
