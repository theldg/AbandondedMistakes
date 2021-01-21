package com.ldg.app.usercenter.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 分享(User)实体类
 *
 * @author makejava
 * @since 2021-01-20 16:50:16
 */
public class User implements Serializable {
    private static final long serialVersionUID = 173368559468297875L;
    /**
    * Id
    */
    private Integer id;
    /**
    * 微信id
    */
    private String wxId;
    /**
    * 微信昵称
    */
    private String wxNickname;
    /**
    * 角色
    */
    private String roles;
    /**
    * 头像地址
    */
    private String avatarUrl;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改时间
    */
    private Date updateTime;
    /**
    * 积分
    */
    private Integer bonus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getWxNickname() {
        return wxNickname;
    }

    public void setWxNickname(String wxNickname) {
        this.wxNickname = wxNickname;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

}