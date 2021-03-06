/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TPropertyRightsTradingRecord;

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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPropertyRightsTrading extends TableImpl<TPropertyRightsTradingRecord> {

    private static final long serialVersionUID = 660641122;

    /**
     * The reference instance of <code>ndt.t_property_rights_trading</code>
     */
    public static final TPropertyRightsTrading T_PROPERTY_RIGHTS_TRADING = new TPropertyRightsTrading();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPropertyRightsTradingRecord> getRecordType() {
        return TPropertyRightsTradingRecord.class;
    }

    /**
     * The column <code>ndt.t_property_rights_trading.id</code>. 主键
     */
    public final TableField<TPropertyRightsTradingRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主键");

    /**
     * The column <code>ndt.t_property_rights_trading.article_title</code>. 项目名称
     */
    public final TableField<TPropertyRightsTradingRecord, String> ARTICLE_TITLE = createField("article_title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "项目名称");

    /**
     * The column <code>ndt.t_property_rights_trading.project_no</code>. 项目编号
     */
    public final TableField<TPropertyRightsTradingRecord, String> PROJECT_NO = createField("project_no", org.jooq.impl.SQLDataType.VARCHAR(255), this, "项目编号");

    /**
     * The column <code>ndt.t_property_rights_trading.expected_deal_type</code>. 拟交易方式
     */
    public final TableField<TPropertyRightsTradingRecord, String> EXPECTED_DEAL_TYPE = createField("expected_deal_type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "拟交易方式");

    /**
     * The column <code>ndt.t_property_rights_trading.expected_deal_period</code>. 拟交易期限
     */
    public final TableField<TPropertyRightsTradingRecord, String> EXPECTED_DEAL_PERIOD = createField("expected_deal_period", org.jooq.impl.SQLDataType.VARCHAR(255), this, "拟交易期限");

    /**
     * The column <code>ndt.t_property_rights_trading.owner_name</code>. 权利人名称/姓名
     */
    public final TableField<TPropertyRightsTradingRecord, String> OWNER_NAME = createField("owner_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "权利人名称/姓名");

    /**
     * The column <code>ndt.t_property_rights_trading.expected_price</code>. 拟交易价格
     */
    public final TableField<TPropertyRightsTradingRecord, String> EXPECTED_PRICE = createField("expected_price", org.jooq.impl.SQLDataType.VARCHAR(255), this, "拟交易价格");

    /**
     * The column <code>ndt.t_property_rights_trading.property_type</code>. 产权类型
     */
    public final TableField<TPropertyRightsTradingRecord, Integer> PROPERTY_TYPE = createField("property_type", org.jooq.impl.SQLDataType.INTEGER, this, "产权类型");

    /**
     * The column <code>ndt.t_property_rights_trading.property_location</code>. 坐落位置
     */
    public final TableField<TPropertyRightsTradingRecord, String> PROPERTY_LOCATION = createField("property_location", org.jooq.impl.SQLDataType.VARCHAR(255), this, "坐落位置");

    /**
     * The column <code>ndt.t_property_rights_trading.property_area</code>. 产权面积
     */
    public final TableField<TPropertyRightsTradingRecord, String> PROPERTY_AREA = createField("property_area", org.jooq.impl.SQLDataType.VARCHAR(255), this, "产权面积");

    /**
     * The column <code>ndt.t_property_rights_trading.ownership_type</code>. 权属类型
     */
    public final TableField<TPropertyRightsTradingRecord, String> OWNERSHIP_TYPE = createField("ownership_type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "权属类型");

    /**
     * The column <code>ndt.t_property_rights_trading.land_nature</code>. 土地性质
     */
    public final TableField<TPropertyRightsTradingRecord, String> LAND_NATURE = createField("land_nature", org.jooq.impl.SQLDataType.VARCHAR(255), this, "土地性质");

    /**
     * The column <code>ndt.t_property_rights_trading.groud_materail</code>. 地上物情况
     */
    public final TableField<TPropertyRightsTradingRecord, String> GROUD_MATERAIL = createField("groud_materail", org.jooq.impl.SQLDataType.VARCHAR(2048), this, "地上物情况");

    /**
     * The column <code>ndt.t_property_rights_trading.transportation</code>. 交通情况
     */
    public final TableField<TPropertyRightsTradingRecord, String> TRANSPORTATION = createField("transportation", org.jooq.impl.SQLDataType.VARCHAR(2048), this, "交通情况");

    /**
     * The column <code>ndt.t_property_rights_trading.is_mortgaged</code>. 是否存在抵押信息
     */
    public final TableField<TPropertyRightsTradingRecord, String> IS_MORTGAGED = createField("is_mortgaged", org.jooq.impl.SQLDataType.VARCHAR(255), this, "是否存在抵押信息");

    /**
     * The column <code>ndt.t_property_rights_trading.is_seized</code>. 是否存在查封信息
     */
    public final TableField<TPropertyRightsTradingRecord, String> IS_SEIZED = createField("is_seized", org.jooq.impl.SQLDataType.VARCHAR(255), this, "是否存在查封信息");

    /**
     * The column <code>ndt.t_property_rights_trading.transferor_name</code>. 转让方姓名/名称
     */
    public final TableField<TPropertyRightsTradingRecord, String> TRANSFEROR_NAME = createField("transferor_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "转让方姓名/名称");

    /**
     * The column <code>ndt.t_property_rights_trading.transferor_code</code>. 身份证号/营业执照号
     */
    public final TableField<TPropertyRightsTradingRecord, String> TRANSFEROR_CODE = createField("transferor_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "身份证号/营业执照号");

    /**
     * The column <code>ndt.t_property_rights_trading.transferor_address</code>. 住所/办公地址
     */
    public final TableField<TPropertyRightsTradingRecord, String> TRANSFEROR_ADDRESS = createField("transferor_address", org.jooq.impl.SQLDataType.VARCHAR(2048), this, "住所/办公地址");

    /**
     * The column <code>ndt.t_property_rights_trading.target_price</code>. 标的价格
     */
    public final TableField<TPropertyRightsTradingRecord, String> TARGET_PRICE = createField("target_price", org.jooq.impl.SQLDataType.VARCHAR(255), this, "标的价格");

    /**
     * The column <code>ndt.t_property_rights_trading.payment_method</code>. 价款支付方式
     */
    public final TableField<TPropertyRightsTradingRecord, String> PAYMENT_METHOD = createField("payment_method", org.jooq.impl.SQLDataType.VARCHAR(255), this, "价款支付方式");

    /**
     * The column <code>ndt.t_property_rights_trading.payment_deadline</code>. 价款支付期限
     */
    public final TableField<TPropertyRightsTradingRecord, String> PAYMENT_DEADLINE = createField("payment_deadline", org.jooq.impl.SQLDataType.VARCHAR(255), this, "价款支付期限");

    /**
     * The column <code>ndt.t_property_rights_trading.additional_requirement</code>. 其他交易条件
     */
    public final TableField<TPropertyRightsTradingRecord, String> ADDITIONAL_REQUIREMENT = createField("additional_requirement", org.jooq.impl.SQLDataType.VARCHAR(4048), this, "其他交易条件");

    /**
     * The column <code>ndt.t_property_rights_trading.phone</code>. 联系电话
     */
    public final TableField<TPropertyRightsTradingRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(255), this, "联系电话");

    /**
     * The column <code>ndt.t_property_rights_trading.fax</code>. 联系传真
     */
    public final TableField<TPropertyRightsTradingRecord, String> FAX = createField("fax", org.jooq.impl.SQLDataType.VARCHAR(255), this, "联系传真");

    /**
     * The column <code>ndt.t_property_rights_trading.email</code>. 电子邮件
     */
    public final TableField<TPropertyRightsTradingRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(255), this, "电子邮件");

    /**
     * The column <code>ndt.t_property_rights_trading.QQ_MSN</code>. QQ_MSN
     */
    public final TableField<TPropertyRightsTradingRecord, String> QQ_MSN = createField("QQ_MSN", org.jooq.impl.SQLDataType.VARCHAR(255), this, "QQ_MSN");

    /**
     * The column <code>ndt.t_property_rights_trading.pub_time</code>. 发布时间
     */
    public final TableField<TPropertyRightsTradingRecord, String> PUB_TIME = createField("pub_time", org.jooq.impl.SQLDataType.VARCHAR(255), this, "发布时间");

    /**
     * The column <code>ndt.t_property_rights_trading.cjj</code>. 成交价格
     */
    public final TableField<TPropertyRightsTradingRecord, String> CJJ = createField("cjj", org.jooq.impl.SQLDataType.VARCHAR(255), this, "成交价格");

    /**
     * Create a <code>ndt.t_property_rights_trading</code> table reference
     */
    public TPropertyRightsTrading() {
        this(DSL.name("t_property_rights_trading"), null);
    }

    /**
     * Create an aliased <code>ndt.t_property_rights_trading</code> table reference
     */
    public TPropertyRightsTrading(String alias) {
        this(DSL.name(alias), T_PROPERTY_RIGHTS_TRADING);
    }

    /**
     * Create an aliased <code>ndt.t_property_rights_trading</code> table reference
     */
    public TPropertyRightsTrading(Name alias) {
        this(alias, T_PROPERTY_RIGHTS_TRADING);
    }

    private TPropertyRightsTrading(Name alias, Table<TPropertyRightsTradingRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPropertyRightsTrading(Name alias, Table<TPropertyRightsTradingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
        return Arrays.<Index>asList(Indexes.T_PROPERTY_RIGHTS_TRADING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPropertyRightsTradingRecord> getPrimaryKey() {
        return Keys.T_PROPERTY_RIGHTS_TRADING_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPropertyRightsTradingRecord>> getKeys() {
        return Arrays.<UniqueKey<TPropertyRightsTradingRecord>>asList(Keys.T_PROPERTY_RIGHTS_TRADING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPropertyRightsTrading as(String alias) {
        return new TPropertyRightsTrading(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPropertyRightsTrading as(Name alias) {
        return new TPropertyRightsTrading(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPropertyRightsTrading rename(String name) {
        return new TPropertyRightsTrading(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TPropertyRightsTrading rename(Name name) {
        return new TPropertyRightsTrading(name, null);
    }
}
