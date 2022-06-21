package com.ms.productcategory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.productcategory.model.ProductCategory;
import com.ms.productcategory.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {
	@Autowired
	private ProductCategoryRepository categoryRepository;

	public List<ProductCategory> findAll() {
		return categoryRepository.findAll();
	}

	public ProductCategory save(ProductCategory productCategory) {
		return categoryRepository.save(productCategory);
	}

	public ProductCategory findById(Long id) {
		return categoryRepository.findById(id).get();
	}

}
