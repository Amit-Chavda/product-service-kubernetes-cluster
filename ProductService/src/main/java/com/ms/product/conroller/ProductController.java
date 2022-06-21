package com.ms.product.conroller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.product.model.Product;
import com.ms.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/findAll")
	public List<Product> findAll() {
		return productService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Product findById(@PathVariable Long id) {
		return productService.findById(id);
	}

	@PostMapping("/save")
	public Product save(@RequestBody Product product) {
		product.setCreatedAt(LocalDate.now());
		return productService.save(product);
	}
}
