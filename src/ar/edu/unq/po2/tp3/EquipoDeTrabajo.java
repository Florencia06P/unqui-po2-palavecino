package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	String nombre;
	ArrayList<Persona> integrantes = new ArrayList<Persona>();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}
	
	public int promedioDeEdades() {}
	
	
}
