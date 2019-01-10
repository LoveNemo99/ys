package com.tinz.ys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ys.entity.PollutantFactor;

public interface PollutantFactorDao {

	PollutantFactor getById(@Param("id") Integer id);

	PollutantFactor getByName(@Param("name") String name);
	
	List<PollutantFactor> getAll();

}
