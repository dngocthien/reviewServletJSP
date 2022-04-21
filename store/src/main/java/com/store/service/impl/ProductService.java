package com.store.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.store.dao.IProductDAO;
import com.store.model.ProductModel;
import com.store.service.IProductService;

public class ProductService implements IProductService{
	@Inject
	private IProductDAO dao;

	@Override
	public List<ProductModel> findAll() {
		return dao.findAll();
	}

	@Override
	public ProductModel findByID(long id) {
		return dao.findByID(id);
	}

	@Override
	public Long save(ProductModel model) {
		return dao.save(model);
	}
	
}
