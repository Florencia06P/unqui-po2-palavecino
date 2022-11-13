package ar.edu.unq.po2.modelo1Parcial;

import java.util.ArrayList;
import java.util.List;

public class Poblacion extends Consumidor {

	private double factorOxidacion;

	private List<Consumidor> consumidores;

	public Poblacion(double factorOxidacion, List<Consumidor> consumidores) {
		this.factorOxidacion = factorOxidacion;
		this.consumidores = consumidores;
	}

	public void agregarConsumidor(Consumidor consumidor) {
		consumidores.add(consumidor);
	}

	@Override
	public double consumoOxigeno() {

		return this.sumatoriaConsumoPorConsumidor() * this.cantidadDeConsumidores() / factorOxidacion;
	}

	public double sumatoriaConsumoPorConsumidor() {

		double sumaConsumo = 0;
		for (Consumidor consumidor : consumidores) {
			sumaConsumo = sumaConsumo + consumidor.consumoOxigeno();
		}
		return sumaConsumo;
	}

	public double cantidadDeConsumidores() {
		return consumidores.size();
	}

}
