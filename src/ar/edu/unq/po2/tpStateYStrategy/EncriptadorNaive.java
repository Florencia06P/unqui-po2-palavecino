package ar.edu.unq.po2.tpStateYStrategy;

public class EncriptadorNaive {
	private EstrategiaCodificacion codificacion;
	
	public String encriptar(String texto) {
		return codificacion.encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return codificacion.desencriptar(texto);
	}
	
	public void setCodificacion(EstrategiaCodificacion codificacion) {
		this.codificacion = codificacion;
	}
}
