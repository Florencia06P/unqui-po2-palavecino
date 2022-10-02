package ar.edu.unq.po2.tp6;

public class SolicitudCreditoPersonal extends SolicitudCredito {
	
	public SolicitudCreditoPersonal(Cliente solicitante, double montoSolicitado, int plazoEnMeses) {
		
		this.solicitante = solicitante;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}

    @Override
	public boolean esAceptable() {
        return tieneIngresosAnualesSuficientes() & montoCuotaNoSuperaElPorcentaje();
    }

    public boolean tieneIngresosAnualesSuficientes() {
        return solicitante.getSueldoAnual() >= 15.000f;
    }


    public boolean montoCuotaNoSuperaElPorcentaje() {
        return this.montoCuota() < solicitante.getSueldoMensual() * 70 / 100;
    }
}
