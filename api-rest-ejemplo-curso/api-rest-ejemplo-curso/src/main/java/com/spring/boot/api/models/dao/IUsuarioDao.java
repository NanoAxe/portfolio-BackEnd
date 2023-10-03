package com.spring.boot.api.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.spring.boot.api.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Integer>{}

