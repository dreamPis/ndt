/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TVillageCompanyBaseinfoRecord;

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
 * 村站采集的公司信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyBaseinfo extends TableImpl<TVillageCompanyBaseinfoRecord> {

    private static final long serialVersionUID = -1748126688;

    /**
     * The reference instance of <code>ndt.t_village_company_baseinfo</code>
     */
    public static final TVillageCompanyBaseinfo T_VILLAGE_COMPANY_BASEINFO = new TVillageCompanyBaseinfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillageCompanyBaseinfoRecord> getRecordType() {
        return TVillageCompanyBaseinfoRecord.class;
    }

    /**
     * The column <code>ndt.t_village_company_baseinfo.id</code>.
     */
    public final TableField<TVillageCompanyBaseinfoRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_company_baseinfo.certificate_type</code>. 证件类型
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Integer> CERTIFICATE_TYPE = createField("certificate_type", org.jooq.impl.SQLDataType.INTEGER, this, "证件类型");

    /**
     * The column <code>ndt.t_village_company_baseinfo.name</code>. 企业名称
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(60), this, "企业名称");

    /**
     * The column <code>ndt.t_village_company_baseinfo.code</code>. 统一社会信用代码或注册号
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(30), this, "统一社会信用代码或注册号");

    /**
     * The column <code>ndt.t_village_company_baseinfo.address</code>. 注册地址
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(100), this, "注册地址");

    /**
     * The column <code>ndt.t_village_company_baseinfo.company_type</code>. 企业类型
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Integer> COMPANY_TYPE = createField("company_type", org.jooq.impl.SQLDataType.INTEGER, this, "企业类型");

    /**
     * The column <code>ndt.t_village_company_baseinfo.production_type</code>. 生产经营类型
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Integer> PRODUCTION_TYPE = createField("production_type", org.jooq.impl.SQLDataType.INTEGER, this, "生产经营类型");

    /**
     * The column <code>ndt.t_village_company_baseinfo.member_total</code>. 成员人数
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Integer> MEMBER_TOTAL = createField("member_total", org.jooq.impl.SQLDataType.INTEGER, this, "成员人数");

    /**
     * The column <code>ndt.t_village_company_baseinfo.division_id</code>.
     */
    public final TableField<TVillageCompanyBaseinfoRecord, BigDecimal> DIVISION_ID = createField("division_id", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_baseinfo.industry_type</code>. 所属行业
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Integer> INDUSTRY_TYPE = createField("industry_type", org.jooq.impl.SQLDataType.INTEGER, this, "所属行业");

    /**
     * The column <code>ndt.t_village_company_baseinfo.setup_time</code>. 成立时间
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Timestamp> SETUP_TIME = createField("setup_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "成立时间");

    /**
     * The column <code>ndt.t_village_company_baseinfo.business_scope</code>. 经营范围
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> BUSINESS_SCOPE = createField("business_scope", org.jooq.impl.SQLDataType.VARCHAR(200), this, "经营范围");

    /**
     * The column <code>ndt.t_village_company_baseinfo.business_size</code>. 经营规模
     */
    public final TableField<TVillageCompanyBaseinfoRecord, BigDecimal> BUSINESS_SIZE = createField("business_size", org.jooq.impl.SQLDataType.NUMERIC, this, "经营规模");

    /**
     * The column <code>ndt.t_village_company_baseinfo.business_size_unit</code>. 经营规模单位
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Integer> BUSINESS_SIZE_UNIT = createField("business_size_unit", org.jooq.impl.SQLDataType.INTEGER, this, "经营规模单位");

    /**
     * The column <code>ndt.t_village_company_baseinfo.business_income</code>. 经营收入
     */
    public final TableField<TVillageCompanyBaseinfoRecord, BigDecimal> BUSINESS_INCOME = createField("business_income", org.jooq.impl.SQLDataType.NUMERIC, this, "经营收入");

    /**
     * The column <code>ndt.t_village_company_baseinfo.business_income_unit</code>. 经营收入单位
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> BUSINESS_INCOME_UNIT = createField("business_income_unit", org.jooq.impl.SQLDataType.VARCHAR(10), this, "经营收入单位");

    /**
     * The column <code>ndt.t_village_company_baseinfo.business_deadline</code>. 经营期限
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Timestamp> BUSINESS_DEADLINE = createField("business_deadline", org.jooq.impl.SQLDataType.TIMESTAMP, this, "经营期限");

    /**
     * The column <code>ndt.t_village_company_baseinfo.registered_capital</code>. 注册资本
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> REGISTERED_CAPITAL = createField("registered_capital", org.jooq.impl.SQLDataType.VARCHAR(20), this, "注册资本");

    /**
     * The column <code>ndt.t_village_company_baseinfo.is_emerging</code>. 是否为新兴经营主体
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Boolean> IS_EMERGING = createField("is_emerging", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否为新兴经营主体");

    /**
     * The column <code>ndt.t_village_company_baseinfo.legal_person</code>. 法人
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> LEGAL_PERSON = createField("legal_person", org.jooq.impl.SQLDataType.VARCHAR(40), this, "法人");

    /**
     * The column <code>ndt.t_village_company_baseinfo.legal_person_identity_id</code>. 法人身份证
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> LEGAL_PERSON_IDENTITY_ID = createField("legal_person_identity_id", org.jooq.impl.SQLDataType.VARCHAR(40), this, "法人身份证");

    /**
     * The column <code>ndt.t_village_company_baseinfo.legal_person_phone</code>. 法人联系方式
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> LEGAL_PERSON_PHONE = createField("legal_person_phone", org.jooq.impl.SQLDataType.VARCHAR(40), this, "法人联系方式");

    /**
     * The column <code>ndt.t_village_company_baseinfo.legal_person_id_deadline</code>. 法人身份证截止时间
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Timestamp> LEGAL_PERSON_ID_DEADLINE = createField("legal_person_id_deadline", org.jooq.impl.SQLDataType.TIMESTAMP, this, "法人身份证截止时间");

    /**
     * The column <code>ndt.t_village_company_baseinfo.related_img_urls</code>. 相关照片
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> RELATED_IMG_URLS = createField("related_img_urls", org.jooq.impl.SQLDataType.VARCHAR(300), this, "相关照片");

    /**
     * The column <code>ndt.t_village_company_baseinfo.worker_total</code>. 用工人数
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Integer> WORKER_TOTAL = createField("worker_total", org.jooq.impl.SQLDataType.INTEGER, this, "用工人数");

    /**
     * The column <code>ndt.t_village_company_baseinfo.worker_time</code>. 用工时间
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> WORKER_TIME = createField("worker_time", org.jooq.impl.SQLDataType.VARCHAR(40), this, "用工时间");

    /**
     * The column <code>ndt.t_village_company_baseinfo.worker_money</code>. 用工工资
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> WORKER_MONEY = createField("worker_money", org.jooq.impl.SQLDataType.VARCHAR(50), this, "用工工资");

    /**
     * The column <code>ndt.t_village_company_baseinfo.social_morality</code>. 社会公德
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Integer> SOCIAL_MORALITY = createField("social_morality", org.jooq.impl.SQLDataType.INTEGER, this, "社会公德");

    /**
     * The column <code>ndt.t_village_company_baseinfo.operating_history</code>. 经营历史
     */
    public final TableField<TVillageCompanyBaseinfoRecord, String> OPERATING_HISTORY = createField("operating_history", org.jooq.impl.SQLDataType.VARCHAR(40), this, "经营历史");

    /**
     * The column <code>ndt.t_village_company_baseinfo.operation_situation</code>. 经营情况
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Integer> OPERATION_SITUATION = createField("operation_situation", org.jooq.impl.SQLDataType.INTEGER, this, "经营情况");

    /**
     * The column <code>ndt.t_village_company_baseinfo.is_court_blacklist</code>. 法院黑名单
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Boolean> IS_COURT_BLACKLIST = createField("is_court_blacklist", org.jooq.impl.SQLDataType.BOOLEAN, this, "法院黑名单");

    /**
     * The column <code>ndt.t_village_company_baseinfo.is_business_blacklist</code>. 工商黑名单
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Boolean> IS_BUSINESS_BLACKLIST = createField("is_business_blacklist", org.jooq.impl.SQLDataType.BOOLEAN, this, "工商黑名单");

    /**
     * The column <code>ndt.t_village_company_baseinfo.is_court_enforcement</code>. 法院执行
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Boolean> IS_COURT_ENFORCEMENT = createField("is_court_enforcement", org.jooq.impl.SQLDataType.BOOLEAN, this, "法院执行");

    /**
     * The column <code>ndt.t_village_company_baseinfo.state</code>.
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.t_village_company_baseinfo.status</code>.
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_company_baseinfo.create_user</code>.
     */
    public final TableField<TVillageCompanyBaseinfoRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_baseinfo.create_time</code>.
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_company_baseinfo.update_user</code>.
     */
    public final TableField<TVillageCompanyBaseinfoRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_baseinfo.update_time</code>.
     */
    public final TableField<TVillageCompanyBaseinfoRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_company_baseinfo</code> table reference
     */
    public TVillageCompanyBaseinfo() {
        this(DSL.name("t_village_company_baseinfo"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_baseinfo</code> table reference
     */
    public TVillageCompanyBaseinfo(String alias) {
        this(DSL.name(alias), T_VILLAGE_COMPANY_BASEINFO);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_baseinfo</code> table reference
     */
    public TVillageCompanyBaseinfo(Name alias) {
        this(alias, T_VILLAGE_COMPANY_BASEINFO);
    }

    private TVillageCompanyBaseinfo(Name alias, Table<TVillageCompanyBaseinfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillageCompanyBaseinfo(Name alias, Table<TVillageCompanyBaseinfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "村站采集的公司信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_COMPANY_BASEINFO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillageCompanyBaseinfoRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_COMPANY_BASEINFO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillageCompanyBaseinfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillageCompanyBaseinfoRecord>>asList(Keys.T_VILLAGE_COMPANY_BASEINFO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyBaseinfo as(String alias) {
        return new TVillageCompanyBaseinfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyBaseinfo as(Name alias) {
        return new TVillageCompanyBaseinfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyBaseinfo rename(String name) {
        return new TVillageCompanyBaseinfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyBaseinfo rename(Name name) {
        return new TVillageCompanyBaseinfo(name, null);
    }
}
