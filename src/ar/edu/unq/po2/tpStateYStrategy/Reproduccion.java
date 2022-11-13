package ar.edu.unq.po2.tpStateYStrategy;

public class Reproduccion extends EstadoDeReproduccion {

	@Override
	public String pause(Song song) {
		song.setEstado(new PausaReproduccion());
//		if(song.getEstadoSong() == new PausaReproduccion()) {
//		 	song.setEstado(new Reproduccion());
//		}
//		else {return "No se esta reproduciendo ninguna cancion y tampoco esta en pausa";}
		return "Se pausa la cancion" ;
		
	}

	@Override
	public String stop(Song song) {
		
		return "No se inicio reproduccion";
	}

}
