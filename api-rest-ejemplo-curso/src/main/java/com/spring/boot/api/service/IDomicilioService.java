package com.spring.boot.api.service;

import java.util.List;

import com.spring.boot.api.entity.Domicilio;

public interface IDomicilioService {
	public List<Domicilio> getDoms();
	public Domicilio getDom(Integer id);
	public Domicilio saveDom(Domicilio dom);
	public void deleteDom(Integer id);
}
