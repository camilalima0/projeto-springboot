package com.cursojava.projeto1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.projeto1.entities.User;

//controlador rest que responde no caminho users

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//endpoint pra acessar usuarios
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
