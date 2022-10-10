package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;

public class Investigador {

	ArrayList<String> avisos;

	public ArrayList<String> recibirAviso(String aviso) {
		avisos.add(aviso);
		return avisos;
	}

	
	}


