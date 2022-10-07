package ar.edu.unq.po2.tpdoublesTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpdoubles.Carta;
import ar.edu.unq.po2.tpdoubles.PokerStatus;

class PokerStatusTestCase {

	private PokerStatus poquer;
    private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;

	@BeforeEach
	public void setUp() throws Exception {

		poquer = new PokerStatus();
		carta1 = new Carta(8, "D");
		carta2 = new Carta(3, "D");
		carta3 = new Carta(2, "P");
		carta4 = new Carta(5, "T");
		carta5 = new Carta(1, "T");

	}

	@Test
	void testPoquer() {
		String poker = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
		assertNotEquals(poker, "Poquer");

		// assertFalse(poquer.verificar("2P","10D","4C","2T", "5D"));
	}

	@Test
	void testColor() {
		String color = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
		assertNotEquals(color, "Color");
		/*
		 * assertTrue(poquer.verificarColor("2PN","2DN","2CN","2TN", "5DN"));
		 * assertFalse(poquer.verificarColor("2PN","10DR","4CR","2TA", "5DV"));
		 */
	}

	@Test
	void testTrio() {
		String trio = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
		assertNotEquals(trio, "Trio");
		/*
		 * assertTrue(poquer.verificarTrio("2PN","2DN","2CN","2TN", "5DN"));
		 * assertFalse(poquer.verificarTrio("2PN","10DR","4CR","2TA", "5DV"));
		 */
	}

	@Test
	void testNoSeEncontroNada() {
		String nada = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
		assertEquals(nada, "Nada" );
		/*
		 * assertTrue(poquer.verificarTrio("2PN","2DN","2CN","2TN", "5DN"));
		 * assertFalse(poquer.verificarTrio("2PN","10DR","4CR","2TA", "5DV"));
		 */
	}

	@Test
	void testUnaCartaEsSuperiorAOtra() {
		assertTrue(poquer.unaCartaEsSuperiorAOtra(carta1, carta2));
	}
	@Test
	void testSonDelMismoPalo() {
		assertTrue(poquer.sonDelMismoPalo(carta1,carta2));
	}

}
