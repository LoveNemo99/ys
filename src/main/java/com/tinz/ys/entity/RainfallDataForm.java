package com.tinz.ys.entity;

import java.io.Serializable;

public class RainfallDataForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer psId;
	private Integer num;
	public Integer getPsId() {
		return psId;
	}
	public void setPsId(Integer psId) {
		this.psId = psId;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "RainfallDataForm [psId=" + psId + ", num=" + num + "]";
	}
	
}
