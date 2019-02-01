package com.asesoftware.integracion;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.asesoftware.entidades.Factura;

@Stateless
@LocalBean
public class GestionFacturaDB extends ManejadorCrud<Factura	, Integer>{
	
	public GestionFacturaDB() {
		super(Factura.class);
	}
	
	//protected region Use esta region para su implmentación del manejador on begin
	
	//protected region Use esta region para su implementación del manejador end

}
