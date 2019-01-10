package com.tinz.ys.service;

import java.util.List;

import com.tinz.ys.entity.RealtimeMonitor;

public interface RealtimeMonitorService {
	List<RealtimeMonitor> getByPsId(Integer psId);

	List<RealtimeMonitor> getAll();

}
