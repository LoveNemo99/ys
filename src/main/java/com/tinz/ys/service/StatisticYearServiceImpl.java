package com.tinz.ys.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ys.dao.StatisticYearDao;
import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.StatisticYear;
import com.tinz.ys.entity.StatisticYearForm;

@Service
public class StatisticYearServiceImpl implements StatisticYearService {
	public static final Integer PAGE_START_NUM = 1;
	public static final Integer PAGE_NUM = 1;
	public static final Integer ROW_NUM = 10;
	public static final Integer ROW_MAX_NUM = 100;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private StatisticYearDao StatisticYearDao;
	

	@Override
	public List<StatisticYear> getAll(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order){
		logger.info("StatisticYear getAll");
		return StatisticYearDao.queryRecord(psId,portId,offset,limit,sort,order);
	}
	
	public List<StatisticYear> getPageData(Integer psId,Integer portId,Integer page,Integer rows,String sort,String order){
		logger.info("StatisticYear getPageData");
		if(page==null||page<PAGE_START_NUM)
			page = PAGE_START_NUM;
		if(rows==null)
			rows = ROW_NUM;
		if(rows>ROW_MAX_NUM)
			rows = ROW_MAX_NUM;
		System.out.println("page:"+page+"rows:"+rows);
		return StatisticYearDao.queryRecord(psId,portId,(page-1)*rows,rows,sort,order);
	}

	@Override
	public List<StatisticYear> getAll(StatisticYear v, PageFilter pf) {
		//logger.info("StatisticYear getAll");
		if(v==null)
			v = new StatisticYear();
		if(pf==null)
			pf = new PageFilter();
		return this.getPageData(v.getPsId(),v.getPortId(),pf.getPage(),pf.getRows(),pf.getSort(),pf.getOrder());
	}

	@Override
	public Integer count(StatisticYear v) {
		if(v==null)
			v = new StatisticYear();
		return StatisticYearDao.queryCount(v.getPsId(), v.getPortId());
	}
	//########################################################################
	@Override
	public Integer countByYear(StatisticYearForm v) {
		if(v==null)
			v = new StatisticYearForm();
		return StatisticYearDao.queryCountByYear(v.getPsId(), v.getStartYear(),v.getEndYear());
	}
	
	public List<StatisticYear> getAll(Integer psId,String startYear,String endYear,Integer offset,Integer limit,String sort,String order){
		logger.info("StatisticYear getAll");
		return StatisticYearDao.queryRecordByYear(psId,startYear,endYear,offset,limit,sort,order);
	}
	
	public List<StatisticYear> getPageDataByYear(Integer psId,String startYear,String endYear,Integer page,Integer rows,String sort,String order){
		logger.info("StatisticYear getPageData");
		if(page==null||page<PAGE_START_NUM)
			page = PAGE_START_NUM;
		if(rows==null)
			rows = ROW_NUM;
		if(rows>ROW_MAX_NUM)
			rows = ROW_MAX_NUM;
		System.out.println("page:"+page+"rows:"+rows);
		return StatisticYearDao.queryRecordByYear(psId,startYear,endYear,(page-1)*rows,rows,sort,order);
	}

	@Override
	public List<StatisticYear> getAll(StatisticYearForm v, PageFilter pf) {
		//logger.info("StatisticYear getAll");
		if(v==null)
			v = new StatisticYearForm();
		if(pf==null)
			pf = new PageFilter();
		return this.getPageDataByYear(v.getPsId(),v.getStartYear(),v.getEndYear(),pf.getPage(),pf.getRows(),pf.getSort(),pf.getOrder());
	}
}
