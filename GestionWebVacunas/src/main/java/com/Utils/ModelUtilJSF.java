package com.Utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ModelUtilJSF {

	
	public static void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }

    public static void mensajeInformacion(String mensaje) {
        addMessage(FacesMessage.SEVERITY_INFO, "Atención", mensaje);
    }

    public static void mensajeAdvertencia(String mensaje) {
        addMessage(FacesMessage.SEVERITY_WARN, "Atención", mensaje);
    }

    public static void mensajeError(String mensaje) {
        addMessage(FacesMessage.SEVERITY_ERROR, "Atención", mensaje);
    }
	
}
