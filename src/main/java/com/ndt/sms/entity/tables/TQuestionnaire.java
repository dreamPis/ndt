/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TQuestionnaireRecord;

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
public class TQuestionnaire extends TableImpl<TQuestionnaireRecord> {

    private static final long serialVersionUID = -2066927046;

    /**
     * The reference instance of <code>ndt.t_questionnaire</code>
     */
    public static final TQuestionnaire T_QUESTIONNAIRE = new TQuestionnaire();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TQuestionnaireRecord> getRecordType() {
        return TQuestionnaireRecord.class;
    }

    /**
     * The column <code>ndt.t_questionnaire.id</code>. 主键
     */
    public final TableField<TQuestionnaireRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "主键");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<TQuestionnaireRecord, Object> RESULT = createField("result", org.jooq.impl.SQLDataType.OTHER.nullable(false), this, "问卷调查结果[{题号:回答}]");

    /**
     * The column <code>ndt.t_questionnaire.submit_user_id</code>. 提交者id
     */
    public final TableField<TQuestionnaireRecord, BigDecimal> SUBMIT_USER_ID = createField("submit_user_id", org.jooq.impl.SQLDataType.NUMERIC, this, "提交者id");

    /**
     * The column <code>ndt.t_questionnaire.create_time</code>. 创建时间
     */
    public final TableField<TQuestionnaireRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ndt.t_questionnaire.temp_id</code>. 预留字段问卷模板id
     */
    public final TableField<TQuestionnaireRecord, Integer> TEMP_ID = createField("temp_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "预留字段问卷模板id");

    /**
     * Create a <code>ndt.t_questionnaire</code> table reference
     */
    public TQuestionnaire() {
        this(DSL.name("t_questionnaire"), null);
    }

    /**
     * Create an aliased <code>ndt.t_questionnaire</code> table reference
     */
    public TQuestionnaire(String alias) {
        this(DSL.name(alias), T_QUESTIONNAIRE);
    }

    /**
     * Create an aliased <code>ndt.t_questionnaire</code> table reference
     */
    public TQuestionnaire(Name alias) {
        this(alias, T_QUESTIONNAIRE);
    }

    private TQuestionnaire(Name alias, Table<TQuestionnaireRecord> aliased) {
        this(alias, aliased, null);
    }

    private TQuestionnaire(Name alias, Table<TQuestionnaireRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.T_QUESTIONNAIRE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TQuestionnaireRecord> getPrimaryKey() {
        return Keys.T_QUESTIONNAIRE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TQuestionnaireRecord>> getKeys() {
        return Arrays.<UniqueKey<TQuestionnaireRecord>>asList(Keys.T_QUESTIONNAIRE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQuestionnaire as(String alias) {
        return new TQuestionnaire(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQuestionnaire as(Name alias) {
        return new TQuestionnaire(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TQuestionnaire rename(String name) {
        return new TQuestionnaire(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TQuestionnaire rename(Name name) {
        return new TQuestionnaire(name, null);
    }
}
