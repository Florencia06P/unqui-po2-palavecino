package ar.edu.unq.po2.tpObserver;

import java.util.List;

public class Servidor1 implements IServidor{
	List<Partido> partidos;
	
	public void agregarPartido(Partido partido) {
		partidos.add(partido);
	}
}
