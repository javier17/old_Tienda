package com.asesoftware.integracion;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.asesoftware.entidades.Persona;

@Stateless
@LocalBean
public class GestionPersonaDB extends ManejadorCrud<Persona	, Integer>{
	
	public GestionPersonaDB() {
		super(Persona.class);
	}
	
	//protected region Use esta region para su implmentaci�n del manejador on begin
	
	//protected region Use esta region para su implementaci�n del manejador end

}
