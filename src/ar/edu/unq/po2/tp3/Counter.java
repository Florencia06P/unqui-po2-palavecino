package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
//import java.util.List;

public class Counter {

	private ArrayList<Integer> numeros = new ArrayList<Integer>();

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

	public int cantidadDeMultiplos(int numero) {
		int multiplos = 0;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % numero == 0) {
				multiplos++;
			}
		}
		return multiplos;

	}

	public int numeroConMasPares(DesarmadorDeNumeros numeros) {
		int numero;
		for (Integer i : numeros) {
			if (i.intValue()) {
				this.cantidadDePares();
			}
		}
		return numero;

	}

	public ArrayList<Integer> desarmarNumeros(int i) {
		ArrayList<Integer> digitos = new ArrayList<Integer>();

		while (i > 0) {
			digitos.add(i % 10);
			i = i / 10;
		}
		return digitos;
	}
	/*
	 * public int numeroConMasPares(int[] numeros) { OTRA FORMA DE ESCRIBIRLO }
	 */
	
	/*public int multiploDeLosNumeros(int x, int y) {
		int mcm=1; 
		int i=2;
		while(i <= x || i <= y)
        {
            if(x%i==0 ||y%i==0)
            {
            mcm=mcm*i;
            if(x%i==0) x=x/i;
            if(y%i==0) y=y/i;
            }
            else
                i=i+1;               
        }
		return mcm;
	}*/
	
	public int multiploDeLosNumeros(int x, int y) {
		int multiploMasAlto=0;
		for (int i=0; i<=1000; i++) {
			if(i%x==0 && i%y==0) {
				multiploMasAlto=multiploMasAlto+i;
			}
			else {
				multiploMasAlto=-1;
			}
		}
		return multiploMasAlto.maxValue();
	}

}
