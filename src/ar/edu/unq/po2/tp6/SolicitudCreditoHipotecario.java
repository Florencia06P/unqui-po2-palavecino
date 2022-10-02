package ar.edu.unq.po2.tp6;

public class SolicitudCreditoHipotecario extends SolicitudCredito {

	Propiedad propiedadDeGarantia;

	public SolicitudCreditoHipotecario(Cliente solicitante, double montoSolicitado, int plazoEnMeses,
			Propiedad propiedad) {

		this.solicitante = solicitante;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
		this.propiedadDeGarantia = propiedad;
	}

	@Override
	public boolean esAceptable() {
		return montoCuotaNoSuperaElPorcentaje() & montoSolicitadoNoSuperaElValorFical() & edadNoSuperada();
	}

	public boolean montoCuotaNoSuperaElPorcentaje() {
		return this.montoCuota() < solicitante.getSueldoMensual() * 50 / 100;
	}

	public boolean montoSolicitadoNoSuperaElValorFical() {
		return montoSolicitado < propiedadDeGarantia.getValorFiscal() * 70 / 100;
	}

	public boolean edadNoSuperada() {
		return solicitante.getEdad() < 65;
	}
}