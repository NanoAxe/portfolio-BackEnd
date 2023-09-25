package com.spring.boot.api.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.api.entity.Proyectos;
import com.spring.boot.api.models.dao.IProjectosDao;

//no olvidar

@Service
public class ProyectosServiceImp implements IProyectosService{
	//injectar en este servicios la interfas dao
	@Autowired 
	private IProjectosDao pjdao ;

	@Override
	public List<Proyectos> getPjs() {
		return (List<Proyectos>) pjdao.findAll();
	}

	@Override
	public List<Proyectos> getPjsBy(Integer id) {
		List<Proyectos> pjsUser = new ArrayList<Proyectos>();
		for(Proyectos pj : this.getPjs()) {
			if(pj.getUser().getId_usuario() == id) {
				pjsUser.add(pj);
			}
		}
			return pjsUser;
	}
	
	@Override
	public Proyectos getPjId(Integer id) {
		return pjdao.findById(id).orElse(null);
	}

	@Override
	public Proyectos savePj(Proyectos proyectos) {
		return pjdao.save(proyectos);
	}

	@Override
	public void deletePj(Integer id) {
		pjdao.deleteById(id);
		
	}
	
	
	

}
