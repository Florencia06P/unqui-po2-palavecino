package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class clienteTest {
	private Cliente cliente;
	

	@BeforeEach
	public void setUp() throws Exception {

		cliente = new Cliente("Sol","Lopez","calle siempreViva 123",25,50.000f,600.000f);
	}

	@Test
	void testSueldoMensual() {
		float sueldoMensual = cliente.getSueldoMensual();
		assertEquals(sueldoMensual, 50.000f);
	}

}
