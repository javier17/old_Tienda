package com.asesoftware.integracion;

import java.util.List;

import javax.ejb.EJB;

public abstract class ManejadorCrud<T,U> implements IManejadorCRUD<T, U>{

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
	
	@Override
	public T crear() {
		T instancia = null;
		try {
			instancia = getClaseEntidad().newInstance();
		}catch (InstantiationException | IllegalAccessException ex) {
			System.out.println("Error al crear");
		}
		return instancia;
	}
	
	@Override
	public void crear(T pData) {
		mp.create(pData);
	}

	@Override
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
