package ar.edu.unq.po2.tpinterfaces;

public class ProductoDeCooperativa implements Producto{
	Double precioBase;
	@Override
	public Double getPrecio() {
		
		return precioBase - (precioBase *10/100);
	}

}
