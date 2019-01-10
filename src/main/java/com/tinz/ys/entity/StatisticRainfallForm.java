package com.tinz.ys.entity;

import java.io.Serializable;

public class StatisticRainfallForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer psId;
	private Integer startNum;
	private Integer endNum;
	public Integer getPsId() {
		return psId;
	}
	public void setPsId(Integer psId) {
		this.psId = psId;
	}
	public Integer getStartNum() {
		return startNum;
	}
	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}
	public Integer getEndNum() {
		return endNum;
	}
	public void setEndNum(Integer endNum) {
		this.endNum = endNum;
	}
	@Override
	public String toString() {
		return "StatisticRainfallForm [psId=" + psId + ", startNum=" + startNum + ", endNum=" + endNum + "]";
	}
	
}
