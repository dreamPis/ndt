/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TVillagePersonalAwardsPunishmentsRecord;

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
 * 奖惩信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalAwardsPunishments extends TableImpl<TVillagePersonalAwardsPunishmentsRecord> {

    private static final long serialVersionUID = -928490484;

    /**
     * The reference instance of <code>ndt.t_village_personal_awards_punishments</code>
     */
    public static final TVillagePersonalAwardsPunishments T_VILLAGE_PERSONAL_AWARDS_PUNISHMENTS = new TVillagePersonalAwardsPunishments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillagePersonalAwardsPunishmentsRecord> getRecordType() {
        return TVillagePersonalAwardsPunishmentsRecord.class;
    }

    /**
     * The column <code>ndt.t_village_personal_awards_punishments.id</code>.
     */
    public final TableField<TVillagePersonalAwardsPunishmentsRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_personal_awards_punishments.baseinfo_id</code>. 对应用户基本信息id
     */
    public final TableField<TVillagePersonalAwardsPunishmentsRecord, BigDecimal> BASEINFO_ID = createField("baseinfo_id", org.jooq.impl.SQLDataType.NUMERIC, this, "对应用户基本信息id");

    /**
     * The column <code>ndt.t_village_personal_awards_punishments.awards_punishments_type</code>. 奖惩类型，参考码表52
     */
    public final TableField<TVillagePersonalAwardsPunishmentsRecord, Integer> AWARDS_PUNISHMENTS_TYPE = createField("awards_punishments_type", org.jooq.impl.SQLDataType.INTEGER, this, "奖惩类型，参考码表52");

    /**
     * The column <code>ndt.t_village_personal_awards_punishments.awards_punishments_name</code>. 奖惩名
     */
    public final TableField<TVillagePersonalAwardsPunishmentsRecord, String> AWARDS_PUNISHMENTS_NAME = createField("awards_punishments_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "奖惩名");

    /**
     * The column <code>ndt.t_village_personal_awards_punishments.awards_punishments_time</code>. 奖惩名时间
     */
    public final TableField<TVillagePersonalAwardsPunishmentsRecord, String> AWARDS_PUNISHMENTS_TIME = createField("awards_punishments_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "奖惩名时间");

    /**
     * The column <code>ndt.t_village_personal_awards_punishments.status</code>.
     */
    public final TableField<TVillagePersonalAwardsPunishmentsRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_personal_awards_punishments.create_user</code>.
     */
    public final TableField<TVillagePersonalAwardsPunishmentsRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_awards_punishments.create_time</code>.
     */
    public final TableField<TVillagePersonalAwardsPunishmentsRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_personal_awards_punishments.update_user</code>.
     */
    public final TableField<TVillagePersonalAwardsPunishmentsRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_awards_punishments.update_time</code>.
     */
    public final TableField<TVillagePersonalAwardsPunishmentsRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_personal_awards_punishments</code> table reference
     */
    public TVillagePersonalAwardsPunishments() {
        this(DSL.name("t_village_personal_awards_punishments"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_awards_punishments</code> table reference
     */
    public TVillagePersonalAwardsPunishments(String alias) {
        this(DSL.name(alias), T_VILLAGE_PERSONAL_AWARDS_PUNISHMENTS);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_awards_punishments</code> table reference
     */
    public TVillagePersonalAwardsPunishments(Name alias) {
        this(alias, T_VILLAGE_PERSONAL_AWARDS_PUNISHMENTS);
    }

    private TVillagePersonalAwardsPunishments(Name alias, Table<TVillagePersonalAwardsPunishmentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillagePersonalAwardsPunishments(Name alias, Table<TVillagePersonalAwardsPunishmentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "奖惩信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_PERSONAL_AWARDS_PUNISHMENTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillagePersonalAwardsPunishmentsRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_PERSONAL_AWARDS_PUNISHMENTS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillagePersonalAwardsPunishmentsRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillagePersonalAwardsPunishmentsRecord>>asList(Keys.T_VILLAGE_PERSONAL_AWARDS_PUNISHMENTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalAwardsPunishments as(String alias) {
        return new TVillagePersonalAwardsPunishments(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalAwardsPunishments as(Name alias) {
        return new TVillagePersonalAwardsPunishments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalAwardsPunishments rename(String name) {
        return new TVillagePersonalAwardsPunishments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalAwardsPunishments rename(Name name) {
        return new TVillagePersonalAwardsPunishments(name, null);
    }
}
