package com.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Named;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.Utils.ModelUtilJSF;
import com.google.gson.Gson;
import com.models.GesvacVacuna;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Named("controladorVacuna")
@SessionScoped
public class ControladorVacuna implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<GesvacVacuna> lstGesvacVacuna;

	private GesvacVacuna objGesvacVacuna;

	public void inicializarVacunas() {
		consultarVacunas();
		objGesvacVacuna = new GesvacVacuna();
	}

	public void onCellEdit(RowEditEvent<GesvacVacuna> event) {
		objGesvacVacuna = event.getObject();
		try {
			Gson json = new Gson();
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8182/vacuna");
			ClientResponse clientResponse = webResource.accept("application/json").type("application/json")
					.put(ClientResponse.class, json.toJson(objGesvacVacuna));
			inicializarVacunas();
			ModelUtilJSF.mensajeInformacion("Ingreso Correcto");
		} catch (Exception e) {
			ModelUtilJSF.mensajeError("Error al ingresar datos de vacuna. " + e.getMessage());
		}

	}

	public void onRowCancel() {
		ModelUtilJSF.mensajeInformacion("Se cancelo la actualización.");
	}

	/**
	 *
	 *
	 *
	 * SERVICIOS
	 *
	 *
	 *
	 *
	 */

	public void consultarVacunas() {
		Gson json = new Gson();
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8182/vacuna");
		ClientResponse clientResponse = webResource.get(ClientResponse.class);
		String yourResponse = clientResponse.getEntity(String.class);
		System.out.println(yourResponse);
		lstGesvacVacuna = stringToArray(yourResponse);
		/*
		 * lstGesvacVacuna = (ArrayList<GesvacVacuna>)
		 * json.fromJson(clientResponse.getEntity(String.class), new
		 * ArrayList<GesvacVacuna>().getClass());
		 */
	}

	public List<GesvacVacuna> stringToArray(String s) {
		GesvacVacuna[] arr = new Gson().fromJson(s, GesvacVacuna[].class);
		return Arrays.asList(arr); // or return Arrays.asList(new Gson().fromJson(s, clazz)); for a one-liner
	}

	public void ingresarVacuna() {
		try {
			objGesvacVacuna.setEstado("A");
			Gson json = new Gson();
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8182/vacuna");
			ClientResponse clientResponse = webResource.accept("application/json").type("application/json")
					.post(ClientResponse.class, json.toJson(objGesvacVacuna));
			inicializarVacunas();
			ModelUtilJSF.mensajeInformacion("Ingreso Correcto");
		} catch (Exception e) {
			ModelUtilJSF.mensajeError("Error al ingresar datos de vacuna. " + e.getMessage());
		}
	}

	public void eliminarVacuna(GesvacVacuna vacuna) {
		try {
			Gson json = new Gson();
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8182/vacuna");
			ClientResponse clientResponse = webResource.accept("application/json").type("application/json")
					.delete(ClientResponse.class, json.toJson(vacuna));
			inicializarVacunas();
			ModelUtilJSF.mensajeInformacion("Eliminación Correcta");
		} catch (Exception e) {
			ModelUtilJSF.mensajeError("Error al eliminar datos de vacuna. " + e.getMessage());
		}
	}

	public List<GesvacVacuna> getLstGesvacVacuna() {
		return lstGesvacVacuna;
	}

	public void setLstGesvacVacuna(List<GesvacVacuna> lstGesvacVacuna) {
		this.lstGesvacVacuna = lstGesvacVacuna;
	}

	public GesvacVacuna getObjGesvacVacuna() {
		return objGesvacVacuna;
	}

	public void setObjGesvacVacuna(GesvacVacuna objGesvacVacuna) {
		this.objGesvacVacuna = objGesvacVacuna;
	}

}
