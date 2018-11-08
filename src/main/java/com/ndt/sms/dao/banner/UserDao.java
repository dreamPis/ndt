package com.ndt.sms.dao.banner;

import com.ndt.sms.dao.BaseDaoImpl;
import com.ndt.sms.entity.tables.records.TUserRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

import static com.ndt.sms.entity.tables.TUser.T_USER;

/**
 * @Author ser7en
 * @Date 2018-10-19 09:54
 * @version：
 * @Desc：
 */
@Repository
public class UserDao extends BaseDaoImpl<TUserRecord, BigDecimal> {

    @Autowired
    private DSLContext dsl;

    public UserDao() {
        super(T_USER);
    }

    @Override
    public Configuration getConfiguration() {
        return dsl.configuration();
    }

    public TUserRecord findByUser(String loginName){
        return dsl.selectFrom(T_USER).where(T_USER.LOGIN_NAME.eq(loginName)).fetchOne();
    }
}
