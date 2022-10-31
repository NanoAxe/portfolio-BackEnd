package com.spring.boot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.boot.api.entity.Domicilio;
import com.spring.boot.api.service.IDomicilioService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class DomicilioRestController {
	@Autowired
	private IDomicilioService domservice;
	
	@GetMapping("/domicilio")
	public List<Domicilio> mostrar(){
		return domservice.getDomicilio();
	}
}
