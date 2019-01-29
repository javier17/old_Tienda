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
	
	//protected region Use esta region para su implmentación del manejador on begin
	
	//protected region Use esta region para su implementación del manejador end

}
