package com.ms.productinventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.productinventory.model.ProductInventory;
import com.ms.productinventory.repository.ProductInventoryRepository;

@Service
public class ProductInventoryService {
	@Autowired
	private ProductInventoryRepository productInventoryRepository;

	public ProductInventory save(ProductInventory inventory) {
		return productInventoryRepository.save(inventory);
	}

	public List<ProductInventory> findAll() {
		return productInventoryRepository.findAll();
	}

	public ProductInventory findById(Long id) {
		return productInventoryRepository.findById(id).get();
	}

	public ProductInventory findByProductId(Long id) {
		return productInventoryRepository.findByProductId(id);
	}

}
