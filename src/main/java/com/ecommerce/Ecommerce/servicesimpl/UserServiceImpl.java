package com.ecommerce.Ecommerce.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.Ecommerce.dao.UserDao;
import com.ecommerce.Ecommerce.models.User;
import com.ecommerce.Ecommerce.services.UserService;

/**
 * @author Shiva
 * Date : 06 May 2022
 */
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao user_dao;

	@Override
	public User add(User user) {
		User u=null;
		user_dao.save(user);
		u=user;
		return u;
	}

}
