package com.tinz.ys.entity;

import java.io.Serializable;

public class SampleCtrlForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer psId;
	private Integer portId;
	private String deviceType;
	private String password;
	public Integer getPsId() {
		return psId;
	}
	public void setPsId(Integer psId) {
		this.psId = psId;
	}
	public Integer getPortId() {
		return portId;
	}
	public void setPortId(Integer portId) {
		this.portId = portId;
	}

	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SampleCtrlForm [psId=" + psId + ", portId=" + portId + ", deviceType=" + deviceType + ", password="
				+ password + "]";
	}

}
