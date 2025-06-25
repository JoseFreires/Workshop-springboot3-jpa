package com.josedev.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josedev.courseSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
