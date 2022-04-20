package com.store.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.store.dao.ICategoryDAO;
import com.store.model.CategoryModel;
import com.store.service.ICategoryService;

public class CategoryService implements ICategoryService{
	
	@Inject
	private ICategoryDAO categoryDAO;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDAO.findAll();
	}

}
