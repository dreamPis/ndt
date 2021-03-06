/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.ActRuVariableRecord;

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
public class ActRuVariable extends TableImpl<ActRuVariableRecord> {

    private static final long serialVersionUID = 463585226;

    /**
     * The reference instance of <code>ndt.act_ru_variable</code>
     */
    public static final ActRuVariable ACT_RU_VARIABLE = new ActRuVariable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActRuVariableRecord> getRecordType() {
        return ActRuVariableRecord.class;
    }

    /**
     * The column <code>ndt.act_ru_variable.id_</code>.
     */
    public final TableField<ActRuVariableRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ndt.act_ru_variable.rev_</code>.
     */
    public final TableField<ActRuVariableRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_ru_variable.type_</code>.
     */
    public final TableField<ActRuVariableRecord, String> TYPE_ = createField("type_", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ndt.act_ru_variable.name_</code>.
     */
    public final TableField<ActRuVariableRecord, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ndt.act_ru_variable.execution_id_</code>.
     */
    public final TableField<ActRuVariableRecord, String> EXECUTION_ID_ = createField("execution_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_variable.proc_inst_id_</code>.
     */
    public final TableField<ActRuVariableRecord, String> PROC_INST_ID_ = createField("proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_variable.task_id_</code>.
     */
    public final TableField<ActRuVariableRecord, String> TASK_ID_ = createField("task_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_variable.bytearray_id_</code>.
     */
    public final TableField<ActRuVariableRecord, String> BYTEARRAY_ID_ = createField("bytearray_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_variable.double_</code>.
     */
    public final TableField<ActRuVariableRecord, Double> DOUBLE_ = createField("double_", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ndt.act_ru_variable.long_</code>.
     */
    public final TableField<ActRuVariableRecord, Long> LONG_ = createField("long_", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>ndt.act_ru_variable.text_</code>.
     */
    public final TableField<ActRuVariableRecord, String> TEXT_ = createField("text_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>ndt.act_ru_variable.text2_</code>.
     */
    public final TableField<ActRuVariableRecord, String> TEXT2_ = createField("text2_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * Create a <code>ndt.act_ru_variable</code> table reference
     */
    public ActRuVariable() {
        this(DSL.name("act_ru_variable"), null);
    }

    /**
     * Create an aliased <code>ndt.act_ru_variable</code> table reference
     */
    public ActRuVariable(String alias) {
        this(DSL.name(alias), ACT_RU_VARIABLE);
    }

    /**
     * Create an aliased <code>ndt.act_ru_variable</code> table reference
     */
    public ActRuVariable(Name alias) {
        this(alias, ACT_RU_VARIABLE);
    }

    private ActRuVariable(Name alias, Table<ActRuVariableRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActRuVariable(Name alias, Table<ActRuVariableRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACT_IDX_VAR_BYTEARRAY, Indexes.ACT_IDX_VAR_EXE, Indexes.ACT_IDX_VAR_PROCINST, Indexes.ACT_IDX_VARIABLE_TASK_ID, Indexes.ACT_RU_VARIABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActRuVariableRecord> getPrimaryKey() {
        return Keys.ACT_RU_VARIABLE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActRuVariableRecord>> getKeys() {
        return Arrays.<UniqueKey<ActRuVariableRecord>>asList(Keys.ACT_RU_VARIABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuVariable as(String alias) {
        return new ActRuVariable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuVariable as(Name alias) {
        return new ActRuVariable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuVariable rename(String name) {
        return new ActRuVariable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuVariable rename(Name name) {
        return new ActRuVariable(name, null);
    }
}
