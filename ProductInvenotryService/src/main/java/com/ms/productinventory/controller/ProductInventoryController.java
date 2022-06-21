package com.ms.productinventory.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.productinventory.model.ProductInventory;
import com.ms.productinventory.service.ProductInventoryService;

@RestController
@RequestMapping("/inventory")
public class ProductInventoryController {

	@Autowired
	private ProductInventoryService inventoryService;

	@GetMapping("/findAll")
	public List<ProductInventory> findAll() {
		return inventoryService.findAll();
	}

	@GetMapping("/findById/{id}")
	public ProductInventory findById(@PathVariable Long id) {
		return inventoryService.findById(id);
	}

	@GetMapping("/findByProductId/{id}")
	public ProductInventory findByProductId(@PathVariable Long id) {
		return inventoryService.findByProductId(id);
	}

	@PostMapping("/save")
	public ProductInventory save(@RequestBody ProductInventory productInventory) {
		productInventory.setCreatedAt(LocalDate.now());
		return inventoryService.save(productInventory);
	}
}
