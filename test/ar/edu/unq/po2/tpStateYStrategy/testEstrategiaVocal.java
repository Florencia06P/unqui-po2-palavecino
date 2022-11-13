package ar.edu.unq.po2.tpStateYStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testEstrategiaVocal {
	String texto;
	EstrategiaVocal estrategiaVocal;

	@BeforeEach
	void setUp() throws Exception {
		texto= "case";
		estrategiaVocal = new EstrategiaVocal();
	}

	@Test
	void testEncriptar() {
		
		
		String resultado = estrategiaVocal.encriptar(texto);
		assertEquals("cesi", resultado);
		
	}

}
