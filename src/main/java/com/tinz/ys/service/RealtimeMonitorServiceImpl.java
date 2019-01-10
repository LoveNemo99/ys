package com.tinz.ys.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ys.dao.RealtimeMonitorDao;
import com.tinz.ys.entity.RealtimeMonitor;

@Service
public class RealtimeMonitorServiceImpl implements RealtimeMonitorService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RealtimeMonitorDao mDao;
	@Override
	public List<RealtimeMonitor> getByPsId(Integer psId) {
		logger.info("RealtimeMonitor getByPsId");
		return mDao.getByPsId(psId);
	}

	@Override
	public List<RealtimeMonitor> getAll(){
		logger.info("RealtimeMonitor getAll");
		return mDao.getAll();
	}
	
}
