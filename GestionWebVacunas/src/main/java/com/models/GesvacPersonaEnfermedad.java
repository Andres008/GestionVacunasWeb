package com.models;



public class GesvacPersonaEnfermedad {

	private long id;

	private GesvacEnfermedad gesvacEnfermedad;

	private GesvacEstadoEnfermedad gesvacEstadoEnfermedad;

	private GesvacPersona gesvacPersona;

	public GesvacPersonaEnfermedad() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public GesvacEnfermedad getGesvacEnfermedad() {
		return this.gesvacEnfermedad;
	}

	public void setGesvacEnfermedad(GesvacEnfermedad gesvacEnfermedad) {
		this.gesvacEnfermedad = gesvacEnfermedad;
	}

	public GesvacEstadoEnfermedad getGesvacEstadoEnfermedad() {
		return this.gesvacEstadoEnfermedad;
	}

	public void setGesvacEstadoEnfermedad(GesvacEstadoEnfermedad gesvacEstadoEnfermedad) {
		this.gesvacEstadoEnfermedad = gesvacEstadoEnfermedad;
	}

	public GesvacPersona getGesvacPersona() {
		return this.gesvacPersona;
	}

	public void setGesvacPersona(GesvacPersona gesvacPersona) {
		this.gesvacPersona = gesvacPersona;
	}

}