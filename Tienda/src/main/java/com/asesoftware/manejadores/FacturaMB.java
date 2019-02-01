package com.asesoftware.manejadores;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.asesoftware.entidades.Factura;
import com.asesoftware.entidades.Persona;
import com.asesoftware.negocio.NegocioFacturaEJB;

@ViewScoped
@ManagedBean
public class FacturaMB {
	
	private Factura factura;
	private List<Factura> facturas;
	
	private int idFactura;
	private String descripcion;
	private String estado;
	private Date fecha;
	private String tipoFactura;
	private int total;
	private Persona cliente;
	private Persona vendedor;
	
	@EJB
	private NegocioFacturaEJB negocioFacturaEJB;
	
	
	@PostConstruct
	public void init() {
		this.factura = new Factura();
		this.facturas = new ArrayList<>();
	}


	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	public List<Factura> getFacturas() {
		return facturas;
	}


	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}


	public int getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getTipoFactura() {
		return tipoFactura;
	}


	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public Persona getCliente() {
		return cliente;
	}


	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}


	public Persona getVendedor() {
		return vendedor;
	}


	public void setVendedor(Persona vendedor) {
		this.vendedor = vendedor;
	}
	
	
	
	
	
	
	
	
	

}
