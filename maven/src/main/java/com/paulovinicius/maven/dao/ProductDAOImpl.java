package com.paulovinicius.maven.dao;

import java.util.HashMap;
import java.util.Map;

import com.paulovinicius.maven.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	private Map <Integer, Product> products = new HashMap<>();

	@Override
	public void create(Product product) {
		products.put(product.getId(), product);

	}

	@Override
	public Product retrieve(int id) {
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		products.replace(product.getId(), product);

	}

	@Override
	public void delete(int id) {
		products.remove(id);
	}

}
