/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TPolicyServiceMaterial;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 政策服务用户申请资料
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPolicyServiceMaterialRecord extends UpdatableRecordImpl<TPolicyServiceMaterialRecord> implements Record8<BigDecimal, BigDecimal, String, String, String, String[], Object, Boolean> {

    private static final long serialVersionUID = -1351825782;

    /**
     * Setter for <code>ndt.t_policy_service_material.id</code>. 唯一id
     */
    public TPolicyServiceMaterialRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_material.id</code>. 唯一id
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_policy_service_material.policy_serv_id</code>. 政策服务id
     */
    public TPolicyServiceMaterialRecord setPolicyServId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_material.policy_serv_id</code>. 政策服务id
     */
    public BigDecimal getPolicyServId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_policy_service_material.type_name</code>. 政策类别名称
     */
    public TPolicyServiceMaterialRecord setTypeName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_material.type_name</code>. 政策类别名称
     */
    public String getTypeName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_policy_service_material.type_group_id</code>. 政策类别分组
     */
    public TPolicyServiceMaterialRecord setTypeGroupId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_material.type_group_id</code>. 政策类别分组
     */
    public String getTypeGroupId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_policy_service_material.name</code>. 资料名称
     */
    public TPolicyServiceMaterialRecord setName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_material.name</code>. 资料名称
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_policy_service_material.credentials</code>. 上传证件[]
     */
    public TPolicyServiceMaterialRecord setCredentials(String... value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_material.credentials</code>. 上传证件[]
     */
    public String[] getCredentials() {
        return (String[]) get(5);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public TPolicyServiceMaterialRecord setTempFile(Object value) {
        set(6, value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getTempFile() {
        return get(6);
    }

    /**
     * Setter for <code>ndt.t_policy_service_material.check_all</code>. 是否全选
     */
    public TPolicyServiceMaterialRecord setCheckAll(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_policy_service_material.check_all</code>. 是否全选
     */
    public Boolean getCheckAll() {
        return (Boolean) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<BigDecimal, BigDecimal, String, String, String, String[], Object, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<BigDecimal, BigDecimal, String, String, String, String[], Object, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TPolicyServiceMaterial.T_POLICY_SERVICE_MATERIAL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TPolicyServiceMaterial.T_POLICY_SERVICE_MATERIAL.POLICY_SERV_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TPolicyServiceMaterial.T_POLICY_SERVICE_MATERIAL.TYPE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TPolicyServiceMaterial.T_POLICY_SERVICE_MATERIAL.TYPE_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TPolicyServiceMaterial.T_POLICY_SERVICE_MATERIAL.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field6() {
        return TPolicyServiceMaterial.T_POLICY_SERVICE_MATERIAL.CREDENTIALS;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field7() {
        return TPolicyServiceMaterial.T_POLICY_SERVICE_MATERIAL.TEMP_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return TPolicyServiceMaterial.T_POLICY_SERVICE_MATERIAL.CHECK_ALL;
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
    public BigDecimal component2() {
        return getPolicyServId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTypeGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component6() {
        return getCredentials();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component7() {
        return getTempFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getCheckAll();
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
    public BigDecimal value2() {
        return getPolicyServId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTypeGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value6() {
        return getCredentials();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value7() {
        return getTempFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getCheckAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceMaterialRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceMaterialRecord value2(BigDecimal value) {
        setPolicyServId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceMaterialRecord value3(String value) {
        setTypeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceMaterialRecord value4(String value) {
        setTypeGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceMaterialRecord value5(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceMaterialRecord value6(String... value) {
        setCredentials(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public TPolicyServiceMaterialRecord value7(Object value) {
        setTempFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceMaterialRecord value8(Boolean value) {
        setCheckAll(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceMaterialRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, String value5, String[] value6, Object value7, Boolean value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPolicyServiceMaterialRecord
     */
    public TPolicyServiceMaterialRecord() {
        super(TPolicyServiceMaterial.T_POLICY_SERVICE_MATERIAL);
    }

    /**
     * Create a detached, initialised TPolicyServiceMaterialRecord
     */
    public TPolicyServiceMaterialRecord(BigDecimal id, BigDecimal policyServId, String typeName, String typeGroupId, String name, String[] credentials, Object tempFile, Boolean checkAll) {
        super(TPolicyServiceMaterial.T_POLICY_SERVICE_MATERIAL);

        set(0, id);
        set(1, policyServId);
        set(2, typeName);
        set(3, typeGroupId);
        set(4, name);
        set(5, credentials);
        set(6, tempFile);
        set(7, checkAll);
    }
}
