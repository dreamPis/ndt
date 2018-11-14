/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.OauthAccessTokenRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class OauthAccessToken extends TableImpl<OauthAccessTokenRecord> {

    private static final long serialVersionUID = -2045475265;

    /**
     * The reference instance of <code>ndt.oauth_access_token</code>
     */
    public static final OauthAccessToken OAUTH_ACCESS_TOKEN = new OauthAccessToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthAccessTokenRecord> getRecordType() {
        return OauthAccessTokenRecord.class;
    }

    /**
     * The column <code>ndt.oauth_access_token.create_time</code>.
     */
    public final TableField<OauthAccessTokenRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>ndt.oauth_access_token.token_id</code>.
     */
    public final TableField<OauthAccessTokenRecord, String> TOKEN_ID = createField("token_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.oauth_access_token.token</code>.
     */
    public final TableField<OauthAccessTokenRecord, byte[]> TOKEN = createField("token", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>ndt.oauth_access_token.authentication_id</code>.
     */
    public final TableField<OauthAccessTokenRecord, String> AUTHENTICATION_ID = createField("authentication_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.oauth_access_token.user_name</code>.
     */
    public final TableField<OauthAccessTokenRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.oauth_access_token.client_id</code>.
     */
    public final TableField<OauthAccessTokenRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.oauth_access_token.authentication</code>.
     */
    public final TableField<OauthAccessTokenRecord, byte[]> AUTHENTICATION = createField("authentication", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>ndt.oauth_access_token.refresh_token</code>.
     */
    public final TableField<OauthAccessTokenRecord, String> REFRESH_TOKEN = createField("refresh_token", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>ndt.oauth_access_token</code> table reference
     */
    public OauthAccessToken() {
        this(DSL.name("oauth_access_token"), null);
    }

    /**
     * Create an aliased <code>ndt.oauth_access_token</code> table reference
     */
    public OauthAccessToken(String alias) {
        this(DSL.name(alias), OAUTH_ACCESS_TOKEN);
    }

    /**
     * Create an aliased <code>ndt.oauth_access_token</code> table reference
     */
    public OauthAccessToken(Name alias) {
        this(alias, OAUTH_ACCESS_TOKEN);
    }

    private OauthAccessToken(Name alias, Table<OauthAccessTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthAccessToken(Name alias, Table<OauthAccessTokenRecord> aliased, Field<?>[] parameters) {
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
    public OauthAccessToken as(String alias) {
        return new OauthAccessToken(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessToken as(Name alias) {
        return new OauthAccessToken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthAccessToken rename(String name) {
        return new OauthAccessToken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthAccessToken rename(Name name) {
        return new OauthAccessToken(name, null);
    }
}
