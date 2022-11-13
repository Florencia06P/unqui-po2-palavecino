package ar.edu.unq.po2.tpStateYStrategy;

public class SeleccionDeCancion extends EstadoDeReproduccion {

	
	@Override
	public String play(Song song) {
		song.setEstado(new Reproduccion());
		return "Esperando que se reproduzca la cancion";
	}
	@Override
	public String pause(Song song) {
		return "Cancion no reproducida";
	}

	@Override
	public String stop(Song song) {
		
		return "Cancion no reproducida";
	}

}
