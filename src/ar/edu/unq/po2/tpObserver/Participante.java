package ar.edu.unq.po2.tpObserver;

public class Participante implements IObserver {
	private ServidorConcurso servidor;

	public Participante(ServidorConcurso servidorConcurso) {
		this.servidor = servidorConcurso;
	}

	public void enviarRespuesta(String respuesta) {
		servidor.recibirRespuesta(respuesta);
	}

	public void actualizar() {
		// String respuesta="";
		
		System.out.println("Aceptado:Puede comenzar");
		//if(servidor.getRespuestas().contains(respuesta)) {
			System.out.println("La respuesta es correcta");
		//}else {
		System.out.println("La respuesta no es correcta");

		//}

	}
	
/*	public String respuesta() {
		return "Es un gato";
	}*/

}
