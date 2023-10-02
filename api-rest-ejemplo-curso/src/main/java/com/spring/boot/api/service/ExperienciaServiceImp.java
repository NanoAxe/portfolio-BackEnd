package com.spring.boot.api.service;

import java.util.ArrayList;
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
	public List<Experiencia> getExps() {
		return (List<Experiencia>) expdao.findAll();
	}

	@Override
	public List<Experiencia> getExpsBy(Integer id) {
		List<Experiencia> lista = new ArrayList<Experiencia>();
		for(Experiencia exp : this.getExps()) {
			if(exp.getUser().getId_usuario() == id) {
				lista.add(exp);
			}
		}
			return lista;
	}
	
	@Override
	public Experiencia getExp(Integer id) {
		return expdao.findById(id).orElse(null);
	}

	@Override
	public Experiencia saveExp(Experiencia exp) {
		return expdao.save(exp);
	}

	@Override
	public void deleteExp(Integer id) {
		expdao.deleteById(id);
		
	}

}

