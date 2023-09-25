package com.spring.boot.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Projectos implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_P")
	private Integer id_P;
	
	@Column
	private String nombre;
	@Column
	private String logo_pj;
	@Column
	private String descripcion;
	@Column
	private String pruebas;
	@Column
	private Integer periodo_ini;
	@Column
	private Integer periodo_fin;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_u")
	private Usuario user;
	
	public Projectos() {
		super();
	}	
	
	public Integer getId_P() {
		return id_P;
	}

	public void setId_P(Integer id_P) {
		this.id_P = id_P;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLogo_pj() {
		return logo_pj;
	}

	public void setLogo_pj(String logo_pj) {
		this.logo_pj = logo_pj;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPruebas() {
		return pruebas;
	}

	public void setPruebas(String pruebas) {
		this.pruebas = pruebas;
	}

	public Integer getPeriodo_ini() {
		return periodo_ini;
	}


	public void setPeriodo_ini(Integer periodo_ini) {
		this.periodo_ini = periodo_ini;
	}

	public Integer getPeriodo_fin() {
		return periodo_fin;
	}

	public void setPeriodo_fin(Integer periodo_fin) {
		this.periodo_fin = periodo_fin;
	}

	public Usuario getUsuario() {
		return user;
	}

	public void setUsuario(Usuario usuario) {
		this.user = usuario;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
