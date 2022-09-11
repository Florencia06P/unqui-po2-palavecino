package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	private Persona persona;
	
	@BeforeEach
	public void setUp() throws Exception {

		persona = new Persona("Florencia",LocalDate.of(1997,Month.FEBRUARY, 6));

	}

	@Test
	void testEdadPersona() {

		// Getting the even occurrences
		int edad = persona.edad();
		// I check the amount is the expected one
		assertEquals(edad, 25);

	}
	
	@Test
	void testMenorQue() {
	//consultar como se deberia testear
	}

}
