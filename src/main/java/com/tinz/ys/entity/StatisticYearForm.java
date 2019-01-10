package com.tinz.ys.entity;

import java.io.Serializable;

public class StatisticYearForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer psId;
	private String startYear;
	private String endYear;
	public Integer getPsId() {
		return psId;
	}
	public void setPsId(Integer psId) {
		this.psId = psId;
	}
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getEndYear() {
		return endYear;
	}
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	@Override
	public String toString() {
		return "StatisticYearForm [psId=" + psId + ", startYear=" + startYear + ", endYear=" + endYear + "]";
	}
	
}
