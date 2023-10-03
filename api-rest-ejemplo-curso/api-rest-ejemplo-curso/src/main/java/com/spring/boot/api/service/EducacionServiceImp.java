package com.spring.boot.api.service;

import java.util.ArrayList;
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

	@Override
	public List<Educacion> getEducacionBy(Integer id) {
		List<Educacion> lista = new ArrayList<Educacion>();
		for(Educacion edu : this.getEducacion()) {
			if(edu.getUser().getId_usuario() == id) {
				lista.add(edu);
			}
		}
			return lista;
	}
	
	@Override
	public Educacion getEdu(Integer id) {
		return educaciondao.findById(id).orElse(null);
	}

	@Override
	public Educacion saveEdu(Educacion edu) {
		return educaciondao.save(edu);
	}

	@Override
	public void deleteEdu(Integer id) {
		educaciondao.deleteById(id);
		
	}

}
