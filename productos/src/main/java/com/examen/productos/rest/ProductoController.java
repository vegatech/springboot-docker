package com.examen.productos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.productos.entity.Producto;
import com.examen.productos.repository.ProductoRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/productos")

public class ProductoController {

	
	
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("get")
    public List<Producto> getProducto() {
        return productoRepository.findAll();
    }
	
    
    @GetMapping("nombre/{nombre}")
    public List<Producto> getProductobyName(String nombre) {
        return productoRepository.findByName(nombre);
    }
	
}
