package com.controladores;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.Utils.ModelUtilJSF;
import com.google.gson.Gson;
import com.models.GesvacEnfermedad;
import com.models.GesvacEstadoEnfermedad;
import com.models.GesvacPersona;
import com.models.GesvacPersonaEnfermedad;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Named("controladorPersona")
@SessionScoped
public class ControladorPersona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GesvacPersona objGesvacPersona;

	private Date va_fecha_nacimiento;

	private GesvacPersonaEnfermedad objGesvacPersonaEnfermedad;

	public void inicializarPersona() {
		objGesvacPersona = new GesvacPersona();
		objGesvacPersona.setGesvacPersonaEnfermedads(new ArrayList<GesvacPersonaEnfermedad>());
		va_fecha_nacimiento = new Date();
		inicializarGesvacPersonaEnfermedad();
	}

	public void inicializarGesvacPersonaEnfermedad() {
		objGesvacPersonaEnfermedad = new GesvacPersonaEnfermedad();
		objGesvacPersonaEnfermedad.setGesvacEnfermedad(new GesvacEnfermedad());
		objGesvacPersonaEnfermedad.setGesvacEstadoEnfermedad(new GesvacEstadoEnfermedad());
	}

	public void agregarEnfermedad() {
		objGesvacPersona.getGesvacPersonaEnfermedads().add(objGesvacPersonaEnfermedad);
		inicializarGesvacPersonaEnfermedad();
	}

	/*****
	 * 
	 * 
	 * 
	 * Servicios
	 * 
	 * @return
	 */

	public void ingresarPersona() {
		try {
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			objGesvacPersona.setFechaNacimiento(formato.format(va_fecha_nacimiento));
			Gson json = new Gson();
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8182/persona");
			System.out.println(json.toJson(objGesvacPersona));
			ClientResponse clientResponse = webResource.accept("application/json").type("application/json")
					.post(ClientResponse.class, json.toJson(objGesvacPersona));
			String respuesta = clientResponse.getEntity(String.class);
			if (respuesta.equals("100")) {
				inicializarPersona();
				ModelUtilJSF.mensajeInformacion("Ingreso Correcto");
			} else {
				ModelUtilJSF.mensajeError("Error al ingresar datos de vacuna. " + respuesta);
			}
		} catch (Exception e) {
			ModelUtilJSF.mensajeError("Error al ingresar datos de vacuna. " + e.getMessage());
		}
	}

	/************
	 * 
	 * 
	 * @return
	 */

	public GesvacPersona getObjGesvacPersona() {
		return objGesvacPersona;
	}

	public void setObjGesvacPersona(GesvacPersona objGesvacPersona) {
		this.objGesvacPersona = objGesvacPersona;
	}

	public Date getVa_fecha_nacimiento() {
		return va_fecha_nacimiento;
	}

	public void setVa_fecha_nacimiento(Date va_fecha_nacimiento) {
		this.va_fecha_nacimiento = va_fecha_nacimiento;
	}

	public GesvacPersonaEnfermedad getObjGesvacPersonaEnfermedad() {
		return objGesvacPersonaEnfermedad;
	}

	public void setObjGesvacPersonaEnfermedad(GesvacPersonaEnfermedad objGesvacPersonaEnfermedad) {
		this.objGesvacPersonaEnfermedad = objGesvacPersonaEnfermedad;
	}

}
