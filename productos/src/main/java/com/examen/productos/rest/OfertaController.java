package com.examen.productos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.examen.productos.entity.Precio;
import com.examen.productos.entity.dto.ProductoDTO;
import com.examen.productos.services.OfertaServices;

@RestController
@CrossOrigin(origins = "*")
public class OfertaController {
	
	@Autowired
	private OfertaServices ofertaService;
	
	
	@GetMapping("/listar")
	public List<Precio> listar(){
		return ofertaService.findAll();
		
	}
	
	@GetMapping("/oferta/{id}")
	public List<Precio> detalle(@PathVariable Long id) {
	return ofertaService.findById(id);
	
	}
	
	@GetMapping("/oferta/{nombre}/desde/{desde}/hasta/{hasta}")
	public ProductoDTO detalleOferta(@PathVariable String nombre,@PathVariable String desde,@PathVariable String hasta) {
	return ofertaService.findByNameByDate(nombre, desde, hasta);
	
	}
	

}
