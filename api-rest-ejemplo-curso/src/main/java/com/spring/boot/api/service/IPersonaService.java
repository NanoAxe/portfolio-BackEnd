package com.spring.boot.api.service;

import java.util.List;

import com.spring.boot.api.entity.Persona;

public interface IPersonaService {
	//aqui crear metodos para usar los cruds
	public List<Persona> getTodos();
	public Persona save(Persona persona);
	public void delete(Integer id);
	
}
