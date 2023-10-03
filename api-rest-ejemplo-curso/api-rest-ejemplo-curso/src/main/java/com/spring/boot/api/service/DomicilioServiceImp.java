package com.spring.boot.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.api.entity.Domicilio;
import com.spring.boot.api.models.dao.IDomicilioDao;

@Service
public class DomicilioServiceImp implements IDomicilioService{
	@Autowired
	private IDomicilioDao domiciliodao;

	@Override
	public List<Domicilio> getDoms() {
		return (List<Domicilio>) domiciliodao.findAll();
	}

	@Override
	public Domicilio getDom(Integer id) {
		return domiciliodao.findById(id).orElse(null);
	}

	@Override
	public Domicilio saveDom(Domicilio dom) {
		return domiciliodao.save(dom);
	}

	@Override
	public void deleteDom(Integer id) {
		domiciliodao.deleteById(id);
		
	}
	
	

}
