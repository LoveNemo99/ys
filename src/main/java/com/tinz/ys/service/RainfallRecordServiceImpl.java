package com.tinz.ys.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ys.dao.RainfallRecordDao;
import com.tinz.ys.entity.RainfallRecord;
import com.tinz.ys.entity.Tree;

@Service
public class RainfallRecordServiceImpl implements RainfallRecordService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RainfallRecordDao rainfallRecordDao;
	@Override
	public RainfallRecord getById(Integer id) {
		logger.info("RainfallRecord getById");
		return rainfallRecordDao.getById(id);
	}

	@Override
	public List<RainfallRecord> getAll(){
		logger.info("RainfallRecord getAll");
		return rainfallRecordDao.getAll();
	}
	
	@Override
	public List<Tree> getTree(){
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String startDay = sdf.format(now)+"-01-01";
		String endDay = sdf.format(now)+"-12-31";
		return rainfallRecordDao.getTree(startDay, endDay);
	}
	
}
