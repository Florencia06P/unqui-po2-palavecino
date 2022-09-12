package ar.edu.unq.po2.tp4;

import java.util.ArrayList;


public class Supermercado {
	ArrayList<Producto> productos = new ArrayList<Producto>();
	String nombre;
	String direccion;
	
	public Supermercado(String unNombre, String unaDireccion) {
		this.nombre= unNombre;
		this.direccion= unaDireccion;
	}

	public Integer cantidadDeProductos() {
		return productos.size();
	}
	public Integer getCantidadDeProductos() {
		
		return this.cantidadDeProductos();
	}

	public void agregarProducto(Producto arroz) {
		productos.add(arroz);
		
	}

	public Double precioTotal() {
		Double total;
		for(Producto precio:productos) {
			
		}
	}
	public Double getPrecioTotal() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
