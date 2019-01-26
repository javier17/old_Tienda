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

}
