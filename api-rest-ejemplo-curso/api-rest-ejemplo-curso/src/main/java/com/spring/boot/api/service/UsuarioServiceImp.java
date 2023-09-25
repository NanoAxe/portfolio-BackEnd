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
	public List<Usuario> getUsuarios() {
		return (List<Usuario>) usuariodao.findAll();
	}

	@Override
	public Usuario getUsuarioId(Integer id) {
		return usuariodao.findById(id).orElse(null);
	}

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		return usuariodao.save(usuario);
	}

	@Override
	public void deleteUsuario(Integer id) {
		usuariodao.deleteById(id);
		
	}
}
