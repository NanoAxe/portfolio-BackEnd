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

import com.spring.boot.api.entity.Perfiles;
import com.spring.boot.api.service.IPerfilService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PerfilRestController {
	@Autowired
	private IPerfilService perfilService;
	
	@GetMapping("/perfil")
	@ResponseStatus(HttpStatus.OK)
	public List<Perfiles> getPerfiles(){
		return perfilService.getPerfil();
	}
	
	@GetMapping("/perfil/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Perfiles getPerfil(@PathVariable Integer id) {
		return perfilService.getPerfilId(id);
	}
	
	@PostMapping("/perfil")
	@ResponseStatus(HttpStatus.OK)
	public Perfiles savePerfil(@RequestBody Perfiles perfil) {
		return perfilService.savePerfil(perfil);
	}
	
	@PutMapping("/perfil/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Perfiles updatePerfil(@RequestBody Perfiles perfil, @PathVariable Integer id) {
		Perfiles perfilA = perfilService.getPerfilId(id);
		perfilA.setNombre(perfil.getNombre());
		perfilA.setTitulo(perfil.getTitulo());
		perfilA.setAboutMe(perfil.getAboutMe());
		perfilA.setFoto(perfil.getFoto());
		perfilA.setDirFoto(perfil.getDirFoto());
		perfilA.setBanner(perfil.getBanner());
		perfilA.setDirBanner(perfil.getDirBanner());
		return perfilService.savePerfil(perfilA);
	}
	
	@DeleteMapping("/perfil/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deletePerfil(@PathVariable Integer id) {
		perfilService.deletePerfil(id);
	}
}
