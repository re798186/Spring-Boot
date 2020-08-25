package com.reethu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reethu.demo.Model.Product;
import com.reethu.demo.dao.ProductJpaRepo;

@RestController
public class RestJpaController {
	@Autowired
	ProductJpaRepo repo;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		System.out.println("Piano");
		return repo.findAll();
	}
	
	@PostMapping("/product")
	public Product saveProduct(Product product) {
		return repo.save(product);
	}
	@DeleteMapping("/product")
	public void deleteProduct(Product product) {
		repo.delete(product);
	}
	@PutMapping("/putProduct")
	public Product putProduct(Product product) {
		return repo.save(product);
	}
}
