package com.asimbron.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.asimbron.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long> {
	
	

}
