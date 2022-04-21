package com.store.dao;

import java.util.List;

import com.store.model.ProductModel;

public interface IProductDAO extends GenericDAO<ProductModel>{

	List<ProductModel> findAll();
	ProductModel findByID(long id);
	Long save(ProductModel model);
}
