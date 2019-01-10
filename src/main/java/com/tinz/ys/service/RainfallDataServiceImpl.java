package com.tinz.ys.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ys.dao.RainfallDataDao;
import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.PollutantId;
import com.tinz.ys.entity.RainfallData;
import com.tinz.ys.entity.RainfallDataForm;

@Service
public class RainfallDataServiceImpl implements RainfallDataService {
	public static final Integer PAGE_START_NUM = 1;
	public static final Integer PAGE_NUM = 1;
	public static final Integer ROW_NUM = 10;
	public static final Integer ROW_MAX_NUM = 100;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RainfallDataDao rainfallDataDao;
	
	@Override
	public List<RainfallData> report(RainfallDataForm v, PageFilter pf) {
		PollutantId factors = rainfallDataDao.queryPollutant();
		logger.info("RainfallData");
		if(v==null)
			v = new RainfallDataForm();
		List<RainfallData> data= rainfallDataDao.queryReport(v.getPsId(), v.getNum(), factors);
		return data;
	}

//	@Override
//	public Integer count(ValveCtrl v) {
//		if(v==null)
//			v = new ValveCtrl();
//		return valveCtrlDao.queryCount(v.getPsId(), v.getPortId());
//	}
}
