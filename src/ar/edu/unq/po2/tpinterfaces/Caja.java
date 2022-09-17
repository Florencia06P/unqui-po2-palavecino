package ar.edu.unq.po2.tpinterfaces;

import java.util.ArrayList;

public class Caja {

	ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public void productosAComprar(Producto producto){
		productos.add(producto);
		
	}
	
	public Double montoTotalAPagar() {
		Double montoTotal= 0.0;
		for(Producto producto:productos) {
			montoTotal+= producto.getPrecio();
		}
		return montoTotal;
	}
}
