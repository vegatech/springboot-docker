package com.examen.productos.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.examen.productos.entity.Precio;
import com.examen.productos.entity.Producto;
import com.examen.productos.entity.dto.ProductoDTO;

@Service
public class OfertaServiceImp implements OfertaServices {
	
	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Precio> findAll() {
		List<Precio> precios = Arrays.asList(clienteRest.getForObject("http://localhost:8082/precios/get",Precio[].class));
		
		return precios.stream().map(p -> new Precio(p.getIdProducto(),p.getPrecio(),p.getPrecioOferta(),p.getFechaInicioOferta(),p.getFechaFinOferta())).collect(Collectors.toList());
	}

	@Override
	public List<Precio> findById(Long id) {
		Map<String, String>  pathVariables = new HashMap<String, String>();
		pathVariables.put("id", "1");
	
		List<Precio> precio = Arrays.asList(clienteRest.getForObject("http://localhost:8082/precios/get/{id}?id="+id,Precio[].class, 2));
		
		
		return precio.stream().map(p -> new Precio(p.getIdProducto(),p.getPrecio(),p.getPrecioOferta(),p.getFechaInicioOferta(),p.getFechaFinOferta())).collect(Collectors.toList());
	}
	
	
	@Override
	public ProductoDTO findByNameByDate(String nombre, String desde, String hasta) {
		 final String uri1 = "http://localhost:8081/productos/nombre/{nombre}?nombre="+nombre;
		 final String uri2 = "http://localhost:8082/precios/fecha/{desde}{hasta}?desde="+desde+"&hasta="+hasta;

		 

		Map<String, String>  pathVariables1 = new HashMap<String, String>();
		pathVariables1.put("nombre", nombre);

		
		Map<String, String>  pathVariables2 = new HashMap<String, String>();
		pathVariables2.put("desde", desde);
		pathVariables2.put("hasta", hasta);
	
	

	
		List<Producto> Lproducto =  Arrays.asList(clienteRest.getForObject(uri1 ,Producto[].class,pathVariables1));
		Producto productoObj = new Producto();
		productoObj.setId(Lproducto.get(0).getId());
		productoObj.setNombre(Lproducto.get(0).getNombre());
		productoObj.setDescripcion(Lproducto.get(0).getNombre());

		List<Precio> Lprecios = Arrays.asList(clienteRest.getForObject(uri2 ,Precio[].class,pathVariables2));
		Precio precioObj = new Precio();
		precioObj.setIdProducto(Lprecios.get(0).getIdProducto());
		precioObj.setPrecio(Lprecios.get(0).getPrecio());
		precioObj.setPrecioOferta(Lprecios.get(0).getPrecioOferta());
		precioObj.setFechaInicioOferta(Lprecios.get(0).getFechaInicioOferta());
		precioObj.setFechaFinOferta(Lprecios.get(0).getFechaFinOferta());
	   

		return new ProductoDTO(productoObj, precioObj);
	}
	
	

}
