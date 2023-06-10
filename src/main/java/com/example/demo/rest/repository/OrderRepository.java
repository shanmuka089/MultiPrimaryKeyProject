package com.example.demo.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.rest.model.OderPrimaryKey;
import com.example.demo.rest.model.Order;

public interface OrderRepository extends JpaRepository<Order, OderPrimaryKey>{

}
