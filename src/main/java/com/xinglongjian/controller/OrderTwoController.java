package com.xinglongjian.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xinglongjian.domain.Book;
import com.xinglongjian.domain.Category;
import com.xinglongjian.domain.OrderFormTwo;
import com.xinglongjian.repository.BookRepository;
import com.xinglongjian.repository.CategoryRepository;

@Controller
public class OrderTwoController {
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private BookRepository bookRepository;
	 
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
	public List<Book> initializeSelectableBooks(OrderFormTwo orderForm) { 
	    orderForm.getSelectBookes().clear();
	    orderForm.getSelectBookes(); 
	 
	    List<Book> selectableBooks = new ArrayList<Book>();
	    Book book1=new Book();
	    book1.setId(20000l);
	    book1.setTitle("\u4e00\u5343\u96f6\u4e00\u591c");
	    Book book2=new Book();
	    book2.setId(20001l);
	    book2.setTitle("\u5341\u4e07\u4e2a\u4e3a\u4ec0\u4e48");
	    Book book3=new Book();
	    book3.setId(20002l);
	    book3.setTitle("\u611a\u516c\u79fb\u5c71");
	    Book book4=new Book();
	    book4.setId(20003l);
	    book4.setTitle("\u534a\u591c\u5077\u9e21");
	    
	    selectableBooks.add(book1);
	    selectableBooks.add(book2);
	    selectableBooks.add(book3);
	    selectableBooks.add(book4);
	    return selectableBooks; 
	} 
	
	public void addBooks(OrderFormTwo orderForm) {
		 Book book = new Book();
//		 book.setId(orderForm.getBookId());
//		 if (orderForm.getSelectBookes().containsKey(book)) {
//		 orderForm.getSelectBookes().put(book,orderForm.getSelectBookes().get(book) + orderForm.getQuantity());
//		 } else {
//		 orderForm.getSelectBookes().put(book,orderForm.getQuantity());
//		 }
    }
	
	public void placeOrder(final OrderFormTwo orderForm)
	{
		System.out.println("save this order");
	}
}
