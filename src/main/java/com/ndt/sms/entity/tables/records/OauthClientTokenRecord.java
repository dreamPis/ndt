/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.OauthClientToken;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OauthClientTokenRecord extends UpdatableRecordImpl<OauthClientTokenRecord> implements Record5<String, byte[], String, String, String> {

    private static final long serialVersionUID = -1922532187;

    /**
     * Setter for <code>ndt.oauth_client_token.token_id</code>. 从服务器端获取到的access_token的值.
     */
    public OauthClientTokenRecord setTokenId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_client_token.token_id</code>. 从服务器端获取到的access_token的值.
     */
    public String getTokenId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ndt.oauth_client_token.token</code>. 这是一个二进制的字段, 存储的数据是OAuth2AccessToken.java对象序列化后的二进制数据.
     */
    public OauthClientTokenRecord setToken(byte... value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_client_token.token</code>. 这是一个二进制的字段, 存储的数据是OAuth2AccessToken.java对象序列化后的二进制数据.
     */
    public byte[] getToken() {
        return (byte[]) get(1);
    }

    /**
     * Setter for <code>ndt.oauth_client_token.authentication_id</code>. 该字段具有唯一性, 是根据当前的username(如果有),client_id与scope通过MD5加密生成的
     */
    public OauthClientTokenRecord setAuthenticationId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_client_token.authentication_id</code>. 该字段具有唯一性, 是根据当前的username(如果有),client_id与scope通过MD5加密生成的
     */
    public String getAuthenticationId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.oauth_client_token.user_name</code>. 登录时的用户名
     */
    public OauthClientTokenRecord setUserName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_client_token.user_name</code>. 登录时的用户名
     */
    public String getUserName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.oauth_client_token.client_id</code>. 客服端id
     */
    public OauthClientTokenRecord setClientId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.oauth_client_token.client_id</code>. 客服端id
     */
    public String getClientId() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, byte[], String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, byte[], String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return OauthClientToken.OAUTH_CLIENT_TOKEN.TOKEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return OauthClientToken.OAUTH_CLIENT_TOKEN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OauthClientToken.OAUTH_CLIENT_TOKEN.AUTHENTICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OauthClientToken.OAUTH_CLIENT_TOKEN.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return OauthClientToken.OAUTH_CLIENT_TOKEN.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAuthenticationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAuthenticationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord value1(String value) {
        setTokenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord value2(byte... value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord value3(String value) {
        setAuthenticationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord value4(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord value5(String value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord values(String value1, byte[] value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OauthClientTokenRecord
     */
    public OauthClientTokenRecord() {
        super(OauthClientToken.OAUTH_CLIENT_TOKEN);
    }

    /**
     * Create a detached, initialised OauthClientTokenRecord
     */
    public OauthClientTokenRecord(String tokenId, byte[] token, String authenticationId, String userName, String clientId) {
        super(OauthClientToken.OAUTH_CLIENT_TOKEN);

        set(0, tokenId);
        set(1, token);
        set(2, authenticationId);
        set(3, userName);
        set(4, clientId);
    }
}
