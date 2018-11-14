/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.OauthAccessToken;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class OauthAccessTokenRecord extends TableRecordImpl<OauthAccessTokenRecord> implements Record8<Timestamp, String, byte[], String, String, String, byte[], String> {

    private static final long serialVersionUID = 1449625224;

    /**
     * Setter for <code>ndt.oauth_access_token.create_time</code>.
     */
    public OauthAccessTokenRecord setCreateTime(Timestamp value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_access_token.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(0);
    }

    /**
     * Setter for <code>ndt.oauth_access_token.token_id</code>.
     */
    public OauthAccessTokenRecord setTokenId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_access_token.token_id</code>.
     */
    public String getTokenId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.oauth_access_token.token</code>.
     */
    public OauthAccessTokenRecord setToken(byte... value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_access_token.token</code>.
     */
    public byte[] getToken() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>ndt.oauth_access_token.authentication_id</code>.
     */
    public OauthAccessTokenRecord setAuthenticationId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_access_token.authentication_id</code>.
     */
    public String getAuthenticationId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.oauth_access_token.user_name</code>.
     */
    public OauthAccessTokenRecord setUserName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_access_token.user_name</code>.
     */
    public String getUserName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.oauth_access_token.client_id</code>.
     */
    public OauthAccessTokenRecord setClientId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_access_token.client_id</code>.
     */
    public String getClientId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.oauth_access_token.authentication</code>.
     */
    public OauthAccessTokenRecord setAuthentication(byte... value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_access_token.authentication</code>.
     */
    public byte[] getAuthentication() {
        return (byte[]) get(6);
    }

    /**
     * Setter for <code>ndt.oauth_access_token.refresh_token</code>.
     */
    public OauthAccessTokenRecord setRefreshToken(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_access_token.refresh_token</code>.
     */
    public String getRefreshToken() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Timestamp, String, byte[], String, String, String, byte[], String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Timestamp, String, byte[], String, String, String, byte[], String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field1() {
        return OauthAccessToken.OAUTH_ACCESS_TOKEN.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OauthAccessToken.OAUTH_ACCESS_TOKEN.TOKEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field3() {
        return OauthAccessToken.OAUTH_ACCESS_TOKEN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OauthAccessToken.OAUTH_ACCESS_TOKEN.AUTHENTICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return OauthAccessToken.OAUTH_ACCESS_TOKEN.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return OauthAccessToken.OAUTH_ACCESS_TOKEN.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field7() {
        return OauthAccessToken.OAUTH_ACCESS_TOKEN.AUTHENTICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return OauthAccessToken.OAUTH_ACCESS_TOKEN.REFRESH_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component1() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component3() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAuthenticationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component7() {
        return getAuthentication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value1() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value3() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAuthenticationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value7() {
        return getAuthentication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessTokenRecord value1(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessTokenRecord value2(String value) {
        setTokenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessTokenRecord value3(byte... value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessTokenRecord value4(String value) {
        setAuthenticationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessTokenRecord value5(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessTokenRecord value6(String value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessTokenRecord value7(byte... value) {
        setAuthentication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessTokenRecord value8(String value) {
        setRefreshToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessTokenRecord values(Timestamp value1, String value2, byte[] value3, String value4, String value5, String value6, byte[] value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OauthAccessTokenRecord
     */
    public OauthAccessTokenRecord() {
        super(OauthAccessToken.OAUTH_ACCESS_TOKEN);
    }

    /**
     * Create a detached, initialised OauthAccessTokenRecord
     */
    public OauthAccessTokenRecord(Timestamp createTime, String tokenId, byte[] token, String authenticationId, String userName, String clientId, byte[] authentication, String refreshToken) {
        super(OauthAccessToken.OAUTH_ACCESS_TOKEN);

        set(0, createTime);
        set(1, tokenId);
        set(2, token);
        set(3, authenticationId);
        set(4, userName);
        set(5, clientId);
        set(6, authentication);
        set(7, refreshToken);
    }
}
