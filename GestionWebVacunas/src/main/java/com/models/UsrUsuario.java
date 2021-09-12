package com.models;

import java.io.Serializable;
import java.util.List;


public class UsrUsuario implements Serializable {
	private static final long serialVersionUID = 1L;


	private String idUsuario;

	private String apellido;

	private String clave;

	private String direccion;

	private String email;

	private String estado;

	private String nombre;

	private String telefono;

	private UsrRol usrRol;

	private List<UsrUsuarioExperiencia> usrUsuarioExperiencias;

	public UsrUsuario() {
	}
	
	

	public UsrUsuario(String idUsuario, String apellido, String clave, String direccion, String email, String estado,
			String nombre, String telefono, UsrRol usrRol, List<UsrUsuarioExperiencia> usrUsuarioExperiencias) {
		super();
		this.idUsuario = idUsuario;
		this.apellido = apellido;
		this.clave = clave;
		this.direccion = direccion;
		this.email = email;
		this.estado = estado;
		this.nombre = nombre;
		this.telefono = telefono;
		this.usrRol = usrRol;
		this.usrUsuarioExperiencias = usrUsuarioExperiencias;
	}



	public String getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public UsrRol getUsrRol() {
		return this.usrRol;
	}

	public void setUsrRol(UsrRol usrRol) {
		this.usrRol = usrRol;
	}

	public List<UsrUsuarioExperiencia> getUsrUsuarioExperiencias() {
		return this.usrUsuarioExperiencias;
	}

	public void setUsrUsuarioExperiencias(List<UsrUsuarioExperiencia> usrUsuarioExperiencias) {
		this.usrUsuarioExperiencias = usrUsuarioExperiencias;
	}

	public UsrUsuarioExperiencia addUsrUsuarioExperiencia(UsrUsuarioExperiencia usrUsuarioExperiencia) {
		getUsrUsuarioExperiencias().add(usrUsuarioExperiencia);
		usrUsuarioExperiencia.setUsrUsuario(this);

		return usrUsuarioExperiencia;
	}

	public UsrUsuarioExperiencia removeUsrUsuarioExperiencia(UsrUsuarioExperiencia usrUsuarioExperiencia) {
		getUsrUsuarioExperiencias().remove(usrUsuarioExperiencia);
		usrUsuarioExperiencia.setUsrUsuario(null);

		return usrUsuarioExperiencia;
	}



	@Override
	public String toString() {
		return "UsrUsuario [idUsuario=" + idUsuario + ", apellido=" + apellido + ", clave=" + clave + ", direccion="
				+ direccion + ", email=" + email + ", estado=" + estado + ", nombre=" + nombre + ", telefono="
				+ telefono + ", usrRol=" + usrRol + ", usrUsuarioExperiencias=" + usrUsuarioExperiencias + "]";
	}

}