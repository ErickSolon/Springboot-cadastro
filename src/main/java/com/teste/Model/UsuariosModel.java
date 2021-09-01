package com.teste.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuariosModel extends Object {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	@Column(length = 25, nullable = false)
	String usuario;

	@Column(length = 25, nullable = false)
	String senha;

	public Long getId() {
		return id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
