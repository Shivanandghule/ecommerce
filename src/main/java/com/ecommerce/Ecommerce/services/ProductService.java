package com.ecommerce.Ecommerce.services;

import java.util.List;

import com.ecommerce.Ecommerce.models.Product;

/**
 * @author Shiva
 * Date : 06 May 2022
 */
public interface ProductService {
	
	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public Product deleteProduct(long prod_id);
	
	public List<Product> getProduct();
	
	public Product getProductById(long prod_id);
}
