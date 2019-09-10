package com.paulovinicius.maven.dao;

import com.paulovinicius.maven.dto.Product;

public interface ProductDAO {
	void create(Product product);
	Product retrieve (int id);
	void update(Product product);
	void delete (int id);
}
