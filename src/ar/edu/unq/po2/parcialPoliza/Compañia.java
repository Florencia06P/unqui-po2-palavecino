package ar.edu.unq.po2.parcialPoliza;

import java.util.List;

public class Compañia {
	private List<Poliza> polizas;

	public void addPoliza(Poliza poliza) {
		polizas.add(poliza);

	}

	public List<Poliza> getPolizas() {
		return polizas;
	}

	public void setPolizas(List<Poliza> polizas) {
		this.polizas = polizas;
	}
	
}
