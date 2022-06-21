package com.ms.productcategory.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.productcategory.model.ProductCategory;
import com.ms.productcategory.service.ProductCategoryService;

@RestController
@RequestMapping("/category")
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService categoryService;

	@GetMapping("/findAll")
	public List<ProductCategory> findAll() {
		return categoryService.findAll();
	}

	@GetMapping("/findById/{id}")
	public ProductCategory findById(@PathVariable Long id) {
		return categoryService.findById(id);
	}

	@GetMapping("/findByProductId/{id}")
	public ProductCategory findByProductId(@PathVariable Long id) {
		return categoryService.findByProductId(id);
	}

	@PostMapping("/save")
	public ProductCategory save(@RequestBody ProductCategory productCategory) {
		productCategory.setCreatedAt(LocalDate.now());
		return categoryService.save(productCategory);
	}
}
