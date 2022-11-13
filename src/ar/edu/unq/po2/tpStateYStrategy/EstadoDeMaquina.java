package ar.edu.unq.po2.tpStateYStrategy;

public abstract class EstadoDeMaquina {
	
	public String presionarBotonInicio(MaquinaDeJuego maquina) {
		return "El juego ya fué iniciado";
	}

	public abstract String ingresarFicha(MaquinaDeJuego maquina);

	public abstract String jugar(MaquinaDeJuego maquina);
}
