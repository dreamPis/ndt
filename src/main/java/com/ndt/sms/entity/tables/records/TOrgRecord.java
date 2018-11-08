/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TOrg;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 组织机构表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TOrgRecord extends UpdatableRecordImpl<TOrgRecord> {

    private static final long serialVersionUID = -1062012680;

    /**
     * Setter for <code>ndt.t_org.id</code>.
     */
    public TOrgRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_org.name</code>. 名称
     */
    public TOrgRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.name</code>. 名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_org.code</code>. 机构代码
     */
    public TOrgRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.code</code>. 机构代码
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_org.parent_id</code>. 父级ID
     */
    public TOrgRecord setParentId(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.parent_id</code>. 父级ID
     */
    public BigDecimal getParentId() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_org.org_type</code>. 机构类型
     */
    public TOrgRecord setOrgType(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.org_type</code>. 机构类型
     */
    public Integer getOrgType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_org.org_subtype</code>. 机构子类型
     */
    public TOrgRecord setOrgSubtype(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.org_subtype</code>. 机构子类型
     */
    public Integer getOrgSubtype() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ndt.t_org.address</code>. 地址
     */
    public TOrgRecord setAddress(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.address</code>. 地址
     */
    public String getAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_org.image_from_parent</code>. LOG图片来自父级
     */
    public TOrgRecord setImageFromParent(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.image_from_parent</code>. LOG图片来自父级
     */
    public Boolean getImageFromParent() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>ndt.t_org.logo_image_url</code>. LOG图片地址
     */
    public TOrgRecord setLogoImageUrl(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.logo_image_url</code>. LOG图片地址
     */
    public String getLogoImageUrl() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.t_org.admin_division_id</code>. 所属行政区划
     */
    public TOrgRecord setAdminDivisionId(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.admin_division_id</code>. 所属行政区划
     */
    public BigDecimal getAdminDivisionId() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>ndt.t_org.divisions</code>. 管辖区域
     */
    public TOrgRecord setDivisions(BigDecimal... value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.divisions</code>. 管辖区域
     */
    public BigDecimal[] getDivisions() {
        return (BigDecimal[]) get(10);
    }

    /**
     * Setter for <code>ndt.t_org.is_leaf</code>. 是否为末级节点
     */
    public TOrgRecord setIsLeaf(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.is_leaf</code>. 是否为末级节点
     */
    public Boolean getIsLeaf() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>ndt.t_org.phone</code>. 联系电话
     */
    public TOrgRecord setPhone(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.phone</code>. 联系电话
     */
    public String getPhone() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ndt.t_org.remark_from_parent</code>. 描述来自父级
     */
    public TOrgRecord setRemarkFromParent(Boolean value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.remark_from_parent</code>. 描述来自父级
     */
    public Boolean getRemarkFromParent() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>ndt.t_org.remark</code>. 描述
     */
    public TOrgRecord setRemark(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.remark</code>. 描述
     */
    public String getRemark() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ndt.t_org.status</code>. 记录状态
     */
    public TOrgRecord setStatus(Integer value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.status</code>. 记录状态
     */
    public Integer getStatus() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>ndt.t_org.create_at</code>. 创建时间
     */
    public TOrgRecord setCreateAt(Timestamp value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>ndt.t_org.create_by</code>. 创建人
     */
    public TOrgRecord setCreateBy(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.create_by</code>. 创建人
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>ndt.t_org.update_at</code>. 更新时间
     */
    public TOrgRecord setUpdateAt(Timestamp value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>ndt.t_org.update_by</code>. 更新人
     */
    public TOrgRecord setUpdateBy(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.update_by</code>. 更新人
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>ndt.t_org.square_logo</code>. 正方形logo
     */
    public TOrgRecord setSquareLogo(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.square_logo</code>. 正方形logo
     */
    public String getSquareLogo() {
        return (String) get(20);
    }

    /**
     * Setter for <code>ndt.t_org.is_visible</code>. 是否可见
     */
    public TOrgRecord setIsVisible(Boolean value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.is_visible</code>. 是否可见
     */
    public Boolean getIsVisible() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>ndt.t_org.short_name</code>. 简称
     */
    public TOrgRecord setShortName(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_org.short_name</code>. 简称
     */
    public String getShortName() {
        return (String) get(22);
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
     * Create a detached TOrgRecord
     */
    public TOrgRecord() {
        super(TOrg.T_ORG);
    }

    /**
     * Create a detached, initialised TOrgRecord
     */
    public TOrgRecord(BigDecimal id, String name, String code, BigDecimal parentId, Integer orgType, Integer orgSubtype, String address, Boolean imageFromParent, String logoImageUrl, BigDecimal adminDivisionId, BigDecimal[] divisions, Boolean isLeaf, String phone, Boolean remarkFromParent, String remark, Integer status, Timestamp createAt, BigDecimal createBy, Timestamp updateAt, BigDecimal updateBy, String squareLogo, Boolean isVisible, String shortName) {
        super(TOrg.T_ORG);

        set(0, id);
        set(1, name);
        set(2, code);
        set(3, parentId);
        set(4, orgType);
        set(5, orgSubtype);
        set(6, address);
        set(7, imageFromParent);
        set(8, logoImageUrl);
        set(9, adminDivisionId);
        set(10, divisions);
        set(11, isLeaf);
        set(12, phone);
        set(13, remarkFromParent);
        set(14, remark);
        set(15, status);
        set(16, createAt);
        set(17, createBy);
        set(18, updateAt);
        set(19, updateBy);
        set(20, squareLogo);
        set(21, isVisible);
        set(22, shortName);
    }
}
