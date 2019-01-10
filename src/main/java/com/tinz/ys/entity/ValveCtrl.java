package com.tinz.ys.entity;

import java.io.Serializable;
import java.util.Date;

public class ValveCtrl implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer psId;
	private Integer portId;
	private String psName;
	private String portName;
	private String valveName;
	private Date time;
	private String state;//阀门状态
	private Integer executeId;
	private String valveExecute;//阀门执行事项
	private Integer resultId;
	private String result;//执行结果标志
	private String reason;//控制原因
	private Integer methodId;
	private String method;//控制方式
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
	public String getValveName() {
		return valveName;
	}
	public void setValveName(String valveName) {
		this.valveName = valveName;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getExecuteId() {
		return executeId;
	}
	public void setExecuteId(Integer executeId) {
		this.executeId = executeId;
	}

	public String getValveExecute() {
		return valveExecute;
	}
	public void setValveExecute(String valveExecute) {
		this.valveExecute = valveExecute;
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
		return "ValveCtrl [id=" + id + ", psId=" + psId + ", portId=" + portId + ", psName=" + psName + ", portName="
				+ portName + ", valveName=" + valveName + ", time=" + time + ", state=" + state + ", executeId="
				+ executeId + ", valveExecute=" + valveExecute + ", resultId=" + resultId + ", result=" + result
				+ ", reason=" + reason + ", methodId=" + methodId + ", method=" + method + ", qn=" + qn
				+ ", synchronize=" + synchronize + "]";
	}
	
}
