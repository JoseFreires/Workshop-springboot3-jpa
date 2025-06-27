package com.josedev.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josedev.courseSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
