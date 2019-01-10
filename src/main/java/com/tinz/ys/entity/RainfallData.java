package com.tinz.ys.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class RainfallData implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private BigInteger id;
	private Integer psId;
	private Integer portId;
	private String psName;
	private String portName;
	private String pollutantType;
	private Date time;
	private Float rtd;
	private BigDecimal cou;
	private Float w00000;
	private Float w01018;
	private Float w21003;
	private Float w01001;
	private Float w01014;
	private Integer num;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
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
	public Float getW00000() {
		return w00000;
	}
	public void setW00000(Float w00000) {
		this.w00000 = w00000;
	}
	public Float getW01018() {
		return w01018;
	}
	public void setW01018(Float w01018) {
		this.w01018 = w01018;
	}
	public Float getW21003() {
		return w21003;
	}
	public void setW21003(Float w21003) {
		this.w21003 = w21003;
	}
	public Float getW01001() {
		return w01001;
	}
	public void setW01001(Float w01001) {
		this.w01001 = w01001;
	}
	public Float getW01014() {
		return w01014;
	}
	public void setW01014(Float w01014) {
		this.w01014 = w01014;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "RainfallData [id=" + id + ", psId=" + psId + ", portId=" + portId + ", psName=" + psName + ", portName="
				+ portName + ", pollutantType=" + pollutantType + ", time=" + time + ", rtd=" + rtd + ", cou=" + cou
				+ ", w00000=" + w00000 + ", w01018=" + w01018 + ", w21003=" + w21003 + ", w01001=" + w01001
				+ ", w01014=" + w01014 + ", num=" + num + "]";
	}
	
}
