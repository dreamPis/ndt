/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.ActIdUserRecord;

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
public class ActIdUser extends TableImpl<ActIdUserRecord> {

    private static final long serialVersionUID = -519172656;

    /**
     * The reference instance of <code>ndt.act_id_user</code>
     */
    public static final ActIdUser ACT_ID_USER = new ActIdUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActIdUserRecord> getRecordType() {
        return ActIdUserRecord.class;
    }

    /**
     * The column <code>ndt.act_id_user.id_</code>.
     */
    public final TableField<ActIdUserRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ndt.act_id_user.rev_</code>.
     */
    public final TableField<ActIdUserRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_id_user.first_</code>.
     */
    public final TableField<ActIdUserRecord, String> FIRST_ = createField("first_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_id_user.last_</code>.
     */
    public final TableField<ActIdUserRecord, String> LAST_ = createField("last_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_id_user.email_</code>.
     */
    public final TableField<ActIdUserRecord, String> EMAIL_ = createField("email_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_id_user.pwd_</code>.
     */
    public final TableField<ActIdUserRecord, String> PWD_ = createField("pwd_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_id_user.picture_id_</code>.
     */
    public final TableField<ActIdUserRecord, String> PICTURE_ID_ = createField("picture_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>ndt.act_id_user</code> table reference
     */
    public ActIdUser() {
        this(DSL.name("act_id_user"), null);
    }

    /**
     * Create an aliased <code>ndt.act_id_user</code> table reference
     */
    public ActIdUser(String alias) {
        this(DSL.name(alias), ACT_ID_USER);
    }

    /**
     * Create an aliased <code>ndt.act_id_user</code> table reference
     */
    public ActIdUser(Name alias) {
        this(alias, ACT_ID_USER);
    }

    private ActIdUser(Name alias, Table<ActIdUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActIdUser(Name alias, Table<ActIdUserRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACT_ID_USER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActIdUserRecord> getPrimaryKey() {
        return Keys.ACT_ID_USER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActIdUserRecord>> getKeys() {
        return Arrays.<UniqueKey<ActIdUserRecord>>asList(Keys.ACT_ID_USER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActIdUser as(String alias) {
        return new ActIdUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActIdUser as(Name alias) {
        return new ActIdUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActIdUser rename(String name) {
        return new ActIdUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActIdUser rename(Name name) {
        return new ActIdUser(name, null);
    }
}
