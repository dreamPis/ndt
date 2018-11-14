package com.ndt.sms;

import com.google.common.collect.Lists;
import com.ndt.sms.dao.oauth.OauthClientDetailsDao;
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
    private OauthClientDetailsDao oauthClientDetailsDao;

    @Test
    public void test(){
        List<OauthClientDetailsRecord> list = Lists.newArrayList();
        for (int i = 0; i < 10; i++){
            OauthClientDetailsRecord record = new OauthClientDetailsRecord();
            record.setClientId("ndt" + i);
            record.setResourceIds("ndt" + i);
            record.setClientSecret(new BCryptPasswordEncoder().encode("ndt" + i));
            record.setScope("read");
            record.setAuthorizedGrantTypes("refresh_token,password,authorization_code");
            record.setWebServerRedirectUri("http://www.baidu.com");
            record.setAccessTokenValidity(60 * 60 * 7);
            record.setRefreshTokenValidity(60 * 60 * 24 * 30);
            list.add(record);
        }

        oauthClientDetailsDao.insert(list);
    }

}
