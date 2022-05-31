package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Usuario;

@RestController
@RequestMapping(value = "/users")
public class UsuarioResource {

	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario user = new Usuario(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(user);
	}
}
