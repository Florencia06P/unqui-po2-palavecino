package ar.edu.unq.po2.tp4;

import java.util.function.BooleanSupplier;

public class Producto {
	
	String nombre;
	Double precio;
	boolean esDelProgramaPreciosCuidados = false;
	
	public Producto(String unNombre, double unPrecio) {
		this.nombre= unNombre;
		this.precio= unPrecio;
	}
	public Producto(String unNombre, double unPrecio, boolean unBoolean) {
		this.nombre= unNombre;
		this.precio= unPrecio;
		this.esDelProgramaPreciosCuidados=unBoolean;
	}
	
	public Object getNombre() {
		
		return nombre;
	}
	public Double getPrecio() {
		
		return precio;
	}
	public boolean esPrecioCuidado() {
		
		return esDelProgramaPreciosCuidados;
	}
	public void aumentarPrecio(double aumento) {
		precio= precio + aumento;
		
	}
	
	
}
