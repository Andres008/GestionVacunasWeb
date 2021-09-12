package com.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the gesvac_persona database table.
 * 
 */
public class GesvacPersona {

	private String cedula;

	private String apellidos;

	private String correoElectronico;

	private String direcion;

	private String fechaNacimiento;

	private String nombres;

	private String ocupacion;

	private List<GesvacDosi> gesvacDosis;

	private List<GesvacPersonaEnfermedad> gesvacPersonaEnfermedads;

	public GesvacPersona() {
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getDirecion() {
		return this.direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public String getFechaNacimiento() throws Exception {
		return this.fechaNacimiento;	
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getOcupacion() {
		return this.ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public List<GesvacDosi> getGesvacDosis() {
		return this.gesvacDosis;
	}

	public void setGesvacDosis(List<GesvacDosi> gesvacDosis) {
		this.gesvacDosis = gesvacDosis;
	}

	public GesvacDosi addGesvacDosi(GesvacDosi gesvacDosi) {
		getGesvacDosis().add(gesvacDosi);
		gesvacDosi.setGesvacPersona(this);

		return gesvacDosi;
	}

	public GesvacDosi removeGesvacDosi(GesvacDosi gesvacDosi) {
		getGesvacDosis().remove(gesvacDosi);
		gesvacDosi.setGesvacPersona(null);

		return gesvacDosi;
	}

	public List<GesvacPersonaEnfermedad> getGesvacPersonaEnfermedads() {
		return this.gesvacPersonaEnfermedads;
	}

	public void setGesvacPersonaEnfermedads(List<GesvacPersonaEnfermedad> gesvacPersonaEnfermedads) {
		this.gesvacPersonaEnfermedads = gesvacPersonaEnfermedads;
	}

	public GesvacPersonaEnfermedad addGesvacPersonaEnfermedad(GesvacPersonaEnfermedad gesvacPersonaEnfermedad) {
		getGesvacPersonaEnfermedads().add(gesvacPersonaEnfermedad);
		gesvacPersonaEnfermedad.setGesvacPersona(this);

		return gesvacPersonaEnfermedad;
	}

	public GesvacPersonaEnfermedad removeGesvacPersonaEnfermedad(GesvacPersonaEnfermedad gesvacPersonaEnfermedad) {
		getGesvacPersonaEnfermedads().remove(gesvacPersonaEnfermedad);
		gesvacPersonaEnfermedad.setGesvacPersona(null);

		return gesvacPersonaEnfermedad;
	}

	@Override
	public String toString() {
		return "GesvacPersona [cedula=" + cedula + ", apellidos=" + apellidos + ", correoElectronico="
				+ correoElectronico + ", direcion=" + direcion + ", fechaNacimiento=" + fechaNacimiento + ", nombres="
				+ nombres + ", ocupacion=" + ocupacion + ", gesvacDosis=" + gesvacDosis + ", gesvacPersonaEnfermedads="
				+ gesvacPersonaEnfermedads + "]";
	}

}