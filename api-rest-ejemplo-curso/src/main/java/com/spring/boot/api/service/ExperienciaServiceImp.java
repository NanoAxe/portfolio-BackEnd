package com.spring.boot.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.api.entity.Experiencia;
import com.spring.boot.api.models.dao.IExperienciaDao;

@Service
public class ExperienciaServiceImp implements IExperienciaService{
	@Autowired
	private IExperienciaDao expdao;

	@Override
	public List<Experiencia> getExp() {
		return (List<Experiencia>) expdao.findAll();
	}
	

}

