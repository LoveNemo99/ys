package com.tinz.ys.entity;

import java.io.Serializable;
import java.util.Date;

public class RainfallRecord implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date startTime;
	private Date endTime;
	private Integer num;
	private Boolean handle;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Boolean getHandle() {
		return handle;
	}
	public void setHandle(Boolean handle) {
		this.handle = handle;
	}
	@Override
	public String toString() {
		return "RainfallRecord [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", num=" + num
				+ ", handle=" + handle + "]";
	}
	
}
