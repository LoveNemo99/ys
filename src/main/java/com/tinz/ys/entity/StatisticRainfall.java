package com.tinz.ys.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StatisticRainfall implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private Integer psId;
	private Integer portId;
	private String psName;
	private String portName;
	private String pollutantType;
	private Date startTime;
	private Date endTime;
	private Float rtd;
	private BigDecimal cou;
	private Float cod;
	private Float codCou;
	private Float andan;
	private Float andanCou;
	private Float ph;
	private Integer num;

	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getPollutantType() {
		return pollutantType;
	}
	public void setPollutantType(String pollutantType) {
		this.pollutantType = pollutantType;
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
	public Float getRtd() {
		return rtd;
	}
	public void setRtd(Float rtd) {
		this.rtd = rtd;
	}
	public BigDecimal getCou() {
		return cou;
	}
	public void setCou(BigDecimal cou) {
		this.cou = cou;
	}
	public Float getCod() {
		return cod;
	}
	public void setCod(Float cod) {
		this.cod = cod;
	}
	public Float getCodCou() {
		return codCou;
	}
	public void setCodCou(Float codCou) {
		this.codCou = codCou;
	}
	public Float getAndan() {
		return andan;
	}
	public void setAndan(Float andan) {
		this.andan = andan;
	}
	public Float getAndanCou() {
		return andanCou;
	}
	public void setAndanCou(Float andanCou) {
		this.andanCou = andanCou;
	}
	public Float getPh() {
		return ph;
	}
	public void setPh(Float ph) {
		this.ph = ph;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "StatisticRainfall [id=" + id + ", psId=" + psId + ", portId=" + portId + ", psName=" + psName
				+ ", portName=" + portName + ", pollutantType=" + pollutantType + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", rtd=" + rtd + ", cou=" + cou + ", cod=" + cod + ", codCou=" + codCou
				+ ", andan=" + andan + ", andanCou=" + andanCou + ", ph=" + ph + ", num=" + num + "]";
	}
	
}
