package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;

public class SistemaReferenciaYPublicacion {
	private ArrayList<Articulo> articulos = new ArrayList<Articulo>();
	private ArrayList<Investigador> investigadores = new ArrayList<Investigador>();

	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}

	public ArrayList<Articulo> cargarArticulo(Articulo articulo12) {
		articulos.add(articulo12);
		for (Investigador i : investigadores) {
			i.recibirAviso();

		}

		return articulos;

	}

//public void notify() {
//	for(Investigador i: investigadores) {
//		i.recibirAviso(aviso());
//	}
//}

//public void recibirAviso(Investigador investigador) {
//	investigador.recibirAviso(aviso());
//}

	public void cargarInvestigadores(Investigador investigador) {
		investigadores.add(investigador);
	}

}
