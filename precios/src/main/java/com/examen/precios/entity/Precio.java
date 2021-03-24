package com.examen.precios.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "precios")
public class Precio implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3809971165382468605L;



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Integer idProducto;
    


    @Basic(optional = false)
    @Column(name = "precio")
    private long precio;
    


    @Basic(optional = false)
    @Column(name = "precio_oferta")
    private long precioOferta;
    
    @Basic(optional = false)
    @Column(name = "fecha_inicio_oferta")
	@Temporal(TemporalType.DATE)
    private Date fechaInicioOferta;
	
    
    @Basic(optional = false)
    @Column(name = "fecha_fin_oferta")
	@Temporal(TemporalType.DATE)
    private Date fechaFinOferta;


	public Integer getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}


	public long getPrecio() {
		return precio;
	}


	public void setPrecio(long precio) {
		this.precio = precio;
	}


	public long getPrecioOferta() {
		return precioOferta;
	}


	public void setPrecioOferta(long precioOferta) {
		this.precioOferta = precioOferta;
	}


	public Date getFechaInicioOferta() {
		return fechaInicioOferta;
	}


	public void setFechaInicioOferta(Date fechaInicioOferta) {
		this.fechaInicioOferta = fechaInicioOferta;
	}


	public Date getFechaFinOferta() {
		return fechaFinOferta;
	}


	public void setFechaFinOferta(Date fechaFinOferta) {
		this.fechaFinOferta = fechaFinOferta;
	}
	

    
    
}
