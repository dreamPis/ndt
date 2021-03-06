/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.ActHiVarinstRecord;

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
public class ActHiVarinst extends TableImpl<ActHiVarinstRecord> {

    private static final long serialVersionUID = -1429709692;

    /**
     * The reference instance of <code>ndt.act_hi_varinst</code>
     */
    public static final ActHiVarinst ACT_HI_VARINST = new ActHiVarinst();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActHiVarinstRecord> getRecordType() {
        return ActHiVarinstRecord.class;
    }

    /**
     * The column <code>ndt.act_hi_varinst.id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ndt.act_hi_varinst.proc_inst_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> PROC_INST_ID_ = createField("proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_varinst.execution_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> EXECUTION_ID_ = createField("execution_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_varinst.task_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> TASK_ID_ = createField("task_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_varinst.name_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ndt.act_hi_varinst.var_type_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> VAR_TYPE_ = createField("var_type_", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>ndt.act_hi_varinst.rev_</code>.
     */
    public final TableField<ActHiVarinstRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_hi_varinst.bytearray_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> BYTEARRAY_ID_ = createField("bytearray_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_varinst.double_</code>.
     */
    public final TableField<ActHiVarinstRecord, Double> DOUBLE_ = createField("double_", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ndt.act_hi_varinst.long_</code>.
     */
    public final TableField<ActHiVarinstRecord, Long> LONG_ = createField("long_", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>ndt.act_hi_varinst.text_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> TEXT_ = createField("text_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>ndt.act_hi_varinst.text2_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> TEXT2_ = createField("text2_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>ndt.act_hi_varinst.create_time_</code>.
     */
    public final TableField<ActHiVarinstRecord, Timestamp> CREATE_TIME_ = createField("create_time_", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.act_hi_varinst.last_updated_time_</code>.
     */
    public final TableField<ActHiVarinstRecord, Timestamp> LAST_UPDATED_TIME_ = createField("last_updated_time_", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.act_hi_varinst</code> table reference
     */
    public ActHiVarinst() {
        this(DSL.name("act_hi_varinst"), null);
    }

    /**
     * Create an aliased <code>ndt.act_hi_varinst</code> table reference
     */
    public ActHiVarinst(String alias) {
        this(DSL.name(alias), ACT_HI_VARINST);
    }

    /**
     * Create an aliased <code>ndt.act_hi_varinst</code> table reference
     */
    public ActHiVarinst(Name alias) {
        this(alias, ACT_HI_VARINST);
    }

    private ActHiVarinst(Name alias, Table<ActHiVarinstRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActHiVarinst(Name alias, Table<ActHiVarinstRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACT_HI_VARINST_PKEY, Indexes.ACT_IDX_HI_PROCVAR_NAME_TYPE, Indexes.ACT_IDX_HI_PROCVAR_PROC_INST, Indexes.ACT_IDX_HI_PROCVAR_TASK_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActHiVarinstRecord> getPrimaryKey() {
        return Keys.ACT_HI_VARINST_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActHiVarinstRecord>> getKeys() {
        return Arrays.<UniqueKey<ActHiVarinstRecord>>asList(Keys.ACT_HI_VARINST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiVarinst as(String alias) {
        return new ActHiVarinst(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiVarinst as(Name alias) {
        return new ActHiVarinst(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiVarinst rename(String name) {
        return new ActHiVarinst(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiVarinst rename(Name name) {
        return new ActHiVarinst(name, null);
    }
}
