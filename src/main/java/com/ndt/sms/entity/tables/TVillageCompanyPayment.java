/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TVillageCompanyPaymentRecord;

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
 * 村站采集的公司缴费信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyPayment extends TableImpl<TVillageCompanyPaymentRecord> {

    private static final long serialVersionUID = 168529487;

    /**
     * The reference instance of <code>ndt.t_village_company_payment</code>
     */
    public static final TVillageCompanyPayment T_VILLAGE_COMPANY_PAYMENT = new TVillageCompanyPayment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillageCompanyPaymentRecord> getRecordType() {
        return TVillageCompanyPaymentRecord.class;
    }

    /**
     * The column <code>ndt.t_village_company_payment.id</code>.
     */
    public final TableField<TVillageCompanyPaymentRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_company_payment.village_company_info_id</code>. 村站采集的公司详情ID
     */
    public final TableField<TVillageCompanyPaymentRecord, BigDecimal> VILLAGE_COMPANY_INFO_ID = createField("village_company_info_id", org.jooq.impl.SQLDataType.NUMERIC, this, "村站采集的公司详情ID");

    /**
     * The column <code>ndt.t_village_company_payment.name</code>. 缴费名称
     */
    public final TableField<TVillageCompanyPaymentRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "缴费名称");

    /**
     * The column <code>ndt.t_village_company_payment.pay_amt</code>. 缴费金额
     */
    public final TableField<TVillageCompanyPaymentRecord, BigDecimal> PAY_AMT = createField("pay_amt", org.jooq.impl.SQLDataType.NUMERIC, this, "缴费金额");

    /**
     * The column <code>ndt.t_village_company_payment.pay_date</code>. 缴费日期
     */
    public final TableField<TVillageCompanyPaymentRecord, String> PAY_DATE = createField("pay_date", org.jooq.impl.SQLDataType.VARCHAR(50), this, "缴费日期");

    /**
     * The column <code>ndt.t_village_company_payment.pay_type</code>. 缴费类型
     */
    public final TableField<TVillageCompanyPaymentRecord, String> PAY_TYPE = createField("pay_type", org.jooq.impl.SQLDataType.VARCHAR(30), this, "缴费类型");

    /**
     * The column <code>ndt.t_village_company_payment.consumption</code>. 缴费用量
     */
    public final TableField<TVillageCompanyPaymentRecord, String> CONSUMPTION = createField("consumption", org.jooq.impl.SQLDataType.VARCHAR(30), this, "缴费用量");

    /**
     * The column <code>ndt.t_village_company_payment.goods_num</code>. 商品数量
     */
    public final TableField<TVillageCompanyPaymentRecord, String> GOODS_NUM = createField("goods_num", org.jooq.impl.SQLDataType.VARCHAR(30), this, "商品数量");

    /**
     * The column <code>ndt.t_village_company_payment.img_url</code>. 缴费图片地址
     */
    public final TableField<TVillageCompanyPaymentRecord, String> IMG_URL = createField("img_url", org.jooq.impl.SQLDataType.VARCHAR(300), this, "缴费图片地址");

    /**
     * The column <code>ndt.t_village_company_payment.status</code>.
     */
    public final TableField<TVillageCompanyPaymentRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_company_payment.create_user</code>.
     */
    public final TableField<TVillageCompanyPaymentRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_payment.create_time</code>.
     */
    public final TableField<TVillageCompanyPaymentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_company_payment.update_user</code>.
     */
    public final TableField<TVillageCompanyPaymentRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_payment.update_time</code>.
     */
    public final TableField<TVillageCompanyPaymentRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_company_payment</code> table reference
     */
    public TVillageCompanyPayment() {
        this(DSL.name("t_village_company_payment"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_payment</code> table reference
     */
    public TVillageCompanyPayment(String alias) {
        this(DSL.name(alias), T_VILLAGE_COMPANY_PAYMENT);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_payment</code> table reference
     */
    public TVillageCompanyPayment(Name alias) {
        this(alias, T_VILLAGE_COMPANY_PAYMENT);
    }

    private TVillageCompanyPayment(Name alias, Table<TVillageCompanyPaymentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillageCompanyPayment(Name alias, Table<TVillageCompanyPaymentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "村站采集的公司缴费信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_COMPANY_PAYMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillageCompanyPaymentRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_COMPANY_PAYMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillageCompanyPaymentRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillageCompanyPaymentRecord>>asList(Keys.T_VILLAGE_COMPANY_PAYMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPayment as(String alias) {
        return new TVillageCompanyPayment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPayment as(Name alias) {
        return new TVillageCompanyPayment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyPayment rename(String name) {
        return new TVillageCompanyPayment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyPayment rename(Name name) {
        return new TVillageCompanyPayment(name, null);
    }
}
