package com.examen.productos.entity.dto;

import com.examen.productos.entity.Precio;
import com.examen.productos.entity.Producto;

public class ProductoDTO {
	
   private	Producto producto;
   private  Precio precio;
   
   
	public ProductoDTO() {
	
	}
	public ProductoDTO(Producto producto, Precio precio) {

		this.producto = producto;
		this.precio = precio;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Precio getPrecio() {
		return precio;
	}
	public void setPrecio(Precio precio) {
		this.precio = precio;
	}
	
	
	


   
}
