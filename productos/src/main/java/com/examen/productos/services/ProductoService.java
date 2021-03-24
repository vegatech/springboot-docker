package com.examen.productos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.productos.repository.ProductoRepository;

@Service
@Transactional
public class ProductoService {

    @Autowired
   ProductoRepository productoRepository;
    
	
}
