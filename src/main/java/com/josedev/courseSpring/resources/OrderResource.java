package com.josedev.courseSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josedev.courseSpring.entities.Order;
import com.josedev.courseSpring.service.OrderService;


@RestController // Definindo que essa classe vai ser uma controladora REST
@RequestMapping(value = "/orders") // Definindo que essa classe vai ter esse endereço de web
public class OrderResource {
	
	// Vincula o resource com o service
	@Autowired
	private OrderService service;

	// Realiza a busca no banco de dados de todos os dados
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	// Realiza a busca no banco de dados por ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
