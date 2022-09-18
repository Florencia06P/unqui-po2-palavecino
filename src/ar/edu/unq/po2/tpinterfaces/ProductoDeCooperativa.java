package ar.edu.unq.po2.tpinterfaces;

public class ProductoDeCooperativa extends Producto{
	public ProductoDeCooperativa(String unNombre, double unPrecio) {
		super(unNombre, unPrecio);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Double montoAPagar() {
		
		return this.getPrecio() - (this.getPrecio() *10/100);
	}

}
