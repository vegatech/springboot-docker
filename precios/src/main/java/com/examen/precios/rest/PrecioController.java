package com.examen.precios.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.precios.entity.Precio;
import com.examen.precios.repository.PrecioRepository;






@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/precios")
public class PrecioController {
	
	
	
	
	
    @Autowired
    private PrecioRepository precioRepository;

    @GetMapping("get")
    public List<Precio> getPrecio() {
        return precioRepository.findAll();
        
    }
	
	
	@GetMapping("/get/{id}")
	public List<Precio> detalle(Integer id){
		return precioRepository.findByIdProducto(id);
	}

	@GetMapping("/fecha/{desde}{hasta}")
	public List<Precio> getfecha(String desde, String hasta){
		return precioRepository.findByRangoFecha(desde, hasta);
	}

	
	
}
