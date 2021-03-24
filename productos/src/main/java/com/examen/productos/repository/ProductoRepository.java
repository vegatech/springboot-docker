package com.examen.productos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.examen.productos.entity.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Integer> {

	
	  @Query(value ="select * from productos p where p.nombre=?1 ", nativeQuery = true)
	    public List<Producto> findByName(String nombre);
	
}
