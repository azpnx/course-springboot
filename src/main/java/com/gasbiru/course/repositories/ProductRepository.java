package com.gasbiru.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasbiru.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
