package com.ecommerce.Ecommerce.models;
/**
 * @author Shiva
 * Date : 06 May 2022
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	@Column(name="user_name")
	private String user_name;
	@Column(name="password")
	private String password;
	@Column(name="address")
	private String address;
	@Column(name="mobile_no")
	private long mobile_no;
	
	
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param user_id
	 * @param user_name
	 * @param password
	 * @param address
	 * @param mobile_no
	 */
	public User(String user_name, String password, String address, long mobile_no) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.address = address;
		this.mobile_no = mobile_no;
	}


	/**
	 * @return the user_id
	 */
	public long getUser_id() {
		return user_id;
	}


	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}


	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}


	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the mobile_no
	 */
	public long getMobile_no() {
		return mobile_no;
	}


	/**
	 * @param mobile_no the mobile_no to set
	 */
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", password=" + password + ", address="
				+ address + ", mobile_no=" + mobile_no + "]";
	}
	
}
