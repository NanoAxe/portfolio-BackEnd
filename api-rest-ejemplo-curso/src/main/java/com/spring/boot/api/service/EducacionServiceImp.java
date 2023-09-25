package com.spring.boot.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.api.entity.Educacion;
import com.spring.boot.api.models.dao.IEducacionDao;

@Service
public class EducacionServiceImp implements IEducacionService{
	@Autowired
	private IEducacionDao educaciondao;
	
	@Override
	public List<Educacion> getEducacion() {	
		return (List<Educacion>) educaciondao.findAll();
	}

}
