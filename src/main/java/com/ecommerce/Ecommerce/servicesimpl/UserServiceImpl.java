package com.ecommerce.Ecommerce.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce.dao.UserDao;
import com.ecommerce.Ecommerce.models.User;
import com.ecommerce.Ecommerce.services.UserService;

/**
 * @author Shiva
 * Date : 06 May 2022
 */
@Service
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

	@Override
	public List<User> getUser() {
		return user_dao.findAll();
	}

	@Override
	public User getUserByID(Long id) {
		return user_dao.findById(id).get();
	}

	@Override
	public User updateUser(User user) {
		user_dao.save(user);
		return user;
	}

	@Override
	public User DeleteById(Long id) {
		User user=user_dao.findById(id).get();
		user_dao.delete(user);
		return user;
	}
}
