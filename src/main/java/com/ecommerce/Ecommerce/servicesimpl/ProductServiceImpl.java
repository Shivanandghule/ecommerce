package com.ecommerce.Ecommerce.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce.dao.ProductDao;
import com.ecommerce.Ecommerce.models.Product;
import com.ecommerce.Ecommerce.services.ProductService;

/**
 * @author Shiva
 * Date : 06 May 2022
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	@Override
	public Product addProduct(Product product) {
		productDao.save(product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		productDao.save(product);
		return product;
	}

	@Override
	public Product deleteProduct(long prod_id) {
		Product product=productDao.findById(prod_id).get();
		productDao.delete(product);
		return product;
	}

	@Override
	public List<Product> getProduct() {
		return productDao.findAll();
	}

	@Override
	public Product getProductById(long prod_id) {
		Product product=productDao.findById(prod_id).get();
		return product;
	}

}
