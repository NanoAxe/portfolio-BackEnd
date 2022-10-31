package com.spring.boot.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.boot.api.entity.Usuario;
import com.spring.boot.api.models.dao.IUsuarioDao;

@Service
public class UsuarioServiceImp implements IUsuarioService{
	@Autowired
	private IUsuarioDao usuariodao;

	@Override
	public List<Usuario> getUsuario() {
		return (List<Usuario>) usuariodao.findAll();
	}
}
