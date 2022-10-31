package com.spring.boot.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.api.entity.Habilidad;
import com.spring.boot.api.models.dao.IHabilidadDao;

@Service
public class HabilidadServiceImp implements IHabilidadService{
	@Autowired
	private IHabilidadDao skilldao;

	@Override
	public List<Habilidad> getSkill() {
		return (List<Habilidad>) skilldao.findAll();
	}
	

}
