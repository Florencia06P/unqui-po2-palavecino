package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;

public class ServidorConcurso implements IObservable {

	ArrayList<Participante> participantes = new ArrayList<Participante>();
	ArrayList<String> respuestas = new ArrayList<String>();

	public void agregarParticipante(Participante participante) {
		if (participantes.size() < 5) {
			participantes.add(participante);
		}
	}

	public void notificar() {
		for (Participante participante : participantes) {
			participante.actualizar();
		}
	}

	public ArrayList<String> getRespuestas() {
		return respuestas;
	}

	public void verificarRespuesta(String respuestaParticipante, Participante participante, Pregunta pregunta) {
		if (respuestaParticipante.equals(pregunta.getRespuesta())) {
			participante.registrarCorrectas();
			participante.notificarRespuestaCorrecta();
			this.notificarNombreJugadorQueRespondioOk(participante);
			this.notificarEnunciado(pregunta);

		} else {
			participante.notificarRespuestaIncorrecta();
		}
	}

	public String notificarNombreJugadorQueRespondioOk(Participante participante) {
		return participante.getNombre();

	}

	public String notificarEnunciado(Pregunta pregunta) {
		return pregunta.getEnunciado();
	}

	public void notificarAceptacion() {
		System.out.println("Aceptado:Puede comenzar");

	}

	
	/*
	 * public Boolean verificarRespuesta(String respuesta) { //consultar si asi se
	 * puede implementar this.recibirRespuesta(respuesta);
	 * //respuestas.contains(respuesta); this.notificar();
	 * return(respuestas.contains(respuesta));
	 * 
	 * }
	 */

	public String recibirRespuesta(String respuesta) {
		return respuesta;

	}

}
