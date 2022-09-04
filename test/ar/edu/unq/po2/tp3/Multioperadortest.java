package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class MultioperadorTestCase {

	private Multioperador operador;
	
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	operador = new Multioperador();
	
	//Se agregan los  numeros. Un solo par y nueve impares
	operador.addNumber(1);
	operador.addNumber(3);
	operador.addNumber(5);
	operador.addNumber(7);
	operador.addNumber(9);
	operador.addNumber(1);
	operador.addNumber(1);
	operador.addNumber(1);
	operador.addNumber(1);
	operador.addNumber(4);
	}
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testEvenNumbers() {
	// Getting the even occurrences
	int amount = operador.multiplicacion();
	// I check the amount is the expected one
	assertEquals(amount, 3780);
	}
	
	@Test
	void test() {
	//	fail("Not yet implemented");
	}

}
