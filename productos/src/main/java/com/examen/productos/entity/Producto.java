package com.examen.productos.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable  {


	/**
	 * 
	 */
	private static final long serialVersionUID = 355556173396636728L;


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    
    
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
	
	
	
    
    
    
    public Producto() {
	
	}


	public Producto(Integer id, String nombre, String descripcion) {

		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
