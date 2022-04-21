package com.store.service;

import java.util.List;

import com.store.model.ProductModel;

public interface IProductService {
	List<ProductModel> findAll();
	ProductModel findByID(long id);
	Long save(ProductModel model);
}
