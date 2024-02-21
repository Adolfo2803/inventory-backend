package com.asimbron.inventory.response;

import java.util.List;

import com.asimbron.inventory.model.Category;

import lombok.Data;
@Data
public class CategoryResponse {
	
	private List<Category> category;

}
