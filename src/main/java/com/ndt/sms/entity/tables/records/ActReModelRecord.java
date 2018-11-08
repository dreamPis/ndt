/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.ActReModel;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class ActReModelRecord extends UpdatableRecordImpl<ActReModelRecord> implements Record13<String, Integer, String, String, String, Timestamp, Timestamp, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 1528231931;

    /**
     * Setter for <code>ndt.act_re_model.id_</code>.
     */
    public ActReModelRecord setId_(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.id_</code>.
     */
    public String getId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ndt.act_re_model.rev_</code>.
     */
    public ActReModelRecord setRev_(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.rev_</code>.
     */
    public Integer getRev_() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ndt.act_re_model.name_</code>.
     */
    public ActReModelRecord setName_(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.name_</code>.
     */
    public String getName_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.act_re_model.key_</code>.
     */
    public ActReModelRecord setKey_(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.key_</code>.
     */
    public String getKey_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.act_re_model.category_</code>.
     */
    public ActReModelRecord setCategory_(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.category_</code>.
     */
    public String getCategory_() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.act_re_model.create_time_</code>.
     */
    public ActReModelRecord setCreateTime_(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.create_time_</code>.
     */
    public Timestamp getCreateTime_() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ndt.act_re_model.last_update_time_</code>.
     */
    public ActReModelRecord setLastUpdateTime_(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.last_update_time_</code>.
     */
    public Timestamp getLastUpdateTime_() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ndt.act_re_model.version_</code>.
     */
    public ActReModelRecord setVersion_(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.version_</code>.
     */
    public Integer getVersion_() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ndt.act_re_model.meta_info_</code>.
     */
    public ActReModelRecord setMetaInfo_(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.meta_info_</code>.
     */
    public String getMetaInfo_() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.act_re_model.deployment_id_</code>.
     */
    public ActReModelRecord setDeploymentId_(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.deployment_id_</code>.
     */
    public String getDeploymentId_() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ndt.act_re_model.editor_source_value_id_</code>.
     */
    public ActReModelRecord setEditorSourceValueId_(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.editor_source_value_id_</code>.
     */
    public String getEditorSourceValueId_() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ndt.act_re_model.editor_source_extra_value_id_</code>.
     */
    public ActReModelRecord setEditorSourceExtraValueId_(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.editor_source_extra_value_id_</code>.
     */
    public String getEditorSourceExtraValueId_() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ndt.act_re_model.tenant_id_</code>.
     */
    public ActReModelRecord setTenantId_(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_re_model.tenant_id_</code>.
     */
    public String getTenantId_() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, Integer, String, String, String, Timestamp, Timestamp, Integer, String, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, Integer, String, String, String, Timestamp, Timestamp, Integer, String, String, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ActReModel.ACT_RE_MODEL.ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ActReModel.ACT_RE_MODEL.REV_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ActReModel.ACT_RE_MODEL.NAME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ActReModel.ACT_RE_MODEL.KEY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ActReModel.ACT_RE_MODEL.CATEGORY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ActReModel.ACT_RE_MODEL.CREATE_TIME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ActReModel.ACT_RE_MODEL.LAST_UPDATE_TIME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ActReModel.ACT_RE_MODEL.VERSION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ActReModel.ACT_RE_MODEL.META_INFO_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ActReModel.ACT_RE_MODEL.DEPLOYMENT_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ActReModel.ACT_RE_MODEL.EDITOR_SOURCE_VALUE_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ActReModel.ACT_RE_MODEL.EDITOR_SOURCE_EXTRA_VALUE_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ActReModel.ACT_RE_MODEL.TENANT_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRev_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCategory_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreateTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getLastUpdateTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getVersion_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getMetaInfo_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getDeploymentId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getEditorSourceValueId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getEditorSourceExtraValueId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getTenantId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRev_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCategory_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getLastUpdateTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getVersion_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMetaInfo_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDeploymentId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getEditorSourceValueId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getEditorSourceExtraValueId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getTenantId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value1(String value) {
        setId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value2(Integer value) {
        setRev_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value3(String value) {
        setName_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value4(String value) {
        setKey_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value5(String value) {
        setCategory_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value6(Timestamp value) {
        setCreateTime_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value7(Timestamp value) {
        setLastUpdateTime_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value8(Integer value) {
        setVersion_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value9(String value) {
        setMetaInfo_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value10(String value) {
        setDeploymentId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value11(String value) {
        setEditorSourceValueId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value12(String value) {
        setEditorSourceExtraValueId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord value13(String value) {
        setTenantId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReModelRecord values(String value1, Integer value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Integer value8, String value9, String value10, String value11, String value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActReModelRecord
     */
    public ActReModelRecord() {
        super(ActReModel.ACT_RE_MODEL);
    }

    /**
     * Create a detached, initialised ActReModelRecord
     */
    public ActReModelRecord(String id_, Integer rev_, String name_, String key_, String category_, Timestamp createTime_, Timestamp lastUpdateTime_, Integer version_, String metaInfo_, String deploymentId_, String editorSourceValueId_, String editorSourceExtraValueId_, String tenantId_) {
        super(ActReModel.ACT_RE_MODEL);

        set(0, id_);
        set(1, rev_);
        set(2, name_);
        set(3, key_);
        set(4, category_);
        set(5, createTime_);
        set(6, lastUpdateTime_);
        set(7, version_);
        set(8, metaInfo_);
        set(9, deploymentId_);
        set(10, editorSourceValueId_);
        set(11, editorSourceExtraValueId_);
        set(12, tenantId_);
    }
}
