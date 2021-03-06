/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TInsureProductRecord;

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
 * 保险产品
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInsureProduct extends TableImpl<TInsureProductRecord> {

    private static final long serialVersionUID = -2100076511;

    /**
     * The reference instance of <code>ndt.t_insure_product</code>
     */
    public static final TInsureProduct T_INSURE_PRODUCT = new TInsureProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TInsureProductRecord> getRecordType() {
        return TInsureProductRecord.class;
    }

    /**
     * The column <code>ndt.t_insure_product.id</code>.
     */
    public final TableField<TInsureProductRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_insure_product.code</code>. 保险产品code
     */
    public final TableField<TInsureProductRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "保险产品code");

    /**
     * The column <code>ndt.t_insure_product.org_id</code>. 产品所属机构id
     */
    public final TableField<TInsureProductRecord, BigDecimal> ORG_ID = createField("org_id", org.jooq.impl.SQLDataType.NUMERIC, this, "产品所属机构id");

    /**
     * The column <code>ndt.t_insure_product.name</code>. 产品名称
     */
    public final TableField<TInsureProductRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "产品名称");

    /**
     * The column <code>ndt.t_insure_product.insurance_costs</code>. 保费
     */
    public final TableField<TInsureProductRecord, String> INSURANCE_COSTS = createField("insurance_costs", org.jooq.impl.SQLDataType.VARCHAR(50), this, "保费");

    /**
     * The column <code>ndt.t_insure_product.insurance_limit</code>. 保额
     */
    public final TableField<TInsureProductRecord, String> INSURANCE_LIMIT = createField("insurance_limit", org.jooq.impl.SQLDataType.VARCHAR(50), this, "保额");

    /**
     * The column <code>ndt.t_insure_product.intended_for</code>. 适用人群
     */
    public final TableField<TInsureProductRecord, String[]> INTENDED_FOR = createField("intended_for", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "适用人群");

    /**
     * The column <code>ndt.t_insure_product.logo</code>. 产品logo
     */
    public final TableField<TInsureProductRecord, BigDecimal> LOGO = createField("logo", org.jooq.impl.SQLDataType.NUMERIC, this, "产品logo");

    /**
     * The column <code>ndt.t_insure_product.guarantee_period</code>. 保障期限
     */
    public final TableField<TInsureProductRecord, String> GUARANTEE_PERIOD = createField("guarantee_period", org.jooq.impl.SQLDataType.VARCHAR(50), this, "保障期限");

    /**
     * The column <code>ndt.t_insure_product.introduce</code>. 产品介绍
     */
    public final TableField<TInsureProductRecord, String> INTRODUCE = createField("introduce", org.jooq.impl.SQLDataType.CLOB, this, "产品介绍");

    /**
     * The column <code>ndt.t_insure_product.insurance_notice</code>. 投保须知
     */
    public final TableField<TInsureProductRecord, String> INSURANCE_NOTICE = createField("insurance_notice", org.jooq.impl.SQLDataType.CLOB, this, "投保须知");

    /**
     * The column <code>ndt.t_insure_product.claims_service</code>. 理赔服务
     */
    public final TableField<TInsureProductRecord, String> CLAIMS_SERVICE = createField("claims_service", org.jooq.impl.SQLDataType.CLOB, this, "理赔服务");

    /**
     * The column <code>ndt.t_insure_product.priority</code>. 优先级
     */
    public final TableField<TInsureProductRecord, Integer> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.INTEGER, this, "优先级");

    /**
     * The column <code>ndt.t_insure_product.status</code>.
     */
    public final TableField<TInsureProductRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_insure_product.create_user</code>.
     */
    public final TableField<TInsureProductRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_insure_product.create_time</code>.
     */
    public final TableField<TInsureProductRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_insure_product.update_user</code>.
     */
    public final TableField<TInsureProductRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_insure_product.update_time</code>.
     */
    public final TableField<TInsureProductRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_insure_product.qr_code</code>. 二维码
     */
    public final TableField<TInsureProductRecord, String> QR_CODE = createField("qr_code", org.jooq.impl.SQLDataType.VARCHAR(120), this, "二维码");

    /**
     * The column <code>ndt.t_insure_product.phone</code>. 联系电话
     */
    public final TableField<TInsureProductRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(20), this, "联系电话");

    /**
     * The column <code>ndt.t_insure_product.apply_way</code>. 申请方式:1微信,2线上
     */
    public final TableField<TInsureProductRecord, Integer[]> APPLY_WAY = createField("apply_way", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "申请方式:1微信,2线上");

    /**
     * Create a <code>ndt.t_insure_product</code> table reference
     */
    public TInsureProduct() {
        this(DSL.name("t_insure_product"), null);
    }

    /**
     * Create an aliased <code>ndt.t_insure_product</code> table reference
     */
    public TInsureProduct(String alias) {
        this(DSL.name(alias), T_INSURE_PRODUCT);
    }

    /**
     * Create an aliased <code>ndt.t_insure_product</code> table reference
     */
    public TInsureProduct(Name alias) {
        this(alias, T_INSURE_PRODUCT);
    }

    private TInsureProduct(Name alias, Table<TInsureProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private TInsureProduct(Name alias, Table<TInsureProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "保险产品");
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
        return Arrays.<Index>asList(Indexes.T_INSURE_PRODUCT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TInsureProductRecord> getPrimaryKey() {
        return Keys.T_INSURE_PRODUCT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TInsureProductRecord>> getKeys() {
        return Arrays.<UniqueKey<TInsureProductRecord>>asList(Keys.T_INSURE_PRODUCT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureProduct as(String alias) {
        return new TInsureProduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInsureProduct as(Name alias) {
        return new TInsureProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TInsureProduct rename(String name) {
        return new TInsureProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TInsureProduct rename(Name name) {
        return new TInsureProduct(name, null);
    }
}
