/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TRisksShareTraceRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class TRisksShareTrace extends TableImpl<TRisksShareTraceRecord> {

    private static final long serialVersionUID = -2081307724;

    /**
     * The reference instance of <code>ndt.t_risks_share_trace</code>
     */
    public static final TRisksShareTrace T_RISKS_SHARE_TRACE = new TRisksShareTrace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TRisksShareTraceRecord> getRecordType() {
        return TRisksShareTraceRecord.class;
    }

    /**
     * The column <code>ndt.t_risks_share_trace.id</code>. 自增id
     */
    public final TableField<TRisksShareTraceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('ndt.t_risks_share_trace_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "自增id");

    /**
     * The column <code>ndt.t_risks_share_trace.loan_id</code>. 对应t_loan_done放款id
     */
    public final TableField<TRisksShareTraceRecord, BigDecimal> LOAN_ID = createField("loan_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "对应t_loan_done放款id");

    /**
     * The column <code>ndt.t_risks_share_trace.user_id</code>. 用户操作者id
     */
    public final TableField<TRisksShareTraceRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "用户操作者id");

    /**
     * The column <code>ndt.t_risks_share_trace.create_time</code>. 创建时间
     */
    public final TableField<TRisksShareTraceRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ndt.t_risks_share_trace.state</code>. 所处的状态码,对应c_dict_type
     */
    public final TableField<TRisksShareTraceRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "所处的状态码,对应c_dict_type");

    /**
     * The column <code>ndt.t_risks_share_trace.valid</code>. 1有效,2无效
     */
    public final TableField<TRisksShareTraceRecord, Short> VALID = createField("valid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.SMALLINT)), this, "1有效,2无效");

    /**
     * The column <code>ndt.t_risks_share_trace.attach_data</code>. 每次提交的附加数据json存储
     */
    public final TableField<TRisksShareTraceRecord, String> ATTACH_DATA = createField("attach_data", org.jooq.impl.SQLDataType.CLOB, this, "每次提交的附加数据json存储");

    /**
     * Create a <code>ndt.t_risks_share_trace</code> table reference
     */
    public TRisksShareTrace() {
        this(DSL.name("t_risks_share_trace"), null);
    }

    /**
     * Create an aliased <code>ndt.t_risks_share_trace</code> table reference
     */
    public TRisksShareTrace(String alias) {
        this(DSL.name(alias), T_RISKS_SHARE_TRACE);
    }

    /**
     * Create an aliased <code>ndt.t_risks_share_trace</code> table reference
     */
    public TRisksShareTrace(Name alias) {
        this(alias, T_RISKS_SHARE_TRACE);
    }

    private TRisksShareTrace(Name alias, Table<TRisksShareTraceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TRisksShareTrace(Name alias, Table<TRisksShareTraceRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.T_RISKS_SHARE_TRACE_LOAN_ID_IDX, Indexes.T_RISKS_SHARE_TRACE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TRisksShareTraceRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_RISKS_SHARE_TRACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TRisksShareTraceRecord> getPrimaryKey() {
        return Keys.T_RISKS_SHARE_TRACE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TRisksShareTraceRecord>> getKeys() {
        return Arrays.<UniqueKey<TRisksShareTraceRecord>>asList(Keys.T_RISKS_SHARE_TRACE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRisksShareTrace as(String alias) {
        return new TRisksShareTrace(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRisksShareTrace as(Name alias) {
        return new TRisksShareTrace(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TRisksShareTrace rename(String name) {
        return new TRisksShareTrace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TRisksShareTrace rename(Name name) {
        return new TRisksShareTrace(name, null);
    }
}
