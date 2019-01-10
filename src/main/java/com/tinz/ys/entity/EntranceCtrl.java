package com.tinz.ys.entity;

import java.io.Serializable;
import java.util.Date;

public class EntranceCtrl implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer psId;
	private Integer portId;
	private String psName;
	private String portName;
	private String cardNum;
	private String cardType;
	private String method;
	private Date time;
	private String result;//执行结果
	private String qn;
	private Boolean synchronize;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getQn() {
		return qn;
	}
	public void setQn(String qn) {
		this.qn = qn;
	}
	public Boolean getSynchronize() {
		return synchronize;
	}
	public void setSynchronize(Boolean synchronize) {
		this.synchronize = synchronize;
	}
	public String getPsName() {
		return psName;
	}
	public void setPsName(String psName) {
		this.psName = psName;
	}
	public String getPortName() {
		return portName;
	}
	public void setPortName(String portName) {
		this.portName = portName;
	}
	@Override
	public String toString() {
		return "EntranceCtrl [id=" + id + ", psId=" + psId + ", portId=" + portId + ", psName=" + psName + ", portName="
				+ portName + ", cardNum=" + cardNum + ", cardType=" + cardType + ", method=" + method + ", time=" + time
				+ ", result=" + result + ", qn=" + qn + ", synchronize=" + synchronize + "]";
	}
	
}
