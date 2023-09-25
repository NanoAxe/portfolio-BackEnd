package com.spring.boot.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Perfiles implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPerfil")
	private Integer idPerfil;
	
	@Column
	private String nombre;
	@Column
	private String foto;
	@Column
	private String dirFoto;
	@Column
	private String banner;
	@Column
	private String dirBanner;
	@Column
	private String titulo;
	@Column
	private String aboutMe;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_u")
	private Usuario user;
	
	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDirFoto() {
		return dirFoto;
	}

	public void setDirFoto(String dirFoto) {
		this.dirFoto = dirFoto;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getDirBanner() {
		return dirBanner;
	}

	public void setDirBanner(String dirBanner) {
		this.dirBanner = dirBanner;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	private static final long serialVersionUID = 1L;

}
