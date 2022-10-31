package com.spring.boot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.api.entity.Experiencia;
import com.spring.boot.api.service.IExperienciaService;

@CrossOrigin(origins = {"localhost:4200"})
@RestController
@RequestMapping("/api")
public class ExperienciaRestController {
	@Autowired
	private IExperienciaService expservice;
	
	@GetMapping("/exp")
	public List<Experiencia> mostrar(){
		return expservice.getExp();
	}
}
