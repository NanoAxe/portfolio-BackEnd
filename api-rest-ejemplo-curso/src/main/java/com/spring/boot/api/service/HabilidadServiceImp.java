package com.spring.boot.api.service;

import java.util.ArrayList;
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
	public List<Habilidad> getHabilidades() {
		return (List<Habilidad>) skilldao.findAll();
	}
	//Esto es lo que estoy probando
	@Override
	public List<Habilidad> getHabilidadesBy(Integer id) {
		List<Habilidad> habsUser = new ArrayList<Habilidad>();
		for(Habilidad hab : this.getHabilidades()) {
			if(hab.getUser().getId_usuario() == id) {
				habsUser.add(hab);
			}
		}
			return habsUser;
	}
	//aqui sigue todo como estaba
	@Override
	public Habilidad getHabilidad(Integer id) {
		return skilldao.findById(id).orElse(null); 
	}

	@Override
	public Habilidad saveHabilidad(Habilidad hab) {
		return skilldao.save(hab);
	}

	@Override
	public void deleteHabilidad(Integer id) {
		skilldao.deleteById(id);
		
	}
	
	

}
