package ar.edu.unq.po2.tpinterfaces;

import java.util.ArrayList;

public class CajaEjercicio1 {

	ArrayList<ProductoMercadoCentral> productos = new ArrayList<ProductoMercadoCentral>();
	
	public void productosAComprar(ProductoMercadoCentral producto){
		productos.add(producto);
		
	}
	
	public Double montoTotalAPagar() {
		Double montoTotal= 0.0;
		for(ProductoMercadoCentral producto:productos) {
			montoTotal+= producto.getMontoAPagar();
		}
		return montoTotal;
	}
}
