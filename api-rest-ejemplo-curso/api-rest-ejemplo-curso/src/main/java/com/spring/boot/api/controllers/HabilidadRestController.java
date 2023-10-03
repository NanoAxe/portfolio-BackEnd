package com.spring.boot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.api.entity.Habilidad;
import com.spring.boot.api.service.IHabilidadService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class HabilidadRestController {
	@Autowired
	private IHabilidadService skillService;
	
	@GetMapping("/habilidad")
	@ResponseStatus(HttpStatus.OK)
	public List<Habilidad> getHabilidades(){
		return skillService.getHabilidades();
	}
	
	@GetMapping("/habilidadBy/{id}")
	@ResponseStatus(HttpStatus.OK)
	public List<Habilidad> getHabilidadBy(@PathVariable Integer id){
		return skillService.getHabilidadesBy(id);
	}
	
	@GetMapping("/habilidad/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Habilidad getHabilidad(@PathVariable Integer id){
		return skillService.getHabilidad(id);
	}
	
	@PostMapping("/habilidad")
	@ResponseStatus(HttpStatus.OK)
	public Habilidad saveHabilidad(@RequestBody Habilidad skill) {
		return skillService.saveHabilidad(skill);
	}
	
	@PutMapping("/habilidad/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Habilidad updateHabilidad(@RequestBody Habilidad skill, @PathVariable Integer id) {
		Habilidad skillA = skillService.getHabilidad(id);
		skillA.setDescripcion(skill.getDescripcion());
		skillA.setNivel(skill.getNivel());
		return skillService.saveHabilidad(skillA);
	}
	
	@DeleteMapping("/habilidad/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteHabilidad(@PathVariable Integer id) {
		skillService.deleteHabilidad(id);
	}
	
}