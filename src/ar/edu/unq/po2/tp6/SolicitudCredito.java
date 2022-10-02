package ar.edu.unq.po2.tp6;

public abstract class SolicitudCredito {
	Cliente solicitante;
	float montoSolicitado;
	int plazoEnMeses;
	//float cantidadCuotas;
	// float montoCuota;

	// public boolean esAceptable;
	public boolean montoCuotaNoSuperaElPorcentaje;

	

	protected abstract boolean esAceptable();

	public float montoCuota() {

		return montoSolicitado / plazoEnMeses;
	}

	public float getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(float montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
}