package com.ecommerce.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Ecommerce.models.Product;
import com.ecommerce.Ecommerce.models.User;
import com.ecommerce.Ecommerce.services.ProductService;
import com.ecommerce.Ecommerce.services.UserService;

/**
 * @author Shiva
 * Date : 06 May 2022
 */
@RestController
public class MyController {
	
	@Autowired
	private ProductService product_service;
	@Autowired
	private UserService user_service;
	
	@GetMapping("/")
	public String home() {
		return "welcome to Ecommerce site";
	}
	
	//User Operations
	
	//adduser
	@PostMapping("/user/add")
	public User addUser(@RequestBody User user) {
		return this.user_service.add(user); 
	}
	
	//view All user
	@GetMapping("/user/viewAll")
	public List<User>  getUser(){
		return this.user_service.getUser();	
	}
	
	//view user by id
	@GetMapping("/user/view")
	public User  getUserById(@RequestParam(name="id") String id){
		return this.user_service.getUserByID(Long.parseLong(id));
	}
	
	//update user
	@PutMapping("/user/update")
	public User updateUser(@RequestBody User user) {
		return this.user_service.updateUser(user);
	}
	
	//delete user
	@DeleteMapping("/user/delete/{id}")
	public User deleteUser(@PathVariable(name="id") String id) {
		return this.user_service.DeleteById(Long.parseLong(id));
	}
	
	//Product operation
	
	//add Product
	@PostMapping("/product/add")
	public Product addProduct(@RequestBody Product product) {
		return this.product_service.addProduct(product);
	}
	
	//update Product
	@PutMapping("/product/update")
	public Product updateProduct(@RequestBody Product product) {
		return this.product_service.updateProduct(product);
	}
	
	//view Product
	@GetMapping("/product/viewAll")
	public List<Product> getAll(){
		return this.product_service.getProduct();
	}
	
	//View product by id
	@GetMapping("/product/view")
	public Product getByProductId(@RequestParam(name="id") String prod_id) {
		return this.product_service.getProductById(Long.parseLong(prod_id));
	}
	
	//delete Product
	@DeleteMapping("/product/delete/{prod_id}")
	public ResponseEntity<?> deleteProduct(@PathVariable String prod_id) {
		try {
		Product product=this.product_service.deleteProduct(Long.parseLong(prod_id));
		return new ResponseEntity<>(product,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
