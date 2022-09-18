package ar.edu.unq.po2.tpinterfaces;

import java.util.ArrayList;

public class CajaEjercicio2 {
	ArrayList<Costeable> costos = new ArrayList<Costeable>();
	
	
	public void productosAComprar(Producto producto){
		costos.add(producto);
		
	}
	
	public void registrarPago(Factura factura) {
		costos.add(factura);
	}
	
	public Double montoTotalAPagar() {
		Double montoTotal= 0.0;
		for(Costeable costeable:costos) {
			montoTotal+= costeable.montoAPagar();
		}
		return montoTotal;
	}
}
