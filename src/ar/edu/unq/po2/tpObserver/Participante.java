package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;

public class Participante implements IObserver {

	private String nombre;
	private int cantidadDeRespuestasCorrectas;
	private ServidorConcurso servidor;
	//private ArrayList<String> respuestas;

	public Participante(ServidorConcurso servidorConcurso) {
		this.servidor = servidorConcurso;
	}

	public void enviarRespuesta(String respuesta) {
		servidor.recibirRespuesta(respuesta);
	}

	public void actualizar() {
		
		String respuesta = "";
		Pregunta pregunta= new Pregunta("","");
		servidor.notificarAceptacion();
		servidor.verificarRespuesta(respuesta, this, pregunta);
		
		
		// if(servidor.getRespuestas().contains(respuesta)) {
		System.out.println("La respuesta es correcta");
		// }else {
		System.out.println("La respuesta no es correcta");

		// }

	}
	
	public void notificarRespuestaCorrecta() {
		System.out.println("La respuesta es correcta");
	}
	public void notificarRespuestaIncorrecta() {
		System.out.println("La respuesta no es incorrecta");
		
	}

	/*
	public void aceptacion() {
		System.out.println("Aceptado:Puede comenzar");
	}
	*/

	public String getNombre() {
		return nombre;
	}

	public int getCantidadDeRespuestasCorrectas() {
		return cantidadDeRespuestasCorrectas;
	}

	public int registrarCorrectas() {
		return 	cantidadDeRespuestasCorrectas += 1;
	}

	
	

}
