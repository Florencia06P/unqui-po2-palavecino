package ar.edu.unq.po2.tpStateYStrategy;

import java.util.ArrayList;

public class EstrategiaVocal implements EstrategiaCodificacion{

	@Override
	public String encriptar(String texto) {
		 
//	           String[] caracteres =texto.split(texto);
			return;
		
		//return texto.replaceAll("a", "e") || texto.replaceAll(texto, texto)
				//texto.replaceAll("e", "i");//.replaceAll("i", "o").replaceAll("o","u").replaceAll("u", "a");
	}

	@Override
	public String desencriptar(String texto) {
		
		return texto.replaceAll("e,i,o,u,a","a,e,i,o,u");
	}
	

}
