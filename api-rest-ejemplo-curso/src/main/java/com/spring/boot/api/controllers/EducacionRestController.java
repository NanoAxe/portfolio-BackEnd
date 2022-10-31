package com.spring.boot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.api.entity.Educacion;
import com.spring.boot.api.service.IEducacionService;

@CrossOrigin(origins = {"localhost:4200"})
@RestController
@RequestMapping("/api")
public class EducacionRestController {
	@Autowired
	private IEducacionService eduservice;
		
	@GetMapping("/educacion")
	public List<Educacion> mostrar(){
		return eduservice.getEducacion();
	}
}
