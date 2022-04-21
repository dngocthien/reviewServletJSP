package com.store.controller.api;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.store.model.ProductModel;
import com.store.service.IProductService;

import utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-product"})
public class ProductAPI extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IProductService service;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		
		ProductModel model = HttpUtil.of(request.getReader()).toModel(ProductModel.class);
		Long id = service.save(model);
		mapper.writeValue(response.getOutputStream(), id);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		response.setContentType("application/json");
		List<ProductModel> models = service.findAll();
		mapper.writeValue(response.getOutputStream(), models);
	}
}
