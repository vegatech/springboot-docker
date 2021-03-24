package com.examen.precios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.examen.precios.entity.Precio;

public interface PrecioRepository extends JpaRepository<Precio, Integer> {
	
	  @Query(value ="select * from precios p where p.fecha_inicio_oferta=?1 and p.fecha_fin_oferta=?2", nativeQuery = true)
	    public List<Precio> findByRangoFecha(String desde, String hasta);
	  
	  @Query(value ="select * from precios p where p.id_producto=?1", nativeQuery = true)
	    public List<Precio> findByIdProducto(Integer id);


	
}
