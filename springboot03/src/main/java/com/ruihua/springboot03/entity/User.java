package com.ruihua.springboot03.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 用户数据的实体类
 * @author 刘瑞华
 * @since 1.0
 */
@JsonInclude(value=Include.NON_NULL)
public class User {
	
	private Integer id; //'用户id'
	private String username; //'用户名'
	private String password; //'密码'
	private String salt; //'盐值'

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getSalt() {
		return salt;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", salt='" + salt + '\'' +
				'}';
	}
}
