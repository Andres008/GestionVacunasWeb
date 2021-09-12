package com.models;

import java.io.Serializable;
import java.util.List;

/**
 * The persistent class for the usr_rol database table.
 * 
 */
public class UsrRol implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long idRol;

	private String estado;

	private String nombre;

	private String observacion;
	
	private List<UsrUsuario> usrUsuarios;

	public UsrRol() {
	}
	
	

	public UsrRol(Long idRol) {
		super();
		this.idRol = idRol;
	}



	public Long getIdRol() {
		return this.idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public List<UsrUsuario> getUsrUsuarios() {
		return this.usrUsuarios;
	}

	public void setUsrUsuarios(List<UsrUsuario> usrUsuarios) {
		this.usrUsuarios = usrUsuarios;
	}

	public UsrUsuario addUsrUsuario(UsrUsuario usrUsuario) {
		getUsrUsuarios().add(usrUsuario);
		usrUsuario.setUsrRol(this);

		return usrUsuario;
	}

	public UsrUsuario removeUsrUsuario(UsrUsuario usrUsuario) {
		getUsrUsuarios().remove(usrUsuario);
		usrUsuario.setUsrRol(null);

		return usrUsuario;
	}

}