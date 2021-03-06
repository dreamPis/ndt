/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TAdvertBakRecord;

import java.math.BigDecimal;
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
 * 散叶广告表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAdvertBak extends TableImpl<TAdvertBakRecord> {

    private static final long serialVersionUID = 1295193048;

    /**
     * The reference instance of <code>ndt.t_advert_bak</code>
     */
    public static final TAdvertBak T_ADVERT_BAK = new TAdvertBak();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TAdvertBakRecord> getRecordType() {
        return TAdvertBakRecord.class;
    }

    /**
     * The column <code>ndt.t_advert_bak.id</code>. 主键
     */
    public final TableField<TAdvertBakRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "主键");

    /**
     * The column <code>ndt.t_advert_bak.name</code>. 散页名称
     */
    public final TableField<TAdvertBakRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "散页名称");

    /**
     * The column <code>ndt.t_advert_bak.img_uri</code>. 图片路径
     */
    public final TableField<TAdvertBakRecord, String> IMG_URI = createField("img_uri", org.jooq.impl.SQLDataType.VARCHAR(80), this, "图片路径");

    /**
     * The column <code>ndt.t_advert_bak.show_sec</code>. 展示时间
     */
    public final TableField<TAdvertBakRecord, Integer> SHOW_SEC = createField("show_sec", org.jooq.impl.SQLDataType.INTEGER, this, "展示时间");

    /**
     * The column <code>ndt.t_advert_bak.status</code>. 展示状态
     */
    public final TableField<TAdvertBakRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.field("'2'::smallint", org.jooq.impl.SQLDataType.SMALLINT)), this, "展示状态");

    /**
     * The column <code>ndt.t_advert_bak.is_slide</code>. 是否滑动(1, 滑动, 2不滑动)
     */
    public final TableField<TAdvertBakRecord, Short> IS_SLIDE = createField("is_slide", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.field("2", org.jooq.impl.SQLDataType.SMALLINT)), this, "是否滑动(1, 滑动, 2不滑动)");

    /**
     * Create a <code>ndt.t_advert_bak</code> table reference
     */
    public TAdvertBak() {
        this(DSL.name("t_advert_bak"), null);
    }

    /**
     * Create an aliased <code>ndt.t_advert_bak</code> table reference
     */
    public TAdvertBak(String alias) {
        this(DSL.name(alias), T_ADVERT_BAK);
    }

    /**
     * Create an aliased <code>ndt.t_advert_bak</code> table reference
     */
    public TAdvertBak(Name alias) {
        this(alias, T_ADVERT_BAK);
    }

    private TAdvertBak(Name alias, Table<TAdvertBakRecord> aliased) {
        this(alias, aliased, null);
    }

    private TAdvertBak(Name alias, Table<TAdvertBakRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "散叶广告表");
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
        return Arrays.<Index>asList(Indexes.PK_T_ADVERT_BAK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TAdvertBakRecord> getPrimaryKey() {
        return Keys.PK_T_ADVERT_BAK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TAdvertBakRecord>> getKeys() {
        return Arrays.<UniqueKey<TAdvertBakRecord>>asList(Keys.PK_T_ADVERT_BAK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAdvertBak as(String alias) {
        return new TAdvertBak(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAdvertBak as(Name alias) {
        return new TAdvertBak(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TAdvertBak rename(String name) {
        return new TAdvertBak(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TAdvertBak rename(Name name) {
        return new TAdvertBak(name, null);
    }
}
