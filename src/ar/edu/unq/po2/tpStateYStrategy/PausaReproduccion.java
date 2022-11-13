package ar.edu.unq.po2.tpStateYStrategy;

public class PausaReproduccion extends EstadoDeReproduccion {

	@Override
	public String pause(Song song) {
		song.setEstado(new ParaReproduccion());
		  return "Continua con la reproduccion";
	
	}

	@Override
	public String stop(Song song) {
		song.setEstado(new SeleccionDeCancion());
		return "No se inicio reproduccion";
	}

}
