package com.ecommerce.Ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shiva
 * Date : 06 May 2022
 */

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long product_id;
	@Column(name="product_name")
	private String product_name;
	@Column(name="product_desc")
	private String product_desc;
	@Column(name="product_price")
	private double product_price;
	/**
	 * 
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param product_id
	 * @param product_name
	 * @param product_desc
	 * @param product_price
	 */
	public Product(long product_id, String product_name, String product_desc, double product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_desc = product_desc;
		this.product_price = product_price;
	}

	/**
	 * @return the product_id
	 */
	public long getProduct_id() {
		return product_id;
	}
	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}
	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	/**
	 * @return the product_desc
	 */
	public String getProduct_desc() {
		return product_desc;
	}
	/**
	 * @param product_desc the product_desc to set
	 */
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	/**
	 * @return the product_price
	 */
	public double getProduct_price() {
		return product_price;
	}

	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_desc=" + product_desc
				+ ", product_price=" + product_price + "]";
	}
	
}
