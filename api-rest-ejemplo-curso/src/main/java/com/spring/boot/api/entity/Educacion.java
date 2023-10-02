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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEdu")
	private Integer idEdu;
	
	@Column
	private String iconoIns;
	@Column
	private String dirIcono;
	@Column
	private String institucion;
	@Column
	private Integer periodoI;
	@Column
	private Integer periodoF;
	@Column
	private String titulo;
	
	
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_u")
	private Usuario user;
	
	public Educacion() {
		super();
	}
	public Integer getIdEdu() {
		return idEdu;
	}

	public void setIdEdu(Integer idEdu) {
		this.idEdu = idEdu;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIconoIns() {
		return iconoIns;
	}

	public void setIconoIns(String img_logo) {
		this.iconoIns = img_logo;
	}

	public String getDirIcono() {
		return dirIcono;
	}

	public void setDirIcono(String dir) {
		this.dirIcono = dir;
	}
	
	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public Integer getInicio() {
		return periodoI;
	}

	public void setInicio(Integer periodo_ini) {
		this.periodoI = periodo_ini;
	}

	public Integer getFin() {
		return periodoF;
	}

	public void setFin(Integer periodo_fin) {
		this.periodoF = periodo_fin;
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
