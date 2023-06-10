package com.example.demo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.model.Order;
import com.example.demo.rest.model.Product;
import com.example.demo.rest.repository.OrderRepository;
import com.example.demo.rest.repository.ProductRepository;

@RestController
@RequestMapping("/")
public class TestController {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/orders")
	public List<Order> getOrders() {
		List<Order> orders = orderRepository.findAll();
		return orders;
	}
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		List<Product> products = productRepository.findAll();
		return products;
	}
}
