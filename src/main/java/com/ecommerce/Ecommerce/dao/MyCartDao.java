package com.ecommerce.Ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Ecommerce.models.MyCart;

/**
 * @author Shiva
 * Date : 06 May 2022
 */
@Repository
public interface MyCartDao extends JpaRepository<MyCart, Long> {

}
