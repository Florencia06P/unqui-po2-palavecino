package ar.edu.unq.po2.parcialPrimeraFecha;

import java.util.List;

public class Ministerio {
	public double montoTotalAInvertir(List<Secretaria> secretarias) {
		double total = 0;
		for(Secretaria secretaria:secretarias) {
			total += secretaria.montoTotal();
		}
		return total;
	}
}
