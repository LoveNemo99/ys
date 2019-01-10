package com.tinz.ys.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tinz.ys.dao.UserDao;
import com.tinz.ys.entity.User;
import com.tinz.ys.entity.UserInfo;
import com.tinz.ys.token.TokenUtil;

@Service
public class UserServiceImpl implements UserService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserDao userDao;
	@Autowired
	private TokenUtil tokenUtil;
	@Override
	public UserInfo login(String username,String password) {
		logger.info("login==== "+username);
//		Integer userId = userDao.login(username, password);
		User user = userDao.loginUser(username, password);
		if(user!=null&&user.getId()!=null) {
			UserInfo userInfo = userDao.queryById(user.getId());
			final String token = tokenUtil.generateToken(user);
			userInfo.setToken(token);
			return userInfo;
		}
		return null;
	}

	@Override
	public List<User> getList() {
		return userDao.queryAll(1, 2);
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}
	@Override
	public UserInfo getUserInfoByUsername(String username) {
		return userDao.getUserInfoByUsername(username);
	}

}
