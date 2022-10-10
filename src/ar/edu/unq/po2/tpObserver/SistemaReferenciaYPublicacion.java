package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;

public class SistemaReferenciaYPublicacion {
 ArrayList<Articulo> articulos;
 ArrayList<Investigador> investigadores;
	

public ArrayList<Articulo> getArticulos() {
	return articulos;
}


public void setArticulos(ArrayList<Articulo> articulos) {
	this.articulos = articulos;
}


public ArrayList<Articulo> cargarArticulo(Articulo articulo12) {
	articulos.add(articulo12);
	for (Investigador i : investigadores) {
		this.recibirAviso(i);
	}

	/*for (int i = 0; i < investigadores.size(); i++) {
		investigadores.get(i).enviarAviso(i);
	}*/
	return articulos;
	
}

public void recibirAviso(Investigador investigador) {
	investigador.recibirAviso(aviso());
}

public String aviso() {
	return "Ha ingresado una nueva conferencia que puede ser de su interes";
}
public void cargarInvestigadores(Investigador investigador){
	investigadores.add(investigador);
}



}
