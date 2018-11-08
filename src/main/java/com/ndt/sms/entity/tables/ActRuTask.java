/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.ActRuTaskRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ActRuTask extends TableImpl<ActRuTaskRecord> {

    private static final long serialVersionUID = 419538851;

    /**
     * The reference instance of <code>ndt.act_ru_task</code>
     */
    public static final ActRuTask ACT_RU_TASK = new ActRuTask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActRuTaskRecord> getRecordType() {
        return ActRuTaskRecord.class;
    }

    /**
     * The column <code>ndt.act_ru_task.id_</code>.
     */
    public final TableField<ActRuTaskRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ndt.act_ru_task.rev_</code>.
     */
    public final TableField<ActRuTaskRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_ru_task.execution_id_</code>.
     */
    public final TableField<ActRuTaskRecord, String> EXECUTION_ID_ = createField("execution_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_task.proc_inst_id_</code>.
     */
    public final TableField<ActRuTaskRecord, String> PROC_INST_ID_ = createField("proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_task.proc_def_id_</code>.
     */
    public final TableField<ActRuTaskRecord, String> PROC_DEF_ID_ = createField("proc_def_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_task.name_</code>.
     */
    public final TableField<ActRuTaskRecord, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ru_task.parent_task_id_</code>.
     */
    public final TableField<ActRuTaskRecord, String> PARENT_TASK_ID_ = createField("parent_task_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_task.description_</code>.
     */
    public final TableField<ActRuTaskRecord, String> DESCRIPTION_ = createField("description_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>ndt.act_ru_task.task_def_key_</code>.
     */
    public final TableField<ActRuTaskRecord, String> TASK_DEF_KEY_ = createField("task_def_key_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ru_task.owner_</code>.
     */
    public final TableField<ActRuTaskRecord, String> OWNER_ = createField("owner_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ru_task.assignee_</code>.
     */
    public final TableField<ActRuTaskRecord, String> ASSIGNEE_ = createField("assignee_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ru_task.delegation_</code>.
     */
    public final TableField<ActRuTaskRecord, String> DELEGATION_ = createField("delegation_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_task.priority_</code>.
     */
    public final TableField<ActRuTaskRecord, Integer> PRIORITY_ = createField("priority_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_ru_task.create_time_</code>.
     */
    public final TableField<ActRuTaskRecord, Timestamp> CREATE_TIME_ = createField("create_time_", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.act_ru_task.due_date_</code>.
     */
    public final TableField<ActRuTaskRecord, Timestamp> DUE_DATE_ = createField("due_date_", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.act_ru_task.category_</code>.
     */
    public final TableField<ActRuTaskRecord, String> CATEGORY_ = createField("category_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ru_task.suspension_state_</code>.
     */
    public final TableField<ActRuTaskRecord, Integer> SUSPENSION_STATE_ = createField("suspension_state_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_ru_task.tenant_id_</code>.
     */
    public final TableField<ActRuTaskRecord, String> TENANT_ID_ = createField("tenant_id_", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ndt.act_ru_task.form_key_</code>.
     */
    public final TableField<ActRuTaskRecord, String> FORM_KEY_ = createField("form_key_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>ndt.act_ru_task</code> table reference
     */
    public ActRuTask() {
        this(DSL.name("act_ru_task"), null);
    }

    /**
     * Create an aliased <code>ndt.act_ru_task</code> table reference
     */
    public ActRuTask(String alias) {
        this(DSL.name(alias), ACT_RU_TASK);
    }

    /**
     * Create an aliased <code>ndt.act_ru_task</code> table reference
     */
    public ActRuTask(Name alias) {
        this(alias, ACT_RU_TASK);
    }

    private ActRuTask(Name alias, Table<ActRuTaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActRuTask(Name alias, Table<ActRuTaskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Ndt.NDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ACT_IDX_TASK_CREATE, Indexes.ACT_IDX_TASK_EXEC, Indexes.ACT_IDX_TASK_PROCDEF, Indexes.ACT_IDX_TASK_PROCINST, Indexes.ACT_RU_TASK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActRuTaskRecord> getPrimaryKey() {
        return Keys.ACT_RU_TASK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActRuTaskRecord>> getKeys() {
        return Arrays.<UniqueKey<ActRuTaskRecord>>asList(Keys.ACT_RU_TASK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTask as(String alias) {
        return new ActRuTask(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTask as(Name alias) {
        return new ActRuTask(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuTask rename(String name) {
        return new ActRuTask(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuTask rename(Name name) {
        return new ActRuTask(name, null);
    }
}