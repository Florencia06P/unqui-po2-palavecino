package ar.edu.unq.po2.tpStateYStrategy;

public class IngresoFicha extends EstadoDeMaquina {

	

	@Override
	public String ingresarFicha(MaquinaDeJuego maquina) {
		maquina.setEstado(new SesionParaUnJugador());
		return "Se ingreso la primer ficha";
	}

	@Override
	public String jugar(MaquinaDeJuego maquina) {
	
		return "Debe ingresar al menos una ficha";
	}

}
