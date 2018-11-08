/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TPersonCompanyUnbindRelRecord;

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
 * 个人公司账号绑定表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPersonCompanyUnbindRel extends TableImpl<TPersonCompanyUnbindRelRecord> {

    private static final long serialVersionUID = 661037660;

    /**
     * The reference instance of <code>ndt.t_person_company_unbind_rel</code>
     */
    public static final TPersonCompanyUnbindRel T_PERSON_COMPANY_UNBIND_REL = new TPersonCompanyUnbindRel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPersonCompanyUnbindRelRecord> getRecordType() {
        return TPersonCompanyUnbindRelRecord.class;
    }

    /**
     * The column <code>ndt.t_person_company_unbind_rel.user_id</code>. 用户ID
     */
    public final TableField<TPersonCompanyUnbindRelRecord, BigDecimal> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "用户ID");

    /**
     * The column <code>ndt.t_person_company_unbind_rel.company_id</code>. 公司ID
     */
    public final TableField<TPersonCompanyUnbindRelRecord, BigDecimal> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "公司ID");

    /**
     * The column <code>ndt.t_person_company_unbind_rel.id</code>. 主键
     */
    public final TableField<TPersonCompanyUnbindRelRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "主键");

    /**
     * The column <code>ndt.t_person_company_unbind_rel.is_legal_person</code>. 是否法人(1、是，2、否)
     */
    public final TableField<TPersonCompanyUnbindRelRecord, Short> IS_LEGAL_PERSON = createField("is_legal_person", org.jooq.impl.SQLDataType.SMALLINT, this, "是否法人(1、是，2、否)");

    /**
     * The column <code>ndt.t_person_company_unbind_rel.unbind_date</code>. 绑定时间
     */
    public final TableField<TPersonCompanyUnbindRelRecord, Timestamp> UNBIND_DATE = createField("unbind_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "绑定时间");

    /**
     * Create a <code>ndt.t_person_company_unbind_rel</code> table reference
     */
    public TPersonCompanyUnbindRel() {
        this(DSL.name("t_person_company_unbind_rel"), null);
    }

    /**
     * Create an aliased <code>ndt.t_person_company_unbind_rel</code> table reference
     */
    public TPersonCompanyUnbindRel(String alias) {
        this(DSL.name(alias), T_PERSON_COMPANY_UNBIND_REL);
    }

    /**
     * Create an aliased <code>ndt.t_person_company_unbind_rel</code> table reference
     */
    public TPersonCompanyUnbindRel(Name alias) {
        this(alias, T_PERSON_COMPANY_UNBIND_REL);
    }

    private TPersonCompanyUnbindRel(Name alias, Table<TPersonCompanyUnbindRelRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPersonCompanyUnbindRel(Name alias, Table<TPersonCompanyUnbindRelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "个人公司账号绑定表");
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
        return Arrays.<Index>asList(Indexes.T_PERSON_COMPANY_UNBIND_REL_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPersonCompanyUnbindRelRecord> getPrimaryKey() {
        return Keys.T_PERSON_COMPANY_UNBIND_REL_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPersonCompanyUnbindRelRecord>> getKeys() {
        return Arrays.<UniqueKey<TPersonCompanyUnbindRelRecord>>asList(Keys.T_PERSON_COMPANY_UNBIND_REL_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonCompanyUnbindRel as(String alias) {
        return new TPersonCompanyUnbindRel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonCompanyUnbindRel as(Name alias) {
        return new TPersonCompanyUnbindRel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPersonCompanyUnbindRel rename(String name) {
        return new TPersonCompanyUnbindRel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TPersonCompanyUnbindRel rename(Name name) {
        return new TPersonCompanyUnbindRel(name, null);
    }
}
