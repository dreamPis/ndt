/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.ActRuJobRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class ActRuJob extends TableImpl<ActRuJobRecord> {

    private static final long serialVersionUID = -1880253417;

    /**
     * The reference instance of <code>ndt.act_ru_job</code>
     */
    public static final ActRuJob ACT_RU_JOB = new ActRuJob();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActRuJobRecord> getRecordType() {
        return ActRuJobRecord.class;
    }

    /**
     * The column <code>ndt.act_ru_job.id_</code>.
     */
    public final TableField<ActRuJobRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ndt.act_ru_job.rev_</code>.
     */
    public final TableField<ActRuJobRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_ru_job.type_</code>.
     */
    public final TableField<ActRuJobRecord, String> TYPE_ = createField("type_", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ndt.act_ru_job.lock_exp_time_</code>.
     */
    public final TableField<ActRuJobRecord, Timestamp> LOCK_EXP_TIME_ = createField("lock_exp_time_", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.act_ru_job.lock_owner_</code>.
     */
    public final TableField<ActRuJobRecord, String> LOCK_OWNER_ = createField("lock_owner_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ru_job.exclusive_</code>.
     */
    public final TableField<ActRuJobRecord, Boolean> EXCLUSIVE_ = createField("exclusive_", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ndt.act_ru_job.execution_id_</code>.
     */
    public final TableField<ActRuJobRecord, String> EXECUTION_ID_ = createField("execution_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_job.process_instance_id_</code>.
     */
    public final TableField<ActRuJobRecord, String> PROCESS_INSTANCE_ID_ = createField("process_instance_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_job.proc_def_id_</code>.
     */
    public final TableField<ActRuJobRecord, String> PROC_DEF_ID_ = createField("proc_def_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_job.retries_</code>.
     */
    public final TableField<ActRuJobRecord, Integer> RETRIES_ = createField("retries_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_ru_job.exception_stack_id_</code>.
     */
    public final TableField<ActRuJobRecord, String> EXCEPTION_STACK_ID_ = createField("exception_stack_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_job.exception_msg_</code>.
     */
    public final TableField<ActRuJobRecord, String> EXCEPTION_MSG_ = createField("exception_msg_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>ndt.act_ru_job.duedate_</code>.
     */
    public final TableField<ActRuJobRecord, Timestamp> DUEDATE_ = createField("duedate_", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.act_ru_job.repeat_</code>.
     */
    public final TableField<ActRuJobRecord, String> REPEAT_ = createField("repeat_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ru_job.handler_type_</code>.
     */
    public final TableField<ActRuJobRecord, String> HANDLER_TYPE_ = createField("handler_type_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ru_job.handler_cfg_</code>.
     */
    public final TableField<ActRuJobRecord, String> HANDLER_CFG_ = createField("handler_cfg_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>ndt.act_ru_job.tenant_id_</code>.
     */
    public final TableField<ActRuJobRecord, String> TENANT_ID_ = createField("tenant_id_", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>ndt.act_ru_job</code> table reference
     */
    public ActRuJob() {
        this(DSL.name("act_ru_job"), null);
    }

    /**
     * Create an aliased <code>ndt.act_ru_job</code> table reference
     */
    public ActRuJob(String alias) {
        this(DSL.name(alias), ACT_RU_JOB);
    }

    /**
     * Create an aliased <code>ndt.act_ru_job</code> table reference
     */
    public ActRuJob(Name alias) {
        this(alias, ACT_RU_JOB);
    }

    private ActRuJob(Name alias, Table<ActRuJobRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActRuJob(Name alias, Table<ActRuJobRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACT_IDX_JOB_EXCEPTION, Indexes.ACT_RU_JOB_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActRuJobRecord> getPrimaryKey() {
        return Keys.ACT_RU_JOB_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActRuJobRecord>> getKeys() {
        return Arrays.<UniqueKey<ActRuJobRecord>>asList(Keys.ACT_RU_JOB_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ActRuJobRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ActRuJobRecord, ?>>asList(Keys.ACT_RU_JOB__ACT_FK_JOB_EXCEPTION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuJob as(String alias) {
        return new ActRuJob(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuJob as(Name alias) {
        return new ActRuJob(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuJob rename(String name) {
        return new ActRuJob(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuJob rename(Name name) {
        return new ActRuJob(name, null);
    }
}
