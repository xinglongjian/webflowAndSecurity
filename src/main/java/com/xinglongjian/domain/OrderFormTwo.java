package com.xinglongjian.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

public class OrderFormTwo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int quantity=0;
	@DateTimeFormat(pattern="MM-dd-yyyy")
	private Date orderDate;
	@DateTimeFormat(pattern="MM-dd-yyyy")
	private Date deliveryDate;
	private Category category;
	private Book book;
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
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Map<Book, Integer> getSelectBookes() {
		
		return selectBookes;
	}
	public void setSelectBookes(Map<Book, Integer> selectBookes) {
		this.selectBookes = selectBookes;
	}

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public void resetSelectedBooks()
	{
		selectBookes.clear();
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	
}
