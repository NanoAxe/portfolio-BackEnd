package com.spring.boot.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Persona implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_P")
	private Integer id_P;
	@Column
	private String nombre1;
	@Column
	private String nombre2;
	@Column
	private String apellido;
	
	public Persona() {}

	public Integer getId_persona() {
		return id_P;
	}
	public void setId_persona(Integer id_P) {
		this.id_P = id_P;
	}
	public String getNombre1() {
		return nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	public String getNombre2() {
		return nombre2;
	}
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
}
