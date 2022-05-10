package com.ecommerce.Ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * @author Shiva
 * Date : 09 May 2022
 */

@Entity
@Table(name="mycart")
public class MyCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cid;
	
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToMany(targetEntity=Product.class)
	@JoinColumn(name="product_id")
	private Product product;
	
	@Column(name="quantity")
	private int quantity;

	
	
	/**
	 * 
	 */
	public MyCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param cid
	 * @param user
	 * @param product
	 * @param quantity
	 */
	public MyCart(long cid, User user, Product product, int quantity) {
		super();
		this.cid = cid;
		this.user = user;
		this.product = product;
		this.quantity = quantity;
	}

	/**
	 * @return the cid
	 */
	public long getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(long cid) {
		this.cid = cid;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "MyCart [cid=" + cid + ", user=" + user + ", product=" + product + ", quantity=" + quantity + "]";
	}
	
}
