package com.tinz.ys.entity;

import java.io.Serializable;

public class Enterprise implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	private String name;
	private String district;
	private Integer collectTime;//初期雨水收集时间（分）
	private String registerType;//注册类型
	private String industryType;//行业分类
	private String address;
	private Float longitude;//经度
	private Float latitude;//纬度
	private String manInCharge;//环保负责人
	private String state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getCollectTime() {
		return collectTime;
	}
	public void setCollectTime(Integer collectTime) {
		this.collectTime = collectTime;
	}
	public String getRegisterType() {
		return registerType;
	}
	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public String getManInCharge() {
		return manInCharge;
	}
	public void setManInCharge(String manInCharge) {
		this.manInCharge = manInCharge;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Enterprise [id=" + id + ", code=" + code + ", name=" + name + ", district=" + district
				+ ", collectTime=" + collectTime + ", registerType=" + registerType + ", industryType=" + industryType
				+ ", address=" + address + ", longitude=" + longitude + ", latitude=" + latitude + ", manInCharge="
				+ manInCharge + ", state=" + state + "]";
	}

}
