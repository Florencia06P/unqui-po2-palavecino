package ar.edu.unq.po2.modelo1Parcial;

import java.util.ArrayList;

public class Barril {
	
	private ArrayList<Consumidor> consumidores;
	private String codigo;
	private int añoFabricacion;

	public Barril(ArrayList<Consumidor> consumidores, String codigo, int añoFabricacion) {
		this.consumidores = consumidores;
		this.codigo = codigo;
		this.añoFabricacion = añoFabricacion;
	}
	
	

}
