package com.tinz.ys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.tinz.ys.entity.User;
import com.tinz.ys.entity.UserInfo;

public interface UserDao {

	/**
	 * 验证用户名密码
	 */
	Integer login(@Param("username") String username,@Param("password") String password);
	User loginUser(@Param("username") String username,@Param("password") String password);
	/**
	 * 通过ID查询用户信息
	 * 
	 * @param id
	 * @return User
	 */
	UserInfo queryById(Integer id);

	/**
	 * 查询所有用户
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return List<User>
	 */
	List<User> queryAll(@Param("offset") Integer offset, @Param("limit") Integer limit);
	
	User getUserByUsername(@Param("username") String username);
	UserInfo getUserInfoByUsername(@Param("username") String username);
}
