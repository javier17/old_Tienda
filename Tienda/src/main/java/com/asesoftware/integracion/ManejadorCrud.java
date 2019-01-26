package com.asesoftware.integracion;

import java.util.List;

import javax.ejb.EJB;

public abstract class ManejadorCrud<T,U> {
	
	/**
	 * a imprimir logs
	 */
	
	@EJB
	protected ManejadorPersistencia<T> mp;
	
	private Class<T> claseEntidad;
	
	
	public ManejadorCrud(Class<T> claseEntidad) {
		this.claseEntidad = claseEntidad;
	}
	
	public List<T> listar(){
		List<T> results = mp.listar(claseEntidad);
		System.out.println("Ya se listaron las personas en ManejadorCrud");
		return results;
	}
	
	
	 public T buscar(U pId) {
	     return mp.buscar(getClaseEntidad(), pId);
	    }


	public Class<T> getClaseEntidad() {
		return claseEntidad;
	}

	public void setClaseEntidad(Class<T> claseEntidad) {
		this.claseEntidad = claseEntidad;
	}
	

}
