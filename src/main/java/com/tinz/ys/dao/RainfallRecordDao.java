package com.tinz.ys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ys.entity.RainfallRecord;
import com.tinz.ys.entity.Tree;

public interface RainfallRecordDao {

	RainfallRecord getById(@Param("id") Integer id);

	List<RainfallRecord> getAll();
	/**
	 * 
	 * @param startDay '2018-01-01'
	 * @param endDay
	 * @return
	 */
	List<Tree> getTree(@Param("startDay") String startDay,@Param("endDay") String endDay);
	
}
