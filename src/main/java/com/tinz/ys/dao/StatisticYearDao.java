package com.tinz.ys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ys.entity.StatisticYear;

public interface StatisticYearDao {

	List<StatisticYear> queryRecord(@Param("psId") Integer psId,@Param("portId") Integer portId,
			@Param("offset") Integer offset, @Param("limit") Integer limit,
			@Param("sort") String sort, @Param("order") String order);
	
	Integer queryCount(@Param("psId") Integer psId,@Param("portId") Integer portId);

	List<StatisticYear> queryRecordByYear(@Param("psId") Integer psId,@Param("startYear") String startYear,
			@Param("endYear") String endYear,
			@Param("offset") Integer offset, @Param("limit") Integer limit,
			@Param("sort") String sort, @Param("order") String order);
	
	Integer queryCountByYear(@Param("psId") Integer psId,@Param("startYear") String startYear,
			@Param("endYear") String endYear);
}