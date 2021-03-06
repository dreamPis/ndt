/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TLoanflowSyncRecord;

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
 * 贷款流程同步表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLoanflowSync extends TableImpl<TLoanflowSyncRecord> {

    private static final long serialVersionUID = -646016565;

    /**
     * The reference instance of <code>ndt.t_loanflow_sync</code>
     */
    public static final TLoanflowSync T_LOANFLOW_SYNC = new TLoanflowSync();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TLoanflowSyncRecord> getRecordType() {
        return TLoanflowSyncRecord.class;
    }

    /**
     * The column <code>ndt.t_loanflow_sync.id</code>.
     */
    public final TableField<TLoanflowSyncRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_loanflow_sync.transcation_id</code>. 事务ID
     */
    public final TableField<TLoanflowSyncRecord, String> TRANSCATION_ID = createField("transcation_id", org.jooq.impl.SQLDataType.VARCHAR(30), this, "事务ID");

    /**
     * The column <code>ndt.t_loanflow_sync.syncconfig_id</code>. 配置记录ID
     */
    public final TableField<TLoanflowSyncRecord, BigDecimal> SYNCCONFIG_ID = createField("syncconfig_id", org.jooq.impl.SQLDataType.NUMERIC, this, "配置记录ID");

    /**
     * The column <code>ndt.t_loanflow_sync.invitation_id</code>. 邀约ID
     */
    public final TableField<TLoanflowSyncRecord, BigDecimal> INVITATION_ID = createField("invitation_id", org.jooq.impl.SQLDataType.NUMERIC, this, "邀约ID");

    /**
     * The column <code>ndt.t_loanflow_sync.node_code</code>. 阶段代码
     */
    public final TableField<TLoanflowSyncRecord, String> NODE_CODE = createField("node_code", org.jooq.impl.SQLDataType.VARCHAR(30), this, "阶段代码");

    /**
     * The column <code>ndt.t_loanflow_sync.node_name</code>. 阶段名称
     */
    public final TableField<TLoanflowSyncRecord, String> NODE_NAME = createField("node_name", org.jooq.impl.SQLDataType.VARCHAR(30), this, "阶段名称");

    /**
     * The column <code>ndt.t_loanflow_sync.req_type</code>. 申请类型
     */
    public final TableField<TLoanflowSyncRecord, Integer> REQ_TYPE = createField("req_type", org.jooq.impl.SQLDataType.INTEGER, this, "申请类型");

    /**
     * The column <code>ndt.t_loanflow_sync.doc_no</code>. 回执编号
     */
    public final TableField<TLoanflowSyncRecord, String> DOC_NO = createField("doc_no", org.jooq.impl.SQLDataType.VARCHAR(30), this, "回执编号");

    /**
     * The column <code>ndt.t_loanflow_sync.operator_code</code>. 银行操作员代码
     */
    public final TableField<TLoanflowSyncRecord, String> OPERATOR_CODE = createField("operator_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "银行操作员代码");

    /**
     * The column <code>ndt.t_loanflow_sync.operator_name</code>. 银行操作员姓名
     */
    public final TableField<TLoanflowSyncRecord, String> OPERATOR_NAME = createField("operator_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "银行操作员姓名");

    /**
     * The column <code>ndt.t_loanflow_sync.grant_amount</code>.
     */
    public final TableField<TLoanflowSyncRecord, BigDecimal> GRANT_AMOUNT = createField("grant_amount", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_loanflow_sync.doc_action</code>. 回执行为
     */
    public final TableField<TLoanflowSyncRecord, String> DOC_ACTION = createField("doc_action", org.jooq.impl.SQLDataType.VARCHAR(30), this, "回执行为");

    /**
     * The column <code>ndt.t_loanflow_sync.action_desc</code>. 行为描述
     */
    public final TableField<TLoanflowSyncRecord, String> ACTION_DESC = createField("action_desc", org.jooq.impl.SQLDataType.VARCHAR(30), this, "行为描述");

    /**
     * The column <code>ndt.t_loanflow_sync.is_sent</code>. 是否同步往前置机
     */
    public final TableField<TLoanflowSyncRecord, Boolean> IS_SENT = createField("is_sent", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否同步往前置机");

    /**
     * The column <code>ndt.t_loanflow_sync.state</code>. 流程状态,参考码表大类26
     */
    public final TableField<TLoanflowSyncRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER, this, "流程状态,参考码表大类26");

    /**
     * The column <code>ndt.t_loanflow_sync.msg</code>. 处理信息
     */
    public final TableField<TLoanflowSyncRecord, String> MSG = createField("msg", org.jooq.impl.SQLDataType.VARCHAR(500), this, "处理信息");

    /**
     * The column <code>ndt.t_loanflow_sync.handle_type</code>. 当前记录处理方式
     */
    public final TableField<TLoanflowSyncRecord, Integer> HANDLE_TYPE = createField("handle_type", org.jooq.impl.SQLDataType.INTEGER, this, "当前记录处理方式");

    /**
     * The column <code>ndt.t_loanflow_sync.in_flow</code>. 是否在流转
     */
    public final TableField<TLoanflowSyncRecord, Boolean> IN_FLOW = createField("in_flow", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否在流转");

    /**
     * The column <code>ndt.t_loanflow_sync.org_code</code>. 银行代码
     */
    public final TableField<TLoanflowSyncRecord, String> ORG_CODE = createField("org_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "银行代码");

    /**
     * The column <code>ndt.t_loanflow_sync.org_name</code>. 银行名
     */
    public final TableField<TLoanflowSyncRecord, String> ORG_NAME = createField("org_name", org.jooq.impl.SQLDataType.VARCHAR(30), this, "银行名");

    /**
     * The column <code>ndt.t_loanflow_sync.sync_time</code>. 同步时间
     */
    public final TableField<TLoanflowSyncRecord, Timestamp> SYNC_TIME = createField("sync_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "同步时间");

    /**
     * The column <code>ndt.t_loanflow_sync.req_body</code>. 完整的request
     */
    public final TableField<TLoanflowSyncRecord, String> REQ_BODY = createField("req_body", org.jooq.impl.SQLDataType.CLOB, this, "完整的request");

    /**
     * The column <code>ndt.t_loanflow_sync.res_body</code>. 完整的response
     */
    public final TableField<TLoanflowSyncRecord, String> RES_BODY = createField("res_body", org.jooq.impl.SQLDataType.CLOB, this, "完整的response");

    /**
     * The column <code>ndt.t_loanflow_sync.status</code>.
     */
    public final TableField<TLoanflowSyncRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_loanflow_sync.create_at</code>.
     */
    public final TableField<TLoanflowSyncRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_loanflow_sync.create_by</code>.
     */
    public final TableField<TLoanflowSyncRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_loanflow_sync.update_at</code>.
     */
    public final TableField<TLoanflowSyncRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_loanflow_sync</code> table reference
     */
    public TLoanflowSync() {
        this(DSL.name("t_loanflow_sync"), null);
    }

    /**
     * Create an aliased <code>ndt.t_loanflow_sync</code> table reference
     */
    public TLoanflowSync(String alias) {
        this(DSL.name(alias), T_LOANFLOW_SYNC);
    }

    /**
     * Create an aliased <code>ndt.t_loanflow_sync</code> table reference
     */
    public TLoanflowSync(Name alias) {
        this(alias, T_LOANFLOW_SYNC);
    }

    private TLoanflowSync(Name alias, Table<TLoanflowSyncRecord> aliased) {
        this(alias, aliased, null);
    }

    private TLoanflowSync(Name alias, Table<TLoanflowSyncRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "贷款流程同步表");
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
        return Arrays.<Index>asList(Indexes.T_LOANFLOW_SYNC_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TLoanflowSyncRecord> getPrimaryKey() {
        return Keys.T_LOANFLOW_SYNC_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TLoanflowSyncRecord>> getKeys() {
        return Arrays.<UniqueKey<TLoanflowSyncRecord>>asList(Keys.T_LOANFLOW_SYNC_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanflowSync as(String alias) {
        return new TLoanflowSync(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanflowSync as(Name alias) {
        return new TLoanflowSync(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TLoanflowSync rename(String name) {
        return new TLoanflowSync(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TLoanflowSync rename(Name name) {
        return new TLoanflowSync(name, null);
    }
}
