package ar.edu.unq.po2.tpStateYStrategy;

public class SesionParaUnJugador extends EstadoDeMaquina {

	@Override
	public String ingresarFicha(MaquinaDeJuego maquina) {
		maquina.setEstado(new SesionParaDosJugadores());
		return "Se ingreso la segunda ficha";
	}

	@Override
	public String jugar(MaquinaDeJuego maquina) {
		maquina.setEstado(new InicioJuego());
		return "Partida terminada";
	}

}
