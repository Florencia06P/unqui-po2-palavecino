package ar.edu.unq.po2.tpObserverTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpObserver.Participante;
import ar.edu.unq.po2.tpObserver.Pregunta;
import ar.edu.unq.po2.tpObserver.ServidorConcurso;

class ConcursoTest {
	
private  String respuesta1;
private ServidorConcurso servidorConcurso;
private	Participante participante1;
private	Participante participante2;
private	Participante participante3;
private Pregunta pregunta1;


@BeforeEach
public void setUp() throws Exception {
	servidorConcurso = new ServidorConcurso();
	participante1 = new Participante(servidorConcurso);
	participante2 = new Participante(servidorConcurso);
	participante3 = new Participante(servidorConcurso);
	pregunta1 = new Pregunta("Que animal ladra?", "Es un perro" );
	respuesta1="Es un perro";
	servidorConcurso.agregarParticipante(participante1);
	servidorConcurso.agregarParticipante(participante2);
	servidorConcurso.agregarParticipante(participante3);
	
}

	@Test
	void testVerificarRespuesta() {
	// respuesta = servidorConcurso.verificarRespuesta(respuesta1,participante1,pregunta1);
		//assertNotEquals("Es un perro",respuesta);
		//assertEquals("Es un gato",respuesta);
	assertTrue(servidorConcurso.verificarRespuesta(respuesta1,participante1,pregunta1));
	}

}
