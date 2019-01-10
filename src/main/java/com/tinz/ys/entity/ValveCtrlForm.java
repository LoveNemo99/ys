package com.tinz.ys.entity;

import java.io.Serializable;

public class ValveCtrlForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer psId;
	private Integer portId;
	private String valveName;
	private String state;//阀门状态
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
	
	public String getValveName() {
		return valveName;
	}
	public void setValveName(String valveName) {
		this.valveName = valveName;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "ValveCtrlForm [psId=" + psId + ", portId=" + portId + ", valveName=" + valveName + ", state=" + state
				+ ", password=" + password + "]";
	}
	
}
