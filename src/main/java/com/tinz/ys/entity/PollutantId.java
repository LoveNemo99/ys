package com.tinz.ys.entity;

import java.io.Serializable;

public class PollutantId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer w00000Id;//雨水
	private Integer w01018Id;//COD
	private Integer w21003Id;//氨氮
	private Integer w01001Id;//PH
	private Integer w01014Id;//电导率
	public Integer getW00000Id() {
		return w00000Id;
	}
	public void setW00000Id(Integer w00000Id) {
		this.w00000Id = w00000Id;
	}
	public Integer getW01018Id() {
		return w01018Id;
	}
	public void setW01018Id(Integer w01018Id) {
		this.w01018Id = w01018Id;
	}
	public Integer getW21003Id() {
		return w21003Id;
	}
	public void setW21003Id(Integer w21003Id) {
		this.w21003Id = w21003Id;
	}
	public Integer getW01001Id() {
		return w01001Id;
	}
	public void setW01001Id(Integer w01001Id) {
		this.w01001Id = w01001Id;
	}
	public Integer getW01014Id() {
		return w01014Id;
	}
	public void setW01014Id(Integer w01014Id) {
		this.w01014Id = w01014Id;
	}
	@Override
	public String toString() {
		return "PollutantId [w00000Id=" + w00000Id + ", w01018Id=" + w01018Id + ", w21003Id=" + w21003Id + ", w01001Id="
				+ w01001Id + ", w01014Id=" + w01014Id + "]";
	}
	
}
