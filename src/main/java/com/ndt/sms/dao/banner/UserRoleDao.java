package com.ndt.sms.dao.banner;

import com.ndt.sms.dao.BaseDaoImpl;
import com.ndt.sms.entity.tables.records.MtUserRoleRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static com.ndt.sms.entity.tables.MtUserRole.MT_USER_ROLE;

/**
 * @Author ser7en
 * @Date 2018-10-19 10:59
 * @version：
 * @Desc：
 */
@Repository
public class UserRoleDao extends BaseDaoImpl<MtUserRoleRecord, BigDecimal> {

    @Autowired
    private DSLContext dsl;

    public UserRoleDao() {
        super(MT_USER_ROLE);
    }

    @Override
    public Configuration getConfiguration() {
        return dsl.configuration();
    }

    public List<BigDecimal> getUserRoles(BigDecimal userId){
        return Arrays.asList(dsl.selectFrom(MT_USER_ROLE).where(MT_USER_ROLE.USER_ID.eq(userId)).fetchArray(MT_USER_ROLE.ROLE_ID));
    }
}
