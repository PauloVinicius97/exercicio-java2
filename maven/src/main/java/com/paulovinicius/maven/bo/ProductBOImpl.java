package com.paulovinicius.maven.bo;

import com.paulovinicius.maven.dto.Product;
import com.paulovinicius.maven.dao.ProductDAOImpl;

public class ProductBOImpl implements ProductBO {
	private ProductDAOImpl dao = new ProductDAOImpl();
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product find(int id) {
		Product product = dao.retrieve(id);
		return product;
	}

}
