package com.jasper.usercenter.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

/**
 * 用户
 * @TableName user
 */
@TableName(value ="user")
@Data
@Builder
public class User implements Serializable {

    @TableId
    private Long id;


    private String username;
    private String avatarUrl;
    private Integer gender;
    private String userPassword;
    private String phone;
    private String email;
    private Integer userStatus;
    private String userAccount;
    private Date createTime;
    private Date updateTime;
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}