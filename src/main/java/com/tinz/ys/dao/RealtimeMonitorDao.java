package com.tinz.ys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ys.entity.RealtimeMonitor;

public interface RealtimeMonitorDao {
	List<RealtimeMonitor> getByPsId(@Param("psId") Integer psId);
	
	List<RealtimeMonitor> getAll();
	
}
