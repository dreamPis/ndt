/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TVillagePersonalOtherinfoRecord;

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
 * 个人其他信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalOtherinfo extends TableImpl<TVillagePersonalOtherinfoRecord> {

    private static final long serialVersionUID = -525170122;

    /**
     * The reference instance of <code>ndt.t_village_personal_otherinfo</code>
     */
    public static final TVillagePersonalOtherinfo T_VILLAGE_PERSONAL_OTHERINFO = new TVillagePersonalOtherinfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillagePersonalOtherinfoRecord> getRecordType() {
        return TVillagePersonalOtherinfoRecord.class;
    }

    /**
     * The column <code>ndt.t_village_personal_otherinfo.id</code>.
     */
    public final TableField<TVillagePersonalOtherinfoRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.baseinfo_id</code>. 对应用户基本信息id
     */
    public final TableField<TVillagePersonalOtherinfoRecord, BigDecimal> BASEINFO_ID = createField("baseinfo_id", org.jooq.impl.SQLDataType.NUMERIC, this, "对应用户基本信息id");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.social_moral</code>. 社会公德，参考码表50
     */
    public final TableField<TVillagePersonalOtherinfoRecord, Integer> SOCIAL_MORAL = createField("social_moral", org.jooq.impl.SQLDataType.INTEGER, this, "社会公德，参考码表50");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.business_history</code>. 经营历史
     */
    public final TableField<TVillagePersonalOtherinfoRecord, String> BUSINESS_HISTORY = createField("business_history", org.jooq.impl.SQLDataType.VARCHAR(500), this, "经营历史");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.business_case</code>. 经营情况，参考码表51
     */
    public final TableField<TVillagePersonalOtherinfoRecord, Integer> BUSINESS_CASE = createField("business_case", org.jooq.impl.SQLDataType.INTEGER, this, "经营情况，参考码表51");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.is_court_black_list</code>. 是否在法院黑名单
     */
    public final TableField<TVillagePersonalOtherinfoRecord, Boolean> IS_COURT_BLACK_LIST = createField("is_court_black_list", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否在法院黑名单");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.is_business_black_list</code>. 是否在工商黑名单
     */
    public final TableField<TVillagePersonalOtherinfoRecord, Boolean> IS_BUSINESS_BLACK_LIST = createField("is_business_black_list", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否在工商黑名单");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.is_court_execute</code>. 是否法院执行
     */
    public final TableField<TVillagePersonalOtherinfoRecord, Boolean> IS_COURT_EXECUTE = createField("is_court_execute", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否法院执行");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.status</code>.
     */
    public final TableField<TVillagePersonalOtherinfoRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.create_user</code>.
     */
    public final TableField<TVillagePersonalOtherinfoRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.create_time</code>.
     */
    public final TableField<TVillagePersonalOtherinfoRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.update_user</code>.
     */
    public final TableField<TVillagePersonalOtherinfoRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_otherinfo.update_time</code>.
     */
    public final TableField<TVillagePersonalOtherinfoRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_personal_otherinfo</code> table reference
     */
    public TVillagePersonalOtherinfo() {
        this(DSL.name("t_village_personal_otherinfo"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_otherinfo</code> table reference
     */
    public TVillagePersonalOtherinfo(String alias) {
        this(DSL.name(alias), T_VILLAGE_PERSONAL_OTHERINFO);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_otherinfo</code> table reference
     */
    public TVillagePersonalOtherinfo(Name alias) {
        this(alias, T_VILLAGE_PERSONAL_OTHERINFO);
    }

    private TVillagePersonalOtherinfo(Name alias, Table<TVillagePersonalOtherinfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillagePersonalOtherinfo(Name alias, Table<TVillagePersonalOtherinfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "个人其他信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_PERSONAL_OTHERINFO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillagePersonalOtherinfoRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_PERSONAL_OTHERINFO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillagePersonalOtherinfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillagePersonalOtherinfoRecord>>asList(Keys.T_VILLAGE_PERSONAL_OTHERINFO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalOtherinfo as(String alias) {
        return new TVillagePersonalOtherinfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalOtherinfo as(Name alias) {
        return new TVillagePersonalOtherinfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalOtherinfo rename(String name) {
        return new TVillagePersonalOtherinfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalOtherinfo rename(Name name) {
        return new TVillagePersonalOtherinfo(name, null);
    }
}
