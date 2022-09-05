package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> numeros = new ArrayList<Integer>();

	public int suma() {

		int sumatoria = 0;

		for (int i = 0; i < numeros.size(); i++) {
			sumatoria = sumatoria + numeros.get(i);
		}
		return sumatoria;
	}

	public int resta() {

		int resta = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			resta = resta - numeros.get(i);
			
		}
		return resta;
		
	}
	
	public int multiplicacion() {
		int multiplicacion = 1;

		for (int i = 0; i < numeros.size(); i++) {
			multiplicacion = multiplicacion * numeros.get(i);
		}
		return multiplicacion;
	}
	public void addNumber(int i) {
		numeros.add(i);

	}

}
