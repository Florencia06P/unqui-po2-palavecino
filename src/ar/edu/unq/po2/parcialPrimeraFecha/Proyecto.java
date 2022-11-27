package ar.edu.unq.po2.parcialPrimeraFecha;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Proyecto extends Obra {
	private LocalDate fechaInicio;
	private int duracion;
	
	private List<Empleado> empleados;

	public Proyecto(String nombre, Empleado lider, LocalDate fecha, int duracion, List<Empleado> empleados) {
		super(nombre, lider);
		this.fechaInicio = fecha;
		this.duracion = duracion;
		this.empleados = empleados;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	@Override
	public double inversionTotal() {
		return this.sumatoriaDeSueldos() * this.getDuracion();
	}
	public double sumatoriaDeSueldos() {
		return this.empleados.stream().mapToDouble(e->e.sueldoDiario()).sum()
				+this.getLider().sueldoDiario();
	}
	
	public void addEmpleado(Empleado e) {
		empleados.add(e);
	}
}
