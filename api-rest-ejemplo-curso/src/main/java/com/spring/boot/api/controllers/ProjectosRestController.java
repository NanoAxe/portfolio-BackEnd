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

import com.spring.boot.api.entity.Proyectos;
import com.spring.boot.api.service.IProyectosService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProjectosRestController {
	@Autowired
	private IProyectosService pjService;
	
	@GetMapping("/proyecto")
	@ResponseStatus(HttpStatus.OK)
	public List<Proyectos> getPjs(){
		return pjService.getPjs();
	}
	@GetMapping("/proyectoBy/{id}")
	@ResponseStatus(HttpStatus.OK)
	public List<Proyectos> getPjBy(@PathVariable Integer id){
		return pjService.getPjsBy(id);
	}
	
	@GetMapping("/proyecto/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Proyectos getPj(@PathVariable Integer id) {
		return pjService.getPjId(id);
	}

	@PostMapping("/proyecto")
	@ResponseStatus(HttpStatus.OK)
	public Proyectos savesPj(@RequestBody Proyectos pj) {
		return pjService.savePj(pj);
	}
	
	@PutMapping("/proyecto")
	@ResponseStatus(HttpStatus.OK)
	public Proyectos updatePj(@RequestBody Proyectos pj, @PathVariable Integer id) {
		Proyectos pjActual = pjService.getPjId(id);
		pjActual.setProyecto(pj.getProyecto());
		pjActual.setDescripcion(pj.getDescripcion());
		pjActual.setEnlace(pj.getEnlace());
		pjActual.setFechaI(pj.getFechaI());
		pjActual.setFechaF(pj.getFechaF());
		pjActual.setIconoPj(pj.getIconoPj());
		pjActual.setDirIconoPj(pj.getDirIconoPj());
		return pjService.savePj(pjActual);
	}
	
	@DeleteMapping("/proyecto/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deletePj(@PathVariable Integer id) {
		pjService.deletePj(id);
	}
}
