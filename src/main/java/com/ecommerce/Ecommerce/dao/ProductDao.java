package com.ecommerce.Ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Ecommerce.models.Product;

/**
 * @author Shiva
 * Date : 06 May 2022
 */
@Repository
public interface ProductDao extends JpaRepository<Product, Long>{

}
