/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TCooperationRecord;

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
 * 合作社信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCooperation extends TableImpl<TCooperationRecord> {

    private static final long serialVersionUID = 922612713;

    /**
     * The reference instance of <code>ndt.t_cooperation</code>
     */
    public static final TCooperation T_COOPERATION = new TCooperation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCooperationRecord> getRecordType() {
        return TCooperationRecord.class;
    }

    /**
     * The column <code>ndt.t_cooperation.id</code>.
     */
    public final TableField<TCooperationRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_cooperation.area</code>. 区（市）县
     */
    public final TableField<TCooperationRecord, String> AREA = createField("area", org.jooq.impl.SQLDataType.VARCHAR(100), this, "区（市）县");

    /**
     * The column <code>ndt.t_cooperation.area_code</code>.
     */
    public final TableField<TCooperationRecord, BigDecimal> AREA_CODE = createField("area_code", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_cooperation.town</code>. 乡镇
     */
    public final TableField<TCooperationRecord, String> TOWN = createField("town", org.jooq.impl.SQLDataType.VARCHAR(100), this, "乡镇");

    /**
     * The column <code>ndt.t_cooperation.town_code</code>.
     */
    public final TableField<TCooperationRecord, BigDecimal> TOWN_CODE = createField("town_code", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_cooperation.work_unit</code>. 单位
     */
    public final TableField<TCooperationRecord, String> WORK_UNIT = createField("work_unit", org.jooq.impl.SQLDataType.VARCHAR(100), this, "单位");

    /**
     * The column <code>ndt.t_cooperation.name</code>. 合作社名称
     */
    public final TableField<TCooperationRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "合作社名称");

    /**
     * The column <code>ndt.t_cooperation.level</code>. 合作社等级
     */
    public final TableField<TCooperationRecord, String> LEVEL = createField("level", org.jooq.impl.SQLDataType.VARCHAR(35), this, "合作社等级");

    /**
     * The column <code>ndt.t_cooperation.addr</code>. 地址
     */
    public final TableField<TCooperationRecord, String> ADDR = createField("addr", org.jooq.impl.SQLDataType.VARCHAR(40), this, "地址");

    /**
     * The column <code>ndt.t_cooperation.phone</code>. 办公电话
     */
    public final TableField<TCooperationRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(100), this, "办公电话");

    /**
     * The column <code>ndt.t_cooperation.zipcode</code>. 邮编
     */
    public final TableField<TCooperationRecord, String> ZIPCODE = createField("zipcode", org.jooq.impl.SQLDataType.VARCHAR(35), this, "邮编");

    /**
     * The column <code>ndt.t_cooperation.legal_name</code>. 法定代表人姓名
     */
    public final TableField<TCooperationRecord, String> LEGAL_NAME = createField("legal_name", org.jooq.impl.SQLDataType.VARCHAR(15), this, "法定代表人姓名");

    /**
     * The column <code>ndt.t_cooperation.legal_id</code>. 身份证号
     */
    public final TableField<TCooperationRecord, String> LEGAL_ID = createField("legal_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "身份证号");

    /**
     * The column <code>ndt.t_cooperation.legalphone</code>. 联系电话
     */
    public final TableField<TCooperationRecord, String> LEGALPHONE = createField("legalphone", org.jooq.impl.SQLDataType.VARCHAR(15), this, "联系电话");

    /**
     * The column <code>ndt.t_cooperation.legal_email</code>. 邮箱
     */
    public final TableField<TCooperationRecord, String> LEGAL_EMAIL = createField("legal_email", org.jooq.impl.SQLDataType.VARCHAR(100), this, "邮箱");

    /**
     * The column <code>ndt.t_cooperation.register_department</code>. 注册登记部门
     */
    public final TableField<TCooperationRecord, String> REGISTER_DEPARTMENT = createField("register_department", org.jooq.impl.SQLDataType.VARCHAR(50), this, "注册登记部门");

    /**
     * The column <code>ndt.t_cooperation.register_capital</code>. 注册资本
     */
    public final TableField<TCooperationRecord, String> REGISTER_CAPITAL = createField("register_capital", org.jooq.impl.SQLDataType.VARCHAR(15), this, "注册资本");

    /**
     * The column <code>ndt.t_cooperation.register_date</code>. 注册登记日期
     */
    public final TableField<TCooperationRecord, String> REGISTER_DATE = createField("register_date", org.jooq.impl.SQLDataType.VARCHAR(15), this, "注册登记日期");

    /**
     * The column <code>ndt.t_cooperation.register_no</code>. 执照注册号码
     */
    public final TableField<TCooperationRecord, String> REGISTER_NO = createField("register_no", org.jooq.impl.SQLDataType.VARCHAR(100), this, "执照注册号码");

    /**
     * The column <code>ndt.t_cooperation.manage_desc</code>. 经营范围
     */
    public final TableField<TCooperationRecord, String> MANAGE_DESC = createField("manage_desc", org.jooq.impl.SQLDataType.VARCHAR(400), this, "经营范围");

    /**
     * The column <code>ndt.t_cooperation.main_pro</code>. 主导产业产品
     */
    public final TableField<TCooperationRecord, String> MAIN_PRO = createField("main_pro", org.jooq.impl.SQLDataType.VARCHAR(100), this, "主导产业产品");

    /**
     * The column <code>ndt.t_cooperation.register_name</code>. 注册商标名称
     */
    public final TableField<TCooperationRecord, String> REGISTER_NAME = createField("register_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "注册商标名称");

    /**
     * The column <code>ndt.t_cooperation.tax_no</code>. 税务登记证号码
     */
    public final TableField<TCooperationRecord, String> TAX_NO = createField("tax_no", org.jooq.impl.SQLDataType.VARCHAR(50), this, "税务登记证号码");

    /**
     * The column <code>ndt.t_cooperation.content</code>. 备注
     */
    public final TableField<TCooperationRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR(400), this, "备注");

    /**
     * The column <code>ndt.t_cooperation.web_url</code>. 网站网页
     */
    public final TableField<TCooperationRecord, String> WEB_URL = createField("web_url", org.jooq.impl.SQLDataType.VARCHAR(100), this, "网站网页");

    /**
     * The column <code>ndt.t_cooperation.person_count</code>. 成员数
     */
    public final TableField<TCooperationRecord, String> PERSON_COUNT = createField("person_count", org.jooq.impl.SQLDataType.VARCHAR(35), this, "成员数");

    /**
     * The column <code>ndt.t_cooperation.person_capital</code>. 成员出资
     */
    public final TableField<TCooperationRecord, String> PERSON_CAPITAL = createField("person_capital", org.jooq.impl.SQLDataType.VARCHAR(15), this, "成员出资");

    /**
     * The column <code>ndt.t_cooperation.manager_count</code>. 单位成员数
     */
    public final TableField<TCooperationRecord, String> MANAGER_COUNT = createField("manager_count", org.jooq.impl.SQLDataType.VARCHAR(35), this, "单位成员数");

    /**
     * The column <code>ndt.t_cooperation.farmer_count</code>. 农民成员数
     */
    public final TableField<TCooperationRecord, String> FARMER_COUNT = createField("farmer_count", org.jooq.impl.SQLDataType.VARCHAR(35), this, "农民成员数");

    /**
     * The column <code>ndt.t_cooperation.cash_capital</code>. 货币出资
     */
    public final TableField<TCooperationRecord, String> CASH_CAPITAL = createField("cash_capital", org.jooq.impl.SQLDataType.VARCHAR(35), this, "货币出资");

    /**
     * The column <code>ndt.t_cooperation.no_cash_capital</code>. 非货币出资
     */
    public final TableField<TCooperationRecord, String> NO_CASH_CAPITAL = createField("no_cash_capital", org.jooq.impl.SQLDataType.VARCHAR(35), this, "非货币出资");

    /**
     * The column <code>ndt.t_cooperation.farmer_capital_count</code>. 农民成员出资人数
     */
    public final TableField<TCooperationRecord, String> FARMER_CAPITAL_COUNT = createField("farmer_capital_count", org.jooq.impl.SQLDataType.VARCHAR(35), this, "农民成员出资人数");

    /**
     * The column <code>ndt.t_cooperation.manager_capital_count</code>. 单位成员出资人数
     */
    public final TableField<TCooperationRecord, String> MANAGER_CAPITAL_COUNT = createField("manager_capital_count", org.jooq.impl.SQLDataType.VARCHAR(35), this, "单位成员出资人数");

    /**
     * The column <code>ndt.t_cooperation.acreage</code>. 基地面积
     */
    public final TableField<TCooperationRecord, String> ACREAGE = createField("acreage", org.jooq.impl.SQLDataType.VARCHAR(15), this, "基地面积");

    /**
     * The column <code>ndt.t_cooperation.improved_farmer_count</code>. 带动农户数
     */
    public final TableField<TCooperationRecord, String> IMPROVED_FARMER_COUNT = createField("improved_farmer_count", org.jooq.impl.SQLDataType.VARCHAR(35), this, "带动农户数");

    /**
     * The column <code>ndt.t_cooperation.improved_acreage</code>. 带动基地面积
     */
    public final TableField<TCooperationRecord, String> IMPROVED_ACREAGE = createField("improved_acreage", org.jooq.impl.SQLDataType.VARCHAR(35), this, "带动基地面积");

    /**
     * The column <code>ndt.t_cooperation.condition</code>. 生产经营情况
     */
    public final TableField<TCooperationRecord, String> CONDITION = createField("condition", org.jooq.impl.SQLDataType.VARCHAR(3000), this, "生产经营情况");

    /**
     * The column <code>ndt.t_cooperation.attestations</code>. 何种认证
     */
    public final TableField<TCooperationRecord, String> ATTESTATIONS = createField("attestations", org.jooq.impl.SQLDataType.VARCHAR(350), this, "何种认证");

    /**
     * The column <code>ndt.t_cooperation.rewards</code>. 何种奖励
     */
    public final TableField<TCooperationRecord, String> REWARDS = createField("rewards", org.jooq.impl.SQLDataType.VARCHAR(3000), this, "何种奖励");

    /**
     * The column <code>ndt.t_cooperation.nature</code>. 合作社性质
     */
    public final TableField<TCooperationRecord, String> NATURE = createField("nature", org.jooq.impl.SQLDataType.VARCHAR(15), this, "合作社性质");

    /**
     * The column <code>ndt.t_cooperation.account_mode</code>. 做帐方式
     */
    public final TableField<TCooperationRecord, String> ACCOUNT_MODE = createField("account_mode", org.jooq.impl.SQLDataType.VARCHAR(30), this, "做帐方式");

    /**
     * The column <code>ndt.t_cooperation.credit_code</code>. 信用码
     */
    public final TableField<TCooperationRecord, String> CREDIT_CODE = createField("credit_code", org.jooq.impl.SQLDataType.VARCHAR(50), this, "信用码");

    /**
     * The column <code>ndt.t_cooperation.reg_no</code>. 许可证号
     */
    public final TableField<TCooperationRecord, String> REG_NO = createField("reg_no", org.jooq.impl.SQLDataType.VARCHAR(50), this, "许可证号");

    /**
     * The column <code>ndt.t_cooperation.remark</code>. 标记
     */
    public final TableField<TCooperationRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(50), this, "标记");

    /**
     * The column <code>ndt.t_cooperation.state</code>. 1、未审核，2、审核通过，3、审核不通过
     */
    public final TableField<TCooperationRecord, Short> STATE = createField("state", org.jooq.impl.SQLDataType.SMALLINT, this, "1、未审核，2、审核通过，3、审核不通过");

    /**
     * The column <code>ndt.t_cooperation.status</code>. 记录状态
     */
    public final TableField<TCooperationRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "记录状态");

    /**
     * The column <code>ndt.t_cooperation.create_user</code>.
     */
    public final TableField<TCooperationRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_cooperation.create_time</code>.
     */
    public final TableField<TCooperationRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_cooperation.update_user</code>.
     */
    public final TableField<TCooperationRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_cooperation.update_time</code>.
     */
    public final TableField<TCooperationRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_cooperation.community</code>. 社区或村
     */
    public final TableField<TCooperationRecord, String> COMMUNITY = createField("community", org.jooq.impl.SQLDataType.VARCHAR(50), this, "社区或村");

    /**
     * The column <code>ndt.t_cooperation.community_id</code>. 社区或村id
     */
    public final TableField<TCooperationRecord, BigDecimal> COMMUNITY_ID = createField("community_id", org.jooq.impl.SQLDataType.NUMERIC, this, "社区或村id");

    /**
     * The column <code>ndt.t_cooperation.is_major</code>. 是否新型经营主体
     */
    public final TableField<TCooperationRecord, Boolean> IS_MAJOR = createField("is_major", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否新型经营主体");

    /**
     * The column <code>ndt.t_cooperation.is_credit</code>. 是否信用主体
     */
    public final TableField<TCooperationRecord, Boolean> IS_CREDIT = createField("is_credit", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否信用主体");

    /**
     * Create a <code>ndt.t_cooperation</code> table reference
     */
    public TCooperation() {
        this(DSL.name("t_cooperation"), null);
    }

    /**
     * Create an aliased <code>ndt.t_cooperation</code> table reference
     */
    public TCooperation(String alias) {
        this(DSL.name(alias), T_COOPERATION);
    }

    /**
     * Create an aliased <code>ndt.t_cooperation</code> table reference
     */
    public TCooperation(Name alias) {
        this(alias, T_COOPERATION);
    }

    private TCooperation(Name alias, Table<TCooperationRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCooperation(Name alias, Table<TCooperationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "合作社信息表");
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
        return Arrays.<Index>asList(Indexes.T_COOPERATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCooperationRecord> getPrimaryKey() {
        return Keys.T_COOPERATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCooperationRecord>> getKeys() {
        return Arrays.<UniqueKey<TCooperationRecord>>asList(Keys.T_COOPERATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCooperation as(String alias) {
        return new TCooperation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCooperation as(Name alias) {
        return new TCooperation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCooperation rename(String name) {
        return new TCooperation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCooperation rename(Name name) {
        return new TCooperation(name, null);
    }
}
