package com.tinz.ys.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class StatisticYear implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private Integer psId;
	private Integer portId;
	private String psName;
	private String portName;
	private String pollutantType;
	private Integer startTime;
	private BigDecimal rainfallPi;
	private Float cod;
	private Float codCou;
	private Float andan;
	private Float andanCou;
	private Float ph;

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

	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public BigDecimal getRainfallPi() {
		return rainfallPi;
	}
	public void setRainfallPi(BigDecimal rainfallPi) {
		this.rainfallPi = rainfallPi;
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
	@Override
	public String toString() {
		return "StatisticYear [id=" + id + ", psId=" + psId + ", portId=" + portId + ", psName=" + psName
				+ ", portName=" + portName + ", pollutantType=" + pollutantType + ", startTime=" + startTime
				+ ", rainfallPi=" + rainfallPi + ", cod=" + cod + ", codCou=" + codCou + ", andan=" + andan
				+ ", andanCou=" + andanCou + ", ph=" + ph + "]";
	}
	
}
