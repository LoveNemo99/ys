package com.tinz.ys.service;

import java.util.List;

import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.StatisticYear;
import com.tinz.ys.entity.StatisticYearForm;

public interface StatisticYearService {

	List<StatisticYear> getAll(StatisticYear v,PageFilter pf);
	List<StatisticYear> getAll(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order);
	Integer count(StatisticYear v);
	
	Integer countByYear(StatisticYearForm v);
	List<StatisticYear> getAll(StatisticYearForm v, PageFilter pf);

}
