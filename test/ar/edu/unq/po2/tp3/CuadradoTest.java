package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTest {

	private Cuadrado cuadrado;

	@BeforeEach
	public void setUp() throws Exception {

		cuadrado = new Cuadrado(4);
	}

	@Test
	void testCuadradoArea() {

		// Getting the even occurrences
		double area = cuadrado.area();
		// I check the area is the expected one
		assertEquals(area, 16);

	}

	@Test
	void testCuadradoPerimetro() {
		double perimetro = cuadrado.perimetro();
		// I check the area is the expected one
		assertEquals(perimetro, 16);

	}
}
