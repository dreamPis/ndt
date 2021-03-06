/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TPolicyServiceSyncRecord;

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
 * 政策服务流程处理
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPolicyServiceSync extends TableImpl<TPolicyServiceSyncRecord> {

    private static final long serialVersionUID = -2016844902;

    /**
     * The reference instance of <code>ndt.t_policy_service_sync</code>
     */
    public static final TPolicyServiceSync T_POLICY_SERVICE_SYNC = new TPolicyServiceSync();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPolicyServiceSyncRecord> getRecordType() {
        return TPolicyServiceSyncRecord.class;
    }

    /**
     * The column <code>ndt.t_policy_service_sync.id</code>. 自增id
     */
    public final TableField<TPolicyServiceSyncRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "自增id");

    /**
     * The column <code>ndt.t_policy_service_sync.apply_id</code>. 申请id
     */
    public final TableField<TPolicyServiceSyncRecord, BigDecimal> APPLY_ID = createField("apply_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "申请id");

    /**
     * The column <code>ndt.t_policy_service_sync.create_by</code>. 操作者
     */
    public final TableField<TPolicyServiceSyncRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "操作者");

    /**
     * The column <code>ndt.t_policy_service_sync.apply_state</code>. 申请状态
     */
    public final TableField<TPolicyServiceSyncRecord, Integer> APPLY_STATE = createField("apply_state", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "申请状态");

    /**
     * The column <code>ndt.t_policy_service_sync.apply_state_name</code>. 状态名称
     */
    public final TableField<TPolicyServiceSyncRecord, String> APPLY_STATE_NAME = createField("apply_state_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "状态名称");

    /**
     * The column <code>ndt.t_policy_service_sync.create_time</code>. 创建时间
     */
    public final TableField<TPolicyServiceSyncRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>ndt.t_policy_service_sync.update_time</code>. 更新时间
     */
    public final TableField<TPolicyServiceSyncRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "更新时间");

    /**
     * The column <code>ndt.t_policy_service_sync.note</code>. 备注
     */
    public final TableField<TPolicyServiceSyncRecord, String> NOTE = createField("note", org.jooq.impl.SQLDataType.VARCHAR(100), this, "备注");

    /**
     * The column <code>ndt.t_policy_service_sync.status</code>. 通过状态
     */
    public final TableField<TPolicyServiceSyncRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "通过状态");

    /**
     * Create a <code>ndt.t_policy_service_sync</code> table reference
     */
    public TPolicyServiceSync() {
        this(DSL.name("t_policy_service_sync"), null);
    }

    /**
     * Create an aliased <code>ndt.t_policy_service_sync</code> table reference
     */
    public TPolicyServiceSync(String alias) {
        this(DSL.name(alias), T_POLICY_SERVICE_SYNC);
    }

    /**
     * Create an aliased <code>ndt.t_policy_service_sync</code> table reference
     */
    public TPolicyServiceSync(Name alias) {
        this(alias, T_POLICY_SERVICE_SYNC);
    }

    private TPolicyServiceSync(Name alias, Table<TPolicyServiceSyncRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPolicyServiceSync(Name alias, Table<TPolicyServiceSyncRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "政策服务流程处理");
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
        return Arrays.<Index>asList(Indexes.T_POLICY_SERVICE_SYNC_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPolicyServiceSyncRecord> getPrimaryKey() {
        return Keys.T_POLICY_SERVICE_SYNC_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPolicyServiceSyncRecord>> getKeys() {
        return Arrays.<UniqueKey<TPolicyServiceSyncRecord>>asList(Keys.T_POLICY_SERVICE_SYNC_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSync as(String alias) {
        return new TPolicyServiceSync(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPolicyServiceSync as(Name alias) {
        return new TPolicyServiceSync(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPolicyServiceSync rename(String name) {
        return new TPolicyServiceSync(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TPolicyServiceSync rename(Name name) {
        return new TPolicyServiceSync(name, null);
    }
}
