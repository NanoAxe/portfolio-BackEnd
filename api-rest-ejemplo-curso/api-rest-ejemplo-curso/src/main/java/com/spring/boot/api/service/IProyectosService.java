package com.spring.boot.api.service;

import java.util.List;

import com.spring.boot.api.entity.Proyectos;

public interface IProyectosService {
	//aqui crear metodos para usar los cruds
	public List<Proyectos> getPjs();
	public List<Proyectos> getPjsBy(Integer id);
	public Proyectos getPjId(Integer id);
	public Proyectos savePj(Proyectos proyectos);
	public void deletePj(Integer id);
	
}
