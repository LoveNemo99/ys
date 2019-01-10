package com.tinz.ys.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ys.dao.SampleCtrlDao;
import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.SampleCtrl;
import com.tinz.ys.entity.SampleCtrlForm;

@Service
public class SampleCtrlServiceImpl implements SampleCtrlService {
	public static final Integer PAGE_START_NUM = 1;
	public static final Integer PAGE_NUM = 1;
	public static final Integer ROW_NUM = 10;
	public static final Integer ROW_MAX_NUM = 100;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SampleCtrlDao SampleCtrlDao;
	

	@Override
	public List<SampleCtrl> getAll(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order){
		logger.info("SampleCtrl getAll");
		return SampleCtrlDao.queryRecord(psId,portId,offset,limit,sort,order);
	}
	
	public List<SampleCtrl> getPageData(Integer psId,Integer portId,Integer page,Integer rows,String sort,String order){
		logger.info("SampleCtrl getPageData");
		if(page==null||page<PAGE_START_NUM)
			page = PAGE_START_NUM;
		if(rows==null)
			rows = ROW_NUM;
		if(rows>ROW_MAX_NUM)
			rows = ROW_MAX_NUM;
		System.out.println("page:"+page+"rows:"+rows);
		return SampleCtrlDao.queryRecord(psId,portId,(page-1)*rows,rows,sort,order);
	}

	@Override
	public List<SampleCtrl> getAll(SampleCtrl v, PageFilter pf) {
		//logger.info("SampleCtrl getAll");
		if(v==null)
			v = new SampleCtrl();
		if(pf==null)
			pf = new PageFilter();
		return this.getPageData(v.getPsId(),v.getPortId(),pf.getPage(),pf.getRows(),pf.getSort(),pf.getOrder());
	}

	@Override
	public Integer count(SampleCtrl v) {
		if(v==null)
			v = new SampleCtrl();
		return SampleCtrlDao.queryCount(v.getPsId(), v.getPortId());
	}
	
	@Override
	public void controlSample(SampleCtrlForm vf) {
		SampleCtrl v = new SampleCtrl();
		BeanUtils.copyProperties(vf, v);
		Date time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		v.setMethodId(801);//采样方式
		v.setResultId(601);//执行结果标志ID--601：未执行
		v.setOperationTime(time);
		v.setSampleTime(time);
		v.setQn(sdf.format(time));
		v.setSynchronize(true);
		SampleCtrlDao.control(v);
	}
}
