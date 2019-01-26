package com.asesoftware.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Mensaje {
	
	public static void mostrarMensaje2(String textoMensaje, String severidad){
		switch (severidad) {
		case "Info":
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", textoMensaje));
			break;
		case "warn":
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", textoMensaje));
		break;
		case "Error":
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", textoMensaje));
			break;
		case "Fatal":
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", textoMensaje));
		break;
		default:
			break;
		}
    
}

}
