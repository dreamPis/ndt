/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TVillageCompanyInsuranceRecord;

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
 * 村站采集的公司参保信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyInsurance extends TableImpl<TVillageCompanyInsuranceRecord> {

    private static final long serialVersionUID = 268002553;

    /**
     * The reference instance of <code>ndt.t_village_company_insurance</code>
     */
    public static final TVillageCompanyInsurance T_VILLAGE_COMPANY_INSURANCE = new TVillageCompanyInsurance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillageCompanyInsuranceRecord> getRecordType() {
        return TVillageCompanyInsuranceRecord.class;
    }

    /**
     * The column <code>ndt.t_village_company_insurance.id</code>.
     */
    public final TableField<TVillageCompanyInsuranceRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_company_insurance.village_company_info_id</code>. 公司详情ID
     */
    public final TableField<TVillageCompanyInsuranceRecord, BigDecimal> VILLAGE_COMPANY_INFO_ID = createField("village_company_info_id", org.jooq.impl.SQLDataType.NUMERIC, this, "公司详情ID");

    /**
     * The column <code>ndt.t_village_company_insurance.insurance_name</code>. 保险名称
     */
    public final TableField<TVillageCompanyInsuranceRecord, String> INSURANCE_NAME = createField("insurance_name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "保险名称");

    /**
     * The column <code>ndt.t_village_company_insurance.insurance_type</code>. 保险类型
     */
    public final TableField<TVillageCompanyInsuranceRecord, String> INSURANCE_TYPE = createField("insurance_type", org.jooq.impl.SQLDataType.VARCHAR(50), this, "保险类型");

    /**
     * The column <code>ndt.t_village_company_insurance.beneficiary</code>. 第一受益人
     */
    public final TableField<TVillageCompanyInsuranceRecord, String> BENEFICIARY = createField("beneficiary", org.jooq.impl.SQLDataType.VARCHAR(60), this, "第一受益人");

    /**
     * The column <code>ndt.t_village_company_insurance.insurance_amt</code>. 保险金额
     */
    public final TableField<TVillageCompanyInsuranceRecord, BigDecimal> INSURANCE_AMT = createField("insurance_amt", org.jooq.impl.SQLDataType.NUMERIC, this, "保险金额");

    /**
     * The column <code>ndt.t_village_company_insurance.insurance_time</code>. 参保日期
     */
    public final TableField<TVillageCompanyInsuranceRecord, String> INSURANCE_TIME = createField("insurance_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "参保日期");

    /**
     * The column <code>ndt.t_village_company_insurance.insurance_duetime</code>. 保险到期日
     */
    public final TableField<TVillageCompanyInsuranceRecord, String> INSURANCE_DUETIME = createField("insurance_duetime", org.jooq.impl.SQLDataType.VARCHAR(50), this, "保险到期日");

    /**
     * The column <code>ndt.t_village_company_insurance.status</code>.
     */
    public final TableField<TVillageCompanyInsuranceRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_company_insurance.create_user</code>.
     */
    public final TableField<TVillageCompanyInsuranceRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_insurance.create_time</code>.
     */
    public final TableField<TVillageCompanyInsuranceRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_company_insurance.update_user</code>.
     */
    public final TableField<TVillageCompanyInsuranceRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_insurance.update_time</code>.
     */
    public final TableField<TVillageCompanyInsuranceRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_company_insurance</code> table reference
     */
    public TVillageCompanyInsurance() {
        this(DSL.name("t_village_company_insurance"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_insurance</code> table reference
     */
    public TVillageCompanyInsurance(String alias) {
        this(DSL.name(alias), T_VILLAGE_COMPANY_INSURANCE);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_insurance</code> table reference
     */
    public TVillageCompanyInsurance(Name alias) {
        this(alias, T_VILLAGE_COMPANY_INSURANCE);
    }

    private TVillageCompanyInsurance(Name alias, Table<TVillageCompanyInsuranceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillageCompanyInsurance(Name alias, Table<TVillageCompanyInsuranceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "村站采集的公司参保信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_COMPANY_INSURANCE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillageCompanyInsuranceRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_COMPANY_INSURANCE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillageCompanyInsuranceRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillageCompanyInsuranceRecord>>asList(Keys.T_VILLAGE_COMPANY_INSURANCE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsurance as(String alias) {
        return new TVillageCompanyInsurance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsurance as(Name alias) {
        return new TVillageCompanyInsurance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyInsurance rename(String name) {
        return new TVillageCompanyInsurance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyInsurance rename(Name name) {
        return new TVillageCompanyInsurance(name, null);
    }
}