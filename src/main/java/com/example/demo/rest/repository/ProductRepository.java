package com.example.demo.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.rest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
