package com.asesoftware.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the personas database table.
 * 
 */
@Entity
@Table(name="personas")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idPersona;

	private String apellidoPersona;

	private String nombrePersona;

	private String telefono;

	private String tipoPersona;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="persona1")
	private List<Factura> facturas1;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="persona2")
	private List<Factura> facturas2;

	public Persona() {
	}

	public int getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getApellidoPersona() {
		return this.apellidoPersona;
	}

	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}

	public String getNombrePersona() {
		return this.nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public List<Factura> getFacturas1() {
		return this.facturas1;
	}

	public void setFacturas1(List<Factura> facturas1) {
		this.facturas1 = facturas1;
	}

	public Factura addFacturas1(Factura facturas1) {
		getFacturas1().add(facturas1);
		facturas1.setPersona1(this);

		return facturas1;
	}

	public Factura removeFacturas1(Factura facturas1) {
		getFacturas1().remove(facturas1);
		facturas1.setPersona1(null);

		return facturas1;
	}

	public List<Factura> getFacturas2() {
		return this.facturas2;
	}

	public void setFacturas2(List<Factura> facturas2) {
		this.facturas2 = facturas2;
	}

	public Factura addFacturas2(Factura facturas2) {
		getFacturas2().add(facturas2);
		facturas2.setPersona2(this);

		return facturas2;
	}

	public Factura removeFacturas2(Factura facturas2) {
		getFacturas2().remove(facturas2);
		facturas2.setPersona2(null);

		return facturas2;
	}

}