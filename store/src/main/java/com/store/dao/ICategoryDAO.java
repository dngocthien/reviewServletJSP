package com.store.dao;

import java.util.List;

import com.store.model.CategoryModel;

public interface ICategoryDAO {
	List<CategoryModel> findAll();
	CategoryModel findByID(long id);
}
