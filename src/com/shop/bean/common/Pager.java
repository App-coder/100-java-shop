package com.shop.bean.common;

public class Pager {
	private int page;
	private int rows;
	private int total;
	private Object list;
	
	public Pager(int page, int rows, int total, Object list) {
		super();
		this.page = page;
		this.rows = rows;
		this.list = list;
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public Object getList() {
		return list;
	}
	public void setList(Object list) {
		this.list = list;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
