/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TStaticSourceBak;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 静态资源对应fastdfs表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TStaticSourceBakRecord extends UpdatableRecordImpl<TStaticSourceBakRecord> implements Record6<BigDecimal, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = -1130103088;

    /**
     * Setter for <code>ndt.t_static_source_bak.id</code>. id
     */
    public TStaticSourceBakRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_static_source_bak.id</code>. id
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_static_source_bak.name</code>. 静态图片区域名称
     */
    public TStaticSourceBakRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_static_source_bak.name</code>. 静态图片区域名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_static_source_bak.source_path</code>. 源文件路径
     */
    public TStaticSourceBakRecord setSourcePath(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_static_source_bak.source_path</code>. 源文件路径
     */
    public String getSourcePath() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_static_source_bak.target_path</code>. 目的文件路径
     */
    public TStaticSourceBakRecord setTargetPath(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_static_source_bak.target_path</code>. 目的文件路径
     */
    public String getTargetPath() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_static_source_bak.source_w</code>. 图片宽
     */
    public TStaticSourceBakRecord setSourceW(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_static_source_bak.source_w</code>. 图片宽
     */
    public Integer getSourceW() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_static_source_bak.source_h</code>. 图片高
     */
    public TStaticSourceBakRecord setSourceH(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_static_source_bak.source_h</code>. 图片高
     */
    public Integer getSourceH() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<BigDecimal> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<BigDecimal, String, String, String, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<BigDecimal, String, String, String, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TStaticSourceBak.T_STATIC_SOURCE_BAK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TStaticSourceBak.T_STATIC_SOURCE_BAK.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TStaticSourceBak.T_STATIC_SOURCE_BAK.SOURCE_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TStaticSourceBak.T_STATIC_SOURCE_BAK.TARGET_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TStaticSourceBak.T_STATIC_SOURCE_BAK.SOURCE_W;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TStaticSourceBak.T_STATIC_SOURCE_BAK.SOURCE_H;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSourcePath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTargetPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSourceW();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getSourceH();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSourcePath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTargetPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSourceW();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getSourceH();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStaticSourceBakRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStaticSourceBakRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStaticSourceBakRecord value3(String value) {
        setSourcePath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStaticSourceBakRecord value4(String value) {
        setTargetPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStaticSourceBakRecord value5(Integer value) {
        setSourceW(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStaticSourceBakRecord value6(Integer value) {
        setSourceH(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStaticSourceBakRecord values(BigDecimal value1, String value2, String value3, String value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TStaticSourceBakRecord
     */
    public TStaticSourceBakRecord() {
        super(TStaticSourceBak.T_STATIC_SOURCE_BAK);
    }

    /**
     * Create a detached, initialised TStaticSourceBakRecord
     */
    public TStaticSourceBakRecord(BigDecimal id, String name, String sourcePath, String targetPath, Integer sourceW, Integer sourceH) {
        super(TStaticSourceBak.T_STATIC_SOURCE_BAK);

        set(0, id);
        set(1, name);
        set(2, sourcePath);
        set(3, targetPath);
        set(4, sourceW);
        set(5, sourceH);
    }
}
