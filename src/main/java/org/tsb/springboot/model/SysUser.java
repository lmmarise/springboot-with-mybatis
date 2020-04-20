package org.tsb.springboot.model;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(SysUser)实体类
 *
 * @author makejava
 * @since 2020-04-20 18:12:30
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = 190972433443979792L;
    /**
    * 用户ID
    */
    private Long id;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 密码
    */
    private String userPassword;
    /**
    * 邮箱
    */
    private String userEmail;
    /**
    * 简介
    */
    private String userInfo;
    /**
    * 头像
    */
    private Object headImg;
    /**
    * 创建时间
    */
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public Object getHeadImg() {
        return headImg;
    }

    public void setHeadImg(Object headImg) {
        this.headImg = headImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}