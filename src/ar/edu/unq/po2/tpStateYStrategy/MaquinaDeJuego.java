package ar.edu.unq.po2.tpStateYStrategy;

public class MaquinaDeJuego {
	private EstadoDeMaquina estado;

	public MaquinaDeJuego() {
		this.estado = new InicioJuego();
	}

	public void setEstado(EstadoDeMaquina estado) {
		this.estado = estado;

	}

	public EstadoDeMaquina getEstadoMaquina() {
		return this.estado;
	}

	public String presionarBotonInicio() {
		return estado.presionarBotonInicio(this);

	}

	public String ingresarFicha() {
		return estado.ingresarFicha(this);

	}

	public String jugar() {
		return estado.jugar(this);
	}

}
