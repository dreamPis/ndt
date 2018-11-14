/*
package com.ndt.sms;

import com.google.common.collect.Lists;
import com.ndt.sms.dao.oauth.ClientDetailsDao;
import com.ndt.sms.dao.oauth.OauthClientDetailDao;
import com.ndt.sms.entity.tables.records.ClientdetailsRecord;
import com.ndt.sms.entity.tables.records.OauthClientDetailsRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SmsApplicationTests {

    @Autowired
    private OauthClientDetailDao oauthClientDetailDao;
    @Autowired
    private ClientDetailsDao clientDetailsDao;

    @Test
    public void test(){
        List<String> clients = oauthClientDetailDao.findClients();
        List<ClientdetailsRecord> recordList = clientDetailsDao.findClentListNotInit(clients);
        List<OauthClientDetailsRecord> list = Lists.newArrayList();
        recordList.forEach(o -> {
            OauthClientDetailsRecord record = new OauthClientDetailsRecord();
            record.setClientId(o.getAppid());
            record.setResourceIds(o.getResourceids());
            record.setClientSecret(new BCryptPasswordEncoder().encode(o.getAppsecret()));
            record.setScope(o.getScope());
            record.setAuthorizedGrantTypes(o.getGranttypes());
            record.setWebServerRedirectUri(o.getRedirecturl());
            record.setAccessTokenValidity(60 * 60 * 12);
            record.setRefreshTokenValidity(60 * 60 * 24 * 30);
            list.add(record);
        });
        oauthClientDetailDao.insert(list);
    }

}
*/
