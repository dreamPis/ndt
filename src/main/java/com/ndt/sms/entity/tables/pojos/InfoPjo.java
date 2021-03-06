/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.annotation.Generated;


/**
 * 资讯表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InfoPjo implements Serializable {

    private static final long serialVersionUID = 1113729260;

    private BigDecimal   id;
    private Integer      type;
    private String       title;
    private String       summary;
    private String       content;
    private String       source;
    private BigDecimal   publishOrgId;
    private String       linkImageUrl;
    private Integer      importance;
    private BigDecimal   readCount;
    private Integer[]    labels;
    private BigDecimal[] divisions;
    private Integer      state;
    private Short        status;
    private BigDecimal   createBy;
    private Timestamp    createAt;
    private BigDecimal   updateBy;
    private Timestamp    updateAt;
    private BigDecimal[] enclosure;
    private String[]     lastImgUri;

    public InfoPjo() {}

    public InfoPjo(InfoPjo value) {
        this.id = value.id;
        this.type = value.type;
        this.title = value.title;
        this.summary = value.summary;
        this.content = value.content;
        this.source = value.source;
        this.publishOrgId = value.publishOrgId;
        this.linkImageUrl = value.linkImageUrl;
        this.importance = value.importance;
        this.readCount = value.readCount;
        this.labels = value.labels;
        this.divisions = value.divisions;
        this.state = value.state;
        this.status = value.status;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
        this.updateBy = value.updateBy;
        this.updateAt = value.updateAt;
        this.enclosure = value.enclosure;
        this.lastImgUri = value.lastImgUri;
    }

    public InfoPjo(
        BigDecimal   id,
        Integer      type,
        String       title,
        String       summary,
        String       content,
        String       source,
        BigDecimal   publishOrgId,
        String       linkImageUrl,
        Integer      importance,
        BigDecimal   readCount,
        Integer[]    labels,
        BigDecimal[] divisions,
        Integer      state,
        Short        status,
        BigDecimal   createBy,
        Timestamp    createAt,
        BigDecimal   updateBy,
        Timestamp    updateAt,
        BigDecimal[] enclosure,
        String[]     lastImgUri
    ) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.summary = summary;
        this.content = content;
        this.source = source;
        this.publishOrgId = publishOrgId;
        this.linkImageUrl = linkImageUrl;
        this.importance = importance;
        this.readCount = readCount;
        this.labels = labels;
        this.divisions = divisions;
        this.state = state;
        this.status = status;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
        this.enclosure = enclosure;
        this.lastImgUri = lastImgUri;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public InfoPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public InfoPjo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public InfoPjo setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSummary() {
        return this.summary;
    }

    public InfoPjo setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public InfoPjo setContent(String content) {
        this.content = content;
        return this;
    }

    public String getSource() {
        return this.source;
    }

    public InfoPjo setSource(String source) {
        this.source = source;
        return this;
    }

    public BigDecimal getPublishOrgId() {
        return this.publishOrgId;
    }

    public InfoPjo setPublishOrgId(BigDecimal publishOrgId) {
        this.publishOrgId = publishOrgId;
        return this;
    }

    public String getLinkImageUrl() {
        return this.linkImageUrl;
    }

    public InfoPjo setLinkImageUrl(String linkImageUrl) {
        this.linkImageUrl = linkImageUrl;
        return this;
    }

    public Integer getImportance() {
        return this.importance;
    }

    public InfoPjo setImportance(Integer importance) {
        this.importance = importance;
        return this;
    }

    public BigDecimal getReadCount() {
        return this.readCount;
    }

    public InfoPjo setReadCount(BigDecimal readCount) {
        this.readCount = readCount;
        return this;
    }

    public Integer[] getLabels() {
        return this.labels;
    }

    public InfoPjo setLabels(Integer... labels) {
        this.labels = labels;
        return this;
    }

    public BigDecimal[] getDivisions() {
        return this.divisions;
    }

    public InfoPjo setDivisions(BigDecimal... divisions) {
        this.divisions = divisions;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public InfoPjo setState(Integer state) {
        this.state = state;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public InfoPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public InfoPjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public InfoPjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public BigDecimal getUpdateBy() {
        return this.updateBy;
    }

    public InfoPjo setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public InfoPjo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    public BigDecimal[] getEnclosure() {
        return this.enclosure;
    }

    public InfoPjo setEnclosure(BigDecimal... enclosure) {
        this.enclosure = enclosure;
        return this;
    }

    public String[] getLastImgUri() {
        return this.lastImgUri;
    }

    public InfoPjo setLastImgUri(String... lastImgUri) {
        this.lastImgUri = lastImgUri;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InfoPjo (");

        sb.append(id);
        sb.append(", ").append(type);
        sb.append(", ").append(title);
        sb.append(", ").append(summary);
        sb.append(", ").append(content);
        sb.append(", ").append(source);
        sb.append(", ").append(publishOrgId);
        sb.append(", ").append(linkImageUrl);
        sb.append(", ").append(importance);
        sb.append(", ").append(readCount);
        sb.append(", ").append(Arrays.toString(labels));
        sb.append(", ").append(Arrays.toString(divisions));
        sb.append(", ").append(state);
        sb.append(", ").append(status);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(Arrays.toString(enclosure));
        sb.append(", ").append(Arrays.toString(lastImgUri));

        sb.append(")");
        return sb.toString();
    }
}
