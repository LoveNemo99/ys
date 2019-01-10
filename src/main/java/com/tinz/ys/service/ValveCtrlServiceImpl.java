package com.tinz.ys.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ys.dao.ValveCtrlDao;
import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.ValveCtrl;
import com.tinz.ys.entity.ValveCtrlForm;

@Service
public class ValveCtrlServiceImpl implements ValveCtrlService {
	public static final Integer PAGE_START_NUM = 1;
	public static final Integer PAGE_NUM = 1;
	public static final Integer ROW_NUM = 10;
	public static final Integer ROW_MAX_NUM = 100;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ValveCtrlDao valveCtrlDao;
	

	@Override
	public List<ValveCtrl> getAll(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order){
		logger.info("ValveCtrl getAll");
		return valveCtrlDao.queryRecord(psId,portId,offset,limit,sort,order);
	}
	
	public List<ValveCtrl> getPageData(Integer psId,Integer portId,Integer page,Integer rows,String sort,String order){
		logger.info("ValveCtrl getPageData");
		if(page==null||page<PAGE_START_NUM)
			page = PAGE_START_NUM;
		if(rows==null)
			rows = ROW_NUM;
		if(rows>ROW_MAX_NUM)
			rows = ROW_MAX_NUM;
		System.out.println("page:"+page+"rows:"+rows);
		return valveCtrlDao.queryRecord(psId,portId,(page-1)*rows,rows,sort,order);
	}

	@Override
	public List<ValveCtrl> getAll(ValveCtrl v, PageFilter pf) {
		//logger.info("ValveCtrl getAll");
		if(v==null)
			v = new ValveCtrl();
		if(pf==null)
			pf = new PageFilter();
		return this.getPageData(v.getPsId(),v.getPortId(),pf.getPage(),pf.getRows(),pf.getSort(),pf.getOrder());
	}

	@Override
	public Integer count(ValveCtrl v) {
		if(v==null)
			v = new ValveCtrl();
		return valveCtrlDao.queryCount(v.getPsId(), v.getPortId());
	}
	
	@Override
	public void controlValve(ValveCtrlForm vf) {
		ValveCtrl v = new ValveCtrl();
		BeanUtils.copyProperties(vf, v);
		Date time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		v.setExecuteId(501);//阀门执行事项ID--501：远程阀门控制
		v.setMethodId(1001);//控制方式ID--1001：手动
		v.setResultId(601);//执行结果标志ID--601：未执行
		v.setTime(time);
		v.setQn(sdf.format(time));
		v.setSynchronize(true);
		valveCtrlDao.control(v);
	}
}
