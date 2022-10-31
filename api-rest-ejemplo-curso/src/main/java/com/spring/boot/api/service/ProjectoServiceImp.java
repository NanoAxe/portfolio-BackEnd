package com.spring.boot.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.api.entity.Projectos;
import com.spring.boot.api.models.dao.IProjectosDao;

@Service
public class ProjectoServiceImp implements IProjectosService{
	@Autowired
	private IProjectosDao pjdao;

	@Override
	public List<Projectos> getPj() {
		return (List<Projectos>) pjdao.findAll();	
	}
	

}
