package com.reethu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.reethu.demo.Model.Product;
import com.reethu.demo.dao.ProductRepo;

@Controller
public class JSPController {
	
	@Autowired
	ProductRepo repo;
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Home");
		
		return mv;
	}

	@RequestMapping("/add")
	public ModelAndView add(Product product) {
		ModelAndView mv = new ModelAndView("Thanku");
		mv.addObject(product);
		repo.save(product);
		return mv;
	}

	@RequestMapping("/fetch")
	public ModelAndView fetch(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("Details");
		Product product = repo.findById(id).orElse(new Product());
		System.out.println(repo.findByName("Flute"));
		System.out.println(repo.findByIdGreaterThan(2));
		System.out.println(repo.findByDescSorted("piano"));
		mv.addObject(product);
		return mv;
	}
	
	
}
