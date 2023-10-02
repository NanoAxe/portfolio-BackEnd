package com.spring.boot.api.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.api.entity.Perfiles;

public interface IPerfilDao extends CrudRepository<Perfiles, Integer>{
  //puedes crear metodos personalizados, pero esto ya trae varios;
	
}
