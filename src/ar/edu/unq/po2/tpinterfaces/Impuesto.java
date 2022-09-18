package ar.edu.unq.po2.tpinterfaces;

public class Impuesto extends Factura {
	Double tasaDelServicio;

	@Override
	public Double montoAPagar() {

		return this.getTasaDelServicio();
	}

	public Double getTasaDelServicio() {
		return tasaDelServicio;
	}

	public void setTasaDelServicio(Double tasaDelServicio) {
		this.tasaDelServicio = tasaDelServicio;
	}

}
