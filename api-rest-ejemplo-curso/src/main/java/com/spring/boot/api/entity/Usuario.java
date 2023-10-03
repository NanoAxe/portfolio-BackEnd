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
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_U")
	private Integer id_usuario;

	@Column
	private String usuario;
	@Column
	private String contrasena;
	@Column
	private String correo;

	/*
	 * esto va para eliminar "basurita" y que no de error 500
	 * 
	 * @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	 * 
	 * @OneToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "idPerfil") private Perfiles perfil;
	 */

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/*
	 * public Perfiles getPerfil() { return perfil; }
	 * 
	 * public void setPerfil(Perfiles perfil) { this.perfil = perfil; }
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
