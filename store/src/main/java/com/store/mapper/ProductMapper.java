package com.store.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.store.model.ProductModel;

public class ProductMapper implements RowMapper<ProductModel>{

	@Override
	public ProductModel mapRow(ResultSet resultSet) {
		ProductModel model = new ProductModel();
		try {
			model.setId(resultSet.getLong("id"));
			model.setName(resultSet.getString("name"));
			model.setBrand(resultSet.getString("name"));
			model.setPrice(resultSet.getInt("price"));
			model.setRemain(resultSet.getBoolean("remain"));
			model.setImage(resultSet.getBlob("image").toString());
			return model;
		} catch (SQLException e) {
			return null;
		}
	}

}
