package com.xinglongjian.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;

import com.xinglongjian.domain.Book;
import com.xinglongjian.domain.OrderForm;

@Controller
public class OrderController {
	
	SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
	public OrderForm initializeForm()
	{
		OrderForm of=new OrderForm();
		of.setQuantity(1);
		of.setOrderDate(format.format(new Date()));
		
		return of;
	}
	public Map<Long, String> initializeSelectableCategories() { 
	    Map<Long, String> selectableCategories = new HashMap<Long, String>(); 
//	    for (Category category : categoryService.findAll()) { 
//	        selectableCategories.put(category.getId(), category.getName()); 
//	    } 
	    selectableCategories.put(10000l, "\u79d1\u5b66\u6280\u672f");
	    selectableCategories.put(10001l, "\u5386\u53f2");
	    selectableCategories.put(10002l, "\u6587\u5b66");
	    selectableCategories.put(10003l, "\u827a\u672f");
	    return selectableCategories; 
	} 
	public Map<Long, String> initializeSelectableBooks(OrderForm orderForm) { 
	    orderForm.getSelectBookes().clear();
	    orderForm.getSelectBookes(); 
	 
	    Map<Long, String> selectableBooks = new HashMap<Long, String>(); 
//	    for (Book book : bookstoreService.findBooksByCategory(categoryService.findById 
//	(orderForm.getCategoryId()))) { 
//	        selectableBooks.put(book.getId(), book.getTitle()); 
//	    } 
	    selectableBooks.put(20000l, "\u4e00\u5343\u96f6\u4e00\u591c");
	    selectableBooks.put(20001l, "\u5341\u4e07\u4e2a\u4e3a\u4ec0\u4e48");
	    selectableBooks.put(20002l, "\u611a\u516c\u79fb\u5c71");
	    selectableBooks.put(20003l, "\u534a\u591c\u5077\u9e21");
	    return selectableBooks; 
	} 
	
	public void addBooks(OrderForm orderForm) {
		 Book book = new Book();
		 book.setId(orderForm.getBookId());
		 if (orderForm.getSelectBookes().containsKey(book)) {
		 orderForm.getSelectBookes().put(book,orderForm.getSelectBookes().get(book) + orderForm.getQuantity());
		 } else {
		 orderForm.getSelectBookes().put(book,orderForm.getQuantity());
		 }
    }
	
	public void placeOrder(final OrderForm orderForm)
	{
		System.out.println("save this order");
	}
}
