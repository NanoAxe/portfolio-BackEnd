package com.spring.boot.api.service;

import java.util.List;

import com.spring.boot.api.entity.Habilidad;

public interface IHabilidadService {
	public List<Habilidad> getHabilidades();
	public List<Habilidad> getHabilidadesBy(Integer id);
	public Habilidad getHabilidad(Integer id);
	public Habilidad saveHabilidad(Habilidad hab);
	public void deleteHabilidad(Integer id);
}
