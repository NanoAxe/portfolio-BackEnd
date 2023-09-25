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

import com.spring.boot.api.entity.Experiencia;
import com.spring.boot.api.service.IExperienciaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ExperienciaRestController {
	@Autowired
	private IExperienciaService expService;

	@GetMapping("/exp")
	@ResponseStatus(HttpStatus.OK)
	public List<Experiencia> getExps() {
		return expService.getExps();
	}

	@GetMapping("/expBy/{id}")
	@ResponseStatus(HttpStatus.OK)
	public List<Experiencia> getExpsBy(@PathVariable Integer id) {
		return expService.getExpsBy(id);
	}

	@GetMapping("/exp/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Experiencia getExp(@PathVariable Integer id) {
		return expService.getExp(id);
	}

	@PostMapping("/exp")
	@ResponseStatus(HttpStatus.OK)
	public Experiencia saveExp(@RequestBody Experiencia exp) {
		return expService.saveExp(exp);
	}

	@PutMapping("/exp/:{id}")
	@ResponseStatus(HttpStatus.OK)
	public Experiencia updateExp(@RequestBody Experiencia exp, @PathVariable Integer id) {
		Experiencia expA = expService.getExp(id);
		expA.setPuesto(exp.getPuesto());
		expA.setLugar(exp.getLugar());
		expA.setDescripcion(exp.getDescripcion());
		expA.setPeriodoI(exp.getPeriodoI());
		expA.setPeriodoF(exp.getPeriodoF());
		expA.setLogo_org(exp.getLogo_org());
		expA.setDirLogo(exp.getDirLogo());
		return expService.saveExp(expA);
	}

	@DeleteMapping("/exp/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteExp(@PathVariable Integer id) {
		expService.deleteExp(id);
	}

}
