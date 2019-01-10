package com.tinz.ys.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ys.dao.StatisticRainfallDao;
import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.StatisticRainfall;
import com.tinz.ys.entity.StatisticRainfallForm;

@Service
public class StatisticRainfallServiceImpl implements StatisticRainfallService {
	public static final Integer PAGE_START_NUM = 1;
	public static final Integer PAGE_NUM = 1;
	public static final Integer ROW_NUM = 10;
	public static final Integer ROW_MAX_NUM = 100;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private StatisticRainfallDao StatisticRainfallDao;
	

	//@Override
	public List<StatisticRainfall> getAll(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order){
		logger.info("StatisticRainfall getAll");
		return StatisticRainfallDao.queryRecord(psId,portId,offset,limit,sort,order);
	}
	
	public List<StatisticRainfall> getPageData(Integer psId,Integer portId,Integer page,Integer rows,String sort,String order){
		logger.info("StatisticRainfall getPageData");
		if(page==null||page<PAGE_START_NUM)
			page = PAGE_START_NUM;
		if(rows==null)
			rows = ROW_NUM;
		if(rows>ROW_MAX_NUM)
			rows = ROW_MAX_NUM;
		System.out.println("page:"+page+"rows:"+rows);
		return StatisticRainfallDao.queryRecord(psId,portId,(page-1)*rows,rows,sort,order);
	}

	@Override
	public List<StatisticRainfall> getAll(StatisticRainfall v, PageFilter pf) {
		//logger.info("StatisticRainfall getAll");
		if(v==null)
			v = new StatisticRainfall();
		if(pf==null)
			pf = new PageFilter();
		return this.getPageData(v.getPsId(),v.getPortId(),pf.getPage(),pf.getRows(),pf.getSort(),pf.getOrder());
	}

	@Override
	public Integer count(StatisticRainfall v) {
		if(v==null)
			v = new StatisticRainfall();
		return StatisticRainfallDao.queryCount(v.getPsId(), v.getPortId());
	}
	//###########################################################################
	@Override
	public Integer countByNum(StatisticRainfallForm v) {
		if(v==null)
			v = new StatisticRainfallForm();
		return StatisticRainfallDao.queryCountByNum(v.getPsId(), v.getStartNum(),v.getEndNum());
	}
	public List<StatisticRainfall> getAllByNum(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order){
		logger.info("StatisticRainfall getAll");
		return StatisticRainfallDao.queryRecord(psId,portId,offset,limit,sort,order);
	}
	
	public List<StatisticRainfall> getPageDataByNum(Integer psId,Integer startNum,Integer endNum,Integer page,Integer rows,String sort,String order){
		logger.info("StatisticRainfall getPageData");
		if(page==null||page<PAGE_START_NUM)
			page = PAGE_START_NUM;
		if(rows==null)
			rows = ROW_NUM;
		if(rows>ROW_MAX_NUM)
			rows = ROW_MAX_NUM;
		System.out.println("page:"+page+"rows:"+rows);
		return StatisticRainfallDao.queryRecordByNum(psId,startNum,endNum,(page-1)*rows,rows,sort,order);
	}

	@Override
	public List<StatisticRainfall> getAllByNum(StatisticRainfallForm v, PageFilter pf) {
		//logger.info("StatisticRainfall getAll");
		if(v==null)
			v = new StatisticRainfallForm();
		if(pf==null)
			pf = new PageFilter();
		return this.getPageDataByNum(v.getPsId(),v.getStartNum(),v.getEndNum(),pf.getPage(),pf.getRows(),pf.getSort(),pf.getOrder());
	}
}
