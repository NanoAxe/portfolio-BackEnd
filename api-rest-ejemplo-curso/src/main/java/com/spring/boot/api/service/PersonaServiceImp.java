package com.spring.boot.api.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.boot.api.entity.Persona;
import com.spring.boot.api.models.dao.IPersonaDao;

//no olvidar

@Service
public class PersonaServiceImp implements IPersonaService{
	//injectar en este servicios la interfas dao
	@Autowired 
	private IPersonaDao personadao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> getTodos() {
		// TODO Auto-generated method stub
		return (List<Persona>) personadao.findAll();
	}
	@Override
	@Transactional
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personadao.save(persona);
	}
	@Override
	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		personadao.deleteById(id);
	}		
	

}
