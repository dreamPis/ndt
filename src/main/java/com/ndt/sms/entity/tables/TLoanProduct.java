/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TLoanProductRecord;

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
 * 贷款产品
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLoanProduct extends TableImpl<TLoanProductRecord> {

    private static final long serialVersionUID = -864442081;

    /**
     * The reference instance of <code>ndt.t_loan_product</code>
     */
    public static final TLoanProduct T_LOAN_PRODUCT = new TLoanProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TLoanProductRecord> getRecordType() {
        return TLoanProductRecord.class;
    }

    /**
     * The column <code>ndt.t_loan_product.id</code>.
     */
    public final TableField<TLoanProductRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_loan_product.name</code>. 产品名称
     */
    public final TableField<TLoanProductRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(30), this, "产品名称");

    /**
     * The column <code>ndt.t_loan_product.org_id</code>. 金融机构ID
     */
    public final TableField<TLoanProductRecord, BigDecimal> ORG_ID = createField("org_id", org.jooq.impl.SQLDataType.NUMERIC, this, "金融机构ID");

    /**
     * The column <code>ndt.t_loan_product.logo_image_url</code>. 产品LOGO地址
     */
    public final TableField<TLoanProductRecord, String> LOGO_IMAGE_URL = createField("logo_image_url", org.jooq.impl.SQLDataType.VARCHAR(60), this, "产品LOGO地址");

    /**
     * The column <code>ndt.t_loan_product.product_type</code>. 产品类型,参考码表大类33
     */
    public final TableField<TLoanProductRecord, BigDecimal> PRODUCT_TYPE = createField("product_type", org.jooq.impl.SQLDataType.NUMERIC, this, "产品类型,参考码表大类33");

    /**
     * The column <code>ndt.t_loan_product.product_code</code>. 产品代码
     */
    public final TableField<TLoanProductRecord, String> PRODUCT_CODE = createField("product_code", org.jooq.impl.SQLDataType.VARCHAR(50), this, "产品代码");

    /**
     * The column <code>ndt.t_loan_product.mix_amount</code>. 最小额度
     */
    public final TableField<TLoanProductRecord, BigDecimal> MIX_AMOUNT = createField("mix_amount", org.jooq.impl.SQLDataType.NUMERIC, this, "最小额度");

    /**
     * The column <code>ndt.t_loan_product.mix_amount_unit</code>. 最小金额单位
     */
    public final TableField<TLoanProductRecord, Integer> MIX_AMOUNT_UNIT = createField("mix_amount_unit", org.jooq.impl.SQLDataType.INTEGER, this, "最小金额单位");

    /**
     * The column <code>ndt.t_loan_product.max_amount</code>. 最大额度
     */
    public final TableField<TLoanProductRecord, BigDecimal> MAX_AMOUNT = createField("max_amount", org.jooq.impl.SQLDataType.NUMERIC, this, "最大额度");

    /**
     * The column <code>ndt.t_loan_product.max_amount_unit</code>. 最大金额单位
     */
    public final TableField<TLoanProductRecord, Integer> MAX_AMOUNT_UNIT = createField("max_amount_unit", org.jooq.impl.SQLDataType.INTEGER, this, "最大金额单位");

    /**
     * The column <code>ndt.t_loan_product.mix_term</code>. 最小期限
     */
    public final TableField<TLoanProductRecord, BigDecimal> MIX_TERM = createField("mix_term", org.jooq.impl.SQLDataType.NUMERIC, this, "最小期限");

    /**
     * The column <code>ndt.t_loan_product.mix_term_unit</code>. 最小期限单位
     */
    public final TableField<TLoanProductRecord, Integer> MIX_TERM_UNIT = createField("mix_term_unit", org.jooq.impl.SQLDataType.INTEGER, this, "最小期限单位");

    /**
     * The column <code>ndt.t_loan_product.max_term</code>. 最大期限
     */
    public final TableField<TLoanProductRecord, BigDecimal> MAX_TERM = createField("max_term", org.jooq.impl.SQLDataType.NUMERIC, this, "最大期限");

    /**
     * The column <code>ndt.t_loan_product.max_term_unit</code>. 最大期限单位
     */
    public final TableField<TLoanProductRecord, Integer> MAX_TERM_UNIT = createField("max_term_unit", org.jooq.impl.SQLDataType.INTEGER, this, "最大期限单位");

    /**
     * The column <code>ndt.t_loan_product.only_ndt</code>. 农贷通专属产品
     */
    public final TableField<TLoanProductRecord, Boolean> ONLY_NDT = createField("only_ndt", org.jooq.impl.SQLDataType.BOOLEAN, this, "农贷通专属产品");

    /**
     * The column <code>ndt.t_loan_product.rate</code>. 利率
     */
    public final TableField<TLoanProductRecord, String> RATE = createField("rate", org.jooq.impl.SQLDataType.VARCHAR(50), this, "利率");

    /**
     * The column <code>ndt.t_loan_product.product_to</code>. 贷款对象
     */
    public final TableField<TLoanProductRecord, Integer[]> PRODUCT_TO = createField("product_to", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "贷款对象");

    /**
     * The column <code>ndt.t_loan_product.loan_types</code>. 贷款方式
     */
    public final TableField<TLoanProductRecord, Integer[]> LOAN_TYPES = createField("loan_types", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "贷款方式");

    /**
     * The column <code>ndt.t_loan_product.labels</code>. 产品标签
     */
    public final TableField<TLoanProductRecord, Integer[]> LABELS = createField("labels", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "产品标签");

    /**
     * The column <code>ndt.t_loan_product.payback_type</code>. 还款方式
     */
    public final TableField<TLoanProductRecord, Integer> PAYBACK_TYPE = createField("payback_type", org.jooq.impl.SQLDataType.INTEGER, this, "还款方式");

    /**
     * The column <code>ndt.t_loan_product.support_policy</code>. 扶持支持政策
     */
    public final TableField<TLoanProductRecord, String> SUPPORT_POLICY = createField("support_policy", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "扶持支持政策");

    /**
     * The column <code>ndt.t_loan_product.remark</code>. 描述
     */
    public final TableField<TLoanProductRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.CLOB, this, "描述");

    /**
     * The column <code>ndt.t_loan_product.priority</code>. 优先级,1~100,数值越大优先级越高
     */
    public final TableField<TLoanProductRecord, Short> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.SMALLINT, this, "优先级,1~100,数值越大优先级越高");

    /**
     * The column <code>ndt.t_loan_product.state</code>. 产品状态,参考码表大类34
     */
    public final TableField<TLoanProductRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER, this, "产品状态,参考码表大类34");

    /**
     * The column <code>ndt.t_loan_product.divisions</code>. 服务区域
     */
    public final TableField<TLoanProductRecord, BigDecimal[]> DIVISIONS = createField("divisions", org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType(), this, "服务区域");

    /**
     * The column <code>ndt.t_loan_product.status</code>. 记录状态
     */
    public final TableField<TLoanProductRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "记录状态");

    /**
     * The column <code>ndt.t_loan_product.create_by</code>. 创建人
     */
    public final TableField<TLoanProductRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "创建人");

    /**
     * The column <code>ndt.t_loan_product.create_at</code>. 创建时间
     */
    public final TableField<TLoanProductRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>ndt.t_loan_product.update_by</code>. 更新人
     */
    public final TableField<TLoanProductRecord, BigDecimal> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.NUMERIC, this, "更新人");

    /**
     * The column <code>ndt.t_loan_product.update_at</code>. 更新时间
     */
    public final TableField<TLoanProductRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ndt.t_loan_product.index</code>. 排序顺序
     */
    public final TableField<TLoanProductRecord, Integer> INDEX = createField("index", org.jooq.impl.SQLDataType.INTEGER, this, "排序顺序");

    /**
     * The column <code>ndt.t_loan_product.square_logo</code>. 正方形logo
     */
    public final TableField<TLoanProductRecord, BigDecimal> SQUARE_LOGO = createField("square_logo", org.jooq.impl.SQLDataType.NUMERIC, this, "正方形logo");

    /**
     * The column <code>ndt.t_loan_product.credit_rating</code>. 信用评级
     */
    public final TableField<TLoanProductRecord, Integer> CREDIT_RATING = createField("credit_rating", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "信用评级");

    /**
     * The column <code>ndt.t_loan_product.base_rate</code>. 基准利率
     */
    public final TableField<TLoanProductRecord, BigDecimal> BASE_RATE = createField("base_rate", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.NUMERIC)), this, "基准利率");

    /**
     * The column <code>ndt.t_loan_product.float_prop</code>. 上浮比例
     */
    public final TableField<TLoanProductRecord, BigDecimal> FLOAT_PROP = createField("float_prop", org.jooq.impl.SQLDataType.NUMERIC.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.NUMERIC)), this, "上浮比例");

    /**
     * Create a <code>ndt.t_loan_product</code> table reference
     */
    public TLoanProduct() {
        this(DSL.name("t_loan_product"), null);
    }

    /**
     * Create an aliased <code>ndt.t_loan_product</code> table reference
     */
    public TLoanProduct(String alias) {
        this(DSL.name(alias), T_LOAN_PRODUCT);
    }

    /**
     * Create an aliased <code>ndt.t_loan_product</code> table reference
     */
    public TLoanProduct(Name alias) {
        this(alias, T_LOAN_PRODUCT);
    }

    private TLoanProduct(Name alias, Table<TLoanProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private TLoanProduct(Name alias, Table<TLoanProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "贷款产品");
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
        return Arrays.<Index>asList(Indexes.T_LOAN_PRODUCT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TLoanProductRecord> getPrimaryKey() {
        return Keys.T_LOAN_PRODUCT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TLoanProductRecord>> getKeys() {
        return Arrays.<UniqueKey<TLoanProductRecord>>asList(Keys.T_LOAN_PRODUCT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanProduct as(String alias) {
        return new TLoanProduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanProduct as(Name alias) {
        return new TLoanProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TLoanProduct rename(String name) {
        return new TLoanProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TLoanProduct rename(Name name) {
        return new TLoanProduct(name, null);
    }
}