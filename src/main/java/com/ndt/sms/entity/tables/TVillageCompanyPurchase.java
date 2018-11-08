/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TVillageCompanyPurchaseRecord;

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
 * 村站采集的公司采购信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyPurchase extends TableImpl<TVillageCompanyPurchaseRecord> {

    private static final long serialVersionUID = -1286622539;

    /**
     * The reference instance of <code>ndt.t_village_company_purchase</code>
     */
    public static final TVillageCompanyPurchase T_VILLAGE_COMPANY_PURCHASE = new TVillageCompanyPurchase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillageCompanyPurchaseRecord> getRecordType() {
        return TVillageCompanyPurchaseRecord.class;
    }

    /**
     * The column <code>ndt.t_village_company_purchase.id</code>.
     */
    public final TableField<TVillageCompanyPurchaseRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_company_purchase.village_company_info_id</code>. 村站采集的公司详情ID
     */
    public final TableField<TVillageCompanyPurchaseRecord, BigDecimal> VILLAGE_COMPANY_INFO_ID = createField("village_company_info_id", org.jooq.impl.SQLDataType.NUMERIC, this, "村站采集的公司详情ID");

    /**
     * The column <code>ndt.t_village_company_purchase.purchase_material</code>. 采购物资
     */
    public final TableField<TVillageCompanyPurchaseRecord, String> PURCHASE_MATERIAL = createField("purchase_material", org.jooq.impl.SQLDataType.VARCHAR(200), this, "采购物资");

    /**
     * The column <code>ndt.t_village_company_purchase.purchase_amt</code>. 采购金额
     */
    public final TableField<TVillageCompanyPurchaseRecord, BigDecimal> PURCHASE_AMT = createField("purchase_amt", org.jooq.impl.SQLDataType.NUMERIC, this, "采购金额");

    /**
     * The column <code>ndt.t_village_company_purchase.purchase_date</code>. 采购日期
     */
    public final TableField<TVillageCompanyPurchaseRecord, String> PURCHASE_DATE = createField("purchase_date", org.jooq.impl.SQLDataType.VARCHAR(50), this, "采购日期");

    /**
     * The column <code>ndt.t_village_company_purchase.img_url</code>. 采购图片地址
     */
    public final TableField<TVillageCompanyPurchaseRecord, String> IMG_URL = createField("img_url", org.jooq.impl.SQLDataType.VARCHAR(300), this, "采购图片地址");

    /**
     * The column <code>ndt.t_village_company_purchase.status</code>.
     */
    public final TableField<TVillageCompanyPurchaseRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_company_purchase.create_user</code>.
     */
    public final TableField<TVillageCompanyPurchaseRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_purchase.create_time</code>.
     */
    public final TableField<TVillageCompanyPurchaseRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_company_purchase.update_user</code>.
     */
    public final TableField<TVillageCompanyPurchaseRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_purchase.update_time</code>.
     */
    public final TableField<TVillageCompanyPurchaseRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_company_purchase</code> table reference
     */
    public TVillageCompanyPurchase() {
        this(DSL.name("t_village_company_purchase"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_purchase</code> table reference
     */
    public TVillageCompanyPurchase(String alias) {
        this(DSL.name(alias), T_VILLAGE_COMPANY_PURCHASE);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_purchase</code> table reference
     */
    public TVillageCompanyPurchase(Name alias) {
        this(alias, T_VILLAGE_COMPANY_PURCHASE);
    }

    private TVillageCompanyPurchase(Name alias, Table<TVillageCompanyPurchaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillageCompanyPurchase(Name alias, Table<TVillageCompanyPurchaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "村站采集的公司采购信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_COMPANY_PURCHASE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillageCompanyPurchaseRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_COMPANY_PURCHASE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillageCompanyPurchaseRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillageCompanyPurchaseRecord>>asList(Keys.T_VILLAGE_COMPANY_PURCHASE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchase as(String alias) {
        return new TVillageCompanyPurchase(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchase as(Name alias) {
        return new TVillageCompanyPurchase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyPurchase rename(String name) {
        return new TVillageCompanyPurchase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyPurchase rename(Name name) {
        return new TVillageCompanyPurchase(name, null);
    }
}
