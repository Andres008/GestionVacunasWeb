package com.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

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
	
	public void inicializarVacunas() {
		consultarVacunas();
	}
	
	@SuppressWarnings("unchecked")
	public void consultarVacunas() {
		Gson json = new Gson();
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8182/vacuna");
		ClientResponse clientResponse = webResource.get(ClientResponse.class); 
		lstGesvacVacuna = json.fromJson(clientResponse.getEntity(String.class), new ArrayList<GesvacVacuna>().getClass());
	}

	public List<GesvacVacuna> getLstGesvacVacuna() {
		return lstGesvacVacuna;
	}

	public void setLstGesvacVacuna(List<GesvacVacuna> lstGesvacVacuna) {
		this.lstGesvacVacuna = lstGesvacVacuna;
	}
	
	
	
	
	

}
