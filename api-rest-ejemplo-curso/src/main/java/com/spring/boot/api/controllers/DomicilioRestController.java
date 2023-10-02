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
import com.spring.boot.api.entity.Domicilio;
import com.spring.boot.api.service.IDomicilioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class DomicilioRestController {
	@Autowired
	private IDomicilioService domService;
	
	@GetMapping("/domicilio")
	@ResponseStatus(HttpStatus.OK)
	public List<Domicilio> getDomicilios(){
		return domService.getDoms();
	}
	
	@GetMapping("/domicilio/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Domicilio getDomicilio(@PathVariable Integer id) {
		return domService.getDom(id);
	}
	
	@PostMapping("/domicilio")
	@ResponseStatus(HttpStatus.OK)
	public Domicilio saveDomicilio(@RequestBody Domicilio dom) {
		return domService.saveDom(dom);
	}
	
	@PutMapping("/domicilio/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Domicilio updateDomicilio(@RequestBody Domicilio dom, @PathVariable Integer id) {
		Domicilio domA = domService.getDom(id);
		domA.setPais(dom.getPais());
		domA.setProvincia(dom.getProvincia());
		domA.setBarrio(dom.getBarrio());
		domA.setCalle(dom.getCalle());
		domA.setNro(dom.getNro());
		return domService.saveDom(domA);
	}
	
	@DeleteMapping("/domicilio/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteDomicilio(@PathVariable Integer id) {
		domService.deleteDom(id);
	}
}
