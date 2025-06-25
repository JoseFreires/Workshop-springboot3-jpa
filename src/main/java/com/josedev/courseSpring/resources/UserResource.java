package com.josedev.courseSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josedev.courseSpring.entities.User;
import com.josedev.courseSpring.repositories.UserRepository;
import com.josedev.courseSpring.service.UserService;


@RestController // Definindo que essa classe vai ser uma controladora REST
@RequestMapping(value = "/users") // Definindo que essa classe vai ter esse endereço de web
public class UserResource {
	
	@Autowired
	private UserService service;

	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
