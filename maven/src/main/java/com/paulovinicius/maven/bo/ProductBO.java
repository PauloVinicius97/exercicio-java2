package com.paulovinicius.maven.bo;

import com.paulovinicius.maven.dto.Product;

public interface ProductBO {
	public void create(Product product);
	
	public Product find(int id);
}
