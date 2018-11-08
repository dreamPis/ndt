/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TCompanyDetailPrecheckRecord;

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
 * 待审核企业信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCompanyDetailPrecheck extends TableImpl<TCompanyDetailPrecheckRecord> {

    private static final long serialVersionUID = -1989195072;

    /**
     * The reference instance of <code>ndt.t_company_detail_precheck</code>
     */
    public static final TCompanyDetailPrecheck T_COMPANY_DETAIL_PRECHECK = new TCompanyDetailPrecheck();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCompanyDetailPrecheckRecord> getRecordType() {
        return TCompanyDetailPrecheckRecord.class;
    }

    /**
     * The column <code>ndt.t_company_detail_precheck.id</code>.
     */
    public final TableField<TCompanyDetailPrecheckRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_company_detail_precheck.contact_name</code>. 联系人姓名
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> CONTACT_NAME = createField("contact_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "联系人姓名");

    /**
     * The column <code>ndt.t_company_detail_precheck.bind_telephone</code>. 绑定电话(联系人电话)
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> BIND_TELEPHONE = createField("bind_telephone", org.jooq.impl.SQLDataType.VARCHAR(20), this, "绑定电话(联系人电话)");

    /**
     * The column <code>ndt.t_company_detail_precheck.salt</code>. SALT
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> SALT = createField("salt", org.jooq.impl.SQLDataType.VARCHAR(40), this, "SALT");

    /**
     * The column <code>ndt.t_company_detail_precheck.password</code>. 密码
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(100), this, "密码");

    /**
     * The column <code>ndt.t_company_detail_precheck.certificate_type</code>. 证件类型
     */
    public final TableField<TCompanyDetailPrecheckRecord, Integer> CERTIFICATE_TYPE = createField("certificate_type", org.jooq.impl.SQLDataType.INTEGER, this, "证件类型");

    /**
     * The column <code>ndt.t_company_detail_precheck.name</code>. 企业名称
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(60), this, "企业名称");

    /**
     * The column <code>ndt.t_company_detail_precheck.code</code>. 统一社会信用代码或注册号
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(30), this, "统一社会信用代码或注册号");

    /**
     * The column <code>ndt.t_company_detail_precheck.address</code>. 注册地址
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(100), this, "注册地址");

    /**
     * The column <code>ndt.t_company_detail_precheck.company_type</code>. 企业类型
     */
    public final TableField<TCompanyDetailPrecheckRecord, Integer> COMPANY_TYPE = createField("company_type", org.jooq.impl.SQLDataType.INTEGER, this, "企业类型");

    /**
     * The column <code>ndt.t_company_detail_precheck.division_id</code>. 所属行政区域
     */
    public final TableField<TCompanyDetailPrecheckRecord, BigDecimal> DIVISION_ID = createField("division_id", org.jooq.impl.SQLDataType.NUMERIC, this, "所属行政区域");

    /**
     * The column <code>ndt.t_company_detail_precheck.industry_type</code>. 所属行业
     */
    public final TableField<TCompanyDetailPrecheckRecord, Integer> INDUSTRY_TYPE = createField("industry_type", org.jooq.impl.SQLDataType.INTEGER, this, "所属行业");

    /**
     * The column <code>ndt.t_company_detail_precheck.setup_time</code>. 成立时间
     */
    public final TableField<TCompanyDetailPrecheckRecord, Timestamp> SETUP_TIME = createField("setup_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "成立时间");

    /**
     * The column <code>ndt.t_company_detail_precheck.business_scope</code>. 经营范围
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> BUSINESS_SCOPE = createField("business_scope", org.jooq.impl.SQLDataType.VARCHAR(200), this, "经营范围");

    /**
     * The column <code>ndt.t_company_detail_precheck.business_deadline</code>. 经营期限
     */
    public final TableField<TCompanyDetailPrecheckRecord, Timestamp> BUSINESS_DEADLINE = createField("business_deadline", org.jooq.impl.SQLDataType.TIMESTAMP, this, "经营期限");

    /**
     * The column <code>ndt.t_company_detail_precheck.registered_capital</code>. 注册资本
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> REGISTERED_CAPITAL = createField("registered_capital", org.jooq.impl.SQLDataType.VARCHAR(20), this, "注册资本");

    /**
     * The column <code>ndt.t_company_detail_precheck.legal_person</code>. 法人
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> LEGAL_PERSON = createField("legal_person", org.jooq.impl.SQLDataType.VARCHAR(40), this, "法人");

    /**
     * The column <code>ndt.t_company_detail_precheck.legal_person_identity_id</code>. 法人身份证
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> LEGAL_PERSON_IDENTITY_ID = createField("legal_person_identity_id", org.jooq.impl.SQLDataType.VARCHAR(40), this, "法人身份证");

    /**
     * The column <code>ndt.t_company_detail_precheck.legal_person_id_deadline</code>. 法人身份证截止时间
     */
    public final TableField<TCompanyDetailPrecheckRecord, Timestamp> LEGAL_PERSON_ID_DEADLINE = createField("legal_person_id_deadline", org.jooq.impl.SQLDataType.TIMESTAMP, this, "法人身份证截止时间");

    /**
     * The column <code>ndt.t_company_detail_precheck.related_img_urls</code>. 相关照片
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> RELATED_IMG_URLS = createField("related_img_urls", org.jooq.impl.SQLDataType.VARCHAR(300), this, "相关照片");

    /**
     * The column <code>ndt.t_company_detail_precheck.state</code>. 审核状态
     */
    public final TableField<TCompanyDetailPrecheckRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER, this, "审核状态");

    /**
     * The column <code>ndt.t_company_detail_precheck.create_time</code>. 创建时间
     */
    public final TableField<TCompanyDetailPrecheckRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>ndt.t_company_detail_precheck.contact_identity_id</code>. 联系人身份证
     */
    public final TableField<TCompanyDetailPrecheckRecord, String> CONTACT_IDENTITY_ID = createField("contact_identity_id", org.jooq.impl.SQLDataType.VARCHAR(30), this, "联系人身份证");

    /**
     * The column <code>ndt.t_company_detail_precheck.check_name_id</code>. 审核人id
     */
    public final TableField<TCompanyDetailPrecheckRecord, BigDecimal> CHECK_NAME_ID = createField("check_name_id", org.jooq.impl.SQLDataType.NUMERIC, this, "审核人id");

    /**
     * The column <code>ndt.t_company_detail_precheck.check_time</code>. 审核时间
     */
    public final TableField<TCompanyDetailPrecheckRecord, Timestamp> CHECK_TIME = createField("check_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "审核时间");

    /**
     * The column <code>ndt.t_company_detail_precheck.source_id</code>. 来源Id 参考码表70
     */
    public final TableField<TCompanyDetailPrecheckRecord, Integer> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.INTEGER, this, "来源Id 参考码表70");

    /**
     * The column <code>ndt.t_company_detail_precheck.user_id</code>. 用户表ID
     */
    public final TableField<TCompanyDetailPrecheckRecord, BigDecimal> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.NUMERIC, this, "用户表ID");

    /**
     * The column <code>ndt.t_company_detail_precheck.is_legal_person</code>. 是否法人
     */
    public final TableField<TCompanyDetailPrecheckRecord, Short> IS_LEGAL_PERSON = createField("is_legal_person", org.jooq.impl.SQLDataType.SMALLINT, this, "是否法人");

    /**
     * Create a <code>ndt.t_company_detail_precheck</code> table reference
     */
    public TCompanyDetailPrecheck() {
        this(DSL.name("t_company_detail_precheck"), null);
    }

    /**
     * Create an aliased <code>ndt.t_company_detail_precheck</code> table reference
     */
    public TCompanyDetailPrecheck(String alias) {
        this(DSL.name(alias), T_COMPANY_DETAIL_PRECHECK);
    }

    /**
     * Create an aliased <code>ndt.t_company_detail_precheck</code> table reference
     */
    public TCompanyDetailPrecheck(Name alias) {
        this(alias, T_COMPANY_DETAIL_PRECHECK);
    }

    private TCompanyDetailPrecheck(Name alias, Table<TCompanyDetailPrecheckRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCompanyDetailPrecheck(Name alias, Table<TCompanyDetailPrecheckRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "待审核企业信息表");
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
        return Arrays.<Index>asList(Indexes.T_COMPANY_DETAIL_PRECHECK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCompanyDetailPrecheckRecord> getPrimaryKey() {
        return Keys.T_COMPANY_DETAIL_PRECHECK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCompanyDetailPrecheckRecord>> getKeys() {
        return Arrays.<UniqueKey<TCompanyDetailPrecheckRecord>>asList(Keys.T_COMPANY_DETAIL_PRECHECK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCompanyDetailPrecheck as(String alias) {
        return new TCompanyDetailPrecheck(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCompanyDetailPrecheck as(Name alias) {
        return new TCompanyDetailPrecheck(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCompanyDetailPrecheck rename(String name) {
        return new TCompanyDetailPrecheck(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCompanyDetailPrecheck rename(Name name) {
        return new TCompanyDetailPrecheck(name, null);
    }
}
