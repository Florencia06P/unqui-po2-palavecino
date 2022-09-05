package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
//import java.util.List;

public class Counter {
	
	
	private ArrayList<Integer> numeros = new ArrayList<Integer>();

	/**
	 * public Counter(ArrayList<int> numeros) { super(); this.numeros = numeros; }
	 */

	public int cantidadDePares() {
		
		int pares = 0;

		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % 2 == 0) {
				pares++;
			}
		}
		return pares;
	}

	public void addNumber(int i) {
		numeros.add(i);

	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}

	public int cantidadDeImpares() {
		int impares = 0;

		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % 2 != 0) {
				impares++;
			}
		}
		return impares;
	}

	public int cantidadDeMultiplos(int numero){
		int multiplos = 0;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % numero == 0) {
				multiplos++;
			}
		}
		return multiplos;

	}
	
	/**public static int numeroConMasPares(int [] numeros) {
		
	}*/
	
	

}

