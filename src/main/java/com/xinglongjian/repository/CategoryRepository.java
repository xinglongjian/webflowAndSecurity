package com.xinglongjian.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.xinglongjian.domain.Category;


public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	List<Category> findAll();
	
	Category findOne(Long primaryKey);

}
