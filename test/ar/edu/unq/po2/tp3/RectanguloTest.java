package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectanguloTest {

	private Rectangulo rectangulo;

	@BeforeEach
	public void setUp() throws Exception {

		rectangulo = new Rectangulo(3, 2);

	}

	@Test
	void testRectanguloArea() {

		// Getting the even occurrences
		double area = rectangulo.area();
		// I check the amount is the expected one
		assertEquals(area, 6);

	}

	@Test
	void testRectanguloPerimetro() {

		// Getting the even occurrences
		double perimetro = rectangulo.perimetro();
		// I check the amount is the expected one
		assertEquals(perimetro, 10);

	}
	
}
