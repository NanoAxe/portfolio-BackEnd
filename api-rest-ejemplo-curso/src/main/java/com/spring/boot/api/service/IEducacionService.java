package com.spring.boot.api.service;

import java.util.List;

import com.spring.boot.api.entity.Educacion;

public interface IEducacionService {
	public List<Educacion> getEducacion();
	public List<Educacion> getEducacionBy(Integer id);
	public Educacion getEdu(Integer id);
	public Educacion saveEdu(Educacion edu);
	public void deleteEdu(Integer id);
}
