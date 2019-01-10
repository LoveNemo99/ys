package com.tinz.ys.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ys.dao.EntranceCtrlDao;
import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.EntranceCtrl;
import com.tinz.ys.entity.EntranceCtrlForm;

@Service
public class EntranceCtrlServiceImpl implements EntranceCtrlService {
	public static final Integer PAGE_START_NUM = 1;
	public static final Integer PAGE_NUM = 1;
	public static final Integer ROW_NUM = 10;
	public static final Integer ROW_MAX_NUM = 100;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private EntranceCtrlDao EntranceCtrlDao;
	

	@Override
	public List<EntranceCtrl> getAll(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order){
		logger.info("EntranceCtrl getAll");
		return EntranceCtrlDao.queryRecord(psId,portId,offset,limit,sort,order);
	}
	
	public List<EntranceCtrl> getPageData(Integer psId,Integer portId,Integer page,Integer rows,String sort,String order){
		logger.info("EntranceCtrl getPageData");
		if(page==null||page<PAGE_START_NUM)
			page = PAGE_START_NUM;
		if(rows==null)
			rows = ROW_NUM;
		if(rows>ROW_MAX_NUM)
			rows = ROW_MAX_NUM;
		System.out.println("page:"+page+"rows:"+rows);
		return EntranceCtrlDao.queryRecord(psId,portId,(page-1)*rows,rows,sort,order);
	}

	@Override
	public List<EntranceCtrl> getAll(EntranceCtrl v, PageFilter pf) {
		//logger.info("EntranceCtrl getAll");
		if(v==null)
			v = new EntranceCtrl();
		if(pf==null)
			pf = new PageFilter();
		return this.getPageData(v.getPsId(),v.getPortId(),pf.getPage(),pf.getRows(),pf.getSort(),pf.getOrder());
	}

	@Override
	public Integer count(EntranceCtrl v) {
		if(v==null)
			v = new EntranceCtrl();
		return EntranceCtrlDao.queryCount(v.getPsId(), v.getPortId());
	}
	
	@Override
	public void controlEntrance(EntranceCtrlForm vf) {
		EntranceCtrl v = new EntranceCtrl();
		BeanUtils.copyProperties(vf, v);
		Date time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		v.setMethod("远程控制");
		v.setResult("未执行");
		v.setTime(time);
		v.setQn(sdf.format(time));
		v.setSynchronize(true);
		EntranceCtrlDao.control(v);
	}
}
