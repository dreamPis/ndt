/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.ActRuTask;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class ActRuTaskRecord extends UpdatableRecordImpl<ActRuTaskRecord> implements Record19<String, Integer, String, String, String, String, String, String, String, String, String, String, Integer, Timestamp, Timestamp, String, Integer, String, String> {

    private static final long serialVersionUID = 452003068;

    /**
     * Setter for <code>ndt.act_ru_task.id_</code>.
     */
    public ActRuTaskRecord setId_(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.id_</code>.
     */
    public String getId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ndt.act_ru_task.rev_</code>.
     */
    public ActRuTaskRecord setRev_(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.rev_</code>.
     */
    public Integer getRev_() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ndt.act_ru_task.execution_id_</code>.
     */
    public ActRuTaskRecord setExecutionId_(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.execution_id_</code>.
     */
    public String getExecutionId_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.act_ru_task.proc_inst_id_</code>.
     */
    public ActRuTaskRecord setProcInstId_(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.proc_inst_id_</code>.
     */
    public String getProcInstId_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.act_ru_task.proc_def_id_</code>.
     */
    public ActRuTaskRecord setProcDefId_(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.proc_def_id_</code>.
     */
    public String getProcDefId_() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.act_ru_task.name_</code>.
     */
    public ActRuTaskRecord setName_(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.name_</code>.
     */
    public String getName_() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.act_ru_task.parent_task_id_</code>.
     */
    public ActRuTaskRecord setParentTaskId_(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.parent_task_id_</code>.
     */
    public String getParentTaskId_() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.act_ru_task.description_</code>.
     */
    public ActRuTaskRecord setDescription_(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.description_</code>.
     */
    public String getDescription_() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.act_ru_task.task_def_key_</code>.
     */
    public ActRuTaskRecord setTaskDefKey_(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.task_def_key_</code>.
     */
    public String getTaskDefKey_() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.act_ru_task.owner_</code>.
     */
    public ActRuTaskRecord setOwner_(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.owner_</code>.
     */
    public String getOwner_() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ndt.act_ru_task.assignee_</code>.
     */
    public ActRuTaskRecord setAssignee_(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.assignee_</code>.
     */
    public String getAssignee_() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ndt.act_ru_task.delegation_</code>.
     */
    public ActRuTaskRecord setDelegation_(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.delegation_</code>.
     */
    public String getDelegation_() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ndt.act_ru_task.priority_</code>.
     */
    public ActRuTaskRecord setPriority_(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.priority_</code>.
     */
    public Integer getPriority_() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>ndt.act_ru_task.create_time_</code>.
     */
    public ActRuTaskRecord setCreateTime_(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.create_time_</code>.
     */
    public Timestamp getCreateTime_() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>ndt.act_ru_task.due_date_</code>.
     */
    public ActRuTaskRecord setDueDate_(Timestamp value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.due_date_</code>.
     */
    public Timestamp getDueDate_() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>ndt.act_ru_task.category_</code>.
     */
    public ActRuTaskRecord setCategory_(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.category_</code>.
     */
    public String getCategory_() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ndt.act_ru_task.suspension_state_</code>.
     */
    public ActRuTaskRecord setSuspensionState_(Integer value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.suspension_state_</code>.
     */
    public Integer getSuspensionState_() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>ndt.act_ru_task.tenant_id_</code>.
     */
    public ActRuTaskRecord setTenantId_(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.tenant_id_</code>.
     */
    public String getTenantId_() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ndt.act_ru_task.form_key_</code>.
     */
    public ActRuTaskRecord setFormKey_(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_task.form_key_</code>.
     */
    public String getFormKey_() {
        return (String) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, Integer, String, String, String, String, String, String, String, String, String, String, Integer, Timestamp, Timestamp, String, Integer, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, Integer, String, String, String, String, String, String, String, String, String, String, Integer, Timestamp, Timestamp, String, Integer, String, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ActRuTask.ACT_RU_TASK.ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ActRuTask.ACT_RU_TASK.REV_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ActRuTask.ACT_RU_TASK.EXECUTION_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ActRuTask.ACT_RU_TASK.PROC_INST_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ActRuTask.ACT_RU_TASK.PROC_DEF_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ActRuTask.ACT_RU_TASK.NAME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ActRuTask.ACT_RU_TASK.PARENT_TASK_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ActRuTask.ACT_RU_TASK.DESCRIPTION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ActRuTask.ACT_RU_TASK.TASK_DEF_KEY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ActRuTask.ACT_RU_TASK.OWNER_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ActRuTask.ACT_RU_TASK.ASSIGNEE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ActRuTask.ACT_RU_TASK.DELEGATION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return ActRuTask.ACT_RU_TASK.PRIORITY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return ActRuTask.ACT_RU_TASK.CREATE_TIME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return ActRuTask.ACT_RU_TASK.DUE_DATE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ActRuTask.ACT_RU_TASK.CATEGORY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return ActRuTask.ACT_RU_TASK.SUSPENSION_STATE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return ActRuTask.ACT_RU_TASK.TENANT_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return ActRuTask.ACT_RU_TASK.FORM_KEY_;
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
        return getExecutionId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProcDefId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getParentTaskId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDescription_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getTaskDefKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getOwner_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getAssignee_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getDelegation_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getPriority_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getCreateTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getDueDate_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getCategory_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component17() {
        return getSuspensionState_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getTenantId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getFormKey_();
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
        return getExecutionId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProcDefId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getParentTaskId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDescription_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTaskDefKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOwner_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAssignee_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getDelegation_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getPriority_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getCreateTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getDueDate_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCategory_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getSuspensionState_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getTenantId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getFormKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value1(String value) {
        setId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value2(Integer value) {
        setRev_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value3(String value) {
        setExecutionId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value4(String value) {
        setProcInstId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value5(String value) {
        setProcDefId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value6(String value) {
        setName_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value7(String value) {
        setParentTaskId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value8(String value) {
        setDescription_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value9(String value) {
        setTaskDefKey_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value10(String value) {
        setOwner_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value11(String value) {
        setAssignee_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value12(String value) {
        setDelegation_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value13(Integer value) {
        setPriority_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value14(Timestamp value) {
        setCreateTime_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value15(Timestamp value) {
        setDueDate_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value16(String value) {
        setCategory_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value17(Integer value) {
        setSuspensionState_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value18(String value) {
        setTenantId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value19(String value) {
        setFormKey_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord values(String value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Integer value13, Timestamp value14, Timestamp value15, String value16, Integer value17, String value18, String value19) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActRuTaskRecord
     */
    public ActRuTaskRecord() {
        super(ActRuTask.ACT_RU_TASK);
    }

    /**
     * Create a detached, initialised ActRuTaskRecord
     */
    public ActRuTaskRecord(String id_, Integer rev_, String executionId_, String procInstId_, String procDefId_, String name_, String parentTaskId_, String description_, String taskDefKey_, String owner_, String assignee_, String delegation_, Integer priority_, Timestamp createTime_, Timestamp dueDate_, String category_, Integer suspensionState_, String tenantId_, String formKey_) {
        super(ActRuTask.ACT_RU_TASK);

        set(0, id_);
        set(1, rev_);
        set(2, executionId_);
        set(3, procInstId_);
        set(4, procDefId_);
        set(5, name_);
        set(6, parentTaskId_);
        set(7, description_);
        set(8, taskDefKey_);
        set(9, owner_);
        set(10, assignee_);
        set(11, delegation_);
        set(12, priority_);
        set(13, createTime_);
        set(14, dueDate_);
        set(15, category_);
        set(16, suspensionState_);
        set(17, tenantId_);
        set(18, formKey_);
    }
}
