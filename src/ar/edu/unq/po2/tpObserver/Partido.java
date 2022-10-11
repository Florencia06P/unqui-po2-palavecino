package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	
	String resultado;
	List<Contrincante> contrincantes;
	Deporte deporte;

	public Partido(String resultado2, List<Contrincante> contrincantes2, Deporte unDeporte) {
		this.resultado = resultado2;
		this.contrincantes = contrincantes2;
		this.deporte = unDeporte;

	}

}
