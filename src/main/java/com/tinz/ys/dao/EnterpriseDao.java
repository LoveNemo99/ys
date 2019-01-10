package com.tinz.ys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ys.entity.Enterprise;
import com.tinz.ys.entity.Tree;

public interface EnterpriseDao {

	Enterprise getById(@Param("id") Integer id);

	List<Enterprise> getAll();
	
	List<Tree> getTree(@Param("id") Integer id);
	
	List<Tree> getPortTree(@Param("id") Integer id);
}
