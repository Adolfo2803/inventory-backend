package com.asimbron.inventory.services;

import org.springframework.http.ResponseEntity;

import com.asimbron.inventory.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();

}
