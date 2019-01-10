package com.tinz.ys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ys.entity.EntranceCtrl;

public interface EntranceCtrlDao {

	List<EntranceCtrl> queryRecord(@Param("psId") Integer psId,@Param("portId") Integer portId,
			@Param("offset") Integer offset, @Param("limit") Integer limit,
			@Param("sort") String sort, @Param("order") String order);
	
	Integer queryCount(@Param("psId") Integer psId,@Param("portId") Integer portId);
	
	void control(EntranceCtrl v);

}