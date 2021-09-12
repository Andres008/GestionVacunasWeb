package com.models;

/**
 * The persistent class for the usr_usuario_experiencia database table.
 * 
 */
public class UsrUsuarioExperiencia  {

	private Long idExperiencia;

	private String experiencia;

	private UsrUsuario usrUsuario;

	public UsrUsuarioExperiencia() {
	}

	public Long getIdExperiencia() {
		return this.idExperiencia;
	}

	public void setIdExperiencia(Long idExperiencia) {
		this.idExperiencia = idExperiencia;
	}

	public String getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public UsrUsuario getUsrUsuario() {
		return this.usrUsuario;
	}

	public void setUsrUsuario(UsrUsuario usrUsuario) {
		this.usrUsuario = usrUsuario;
	}

}