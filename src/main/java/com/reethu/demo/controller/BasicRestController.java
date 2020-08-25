package com.reethu.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reethu.demo.Model.Product;
import com.reethu.demo.dao.ProductJpaRepo;

@Controller
public class BasicRestController {
	
	@Autowired
	ProductJpaRepo repo;
	
	@RequestMapping("/products")
	@ResponseBody
	public List<Product> getProducts() {
		System.out.println("Flute");
		return repo.findAll();
		
	}
	
	@RequestMapping("/products/{id}")
	@ResponseBody
	public Optional<Product> getProduct(@PathVariable("id") int id) {
		return repo.findById(id);
	}
}
