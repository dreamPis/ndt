/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TThirdUserRecord;

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
 * 第三方用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TThirdUser extends TableImpl<TThirdUserRecord> {

    private static final long serialVersionUID = 1561224687;

    /**
     * The reference instance of <code>ndt.t_third_user</code>
     */
    public static final TThirdUser T_THIRD_USER = new TThirdUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TThirdUserRecord> getRecordType() {
        return TThirdUserRecord.class;
    }

    /**
     * The column <code>ndt.t_third_user.id</code>.
     */
    public final TableField<TThirdUserRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_third_user.third_type</code>. 第三方类型
     */
    public final TableField<TThirdUserRecord, Integer> THIRD_TYPE = createField("third_type", org.jooq.impl.SQLDataType.INTEGER, this, "第三方类型");

    /**
     * The column <code>ndt.t_third_user.third_id</code>. 第三方唯一标识
     */
    public final TableField<TThirdUserRecord, String> THIRD_ID = createField("third_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "第三方唯一标识");

    /**
     * The column <code>ndt.t_third_user.user_id</code>. 绑定用户ID
     */
    public final TableField<TThirdUserRecord, BigDecimal> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.NUMERIC, this, "绑定用户ID");

    /**
     * The column <code>ndt.t_third_user.create_at</code>. 创建时间
     */
    public final TableField<TThirdUserRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * Create a <code>ndt.t_third_user</code> table reference
     */
    public TThirdUser() {
        this(DSL.name("t_third_user"), null);
    }

    /**
     * Create an aliased <code>ndt.t_third_user</code> table reference
     */
    public TThirdUser(String alias) {
        this(DSL.name(alias), T_THIRD_USER);
    }

    /**
     * Create an aliased <code>ndt.t_third_user</code> table reference
     */
    public TThirdUser(Name alias) {
        this(alias, T_THIRD_USER);
    }

    private TThirdUser(Name alias, Table<TThirdUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private TThirdUser(Name alias, Table<TThirdUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "第三方用户表");
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
        return Arrays.<Index>asList(Indexes.T_THIRD_USER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TThirdUserRecord> getPrimaryKey() {
        return Keys.T_THIRD_USER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TThirdUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TThirdUserRecord>>asList(Keys.T_THIRD_USER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TThirdUser as(String alias) {
        return new TThirdUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TThirdUser as(Name alias) {
        return new TThirdUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TThirdUser rename(String name) {
        return new TThirdUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TThirdUser rename(Name name) {
        return new TThirdUser(name, null);
    }
}
