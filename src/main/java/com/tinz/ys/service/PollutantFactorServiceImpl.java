package com.tinz.ys.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ys.dao.PollutantFactorDao;
import com.tinz.ys.entity.PollutantFactor;

@Service
public class PollutantFactorServiceImpl implements PollutantFactorService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private PollutantFactorDao PollutantFactorDao;
	@Override
	public PollutantFactor getByName(String name) {
		logger.info("PollutantFactor getByName");
		return PollutantFactorDao.getByName(name);
	}

	@Override
	public List<PollutantFactor> getAll(){
		logger.info("PollutantFactor getAll");
		return PollutantFactorDao.getAll();
	}
}
