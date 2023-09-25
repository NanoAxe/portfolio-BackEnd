package com.spring.boot.api.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.api.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Integer>{
  //puedes crear metodos personalizados, pero esto ya trae varios;
	
}
