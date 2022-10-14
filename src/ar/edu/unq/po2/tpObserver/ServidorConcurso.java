package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;


public class ServidorConcurso implements IObservable {

	ArrayList<Participante> participantes= new ArrayList<Participante>();
	ArrayList<String> respuestas= new ArrayList<String>();
	
	public void agregarParticipante(Participante participante) {
		participantes.add(participante);
	}
	
	public void notificar() {
		for(Participante participante: participantes) {
			participante.actualizar();
		}
	}
	
	public ArrayList<String> getRespuestas() {
		return respuestas;
	}

	/*public void setRespuestas(ArrayList<String> respuestas) {
		this.respuestas = respuestas;
	}*/

	public Boolean verificarRespuesta(String respuesta) {
		//consultar si asi se puede implementar
		this.recibirRespuesta(respuesta);
		//respuestas.contains(respuesta);
		this.notificar();
		return(respuestas.contains(respuesta));
		
	}
	
	
	public String recibirRespuesta(String respuesta) {
		return respuesta;
		
	}
	
}
