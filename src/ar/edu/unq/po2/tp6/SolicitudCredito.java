package ar.edu.unq.po2.tp6;

public abstract class SolicitudCredito {
	Cliente solicitante;
	double montoSolicitado;
	int plazoEnMeses;
	//float cantidadCuotas;
	// float montoCuota;

	// public boolean esAceptable;
	public boolean montoCuotaNoSuperaElPorcentaje;

	

	protected abstract boolean esAceptable();

	public double montoCuota() {

		return montoSolicitado / plazoEnMeses;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(float montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
}