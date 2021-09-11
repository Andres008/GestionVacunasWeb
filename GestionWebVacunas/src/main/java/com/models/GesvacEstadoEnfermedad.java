package com.models;

import java.util.List;


/**
 * The persistent class for the gesvac_estado_enfermedad database table.
 * 
 */
public class GesvacEstadoEnfermedad {

	private long id;

	private String descripcion;

	private List<GesvacPersonaEnfermedad> gesvacPersonaEnfermedads;

	public GesvacEstadoEnfermedad() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<GesvacPersonaEnfermedad> getGesvacPersonaEnfermedads() {
		return this.gesvacPersonaEnfermedads;
	}

	public void setGesvacPersonaEnfermedads(List<GesvacPersonaEnfermedad> gesvacPersonaEnfermedads) {
		this.gesvacPersonaEnfermedads = gesvacPersonaEnfermedads;
	}

	public GesvacPersonaEnfermedad addGesvacPersonaEnfermedad(GesvacPersonaEnfermedad gesvacPersonaEnfermedad) {
		getGesvacPersonaEnfermedads().add(gesvacPersonaEnfermedad);
		gesvacPersonaEnfermedad.setGesvacEstadoEnfermedad(this);

		return gesvacPersonaEnfermedad;
	}

	public GesvacPersonaEnfermedad removeGesvacPersonaEnfermedad(GesvacPersonaEnfermedad gesvacPersonaEnfermedad) {
		getGesvacPersonaEnfermedads().remove(gesvacPersonaEnfermedad);
		gesvacPersonaEnfermedad.setGesvacEstadoEnfermedad(null);

		return gesvacPersonaEnfermedad;
	}

}