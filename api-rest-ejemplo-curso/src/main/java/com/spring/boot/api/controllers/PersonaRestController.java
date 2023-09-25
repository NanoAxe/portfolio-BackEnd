package com.spring.boot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.boot.api.entity.Persona;
import com.spring.boot.api.service.IPersonaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaRestController {
	@Autowired
	private IPersonaService personaService;
	
	@GetMapping("/persona")
	public List<Persona> mostrar(){
		return personaService.getTodos();
	}
	
	@PostMapping("/persona")
	public ResponseEntity<?> crear(@RequestBody Persona persona) {
		return ResponseEntity.status(HttpStatus.CREATED).body(personaService.save(persona));
	}
}
