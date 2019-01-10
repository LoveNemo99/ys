package com.tinz.ys.service;

import java.util.List;

import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.SampleCtrl;
import com.tinz.ys.entity.SampleCtrlForm;

public interface SampleCtrlService {

	List<SampleCtrl> getAll(SampleCtrl v,PageFilter pf);
	List<SampleCtrl> getAll(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order);
	Integer count(SampleCtrl v);
	void controlSample(SampleCtrlForm vf);
}
