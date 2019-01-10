package com.tinz.ys.entity;

import java.io.Serializable;
import java.util.Date;

public class RealtimeMonitor implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer psId;
	private String psName;
	private String port;
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	private Date time;
	private String onlineState;
	private String electricState;
	private Float instant;
	private Float cod;
	private Float ph;
	private Float dianDaoLv;
	public Float getDianDaoLv() {
		return dianDaoLv;
	}
	public void setDianDaoLv(Float dianDaoLv) {
		this.dianDaoLv = dianDaoLv;
	}
	private Integer bottle;
	private String sjcValveState;
	private String pskValveState;
	private String bumpState;
	private String levelState;
	private String entranceState;
	private String psState;
	public Integer getPsId() {
		return psId;
	}
	public void setPsId(Integer psId) {
		this.psId = psId;
	}
	public String getPsName() {
		return psName;
	}
	public void setPsName(String psName) {
		this.psName = psName;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getOnlineState() {
		return onlineState;
	}
	public void setOnlineState(String onlineState) {
		this.onlineState = onlineState;
	}
	public String getElectricState() {
		return electricState;
	}
	public void setElectricState(String electricState) {
		this.electricState = electricState;
	}
	public Float getInstant() {
		return instant;
	}
	public void setInstant(Float instant) {
		this.instant = instant;
	}
	public Float getCod() {
		return cod;
	}
	public void setCod(Float cod) {
		this.cod = cod;
	}
	public Float getPh() {
		return ph;
	}
	public void setPh(Float ph) {
		this.ph = ph;
	}
	public Integer getBottle() {
		return bottle;
	}
	public void setBottle(Integer bottle) {
		this.bottle = bottle;
	}
	public String getSjcValveState() {
		return sjcValveState;
	}
	public void setSjcValveState(String sjcValveState) {
		this.sjcValveState = sjcValveState;
	}
	public String getPskValveState() {
		return pskValveState;
	}
	public void setPskValveState(String pskValveState) {
		this.pskValveState = pskValveState;
	}
	public String getBumpState() {
		return bumpState;
	}
	public void setBumpState(String bumpState) {
		this.bumpState = bumpState;
	}
	public String getLevelState() {
		return levelState;
	}
	public void setLevelState(String levelState) {
		this.levelState = levelState;
	}
	public String getEntranceState() {
		return entranceState;
	}
	public void setEntranceState(String entranceState) {
		this.entranceState = entranceState;
	}
	public String getPsState() {
		return psState;
	}
	public void setPsState(String psState) {
		this.psState = psState;
	}
	@Override
	public String toString() {
		return "RealtimeMonitor [psId=" + psId + ", psName=" + psName + ", port=" + port + ", time=" + time
				+ ", onlineState=" + onlineState + ", electricState=" + electricState + ", instant=" + instant
				+ ", cod=" + cod + ", ph=" + ph + ", dianDaoLv=" + dianDaoLv + ", bottle=" + bottle + ", sjcValveState="
				+ sjcValveState + ", pskValveState=" + pskValveState + ", bumpState=" + bumpState + ", levelState="
				+ levelState + ", entranceState=" + entranceState + ", psState=" + psState + "]";
	}
	
}
