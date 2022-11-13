package ar.edu.unq.po2.tpStateYStrategy;

public class ParaReproduccion extends EstadoDeReproduccion {

	@Override
	public String pause(Song song) {
		 return "Se pauso la cancion";
	}

	@Override
	public String stop(Song song) {
		song.setEstado(new SeleccionDeCancion());
		return "Se paro la cancion";
	}

}
