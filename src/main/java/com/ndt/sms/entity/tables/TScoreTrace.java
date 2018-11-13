/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TScoreTraceRecord;

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
public class TScoreTrace extends TableImpl<TScoreTraceRecord> {

    private static final long serialVersionUID = -941073865;

    /**
     * The reference instance of <code>ndt.t_score_trace</code>
     */
    public static final TScoreTrace T_SCORE_TRACE = new TScoreTrace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TScoreTraceRecord> getRecordType() {
        return TScoreTraceRecord.class;
    }

    /**
     * The column <code>ndt.t_score_trace.id</code>. 主键
     */
    public final TableField<TScoreTraceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('seq1'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "主键");

    /**
     * The column <code>ndt.t_score_trace.user_id</code>. 用户ID
     */
    public final TableField<TScoreTraceRecord, BigDecimal> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "用户ID");

    /**
     * The column <code>ndt.t_score_trace.change_before</code>. 积分变更前
     */
    public final TableField<TScoreTraceRecord, Integer> CHANGE_BEFORE = createField("change_before", org.jooq.impl.SQLDataType.INTEGER, this, "积分变更前");

    /**
     * The column <code>ndt.t_score_trace.change_after</code>. 积分变更后
     */
    public final TableField<TScoreTraceRecord, Integer> CHANGE_AFTER = createField("change_after", org.jooq.impl.SQLDataType.INTEGER, this, "积分变更后");

    /**
     * The column <code>ndt.t_score_trace.change_amount</code>. 变更量
     */
    public final TableField<TScoreTraceRecord, Integer> CHANGE_AMOUNT = createField("change_amount", org.jooq.impl.SQLDataType.INTEGER, this, "变更量");

    /**
     * The column <code>ndt.t_score_trace.oper_remark</code>. 操作说明
     */
    public final TableField<TScoreTraceRecord, String> OPER_REMARK = createField("oper_remark", org.jooq.impl.SQLDataType.VARCHAR(20), this, "操作说明");

    /**
     * The column <code>ndt.t_score_trace.create_at</code>. 创建时间
     */
    public final TableField<TScoreTraceRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * Create a <code>ndt.t_score_trace</code> table reference
     */
    public TScoreTrace() {
        this(DSL.name("t_score_trace"), null);
    }

    /**
     * Create an aliased <code>ndt.t_score_trace</code> table reference
     */
    public TScoreTrace(String alias) {
        this(DSL.name(alias), T_SCORE_TRACE);
    }

    /**
     * Create an aliased <code>ndt.t_score_trace</code> table reference
     */
    public TScoreTrace(Name alias) {
        this(alias, T_SCORE_TRACE);
    }

    private TScoreTrace(Name alias, Table<TScoreTraceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TScoreTrace(Name alias, Table<TScoreTraceRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.T_SCORE_TRACE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TScoreTraceRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_SCORE_TRACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TScoreTraceRecord> getPrimaryKey() {
        return Keys.T_SCORE_TRACE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TScoreTraceRecord>> getKeys() {
        return Arrays.<UniqueKey<TScoreTraceRecord>>asList(Keys.T_SCORE_TRACE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TScoreTrace as(String alias) {
        return new TScoreTrace(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TScoreTrace as(Name alias) {
        return new TScoreTrace(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TScoreTrace rename(String name) {
        return new TScoreTrace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TScoreTrace rename(Name name) {
        return new TScoreTrace(name, null);
    }
}
