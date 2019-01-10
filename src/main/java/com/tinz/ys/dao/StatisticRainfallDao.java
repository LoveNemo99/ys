package com.tinz.ys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ys.entity.StatisticRainfall;

public interface StatisticRainfallDao {

	List<StatisticRainfall> queryRecord(@Param("psId") Integer psId,@Param("portId") Integer portId,
			@Param("offset") Integer offset, @Param("limit") Integer limit,
			@Param("sort") String sort, @Param("order") String order);
	
	Integer queryCount(@Param("psId") Integer psId,@Param("portId") Integer portId);

	List<StatisticRainfall> queryRecordByNum(@Param("psId") Integer psId,@Param("startNum") Integer startNum,
			@Param("endNum") Integer endNum,
			@Param("offset") Integer offset, @Param("limit") Integer limit,
			@Param("sort") String sort, @Param("order") String order);
	
	Integer queryCountByNum(@Param("psId") Integer psId,@Param("startNum") Integer startNum,@Param("endNum") Integer endNum);
}