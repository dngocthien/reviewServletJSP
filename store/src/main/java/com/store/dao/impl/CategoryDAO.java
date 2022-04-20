package com.store.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.store.dao.ICategoryDAO;
import com.store.model.CategoryModel;

public class CategoryDAO implements ICategoryDAO {

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jspservletjdbc";
			String userName = "root";
			String password = "18081997";
			return DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}

	@Override
	public List<CategoryModel> findAll() {
		List<CategoryModel> results = new ArrayList<CategoryModel>();
		String sql = "SELECT * FROM category";

		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		if (connection != null) {
			try {
				statement = connection.prepareStatement(sql);
				resultSet = statement.executeQuery();
				while (resultSet.next()) {
					CategoryModel category = new CategoryModel();
					category.setId(resultSet.getLong("id"));
					category.setCode(resultSet.getString("code"));
				}

				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (resultSet != null) {
						resultSet.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		return results;
	}

	@Override
	public CategoryModel findByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
