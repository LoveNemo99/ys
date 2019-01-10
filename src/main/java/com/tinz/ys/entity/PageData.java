package com.tinz.ys.entity;

public class PageData<T> implements java.io.Serializable{
	private static final long serialVersionUID = 3904881582517555134L;
	private PageFilter ph;
	private T data;
	
	public PageFilter getPh() {
		return ph;
	}
	public void setPh(PageFilter ph) {
		this.ph = ph;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public PageData() {
		super();
	}
	
}
