/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TInsureLoanTraceRecord;

import java.math.BigDecimal;
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
 * 保险信贷轨迹表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInsureLoanTrace extends TableImpl<TInsureLoanTraceRecord> {

    private static final long serialVersionUID = 1411353722;

    /**
     * The reference instance of <code>ndt.t_insure_loan_trace</code>
     */
    public static final TInsureLoanTrace T_INSURE_LOAN_TRACE = new TInsureLoanTrace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TInsureLoanTraceRecord> getRecordType() {
        return TInsureLoanTraceRecord.class;
    }

    /**
     * The column <code>ndt.t_insure_loan_trace.id</code>. 轨迹id
     */
    public final TableField<TInsureLoanTraceRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "轨迹id");

    /**
     * The column <code>ndt.t_insure_loan_trace.order_id</code>. 订单id
     */
    public final TableField<TInsureLoanTraceRecord, BigDecimal> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "订单id");

    /**
     * The column <code>ndt.t_insure_loan_trace.oper_user_id</code>. 操作用户id
     */
    public final TableField<TInsureLoanTraceRecord, BigDecimal> OPER_USER_ID = createField("oper_user_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "操作用户id");

    /**
     * The column <code>ndt.t_insure_loan_trace.note</code>. 提示信息
     */
    public final TableField<TInsureLoanTraceRecord, String> NOTE = createField("note", org.jooq.impl.SQLDataType.VARCHAR(150), this, "提示信息");

    /**
     * The column <code>ndt.t_insure_loan_trace.create_at</code>. 创建时间
     */
    public final TableField<TInsureLoanTraceRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ndt.t_insure_loan_trace.status</code>. 贷款状态
     */
    public final TableField<TInsureLoanTraceRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "贷款状态");

    /**
     * The column <code>ndt.t_insure_loan_trace.money</code>. 记录金额
     */
    public final TableField<TInsureLoanTraceRecord, BigDecimal> MONEY = createField("money", org.jooq.impl.SQLDataType.NUMERIC, this, "记录金额");

    /**
     * Create a <code>ndt.t_insure_loan_trace</code> table reference
     */
    public TInsureLoanTrace() {
        this(DSL.name("t_insure_loan_trace"), null);
    }

    /**
     * Create an aliased <code>ndt.t_insure_loan_trace</code> table reference
     */
    public TInsureLoanTrace(String alias) {
        this(DSL.name(alias), T_INSURE_LOAN_TRACE);
    }

    /**
     * Create an aliased <code>ndt.t_insure_loan_trace</code> table reference
     */
    public TInsureLoanTrace(Name alias) {
        this(alias, T_INSURE_LOAN_TRACE);
    }

    private TInsureLoanTrace(Name alias, Table<TInsureLoanTraceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TInsureLoanTrace(Name alias, Table<TInsureLoanTraceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "保险信贷轨迹表");
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
        return Arrays.<Index>asList(Indexes.T_INSURE_LOAN_TRACE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TInsureLoanTraceRecord> getPrimaryKey() {
        return Keys.T_INSURE_LOAN_TRACE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TInsureLoanTraceRecord>> getKeys() {
        return Arrays.<UniqueKey<TInsureLoanTraceRecord>>asList(Keys.T_INSURE_LOAN_TRACE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanTrace as(String alias) {
        return new TInsureLoanTrace(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureLoanTrace as(Name alias) {
        return new TInsureLoanTrace(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TInsureLoanTrace rename(String name) {
        return new TInsureLoanTrace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TInsureLoanTrace rename(Name name) {
        return new TInsureLoanTrace(name, null);
    }
}
