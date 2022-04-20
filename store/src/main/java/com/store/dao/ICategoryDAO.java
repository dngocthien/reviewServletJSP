package com.store.dao;

import java.util.List;

import com.store.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
	CategoryModel findByID(long id);
	CategoryModel findByCode(String code);
}
