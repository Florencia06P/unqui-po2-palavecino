package ar.edu.unq.po2.tpdoublesTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpdoubles.PokerStatus;

class PokerStatusTestCase {
	
	private PokerStatus poquer;
	
	@BeforeEach
	public void setUp() throws Exception {

		poquer = new PokerStatus();
	}

	@Test
	void testPoquer() {
		assertTrue(poquer.verificar("10P","10D","10C","10T", "10D"));
		assertFalse(poquer.verificar("2P","10D","4C","2T", "5D"));
	}

/*
	@Test
	void testColor() {
		assertTrue(poquer.verificarColor("2PN","2DN","2CN","2TN", "5DN"));
		assertFalse(poquer.verificarColor("2PN","10DR","4CR","2TA", "5DV"));
	}
	@Test
	void testTrio() {
		assertTrue(poquer.verificarTrio("2PN","2DN","2CN","2TN", "5DN"));
		assertFalse(poquer.verificarTrio("2PN","10DR","4CR","2TA", "5DV"));
	}
	
	
	*/
}
