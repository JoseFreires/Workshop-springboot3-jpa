package com.josedev.courseSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josedev.courseSpring.entities.User;

@RestController // Definindo que essa classe vai ser uma controladora REST
@RequestMapping(value = "/users") // Definindo que essa classe vai ter esse endereço de web
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Xande", "xandinhoS2@gmail.com", "999999999", "123456");
		return ResponseEntity.ok().body(u); // Definindo que se estiver OK aprensentar o "body"
	}
}
