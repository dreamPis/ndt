/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class ActRuIdentitylinkPjo implements Serializable {

    private static final long serialVersionUID = -495795811;

    private String  id_;
    private Integer rev_;
    private String  groupId_;
    private String  type_;
    private String  userId_;
    private String  taskId_;
    private String  procInstId_;
    private String  procDefId_;

    public ActRuIdentitylinkPjo() {}

    public ActRuIdentitylinkPjo(ActRuIdentitylinkPjo value) {
        this.id_ = value.id_;
        this.rev_ = value.rev_;
        this.groupId_ = value.groupId_;
        this.type_ = value.type_;
        this.userId_ = value.userId_;
        this.taskId_ = value.taskId_;
        this.procInstId_ = value.procInstId_;
        this.procDefId_ = value.procDefId_;
    }

    public ActRuIdentitylinkPjo(
        String  id_,
        Integer rev_,
        String  groupId_,
        String  type_,
        String  userId_,
        String  taskId_,
        String  procInstId_,
        String  procDefId_
    ) {
        this.id_ = id_;
        this.rev_ = rev_;
        this.groupId_ = groupId_;
        this.type_ = type_;
        this.userId_ = userId_;
        this.taskId_ = taskId_;
        this.procInstId_ = procInstId_;
        this.procDefId_ = procDefId_;
    }

    public String getId_() {
        return this.id_;
    }

    public ActRuIdentitylinkPjo setId_(String id_) {
        this.id_ = id_;
        return this;
    }

    public Integer getRev_() {
        return this.rev_;
    }

    public ActRuIdentitylinkPjo setRev_(Integer rev_) {
        this.rev_ = rev_;
        return this;
    }

    public String getGroupId_() {
        return this.groupId_;
    }

    public ActRuIdentitylinkPjo setGroupId_(String groupId_) {
        this.groupId_ = groupId_;
        return this;
    }

    public String getType_() {
        return this.type_;
    }

    public ActRuIdentitylinkPjo setType_(String type_) {
        this.type_ = type_;
        return this;
    }

    public String getUserId_() {
        return this.userId_;
    }

    public ActRuIdentitylinkPjo setUserId_(String userId_) {
        this.userId_ = userId_;
        return this;
    }

    public String getTaskId_() {
        return this.taskId_;
    }

    public ActRuIdentitylinkPjo setTaskId_(String taskId_) {
        this.taskId_ = taskId_;
        return this;
    }

    public String getProcInstId_() {
        return this.procInstId_;
    }

    public ActRuIdentitylinkPjo setProcInstId_(String procInstId_) {
        this.procInstId_ = procInstId_;
        return this;
    }

    public String getProcDefId_() {
        return this.procDefId_;
    }

    public ActRuIdentitylinkPjo setProcDefId_(String procDefId_) {
        this.procDefId_ = procDefId_;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActRuIdentitylinkPjo (");

        sb.append(id_);
        sb.append(", ").append(rev_);
        sb.append(", ").append(groupId_);
        sb.append(", ").append(type_);
        sb.append(", ").append(userId_);
        sb.append(", ").append(taskId_);
        sb.append(", ").append(procInstId_);
        sb.append(", ").append(procDefId_);

        sb.append(")");
        return sb.toString();
    }
}
