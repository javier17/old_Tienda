package com.asesoftware.negocio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.asesoftware.entidades.Persona;
import com.asesoftware.integracion.GestionPersonaDB;

@Stateless
@LocalBean
public class NegocioPersonaEJB {
	
	@EJB
	private GestionPersonaDB gestionPersonaDB;
	

	public List<Persona> listarPersonas(){
		return gestionPersonaDB.listar();
	}
	
	public void crear(Persona persona) {
		try {
		gestionPersonaDB.crear(persona);
		}catch (Exception e) {
			System.out.println("Error al crear una persona en gestionPersonaEJB");
		}
	}

}
