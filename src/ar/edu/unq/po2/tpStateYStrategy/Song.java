package ar.edu.unq.po2.tpStateYStrategy;

public class Song {
	private EstadoDeReproduccion estadoReproduccion;
	
	public Song() {
		this.estadoReproduccion = new SeleccionDeCancion();
	}
	
	public void setEstado(EstadoDeReproduccion estado) {
		this.estadoReproduccion = estado;

	}
	
	public EstadoDeReproduccion getEstadoSong() {
		return this.estadoReproduccion;
	}
	
	public String play() {
		return estadoReproduccion.play(this);

	}
	
	public String pause() {
		return estadoReproduccion.pause(this);

	}
	
	public String stop() {
		return estadoReproduccion.stop(this);

	}
}
