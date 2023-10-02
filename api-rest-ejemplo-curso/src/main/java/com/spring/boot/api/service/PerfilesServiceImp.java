package com.spring.boot.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.api.entity.Perfiles;
import com.spring.boot.api.models.dao.IPerfilDao;

@Service
public class PerfilesServiceImp implements IPerfilService{
	@Autowired
	private IPerfilDao perfildao;
	
	@Override
	public List<Perfiles> getPerfil() {
		return (List<Perfiles>) perfildao.findAll();
	}

	@Override
	public Perfiles getPerfilId(Integer id) {
		return perfildao.findById(id).orElse(null);
	}

	@Override
	public Perfiles savePerfil(Perfiles perfil) {
		return perfildao.save(perfil);
	}

	@Override
	public void deletePerfil(Integer id) {
		perfildao.deleteById(id);
		
	}
	

}
