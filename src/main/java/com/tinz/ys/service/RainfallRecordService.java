package com.tinz.ys.service;

import java.util.List;

import com.tinz.ys.entity.RainfallRecord;
import com.tinz.ys.entity.Tree;

public interface RainfallRecordService {
	RainfallRecord getById(Integer id);

	List<RainfallRecord> getAll();

	List<Tree> getTree();

}
