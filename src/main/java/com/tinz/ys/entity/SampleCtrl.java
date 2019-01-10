package com.tinz.ys.entity;

import java.io.Serializable;
import java.util.Date;

public class SampleCtrl implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer psId;
	private Integer portId;
	private String psName;
	private String portName;
	private Date operationTime;
	private Date sampleTime;
	private String deviceType;//反控设备类型
	private Integer resultId;
	private String result;//执行结果标志
	private Integer methodId;
	private String method;//采样方式
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
	public Date getOperationTime() {
		return operationTime;
	}
	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public Date getSampleTime() {
		return sampleTime;
	}
	public void setSampleTime(Date sampleTime) {
		this.sampleTime = sampleTime;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public Integer getResultId() {
		return resultId;
	}
	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Integer getMethodId() {
		return methodId;
	}
	public void setMethodId(Integer methodId) {
		this.methodId = methodId;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
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
	@Override
	public String toString() {
		return "SampleCtrl [id=" + id + ", psId=" + psId + ", portId=" + portId + ", psName=" + psName + ", portName="
				+ portName + ", operationTime=" + operationTime + ", sampleTime=" + sampleTime + ", deviceType="
				+ deviceType + ", resultId=" + resultId + ", result=" + result + ", methodId=" + methodId + ", method="
				+ method + ", qn=" + qn + ", synchronize=" + synchronize + "]";
	}
	
}
