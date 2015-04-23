package com.xinglongjian.domain;

import java.util.Date;
import java.util.List;

public class OrderForm {
	private int count=0;
	private Date orderDate;
	private long selectCategory;
	private List<String> selectBookes;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public List<String> getSelectBookes() {
		return selectBookes;
	}
	public void setSelectBookes(List<String> selectBookes) {
		this.selectBookes = selectBookes;
	}
	public long getSelectCategory() {
		return selectCategory;
	}
	public void setSelectCategory(long selectCategory) {
		this.selectCategory = selectCategory;
	}
	

}
