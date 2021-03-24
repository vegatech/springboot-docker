package com.examen.productos.services;

import java.util.List;


import com.examen.productos.entity.Precio;
import com.examen.productos.entity.dto.ProductoDTO;

public interface OfertaServices {
	
	public List<Precio> findAll();
	public List<Precio> findById(Long id);
	public ProductoDTO findByNameByDate(String nombre, String desde, String hasta);

}
