package com.ms.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ms.product.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long>{

}
