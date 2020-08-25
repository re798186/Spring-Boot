package com.reethu.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reethu.demo.Model.Product;

public interface ProductJpaRepo extends JpaRepository<Product, Integer> {

}
