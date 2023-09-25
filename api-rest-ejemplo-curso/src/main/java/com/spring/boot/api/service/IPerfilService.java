package com.spring.boot.api.service;

import java.util.List;

import com.spring.boot.api.entity.Perfiles;

public interface IPerfilService{
	public List<Perfiles> getPerfil();
	public Perfiles getPerfilId(Integer id);
	public Perfiles savePerfil(Perfiles perfil);
	public void deletePerfil(Integer id);
}
