/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TCompanyInvestmentRecord;

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
 * 公司投资信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCompanyInvestment extends TableImpl<TCompanyInvestmentRecord> {

    private static final long serialVersionUID = -798290098;

    /**
     * The reference instance of <code>ndt.t_company_investment</code>
     */
    public static final TCompanyInvestment T_COMPANY_INVESTMENT = new TCompanyInvestment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCompanyInvestmentRecord> getRecordType() {
        return TCompanyInvestmentRecord.class;
    }

    /**
     * The column <code>ndt.t_company_investment.id</code>.
     */
    public final TableField<TCompanyInvestmentRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_company_investment.company_detail_id</code>. 村站采集的公司详情ID
     */
    public final TableField<TCompanyInvestmentRecord, BigDecimal> COMPANY_DETAIL_ID = createField("company_detail_id", org.jooq.impl.SQLDataType.NUMERIC, this, "村站采集的公司详情ID");

    /**
     * The column <code>ndt.t_company_investment.investment_unit</code>. 投资单位
     */
    public final TableField<TCompanyInvestmentRecord, String> INVESTMENT_UNIT = createField("investment_unit", org.jooq.impl.SQLDataType.VARCHAR(200), this, "投资单位");

    /**
     * The column <code>ndt.t_company_investment.investment_amt</code>. 投资金额
     */
    public final TableField<TCompanyInvestmentRecord, BigDecimal> INVESTMENT_AMT = createField("investment_amt", org.jooq.impl.SQLDataType.NUMERIC, this, "投资金额");

    /**
     * The column <code>ndt.t_company_investment.investment_date</code>. 投资日期
     */
    public final TableField<TCompanyInvestmentRecord, Timestamp> INVESTMENT_DATE = createField("investment_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "投资日期");

    /**
     * The column <code>ndt.t_company_investment.back_out_date</code>. 退出日期
     */
    public final TableField<TCompanyInvestmentRecord, Timestamp> BACK_OUT_DATE = createField("back_out_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "退出日期");

    /**
     * The column <code>ndt.t_company_investment.status</code>.
     */
    public final TableField<TCompanyInvestmentRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_company_investment.create_by</code>.
     */
    public final TableField<TCompanyInvestmentRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_company_investment.create_at</code>.
     */
    public final TableField<TCompanyInvestmentRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_company_investment.update_by</code>.
     */
    public final TableField<TCompanyInvestmentRecord, BigDecimal> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_company_investment.update_at</code>.
     */
    public final TableField<TCompanyInvestmentRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_company_investment</code> table reference
     */
    public TCompanyInvestment() {
        this(DSL.name("t_company_investment"), null);
    }

    /**
     * Create an aliased <code>ndt.t_company_investment</code> table reference
     */
    public TCompanyInvestment(String alias) {
        this(DSL.name(alias), T_COMPANY_INVESTMENT);
    }

    /**
     * Create an aliased <code>ndt.t_company_investment</code> table reference
     */
    public TCompanyInvestment(Name alias) {
        this(alias, T_COMPANY_INVESTMENT);
    }

    private TCompanyInvestment(Name alias, Table<TCompanyInvestmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCompanyInvestment(Name alias, Table<TCompanyInvestmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "公司投资信息");
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
        return Arrays.<Index>asList(Indexes.T_COMPANY_INVESTMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCompanyInvestmentRecord> getPrimaryKey() {
        return Keys.T_COMPANY_INVESTMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCompanyInvestmentRecord>> getKeys() {
        return Arrays.<UniqueKey<TCompanyInvestmentRecord>>asList(Keys.T_COMPANY_INVESTMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCompanyInvestment as(String alias) {
        return new TCompanyInvestment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCompanyInvestment as(Name alias) {
        return new TCompanyInvestment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCompanyInvestment rename(String name) {
        return new TCompanyInvestment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCompanyInvestment rename(Name name) {
        return new TCompanyInvestment(name, null);
    }
}
