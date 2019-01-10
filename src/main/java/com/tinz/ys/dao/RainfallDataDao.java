package com.tinz.ys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ys.entity.PollutantId;
import com.tinz.ys.entity.RainfallData;

public interface RainfallDataDao {
	PollutantId queryPollutant();
	List<RainfallData> queryReport(@Param("psId") Integer psId,@Param("num") Integer num,@Param("factors") PollutantId p);
//	List<RainfallData> queryRecord(@Param("psId") Integer psId,@Param("num") Integer num,
//			@Param("offset") Integer offset, @Param("limit") Integer limit,
//			@Param("sort") String sort, @Param("order") String order);
//	
//	Integer queryCount(@Param("psId") Integer psId,@Param("portId") Integer portId);
}