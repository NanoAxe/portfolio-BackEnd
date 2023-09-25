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
public class Proyectos implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPj")
	private Integer idPj;
	@Column
	private String proyecto;
	@Column
	private String enlace;
	@Column
	private Integer fechaI;
	@Column
	private Integer fechaF;
	@Column
	private String descripcion;
	@Column
	private String iconoPj;
	@Column
	private String dirIconoPj;
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_u")
	private Usuario user;

	public Proyectos() {
	}

	public Integer getIdPj() {
		return idPj;
	}

	public void setIdPj(Integer idPj) {
		this.idPj = idPj;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public Integer getFechaI() {
		return fechaI;
	}

	public void setFechaI(Integer fechaI) {
		this.fechaI = fechaI;
	}

	public Integer getFechaF() {
		return fechaF;
	}

	public void setFechaF(Integer fechaF) {
		this.fechaF = fechaF;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIconoPj() {
		return iconoPj;
	}

	public void setIconoPj(String iconoPj) {
		this.iconoPj = iconoPj;
	}

	public String getDirIconoPj() {
		return dirIconoPj;
	}

	public void setDirIconoPj(String dirIconoPj) {
		this.dirIconoPj = dirIconoPj;
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
