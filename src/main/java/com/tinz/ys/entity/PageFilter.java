package com.tinz.ys.entity;

public class PageFilter implements java.io.Serializable {
	private static final long serialVersionUID = -6397977728537049666L;
	private Integer page;// 当前页
	private Integer rows;// 每页显示记录数
	private String sort;// 排序字段
	private String order;// asc/desc

	public PageFilter() {
		super();
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}
