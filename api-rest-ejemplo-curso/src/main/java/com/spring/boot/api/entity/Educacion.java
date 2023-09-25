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
public class Educacion implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_E")
	private Integer id_E;
	
	@Column
	private String img_insti;
	@Column
	private String institucion;
	@Column
	private Integer periodo_f;
	@Column
	private Integer periodo_i;
	@Column
	private String titulo;
	
	
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_u")
	private Usuario user;
	
	public Educacion() {
		super();
	}

	public Integer getId_educacion() {
		return id_E;
	}

	public void setId_educacion(Integer id_educacion) {
		this.id_E = id_educacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getImg_logo() {
		return img_insti;
	}

	public void setImg_logo(String img_logo) {
		this.img_insti = img_logo;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public Integer getPeriodo_i() {
		return periodo_i;
	}

	public void setPeriodo_i(Integer periodo_ini) {
		this.periodo_i = periodo_ini;
	}

	public Integer getPeriodo_f() {
		return periodo_f;
	}

	public void setPeriodo_f(Integer periodo_fin) {
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
