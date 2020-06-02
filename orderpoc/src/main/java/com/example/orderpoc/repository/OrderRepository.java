package com.example.orderpoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderpoc.entity.Order;

public	interface OrderRepository extends JpaRepository<Order, Long> {
	}

