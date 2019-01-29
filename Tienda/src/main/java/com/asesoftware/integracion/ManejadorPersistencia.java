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
		System.out.println("Ya se listaron las personas en ManejadorPersistencia");
		return em.createNamedQuery(clazz.getSimpleName()+".findAll").getResultList();
	}
	
	/**
	 * 
	 * Persiste un objeto en la base de datos
	 * 
	 * @param obj Instancia de la entidad T a crear en la base de datos
	 */
	public void create(Object obj) {
		em.persist(obj);
	}
	
	/**
	 * 
	 * @param cl
	 * @param pk
	 * @return
	 */

	public  T buscar(Class<T> cl, Object pk) {
	        return em.find(cl, pk);
	    }
	
	
}
