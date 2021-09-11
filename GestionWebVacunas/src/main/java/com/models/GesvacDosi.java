package com.models;

import java.util.Date;



public class GesvacDosi  {

	private long id;

	private String centroVacunacion;

	private Date fecha;

	private String lote;

	private String vacunador;

	private GesvacPersona gesvacPersona;

	private GesvacVacuna gesvacVacuna;

	public GesvacDosi() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCentroVacunacion() {
		return this.centroVacunacion;
	}

	public void setCentroVacunacion(String centroVacunacion) {
		this.centroVacunacion = centroVacunacion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLote() {
		return this.lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getVacunador() {
		return this.vacunador;
	}

	public void setVacunador(String vacunador) {
		this.vacunador = vacunador;
	}

	public GesvacPersona getGesvacPersona() {
		return this.gesvacPersona;
	}

	public void setGesvacPersona(GesvacPersona gesvacPersona) {
		this.gesvacPersona = gesvacPersona;
	}

	public GesvacVacuna getGesvacVacuna() {
		return this.gesvacVacuna;
	}

	public void setGesvacVacuna(GesvacVacuna gesvacVacuna) {
		this.gesvacVacuna = gesvacVacuna;
	}

}