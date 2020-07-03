package com.gasbiru.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasbiru.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
