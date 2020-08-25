package com.reethu.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.reethu.demo.Model.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {

	List<Product> findByName(String name); //name is a variable in Product
	List<Product> findByIdGreaterThan(int id);
	@Query("from Product where description = ?1 order by id")
	List<Product> findByDescSorted(String name);
}
