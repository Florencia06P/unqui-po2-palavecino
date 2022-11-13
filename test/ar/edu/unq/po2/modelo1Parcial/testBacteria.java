package ar.edu.unq.po2.modelo1Parcial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testBacteria {

	Coco coco1;
	Bacilo bacilo1;
	Coco coco2;
	Bacilo bacilo2;
	Poblacion poblacion;
	private List<Consumidor> consumidores;

	@BeforeEach
	void setUp() throws Exception {
		coco1 = new Coco(5);
		bacilo1 = new Bacilo(5, 2);
		coco2 = new Coco(2);
		bacilo2 = new Bacilo(3, 6);
		consumidores = Arrays.asList(coco1, coco2, bacilo1, bacilo2);

		poblacion = new Poblacion(2, consumidores);
	}

	@Test
	void testConsumoBacterias() {
		double resultado1= coco1.consumoOxigeno();
		assertEquals(10,resultado1);
		
		double resultado2= coco2.consumoOxigeno();
		assertEquals(4,resultado2);
		
		double resultado3=bacilo1.consumoOxigeno();
		assertEquals(15,resultado3);
		
	}

}
