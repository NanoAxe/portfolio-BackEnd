package com.spring.boot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.api.entity.Projectos;
import com.spring.boot.api.service.IProjectosService;


@CrossOrigin(origins = {"localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProjectosRestController {
	@Autowired
	private IProjectosService pjservice;
	
	@GetMapping("/pj")
	public List<Projectos> mostrar(){
		return pjservice.getPj();
	}
}
