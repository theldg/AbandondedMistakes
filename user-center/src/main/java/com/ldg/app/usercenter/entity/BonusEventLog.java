package com.ldg.app.usercenter.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 积分变更记录表(BonusEventLog)实体类
 *
 * @author makejava
 * @since 2021-01-20 16:51:03
 */
public class BonusEventLog implements Serializable {
    private static final long serialVersionUID = -30641638310808520L;
    /**
    * Id
    */
    private Integer id;
    /**
    * user.id
    */
    private Integer userId;
    /**
    * 积分操作值
    */
    private Integer value;
    /**
    * 发生的事件
    */
    private String event;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 描述
    */
    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}