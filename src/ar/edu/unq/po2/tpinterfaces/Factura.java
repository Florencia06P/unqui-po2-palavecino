package ar.edu.unq.po2.tpinterfaces;

public  class Factura implements Costeable{
	Factura tipo;
	Double montoAPagar;
	public Double getMontoAPagar() {
		return montoAPagar;
	}
	public void setMontoAPagar(Double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	public  Double montoAPagar() {
		return this.getMontoAPagar();
		
	}
}
