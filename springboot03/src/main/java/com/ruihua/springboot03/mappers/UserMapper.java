package com.ruihua.springboot03.mappers;

import com.ruihua.springboot03.entity.User;

/**
 * 用户功能的持久层接口
 */
public interface UserMapper {
	/**
	 * 注册新用户，插入一条新数据
	 * @param user 用户实体类
	 * @return 受影响的行数
	 */
	Integer insertNewUser(User user);

	/**
	 * 查找该用户，查询是否有该用户
	 * @param username 用户名
	 * @return 用户密码
	 */
	String findUser(String username);

}










