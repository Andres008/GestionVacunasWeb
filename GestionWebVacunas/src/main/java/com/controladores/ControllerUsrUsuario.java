package com.controladores;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.Utils.ModelUtilJSF;
import com.google.gson.Gson;
import com.models.UsrUsuario;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

@Named("controllerUsrUsuario")
@SessionScoped
public class ControllerUsrUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private UsrUsuario objUsrUsuario;
	
	public void inicializarUsuario() {
		objUsrUsuario= new UsrUsuario();
	}
	
	
	
	
	/***
	 * 
	 * 
	 * 
	 * 
	 * Servicios
	 * @return
	 */
	
	public String verificarUsuarioContrasenia() {
		try {
			Gson json = new Gson();
			Client client = Client.create();
			client.addFilter(new HTTPBasicAuthFilter(objUsrUsuario.getIdUsuario(), objUsrUsuario.getClave()));
			WebResource webResource = client.resource("http://localhost:8183/usuario");
			ClientResponse clientResponse = webResource.accept("application/json").type("application/json")
					.put(ClientResponse.class, json.toJson(objUsrUsuario));
			String yourResponse = clientResponse.getEntity(String.class);
			System.out.println("Respuesta: "+yourResponse);
			if (yourResponse.contains("Unauthorized")|| yourResponse.isEmpty())
				ModelUtilJSF.mensajeError("Usuario no Authorizado.");
			else
				ModelUtilJSF.mensajeInformacion("Usuario Autorizado.");
			return "";
		}catch (Exception e) {
			ModelUtilJSF.mensajeError(e.getMessage());
			return "";
		}
	}
	
	
	/*****
	 * 
	 * 
	 * @return
	 */

	public UsrUsuario getObjUsrUsuario() {
		return objUsrUsuario;
	}

	public void setObjUsrUsuario(UsrUsuario objUsrUsuario) {
		this.objUsrUsuario = objUsrUsuario;
	}

}
