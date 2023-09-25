package com.spring.boot.api.service;

import java.util.List;

import com.spring.boot.api.entity.Usuario;


public interface IUsuarioService {
	public List<Usuario> getUsuarios();
	public Usuario getUsuarioId(Integer id);
	public Usuario saveUsuario(Usuario usuario);
	public void deleteUsuario(Integer id);
}
