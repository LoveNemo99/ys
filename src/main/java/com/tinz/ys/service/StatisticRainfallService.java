package com.tinz.ys.service;

import java.util.List;

import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.StatisticRainfall;
import com.tinz.ys.entity.StatisticRainfallForm;

public interface StatisticRainfallService {

	List<StatisticRainfall> getAll(StatisticRainfall v,PageFilter pf);
	//List<StatisticRainfall> getAll(Integer psId,Integer portId,Integer offset,Integer limit,String sort,String order);
	Integer count(StatisticRainfall v);
	Integer countByNum(StatisticRainfallForm v);
	List<StatisticRainfall> getAllByNum(StatisticRainfallForm v, PageFilter pf);

}
