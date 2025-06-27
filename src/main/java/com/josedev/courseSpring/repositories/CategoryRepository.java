package com.josedev.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josedev.courseSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
