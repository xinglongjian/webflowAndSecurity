package com.xinglongjian.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.xinglongjian.domain.Book;


public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findAll();
	
	Book findOne(Long primaryKey);

}
