package ar.edu.unq.po2.tpStateYStrategy;

public abstract class EstadoDeReproduccion {
	
	public String play(Song song) {
		return "Esperando que selecciona una cancion";
	}

	public abstract String pause(Song song);

	public abstract String stop(Song song);
}
