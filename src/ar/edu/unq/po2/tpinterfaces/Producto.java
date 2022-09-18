package ar.edu.unq.po2.tpinterfaces;

public  class Producto implements Costeable{

	@Override
	public Double montoAPagar() {
		return precio;
	}
	
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
