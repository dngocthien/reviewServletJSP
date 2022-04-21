package com.store.dao.impl;

import java.util.List;

import com.store.dao.IProductDAO;
import com.store.mapper.ProductMapper;
import com.store.model.ProductModel;

public class ProductDAO extends AbstractDAO<ProductModel> implements IProductDAO{

	@Override
	public List<ProductModel> findAll() {
		String sql = "SELECT * FROM product";
		return query(sql, new ProductMapper());
	}

	@Override
	public ProductModel findByID(long id) {
		String sql = "SELECT * FROM product WHERE ID = ?";
		List<ProductModel> models = query(sql, new ProductMapper(), id);
		return models.isEmpty() ? null : models.get(0);
	}

	@Override
	public Long save(ProductModel model) {
		String sql = "INSERT INTO product (name, brand, price) VALUES (?,?,?)";
		return insert(sql, model.getName(), model.getBrand(), model.getPrice());
	}

}
