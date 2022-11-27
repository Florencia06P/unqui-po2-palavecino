package ar.edu.unq.po2.parcialPrimeraFecha;

import java.time.LocalDate;
import java.util.Date;

public abstract class Obra {
	private String nombre;
	private Empleado lider;

	public Obra(String nombre, Empleado lider) {
		this.nombre = nombre;
		this.lider = lider;
	}

	public abstract double inversionTotal();

	public Empleado getLider() {
		return lider;
	}

	protected abstract LocalDate getFechaInicio();
}
