package com.ms.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ms.product.model.Product;
import com.ms.product.model.ProductCategory;
import com.ms.product.model.ProductInventory;
import com.ms.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Product save(Product product) {
		return productRepository.save(product);
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product findById(Long id) {

		ProductInventory productInventory = restTemplate
				.getForObject("http://inventory-service:5003/inventory/findByProductId/" + id, ProductInventory.class);

		ProductCategory productCategory = restTemplate.getForObject(
				"http://category-service:5002/category/findByProductId/" + id,

				ProductCategory.class);

		Product product = productRepository.findById(id).get();
		product.setCategory(productCategory);
		product.setInventory(productInventory);

		return product;
	}

}
