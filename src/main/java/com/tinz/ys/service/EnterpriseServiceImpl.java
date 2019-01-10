package com.tinz.ys.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ys.dao.EnterpriseDao;
import com.tinz.ys.entity.Enterprise;
import com.tinz.ys.entity.Tree;
import com.tinz.ys.entity.UserInfo;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private EnterpriseDao enterpriseDao;
	@Override
	public Enterprise getById(Integer id) {
		logger.info("Enterprise getById");
		return enterpriseDao.getById(id);
	}

	@Override
	public List<Enterprise> getAll(){
		logger.info("Enterprise getAll");
		return enterpriseDao.getAll();
	}
	
	@Override
	public List<Tree> getTree(UserInfo u){
		logger.info("Enterprise getTree");
		if("管理员".equals(u.getRole())) {
			return enterpriseDao.getTree(null);
		}
		else if("企业用户".equals(u.getRole())){
			if(u.getPsId()!=null) {
				return enterpriseDao.getTree(u.getPsId());
			}
			return null;
		}
		return null;
	}
	
	@Override
	public List<Tree> getPortTree(UserInfo u,Integer id){
		logger.info("Enterprise getPortTree");
		if("管理员".equals(u.getRole())) {
			return enterpriseDao.getPortTree(id);
		}
		else if("企业用户".equals(u.getRole())){
			if(u.getPsId()!=null&&u.getPsId()==id) {
				return enterpriseDao.getPortTree(id);
			}
			return null;
		}
		return null;
	}
}
