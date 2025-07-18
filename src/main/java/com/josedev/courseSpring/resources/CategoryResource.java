package com.josedev.courseSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josedev.courseSpring.entities.Category;
import com.josedev.courseSpring.service.CategoryService;


@RestController // Definindo que essa classe vai ser uma controladora REST
@RequestMapping(value = "/categories") // Definindo que essa classe vai ter esse endereço de web
public class CategoryResource {
	
	// Vincula o resource com o service
	@Autowired
	private CategoryService service;

	// Realiza a busca no banco de dados de todos os dados
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	// Realiza a busca no banco de dados por ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
