package com.tinz.ys.service;

import java.util.List;

import com.tinz.ys.entity.EntranceCtrl;
import com.tinz.ys.entity.EntranceCtrlForm;
import com.tinz.ys.entity.PageFilter;

public interface EntranceCtrlService {

	List<EntranceCtrl> getAll(EntranceCtrl v,PageFilter pf);
	List<EntranceCtrl> getAll(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order);
	Integer count(EntranceCtrl v);
	void controlEntrance(EntranceCtrlForm vf);
}
