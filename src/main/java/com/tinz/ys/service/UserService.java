package com.tinz.ys.service;

import java.util.List;
import com.tinz.ys.entity.User;
import com.tinz.ys.entity.UserInfo;

public interface UserService {

	List<User> getList();

	UserInfo login(String username, String password);

	User getUserByUsername(String username);

	UserInfo getUserInfoByUsername(String username);
}
