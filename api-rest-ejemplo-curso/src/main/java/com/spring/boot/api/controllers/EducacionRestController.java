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

import com.spring.boot.api.entity.Educacion;
import com.spring.boot.api.service.IEducacionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EducacionRestController {
	@Autowired
	private IEducacionService eduService;
		
	@GetMapping("/educacion")
	@ResponseStatus(HttpStatus.OK)
	public List<Educacion> getEducacion(){
		return eduService.getEducacion();
	}
	
	@GetMapping("/educacionBy/{id}")
	@ResponseStatus(HttpStatus.OK)
	public List<Educacion> getHabilidadBy(@PathVariable Integer id){
		return eduService.getEducacionBy(id);
	}
	
	@GetMapping("/educacion/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Educacion getEduId(@PathVariable Integer id) {
		return eduService.getEdu(id);
	}
	
	@PostMapping("/educacion")
	@ResponseStatus(HttpStatus.OK)
	public Educacion saveEducacion(@RequestBody Educacion edu) {
		return eduService.saveEdu(edu);
	}
	
	@PutMapping("/educacion/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Educacion updateEducacion(@RequestBody Educacion edu, @PathVariable Integer id) {
		Educacion eduA = eduService.getEdu(id);
		eduA.setTitulo(edu.getTitulo());
		eduA.setInstitucion(edu.getInstitucion());
		eduA.setInicio(edu.getInicio());
		eduA.setFin(edu.getFin());
		eduA.setIconoIns(edu.getIconoIns());
		eduA.setDirIcono(edu.getDirIcono());
		return eduService.saveEdu(eduA);
	}
	
	@DeleteMapping("/educacion/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteEducacion(@PathVariable Integer id) {
		eduService.deleteEdu(id);
	}
}
