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
public class Experiencia implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_X")
	private Integer id_X;
	
	@Column
	private String puesto;
	@Column
	private String lugar;
	@Column
	private String logo_org;
	@Column
	private Integer periodo_i;
	@Column
	private Integer periodo_f;
	@Column
	private String descripcion;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_u")
	private Usuario user;	
	
	public Experiencia() {
	}

	public Integer getId_experiencia() {
		return id_X;
	}

	public void setId_experiencia(Integer id_experiencia) {
		this.id_X = id_experiencia;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getOrganizacion() {
		return lugar;
	}

	public void setOrganizacion(String organizacion) {
		this.lugar = organizacion;
	}

	public String getDesc() {
		return descripcion;
	}

	public void setDesc(String desc) {
		this.descripcion = desc;
	}

	public String getLogo_org() {
		return logo_org;
	}

	public void setLogo_org(String logo_org) {
		this.logo_org = logo_org;
	}

	public Integer getPeriodo_ini() {
		return periodo_i;
	}

	public void setPeriodo_ini(Integer periodo_ini) {
		this.periodo_i = periodo_ini;
	}

	public Integer getPeriodo_fin() {
		return periodo_f;
	}

	public void setPeriodo_fin(Integer periodo_fin) {
		this.periodo_f = periodo_fin;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
