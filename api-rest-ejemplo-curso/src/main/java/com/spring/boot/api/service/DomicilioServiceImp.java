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
	public List<Domicilio> getDomicilio() {
		return (List<Domicilio>) domiciliodao.findAll();
	}

}
