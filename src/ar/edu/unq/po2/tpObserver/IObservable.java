package ar.edu.unq.po2.tpObserver;

public interface IObservable {
	public void agregarParticipante(Participante participante);
	public void notificar();
}
