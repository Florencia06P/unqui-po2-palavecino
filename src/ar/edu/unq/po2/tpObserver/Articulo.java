package ar.edu.unq.po2.tpObserver;


import java.util.List;

public class Articulo {
	String titulo;
	String autor;
	String filiacion;
	String tipo;
	String lugarPublicacion;
	List<String> palabrasClaves;

	public Articulo(String unTitulo, String unAutor, String unaFiliacion, String tipo, List<String> palabrasClaves) {
		this.titulo= unTitulo;
		this.autor= unAutor;
		this.filiacion = unaFiliacion;
		this.tipo=tipo;
		this.palabrasClaves=palabrasClaves;
	}

}
