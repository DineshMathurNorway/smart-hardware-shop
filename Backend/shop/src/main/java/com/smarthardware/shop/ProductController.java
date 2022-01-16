package com.smarthardware.shop;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductRepository products;
	
	@GetMapping
	public Products products(@RequestParam(required = false, defaultValue = "") String search) {
		return products.findByNameContains(search);
	}
	@GetMapping("/{id}")
	public Optional<Product> productById(@PathVariable Long id) {
		return products.findById(id);
	}
}
