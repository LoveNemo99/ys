package com.tinz.ys.service;

import java.util.List;

import com.tinz.ys.entity.PageFilter;
import com.tinz.ys.entity.RainfallData;
import com.tinz.ys.entity.RainfallDataForm;

public interface RainfallDataService {

	List<RainfallData> report(RainfallDataForm v,PageFilter pf);

}
