package ar.edu.unq.po2.tpinterfaces;

public class ProductoDeEmpresaTradicional implements Producto {
	Double precioBase;
	@Override
	public Double getPrecio() {
		
		return precioBase;
	}

}
