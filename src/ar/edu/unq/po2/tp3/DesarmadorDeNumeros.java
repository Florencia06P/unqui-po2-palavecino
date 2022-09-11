package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class DesarmadorDeNumeros {
	
		public ArrayList<Integer> desarmarNumeros(int i){
		ArrayList<Integer> digitos = new ArrayList<Integer>();
		
		while (i>0) {
			digitos.add(i%10);
			i = i / 10;
		}
		return digitos;
	}
	
	/*
	public int numeroConMasPares(int[] numeros) {
		int numero[0];
		for(Integer i:numeros) {
			if(i=1 )
		}
	}
	*/
}
