package com.xinglongjian.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

import com.xinglongjian.domain.Account;
import com.xinglongjian.domain.Book;
import com.xinglongjian.domain.Category;
import com.xinglongjian.domain.OrderForm;
import com.xinglongjian.domain.OrderFormTwo;

@Controller
public class OrderTwoController {
	
	public OrderFormTwo initializeForm()
	{
		OrderFormTwo of=new OrderFormTwo();
		of.setQuantity(1);
		of.setOrderDate(new Date());
		
		return of;
	}
	public List<Category> initializeSelectableCategories() { 
	    List<Category> lists=new ArrayList<Category>();
	    Category cate1=new Category();
	    cate1.setId(10000l);
	    cate1.setName("\u79d1\u5b66\u6280\u672f");
	    Category cate2=new Category();
	    cate2.setId(10000l);
	    cate2.setName("\u5386\u53f2");
	    Category cate3=new Category();
	    cate3.setId(10000l);
	    cate3.setName("\u6587\u5b66");
	    Category cate4=new Category();
	    cate4.setId(10000l);
	    cate4.setName("\u827a\u672f");
	    lists.add(cate1);
	    lists.add(cate2);
	    lists.add(cate3);
	    lists.add(cate4);
	    return lists; 
	} 
	public Map<Long, String> initializeSelectableBooks(OrderFormTwo orderForm) { 
	    orderForm.getSelectBookes().clear();
	    orderForm.getSelectBookes(); 
	 
	    Map<Long, String> selectableBooks = new HashMap<Long, String>(); 
//	    for (Book book : bookstoreService.findBooksByCategory(categoryService.findById 
//	(orderForm.getCategoryId()))) { 
//	        selectableBooks.put(book.getId(), book.getTitle()); 
//	    } 
	    selectableBooks.put(20000l, "\u4e00\u5343\u96f6\u4e00\u591c");
	    selectableBooks.put(20001l, "\u5341\u4e07\u4e2a\u4e3a\u4ec0\u4e48");
	    selectableBooks.put(20002l, "\u611a\u516c\u79fb\u5c71");
	    selectableBooks.put(20003l, "\u534a\u591c\u5077\u9e21");
	    return selectableBooks; 
	} 
	
	public void addBooks(OrderFormTwo orderForm) {
		 Book book = new Book();
		 book.setId(orderForm.getBookId());
		 if (orderForm.getSelectBookes().containsKey(book)) {
		 orderForm.getSelectBookes().put(book,orderForm.getSelectBookes().get(book) + orderForm.getQuantity());
		 } else {
		 orderForm.getSelectBookes().put(book,orderForm.getQuantity());
		 }
    }
	
	public void placeOrder(final OrderFormTwo orderForm)
	{
		System.out.println("save this order");
	}
}
