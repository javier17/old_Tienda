package com.asesoftware.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the facturas database table.
 * 
 */
@Entity
@Table(name="facturas")
@NamedQuery(name="Factura.findAll", query="SELECT f FROM Factura f")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idFactura;

	private String descripcion;

	private String estado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String tipoFactura;

	private int total;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="cliente")
	private Persona persona1;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="vendedor")
	private Persona persona2;

	public Factura() {
	}

	public int getIdFactura() {
		return this.idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipoFactura() {
		return this.tipoFactura;
	}

	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Persona getPersona1() {
		return this.persona1;
	}

	public void setPersona1(Persona persona1) {
		this.persona1 = persona1;
	}

	public Persona getPersona2() {
		return this.persona2;
	}

	public void setPersona2(Persona persona2) {
		this.persona2 = persona2;
	}

}