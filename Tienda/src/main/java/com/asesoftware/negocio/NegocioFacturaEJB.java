package com.asesoftware.negocio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.asesoftware.entidades.Factura;
import com.asesoftware.integracion.GestionFacturaDB;

@Stateless
@LocalBean
public class NegocioFacturaEJB {
	
	@EJB
	private GestionFacturaDB gestionFacturaDB;
	
	public List<Factura> listarFacturas(){
		return gestionFacturaDB.listar();
	}

}
