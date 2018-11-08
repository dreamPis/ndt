package com.ndt.sms.dao;

import com.ndt.sms.common.OffsetPageVo;
import com.ndt.sms.common.PageVo;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.SortField;
import org.jooq.TableRecord;
import org.jooq.exception.DataAccessException;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * @Author ser7en
 * @Date 2018-10-09 14:44
 * @version：
 * @Desc：
 */
public interface BaseDao<R extends TableRecord<R>, T> {
    void insert(R object) throws DataAccessException;

    void insert(Collection<R> objects) throws DataAccessException;

    void update(R object) throws DataAccessException;

    /**
     * 更新非空字段
     * @param object
     * @return
     * @throws DataAccessException
     */
    int updateNotNullFeild(R object) throws DataAccessException;

    void delete(R object) throws DataAccessException;

    void delete(Collection<R> objects) throws DataAccessException;

    void deleteById(Collection<T> ids) throws DataAccessException;

    R findById(T id) throws DataAccessException;

    <Z> List<R> fetch(Field<Z> field, Z... values) throws DataAccessException;

    <Z> List<R> fetch(Field<Z> field, Collection<Z> values) throws DataAccessException;

    <Z> R fetchOne(Condition...  where) throws DataAccessException;

    <Z>R fetchOne(Field<Z> field, Z value) throws DataAccessException;

    <Z> Optional<R> fetchOptional(Field<Z> field, Z value) throws DataAccessException;

    PageVo<R> fetchByPage(List<Condition> conditions, OffsetPageVo offsetPageVo, Collection<SortField<?>> sortFields);

    List<R> findByConditions(List<Condition> conditions,Collection<SortField<?>> sortFields);

    List<R> findByCondition(Condition condition,Collection<SortField<?>> sortFields);

    List<R> findByOrgParent(Condition condition);
}
