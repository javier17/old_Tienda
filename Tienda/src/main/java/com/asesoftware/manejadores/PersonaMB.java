package com.asesoftware.manejadores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.asesoftware.entidades.Persona;
import com.asesoftware.negocio.NegocioPersonaEJB;
import com.asesoftware.util.Mensaje;

@ViewScoped
@ManagedBean
public class PersonaMB {
	
	private Persona persona;
	private List<Persona> personas;
	
	private int idPersona;
	private String apellidoPersona;
	private String nombrePersona;
	private String telefono;
	private String tipoPersona;
	private int cantidad;
	
	@EJB
	private NegocioPersonaEJB negocioPersonaEJB;
	
	@PostConstruct
	public void init() {
		this.persona = new Persona();
		this.personas = new ArrayList<>();
		this.listarPersonas();
	}
	
	public void listarPersonas() {
		this.personas = negocioPersonaEJB.listarPersonas();
		this.cantidad = this.personas.size();		
	}
	
	public void guardarPersona() {
		this.persona = new Persona();
		this.persona.setNombrePersona(nombrePersona);
		this.persona.setApellidoPersona(apellidoPersona);
		this.persona.setTelefono(telefono);
		this.persona.setTipoPersona(tipoPersona);
		try {
			//Colocar método guardar
			Mensaje.mostrarMensaje2("Persona regisrada exitosamente!!", "Info");
		}catch (Exception e) {
			System.out.println("Error al guardar la persona en PersonaMB");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getApellidoPersona() {
		return apellidoPersona;
	}

	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Pendiente formatear el tipo de persona de C a Cliente ...
	 */
	
	
}
