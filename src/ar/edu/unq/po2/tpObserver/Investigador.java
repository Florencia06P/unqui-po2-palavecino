package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;

public class Investigador {

	ArrayList<String> avisos= new ArrayList<String>();

	public ArrayList<String> recibirAviso() {

		avisos.add(aviso());
		return avisos;
	}

	public ArrayList<String> getAvisos() {
		return avisos;
	}

	public void setAvisos(ArrayList<String> avisos) {
		this.avisos = avisos;
	}

	public String aviso() {
		return "Ha ingresado una nueva conferencia que puede ser de su interes";
	}
}
