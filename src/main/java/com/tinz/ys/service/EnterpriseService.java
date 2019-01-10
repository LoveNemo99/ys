package com.tinz.ys.service;

import java.util.List;

import com.tinz.ys.entity.Enterprise;
import com.tinz.ys.entity.Tree;
import com.tinz.ys.entity.UserInfo;

public interface EnterpriseService {
	Enterprise getById(Integer id);

	List<Enterprise> getAll();

	List<Tree> getTree(UserInfo u);

	List<Tree> getPortTree(UserInfo u, Integer id);
}
