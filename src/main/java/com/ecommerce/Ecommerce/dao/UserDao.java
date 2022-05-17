package com.ecommerce.Ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Ecommerce.models.User;

/**
 * @author Shiva
 * Date : 06 May 2022
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
