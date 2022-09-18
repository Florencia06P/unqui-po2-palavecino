package ar.edu.unq.po2.tpinterfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CajaParte2 {
	private Producto arroz;
	private Producto detergente;
	private Factura facturaDeAgua;
	private Factura telefono;
	private CajaEjercicio2 caja;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		detergente = new Producto("Detergente", 75d);
		facturaDeAgua = new Servicio(900.0,3);
		telefono = new Servicio(944.5,1);
		
		
	}
	@Test
	public void testMontoTotalAPagar() {
		assertEquals(0.0,caja.montoTotalAPagar());
		caja.productosAComprar(arroz);
		caja.productosAComprar(detergente);
		caja.registrarPago(facturaDeAgua);
		caja.registrarPago(telefono);
		assertEquals(1938.4, caja.montoTotalAPagar());
	}

}
