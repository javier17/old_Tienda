package com.asesoftware.integracion;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ManejadorPersistencia<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//atributos
	@PersistenceContext
	private transient EntityManager em;
	
	/**
	 * Variable estatica para imprimir logs...
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<T> listar(Class clazz) {
		System.out.println("Ya se listaron las personas en ManejadorPersostencia");
		return em.createNamedQuery(clazz.getSimpleName()+".findAll").getResultList();
	}
	
	 
	public  T buscar(Class<T> cl, Object pk) {
	        return em.find(cl, pk);
	    }
	
	
}
