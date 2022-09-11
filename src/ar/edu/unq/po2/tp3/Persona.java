package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public class Persona {
	public String nombre;
	public LocalDate fechaNacimiento;

	public Persona(String nombre, LocalDate of) {
		this.setNombre(nombre);
		this.setFechaNacimiento(of);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int edad() {

		LocalDate fechaActual = LocalDate.now();
		Period edad = Period.between(this.getFechaNacimiento(), fechaActual);

		return edad.getYears();

	}

	public boolean menorQue(Persona persona2) {
		
		Persona persona1 = new Persona("Belen", LocalDate.of(1997, Month.FEBRUARY, 6));
		if (persona1.edad() < persona2.edad()) {
			return true;
		}else { return false;}
	}
	
	public Persona nuevaPersonaCon( String nombre,LocalDate fechaNacimiento) {
		Persona nuevaPersona= new Persona(nombre,fechaNacimiento);
		return nuevaPersona;
	}

}
