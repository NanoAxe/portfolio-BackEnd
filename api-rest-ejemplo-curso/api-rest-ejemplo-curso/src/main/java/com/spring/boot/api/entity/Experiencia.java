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
public class Experiencia implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idExp")
	private Integer idExp;

	@Column
	private String puesto;
	@Column
	private String lugar;
	@Column
	private String logo_org;
	@Column
	private String dirLogo;
	@Column
	private Integer periodoI;
	@Column
	private Integer periodoF;
	@Column
	private String descripcion;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_u")
	private Usuario user;

	public Experiencia() {
	}

	public Integer getIdExp() {
		return idExp;
	}

	public void setIdExp(Integer idExp) {
		this.idExp = idExp;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getLogo_org() {
		return logo_org;
	}

	public void setLogo_org(String logo_org) {
		this.logo_org = logo_org;
	}

	public String getDirLogo() {
		return dirLogo;
	}

	public void setDirLogo(String dirLogo) {
		this.dirLogo = dirLogo;
	}

	public Integer getPeriodoI() {
		return periodoI;
	}

	public void setPeriodoI(Integer periodoI) {
		this.periodoI = periodoI;
	}

	public Integer getPeriodoF() {
		return periodoF;
	}

	public void setPeriodoF(Integer periodoF) {
		this.periodoF = periodoF;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
