package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	
	public ProductoPrimeraNecesidad(String unNombre, double unPrecio, boolean unBoolean) {
		this.nombre= unNombre;
		this.precio= unPrecio;
		this.esDelProgramaPreciosCuidados=unBoolean;
	}
	
	public Double getPrecio() {
		
		return precio;
	}
	
	public void aplicarDescuento(double descuento) {
		precio = precio * descuento;
	}

}
