package com.ndt.sms.dao;

import com.ndt.sms.common.OffsetPageVo;
import com.ndt.sms.common.PageVo;
import org.jooq.*;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * @Author ser7en
 * @Date 2018-10-09 14:47
 * @version：
 * @Desc：
 */
public abstract class BaseDaoImpl<R extends UpdatableRecord<R>, T> implements BaseDao<R, T> {

    private final Table<R> table;

    public BaseDaoImpl(Table<R> table) {
        this.table = table;
    }

    @PostConstruct
    public abstract Configuration getConfiguration();

    @Override
    public void insert(R object) throws DataAccessException {
        DSL.using(getConfiguration()).insertInto(object.getTable()).set(object).execute();
    }

    @Override
    public void insert(Collection<R> objects) throws DataAccessException {
        DSL.using(getConfiguration()).batchInsert(objects).execute();
    }

    @Override
    public void update(R object) throws DataAccessException {
        DSL.using(getConfiguration()).executeUpdate(object);
    }

    /**
     * 更新非空字段
     * @param object
     * @return
     */
    @Override
    public int updateNotNullFeild(R object) throws DataAccessException{
        Field<T> primaryKey = getPrimaryKey();
        if(primaryKey == null){
            throw  new DataAccessException(object.getTable().getName()+",表无主键无法更新");
        }
        String primaryKeyName = primaryKey.getName();
        Map filedMap = new LinkedHashMap();
        for (Field<?> field : object.fields()) {
            //排除主键字段
            if(field.getName().equals(primaryKeyName)){
                continue;
            }
            Object value = field.getValue(object);
            if( value != null){
                filedMap.put(field,value);
            }
        }
        return DSL.using(getConfiguration())
                .update(this.table)
                .set(filedMap)
                .where(primaryKey.eq(primaryKey.getValue(object)))
                .execute();
    }

    @Override
    public void delete(R object) throws DataAccessException {
        DSL.using(getConfiguration()).executeDelete(object);
    }

    @Override
    public void delete(Collection<R> objects) throws DataAccessException {
        DSL.using(getConfiguration()).batchDelete(objects).execute();
    }

    @Override
    public void deleteById(Collection<T> ids) throws DataAccessException {
        Field<T> primaryField = getPrimaryKey();
        if (primaryField != null && ids.size() > 0) {
            DSL.using(getConfiguration()).delete(this.table).where(primaryField.in(ids)).execute();
        }
    }

    @Override
    public R findById(T id) throws DataAccessException {
        Field<T> primaryField = getPrimaryKey();
        if (primaryField != null) {
            return DSL.using(getConfiguration()).selectFrom(this.table).where(primaryField.eq(id)).fetchAny();
        }
        return null;
    }

    @Override
    public R fetchOne(Condition...  where) throws DataAccessException {
        return DSL.using(getConfiguration()).selectFrom(this.table).where(where).fetchOne();
    }


    @Override
    public <Z> List<R> fetch(Field<Z> field, Z... values) throws DataAccessException {
        return DSL.using(getConfiguration()).selectFrom(this.table).where(new Condition[]{field.in(values)}).fetch();
    }

    @Override
    public <Z> List<R> fetch(Field<Z> field, Collection<Z> values) throws DataAccessException {
        return DSL.using(getConfiguration()).selectFrom(this.table).where(new Condition[]{field.in(values)}).fetch();
    }

    @Override
    public <Z> R fetchOne(Field<Z> field, Z value) throws DataAccessException {
        return DSL.using(getConfiguration()).selectFrom(this.table).where(new Condition[]{field.eq(value)}).fetchOne();
    }


    @Override
    public <Z> Optional<R> fetchOptional(Field<Z> field, Z value) throws DataAccessException {
        return Optional.ofNullable(this.fetchOne(field, value));
    }

    /**
     * @param conditions
     * @param offsetPagingVo
     * @param sortFields
     * @return
     */
    @Override
    public PageVo<R> fetchByPage(List<Condition> conditions, OffsetPageVo offsetPagingVo, Collection<SortField<?>> sortFields) {
        PageVo<R> pageVo = new PageVo<>();
        ArrayList<R> arrayList = new ArrayList<>(Arrays.asList(DSL.using(getConfiguration()).selectFrom(this.table).where(conditions).orderBy(sortFields).limit(offsetPagingVo.getOffset(), offsetPagingVo.getSize()).fetchArray()));
        pageVo.setPageData(arrayList);
        Integer total = DSL.using(getConfiguration()).selectCount().from(this.table).where(conditions).fetchAny().value1();
        pageVo.setTotalCount(total);
        return pageVo;
    }

    private Field<T> getPrimaryKey() {
        UniqueKey key = this.table.getPrimaryKey();
        if (key == null || key.getFields() == null || key.getFields().isEmpty()) {
            return null;
        }
        List<TableField<R, T>> fields = key.getFields();
        return fields.get(0);
    }

    @Override
    public List<R> findByConditions(List<Condition> conditions, Collection<SortField<?>> sortFields) {
        return DSL.using(getConfiguration()).selectFrom(this.table).where(conditions).orderBy(sortFields).fetch();
    }

    @Override
    public List<R> findByCondition(Condition condition, Collection<SortField<?>> sortFields) {
        return DSL.using(getConfiguration()).selectFrom(this.table).where(condition).orderBy(sortFields).fetch();
    }

    @Override
    public List<R> findByOrgParent(Condition condition) {
        return DSL.using(getConfiguration()).selectFrom(this.table).where(condition).fetch();
    }

    /**
     * 分页查询指定表
     * @param page
     * @param fields 查询字段
     * @param tables 查询表
     * @param where 查询条件
     * @param sortFields 排序字段
     * @return
     */
    public PageVo queryPage(OffsetPageVo page,
                            Collection<? extends SelectField<?>> fields,
                            Collection<? extends TableLike<?>> tables,
                            List<Condition> where,
                            Collection<? extends SortField<?>> sortFields){
        PageVo pageVo = new PageVo<>();
        Result<Record> fetch = DSL.using(getConfiguration()).select(fields).from(tables)
                .where(where)
                .orderBy(sortFields)
                .limit(page.getOffset(), page.getSize())
                .fetch();
        Integer total = DSL.using(getConfiguration()).selectCount().from(tables)
                .where(where).fetchAny().value1();
        pageVo.setPageData(fetch.intoMaps());
        pageVo.setTotalCount(total);
        return pageVo;
    }


    /**
     * 分页查询当前表
     * @param page
     * @param where 查询条件
     * @param sortFields 排序字段
     * @return
     */
    public PageVo queryPage(OffsetPageVo page, List<Condition> where,
                            Collection<? extends SortField<?>> sortFields){
        PageVo pageVo = new PageVo<>();
        Result<R> fetch = DSL.using(getConfiguration()).selectFrom(this.table)
                .where(where)
                .orderBy(sortFields)
                .limit(page.getOffset(), page.getSize())
                .fetch();
        Integer total = DSL.using(getConfiguration()).selectCount().from(this.table)
                .where(where).fetchAny().value1();
        pageVo.setPageData(fetch.intoMaps());
        pageVo.setTotalCount(total);
        return pageVo;
    }

    /**
     * 分页查询当前表
     * @param page
     * @param where 查询条件
     * @param sortFields 排序字段
     * @return
     */
    public PageVo queryPage(OffsetPageVo page,
                            Collection<? extends SelectField<?>> fields,
                            Collection<Condition> where,
                            Collection<? extends SortField<?>> sortFields){
        PageVo pageVo = new PageVo<>();
        Result fetch = DSL.using(getConfiguration())
                .select(fields)
                .from(this.table)
                .where(where)
                .orderBy(sortFields)
                .limit(page.getOffset(), page.getSize())
                .fetch();
        Integer total = DSL.using(getConfiguration()).selectCount().from(this.table)
                .where(where).fetchAny().value1();
        pageVo.setPageData(fetch.intoMaps());
        pageVo.setTotalCount(total);
        return pageVo;
    }
}
