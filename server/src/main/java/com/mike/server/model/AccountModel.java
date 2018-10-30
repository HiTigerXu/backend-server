package com.mike.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_account")
public class AccountModel {
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 关联网关uuid
     */
    private String uuid;

    /**
     * 用户名
     */
    private String name;

    /**
     * 真实名
     */
    @JsonProperty("actual_name")
    private String actualName;

    /**
     * 用户密码
     */
    private String Password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户手机
     */
    private String mobile;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 绑定google secret
     */
    @JsonProperty("google_secret")
    private String googleSecret;

    /**
     * 绑定权限id
     */
    private String roleId;

    /**
     * 是否超级管理员
     */
    @JsonProperty("is_admin")
    private Integer isAdmin;

    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 数据是否有效
     */
    private Integer valid;
}
