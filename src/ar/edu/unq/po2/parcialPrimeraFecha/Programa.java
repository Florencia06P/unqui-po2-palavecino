package ar.edu.unq.po2.parcialPrimeraFecha;

import java.time.LocalDate;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class Programa extends Obra {
	private double costoGestion;
	private List<Obra> obras = new ArrayList<Obra>();

	public Programa(String nombre, Empleado lider, double costo) {
		super(nombre, lider);
		this.costoGestion = costo;
		

	}

	public LocalDate getFechaInicio() {
		return obras.stream().map(o -> o.getFechaInicio()).min(LocalDate::compareTo).get();
	}

	@Override
	public double inversionTotal() {
		return this.obras.stream().mapToDouble(o -> o.inversionTotal()).sum() + this.costoGestion;
	}

	public void addObras(Obra obras) {
		this.obras.add(obras);
	}

}
