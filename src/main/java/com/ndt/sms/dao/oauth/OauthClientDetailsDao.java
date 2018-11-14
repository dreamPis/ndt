package com.ndt.sms.dao.oauth;

import com.ndt.sms.dao.BaseDaoImpl;
import com.ndt.sms.entity.tables.records.OauthClientDetailsRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.ndt.sms.entity.tables.OauthClientDetails.OAUTH_CLIENT_DETAILS;

/**
 * @Author ser7en
 * @Date 2018-11-14 14:16
 * @version：
 * @Desc：
 */
@Repository
public class OauthClientDetailsDao extends BaseDaoImpl<OauthClientDetailsRecord, String> {

    @Autowired
    private DSLContext dsl;

    public OauthClientDetailsDao() {
        super(OAUTH_CLIENT_DETAILS);
    }

    @Override
    public Configuration getConfiguration() {
        return dsl.configuration();
    }
}
