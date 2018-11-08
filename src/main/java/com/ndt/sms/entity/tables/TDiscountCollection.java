/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TDiscountCollectionRecord;

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
 * 村站采集信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDiscountCollection extends TableImpl<TDiscountCollectionRecord> {

    private static final long serialVersionUID = 1239461408;

    /**
     * The reference instance of <code>ndt.t_discount_collection</code>
     */
    public static final TDiscountCollection T_DISCOUNT_COLLECTION = new TDiscountCollection();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TDiscountCollectionRecord> getRecordType() {
        return TDiscountCollectionRecord.class;
    }

    /**
     * The column <code>ndt.t_discount_collection.id</code>. 主键
     */
    public final TableField<TDiscountCollectionRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "主键");

    /**
     * The column <code>ndt.t_discount_collection.term_name</code>. 项目名称
     */
    public final TableField<TDiscountCollectionRecord, String> TERM_NAME = createField("term_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "项目名称");

    /**
     * The column <code>ndt.t_discount_collection.term_user_id_card</code>. 采集主体身份证
     */
    public final TableField<TDiscountCollectionRecord, String> TERM_USER_ID_CARD = createField("term_user_id_card", org.jooq.impl.SQLDataType.VARCHAR(20), this, "采集主体身份证");

    /**
     * The column <code>ndt.t_discount_collection.term_user_company_code</code>. 采集主体公司社会信用代码或注册号
     */
    public final TableField<TDiscountCollectionRecord, String> TERM_USER_COMPANY_CODE = createField("term_user_company_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "采集主体公司社会信用代码或注册号");

    /**
     * The column <code>ndt.t_discount_collection.term_user_id</code>. 采集主体用户ID
     */
    public final TableField<TDiscountCollectionRecord, BigDecimal> TERM_USER_ID = createField("term_user_id", org.jooq.impl.SQLDataType.NUMERIC, this, "采集主体用户ID");

    /**
     * The column <code>ndt.t_discount_collection.term_division_id</code>. 采集主体区域ID
     */
    public final TableField<TDiscountCollectionRecord, BigDecimal> TERM_DIVISION_ID = createField("term_division_id", org.jooq.impl.SQLDataType.NUMERIC, this, "采集主体区域ID");

    /**
     * The column <code>ndt.t_discount_collection.term_remark</code>. 采集项目描述
     */
    public final TableField<TDiscountCollectionRecord, String> TERM_REMARK = createField("term_remark", org.jooq.impl.SQLDataType.VARCHAR(150), this, "采集项目描述");

    /**
     * The column <code>ndt.t_discount_collection.term_breed</code>. 项目品种
     */
    public final TableField<TDiscountCollectionRecord, String> TERM_BREED = createField("term_breed", org.jooq.impl.SQLDataType.VARCHAR(50), this, "项目品种");

    /**
     * The column <code>ndt.t_discount_collection.term_acreage</code>. 面积
     */
    public final TableField<TDiscountCollectionRecord, Integer> TERM_ACREAGE = createField("term_acreage", org.jooq.impl.SQLDataType.INTEGER, this, "面积");

    /**
     * The column <code>ndt.t_discount_collection.term_acreage_unit</code>. 面积单位
     */
    public final TableField<TDiscountCollectionRecord, String> TERM_ACREAGE_UNIT = createField("term_acreage_unit", org.jooq.impl.SQLDataType.VARCHAR(10), this, "面积单位");

    /**
     * The column <code>ndt.t_discount_collection.term_count</code>. 数量
     */
    public final TableField<TDiscountCollectionRecord, Integer> TERM_COUNT = createField("term_count", org.jooq.impl.SQLDataType.INTEGER, this, "数量");

    /**
     * The column <code>ndt.t_discount_collection.term_count_unit</code>.
     */
    public final TableField<TDiscountCollectionRecord, String> TERM_COUNT_UNIT = createField("term_count_unit", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>ndt.t_discount_collection.term_assets</code>. 资产
     */
    public final TableField<TDiscountCollectionRecord, BigDecimal> TERM_ASSETS = createField("term_assets", org.jooq.impl.SQLDataType.NUMERIC, this, "资产");

    /**
     * The column <code>ndt.t_discount_collection.term_assets_unit</code>. 资产单位
     */
    public final TableField<TDiscountCollectionRecord, String> TERM_ASSETS_UNIT = createField("term_assets_unit", org.jooq.impl.SQLDataType.VARCHAR(10), this, "资产单位");

    /**
     * The column <code>ndt.t_discount_collection.create_at</code>. 采集时间
     */
    public final TableField<TDiscountCollectionRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "采集时间");

    /**
     * The column <code>ndt.t_discount_collection.create_by</code>. 采集人
     */
    public final TableField<TDiscountCollectionRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "采集人");

    /**
     * The column <code>ndt.t_discount_collection.term_user_company_id</code>. 采集主体企业ID
     */
    public final TableField<TDiscountCollectionRecord, BigDecimal> TERM_USER_COMPANY_ID = createField("term_user_company_id", org.jooq.impl.SQLDataType.NUMERIC, this, "采集主体企业ID");

    /**
     * The column <code>ndt.t_discount_collection.update_at</code>. 修改时间
     */
    public final TableField<TDiscountCollectionRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "修改时间");

    /**
     * The column <code>ndt.t_discount_collection.update_by</code>. 修改人
     */
    public final TableField<TDiscountCollectionRecord, BigDecimal> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.NUMERIC, this, "修改人");

    /**
     * Create a <code>ndt.t_discount_collection</code> table reference
     */
    public TDiscountCollection() {
        this(DSL.name("t_discount_collection"), null);
    }

    /**
     * Create an aliased <code>ndt.t_discount_collection</code> table reference
     */
    public TDiscountCollection(String alias) {
        this(DSL.name(alias), T_DISCOUNT_COLLECTION);
    }

    /**
     * Create an aliased <code>ndt.t_discount_collection</code> table reference
     */
    public TDiscountCollection(Name alias) {
        this(alias, T_DISCOUNT_COLLECTION);
    }

    private TDiscountCollection(Name alias, Table<TDiscountCollectionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TDiscountCollection(Name alias, Table<TDiscountCollectionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "村站采集信息");
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
        return Arrays.<Index>asList(Indexes.T_DISCOUNT_COLLECTION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TDiscountCollectionRecord> getPrimaryKey() {
        return Keys.T_DISCOUNT_COLLECTION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TDiscountCollectionRecord>> getKeys() {
        return Arrays.<UniqueKey<TDiscountCollectionRecord>>asList(Keys.T_DISCOUNT_COLLECTION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDiscountCollection as(String alias) {
        return new TDiscountCollection(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDiscountCollection as(Name alias) {
        return new TDiscountCollection(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TDiscountCollection rename(String name) {
        return new TDiscountCollection(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TDiscountCollection rename(Name name) {
        return new TDiscountCollection(name, null);
    }
}
