package com.tinz.ys.entity;

public class PollutantFactor {
	private Integer id;
	private String code;
	private String name;
	private String avgUnit;
	private String couUnit;
	private Float upperLimit;
	private Float lowerLimit;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvgUnit() {
		return avgUnit;
	}
	public void setAvgUnit(String avgUnit) {
		this.avgUnit = avgUnit;
	}
	public String getCouUnit() {
		return couUnit;
	}
	public void setCouUnit(String couUnit) {
		this.couUnit = couUnit;
	}
	public Float getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(Float upperLimit) {
		this.upperLimit = upperLimit;
	}
	public Float getLowerLimit() {
		return lowerLimit;
	}
	public void setLowerLimit(Float lowerLimit) {
		this.lowerLimit = lowerLimit;
	}
	@Override
	public String toString() {
		return "PollutantFactor [id=" + id + ", code=" + code + ", name=" + name + ", avgUnit=" + avgUnit + ", couUnit="
				+ couUnit + ", upperLimit=" + upperLimit + ", lowerLimit=" + lowerLimit + "]";
	}

}
