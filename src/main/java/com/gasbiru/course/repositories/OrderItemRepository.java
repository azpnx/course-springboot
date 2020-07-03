package com.gasbiru.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasbiru.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
