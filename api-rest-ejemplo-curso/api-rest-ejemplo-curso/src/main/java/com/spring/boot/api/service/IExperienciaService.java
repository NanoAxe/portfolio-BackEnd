package com.spring.boot.api.service;

import java.util.List;
import com.spring.boot.api.entity.Experiencia;

public interface IExperienciaService {
	public List<Experiencia> getExps();
	public List<Experiencia> getExpsBy(Integer id);
	public Experiencia getExp(Integer id);
	public Experiencia saveExp(Experiencia exp);
	public void deleteExp(Integer id);
}
