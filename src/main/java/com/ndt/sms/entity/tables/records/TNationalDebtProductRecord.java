/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TNationalDebtProduct;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TNationalDebtProductRecord extends UpdatableRecordImpl<TNationalDebtProductRecord> implements Record15<BigDecimal, BigDecimal, String, Integer[], Timestamp, Timestamp, Integer, String, Timestamp, Integer, Integer[], Integer, BigDecimal, BigDecimal, Timestamp> {

    private static final long serialVersionUID = -442731424;

    /**
     * Setter for <code>ndt.t_national_debt_product.org_id</code>. 发行机构ID
     */
    public TNationalDebtProductRecord setOrgId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.org_id</code>. 发行机构ID
     */
    public BigDecimal getOrgId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.id</code>. 国债id
     */
    public TNationalDebtProductRecord setId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.id</code>. 国债id
     */
    public BigDecimal getId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.pro_name</code>. 产品名称
     */
    public TNationalDebtProductRecord setProName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.pro_name</code>. 产品名称
     */
    public String getProName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.varieties</code>. 国债品种
     */
    public TNationalDebtProductRecord setVarieties(Integer... value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.varieties</code>. 国债品种
     */
    public Integer[] getVarieties() {
        return (Integer[]) get(3);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.start_issue_date</code>. 预约起始期限
     */
    public TNationalDebtProductRecord setStartIssueDate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.start_issue_date</code>. 预约起始期限
     */
    public Timestamp getStartIssueDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.end_issue_date</code>. 预约截止期限
     */
    public TNationalDebtProductRecord setEndIssueDate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.end_issue_date</code>. 预约截止期限
     */
    public Timestamp getEndIssueDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.paying_interest_way</code>. 付息方式
     */
    public TNationalDebtProductRecord setPayingInterestWay(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.paying_interest_way</code>. 付息方式
     */
    public Integer getPayingInterestWay() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.detail</code>. 产品详情
     */
    public TNationalDebtProductRecord setDetail(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.detail</code>. 产品详情
     */
    public String getDetail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.create_time</code>. 产品创建时间
     */
    public TNationalDebtProductRecord setCreateTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.create_time</code>. 产品创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.total_amount</code>. 发行总金额
     */
    public TNationalDebtProductRecord setTotalAmount(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.total_amount</code>. 发行总金额
     */
    public Integer getTotalAmount() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.product_to</code>. 产品对象
     */
    public TNationalDebtProductRecord setProductTo(Integer... value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.product_to</code>. 产品对象
     */
    public Integer[] getProductTo() {
        return (Integer[]) get(10);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.state</code>. 发行状态
     */
    public TNationalDebtProductRecord setState(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.state</code>. 发行状态
     */
    public Integer getState() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.handle_org_id</code>. 办理网点ID
     */
    public TNationalDebtProductRecord setHandleOrgId(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.handle_org_id</code>. 办理网点ID
     */
    public BigDecimal getHandleOrgId() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.operator_user_id</code>. 操作用户ID
     */
    public TNationalDebtProductRecord setOperatorUserId(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.operator_user_id</code>. 操作用户ID
     */
    public BigDecimal getOperatorUserId() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>ndt.t_national_debt_product.operate_time</code>. 操作时间
     */
    public TNationalDebtProductRecord setOperateTime(Timestamp value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_product.operate_time</code>. 操作时间
     */
    public Timestamp getOperateTime() {
        return (Timestamp) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<BigDecimal, BigDecimal, String, Integer[], Timestamp, Timestamp, Integer, String, Timestamp, Integer, Integer[], Integer, BigDecimal, BigDecimal, Timestamp> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<BigDecimal, BigDecimal, String, Integer[], Timestamp, Timestamp, Integer, String, Timestamp, Integer, Integer[], Integer, BigDecimal, BigDecimal, Timestamp> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.ORG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.PRO_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field4() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.VARIETIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.START_ISSUE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.END_ISSUE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.PAYING_INTEREST_WAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.TOTAL_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field11() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.PRODUCT_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.HANDLE_ORG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.OPERATOR_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT.OPERATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] component4() {
        return getVarieties();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getStartIssueDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getEndIssueDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getPayingInterestWay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDetail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getTotalAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] component11() {
        return getProductTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getHandleOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getOperatorUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getOperateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value4() {
        return getVarieties();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getStartIssueDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getEndIssueDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getPayingInterestWay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDetail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getTotalAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value11() {
        return getProductTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getHandleOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getOperatorUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getOperateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value1(BigDecimal value) {
        setOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value2(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value3(String value) {
        setProName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value4(Integer... value) {
        setVarieties(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value5(Timestamp value) {
        setStartIssueDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value6(Timestamp value) {
        setEndIssueDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value7(Integer value) {
        setPayingInterestWay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value8(String value) {
        setDetail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value10(Integer value) {
        setTotalAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value11(Integer... value) {
        setProductTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value12(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value13(BigDecimal value) {
        setHandleOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value14(BigDecimal value) {
        setOperatorUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord value15(Timestamp value) {
        setOperateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtProductRecord values(BigDecimal value1, BigDecimal value2, String value3, Integer[] value4, Timestamp value5, Timestamp value6, Integer value7, String value8, Timestamp value9, Integer value10, Integer[] value11, Integer value12, BigDecimal value13, BigDecimal value14, Timestamp value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TNationalDebtProductRecord
     */
    public TNationalDebtProductRecord() {
        super(TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT);
    }

    /**
     * Create a detached, initialised TNationalDebtProductRecord
     */
    public TNationalDebtProductRecord(BigDecimal orgId, BigDecimal id, String proName, Integer[] varieties, Timestamp startIssueDate, Timestamp endIssueDate, Integer payingInterestWay, String detail, Timestamp createTime, Integer totalAmount, Integer[] productTo, Integer state, BigDecimal handleOrgId, BigDecimal operatorUserId, Timestamp operateTime) {
        super(TNationalDebtProduct.T_NATIONAL_DEBT_PRODUCT);

        set(0, orgId);
        set(1, id);
        set(2, proName);
        set(3, varieties);
        set(4, startIssueDate);
        set(5, endIssueDate);
        set(6, payingInterestWay);
        set(7, detail);
        set(8, createTime);
        set(9, totalAmount);
        set(10, productTo);
        set(11, state);
        set(12, handleOrgId);
        set(13, operatorUserId);
        set(14, operateTime);
    }
}
