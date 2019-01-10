package com.tinz.ys.service;

import java.util.List;

import com.tinz.ys.entity.PollutantFactor;

public interface PollutantFactorService {
	PollutantFactor getByName(String name);

	List<PollutantFactor> getAll();

}
