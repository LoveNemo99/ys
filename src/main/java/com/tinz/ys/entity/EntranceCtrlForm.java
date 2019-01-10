package com.tinz.ys.entity;

import java.io.Serializable;

public class EntranceCtrlForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer psId;
	private Integer portId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EntranceCtrlForm [psId=" + psId + ", portId=" + portId + ", password=" + password + "]";
	}
	
}
