package com.xinglongjian.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class OrderForm implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int quantity=0;
	private Date orderDate;
	private String deliveryDate;
	private long categoryId;
	private long bookId;
	private Map<Book,Integer> selectBookes=new HashMap<Book, Integer>();
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public Map<Book, Integer> getSelectBookes() {
		
		return selectBookes;
	}
	public void setSelectBookes(Map<Book, Integer> selectBookes) {
		this.selectBookes = selectBookes;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public void resetSelectedBooks()
	{
		selectBookes.clear();
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
}
