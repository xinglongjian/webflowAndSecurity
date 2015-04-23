package com.xinglongjian.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;

import com.xinglongjian.domain.OrderForm;

@Controller
public class OrderController {
	
	public OrderForm initializeForm()
	{
		OrderForm of=new OrderForm();
		of.setCount(1);
		of.setOrderDate(new Date());
		
		return of;
	}
	public Map<Long, String> initializeSelectableCategories() { 
	    Map<Long, String> selectableCategories = new HashMap<Long, String>(); 
//	    for (Category category : categoryService.findAll()) { 
//	        selectableCategories.put(category.getId(), category.getName()); 
//	    } 
	    selectableCategories.put(10000l, "科学技术");
	    selectableCategories.put(10001l, "历史");
	    selectableCategories.put(10002l, "文学");
	    selectableCategories.put(10003l, "艺术");
	    return selectableCategories; 
	} 
	public Map<Long, String> initializeSelectableBooks(OrderForm orderForm) { 
	    orderForm.getSelectBookes().clear();
	    orderForm.getSelectBookes(); 
	 
	    Map<Long, String> selectableBooks = new HashMap<Long, String>(); 
//	    for (Book book : bookstoreService.findBooksByCategory(categoryService.findById 
//	(orderForm.getCategoryId()))) { 
//	        selectableBooks.put(book.getId(), book.getTitle()); 
//	    } 
	    selectableBooks.put(20000l, "一千零一夜");
	    selectableBooks.put(20001l, "十万个为什么");
	    selectableBooks.put(20002l, "愚公移山");
	    selectableBooks.put(20003l, "半夜偷鸡");
	    return selectableBooks; 
	}  
}
