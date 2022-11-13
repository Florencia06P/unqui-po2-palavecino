package ar.edu.unq.po2.tpStateYStrategy;

public class SesionParaDosJugadores extends EstadoDeMaquina {

	@Override
	public String ingresarFicha(MaquinaDeJuego maquina) {

		return "Ya se ingresaron dos fichas";
	}

	@Override
	public String jugar(MaquinaDeJuego maquina) {
		maquina.setEstado(new InicioJuego());
		return "Partida terminada";
	}

}
