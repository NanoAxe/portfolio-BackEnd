package com.spring.boot.api.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.api.entity.Proyectos;

public interface IProjectosDao extends CrudRepository<Proyectos, Integer>{

}
