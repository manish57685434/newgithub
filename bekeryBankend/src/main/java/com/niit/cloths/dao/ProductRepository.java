package com.niit.bekery.dao;

import java.util.List;

import com.niit.bekery.model.Product;

public interface ProductRepository {
	
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int productId);
	public List<Product> getAllProduct();
	public Product getProductById(int productId);

}
