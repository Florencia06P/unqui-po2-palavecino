package ar.edu.unq.po2.tpdoublesTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpdoubles.Carta;
import ar.edu.unq.po2.tpdoubles.PokerStatus;

class PokerStatusTestCase {

	private PokerStatus poquer;//SUT
    private Carta carta1;//DOC
	private Carta carta2;//DOC
	private Carta carta3;//DOC
	private Carta carta4;//DOC
	private Carta carta5;//DOC

	@BeforeEach
	public void setUp() throws Exception {
		
		//Utilizando Mockito
		poquer = mock(PokerStatus.class);
		carta1 = new Carta(8, "D");
		carta2 = new Carta(3, "D");
		carta3 = new Carta(2, "P");
		carta4 = new Carta(5, "T");
		carta5 = new Carta(1, "T");
		
		
		when(poquer.esPoquer(carta1, carta2, carta3, carta4, carta5)).thenReturn("Poquer");
		when(poquer.esColor(carta1, carta2, carta3, carta4, carta5)).thenReturn("Color");
		when(poquer.esTrio(carta1, carta2, carta3, carta4, carta5)).thenReturn("Trio");
		
		
/*		
		poquer = new PokerStatus();
		carta1 = new Carta(8, "D");
		carta2 = new Carta(3, "D");s
		carta3 = new Carta(2, "P");
		carta4 = new Carta(5, "T");
		carta5 = new Carta(1, "T");
*/
	}

	@Test
	void testPoquer() {
		
		//Utilizando Mockito
		verify(poquer).verificar(carta1, carta2, carta3, carta4, carta5);
		
		/*
		String poker = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
		assertNotEquals(poker, "Poquer");*/

		// assertFalse(poquer.verificar("2P","10D","4C","2T", "5D"));
	}

	@Test
	void testColor() {
		
		//Utilizando Mockito
		String color = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
		verify(poquer).verificar(carta1, carta2, carta3, carta4, carta5);
		assertNotEquals(color, "Color");
		/*
		String color = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
		assertNotEquals(color, "Color");*/
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
		verify(poquer).unaCartaEsSuperiorAOtra(carta1,carta2);
		//assertTrue(poquer.unaCartaEsSuperiorAOtra(carta1, carta2));
	}
	@Test
	void testSonDelMismoPalo() {
		assertTrue(poquer.sonDelMismoPalo(carta1,carta2));
	}

}
