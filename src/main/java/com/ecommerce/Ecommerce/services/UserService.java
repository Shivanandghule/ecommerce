package com.ecommerce.Ecommerce.services;
/**
 * @author Shiva
 * Date : 06 May 2022
 */

import java.util.List;

import com.ecommerce.Ecommerce.models.User;

public interface UserService {
	public User add(User user);
	
	public List<User> getUser();
	
	public User getUserByID(Long id);
	
	public User updateUser(User user);

	public User DeleteById(Long id);
	
}
