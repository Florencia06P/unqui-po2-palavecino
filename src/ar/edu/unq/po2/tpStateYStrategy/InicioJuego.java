package ar.edu.unq.po2.tpStateYStrategy;

public class InicioJuego extends EstadoDeMaquina {

	@Override
	public String presionarBotonInicio(MaquinaDeJuego maquina) {
		
		maquina.setEstado(new IngresoFicha());
		return "Esperando que ingrese una ficha";
	}

	@Override
	public String ingresarFicha(MaquinaDeJuego maquina) {

		return "juego no iniciado";
	}

	@Override
	public String jugar(MaquinaDeJuego maquina) {

		return "juego no iniciado";
	}

}
