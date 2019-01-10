package com.tinz.ys.service;

import java.util.List;

import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.ValveCtrl;
import com.tinz.ys.entity.ValveCtrlForm;

public interface ValveCtrlService {

	List<ValveCtrl> getAll(ValveCtrl v,PageFilter pf);
	List<ValveCtrl> getAll(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order);
	Integer count(ValveCtrl v);
	void controlValve(ValveCtrlForm vf);
}
