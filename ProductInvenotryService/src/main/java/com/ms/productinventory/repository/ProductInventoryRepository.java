package com.ms.productinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.productinventory.model.ProductInventory;

@Repository
public interface ProductInventoryRepository extends JpaRepository<ProductInventory, Long> {

}
