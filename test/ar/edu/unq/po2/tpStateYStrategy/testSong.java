package ar.edu.unq.po2.tpStateYStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testSong {

	Song song;
	SeleccionDeCancion seleccion;
	Reproduccion reproduccion;
	PausaReproduccion pausa;
	ParaReproduccion para;

	@BeforeEach
	void setUp() throws Exception {
		song = new Song();
		seleccion = new SeleccionDeCancion();
		reproduccion = new Reproduccion();
		pausa = new PausaReproduccion();
		para = new ParaReproduccion();

	}

	@Test
	void testGetEstadoInicial() {
		assertEquals(seleccion.getClass(), song.getEstadoSong().getClass());
	}
	
	@Test
	void testPresionarPlay() {
		song.play();
		assertEquals(reproduccion.getClass(), song.getEstadoSong().getClass());
	}
	
	@Test
	void testPausarCancionNoPuedoPorqueNoPresionePlay() {
		song.pause();
		assertNotEquals(pausa.getClass(), song.getEstadoSong().getClass());
	}
	
	@Test
	void testPausarCancionCorrectamente() {
		song.play();
		song.pause();
		assertEquals(pausa.getClass(), song.getEstadoSong().getClass());
	}
	
	@Test
	void testPararLaCancion() {
		song.play();
		song.pause();
		song.pause();
		assertEquals(para.getClass(), song.getEstadoSong().getClass());
	}
	
	
	@Test
	void testElegirNuevaCancion() {
		song.play();
		song.pause();
		song.stop();
	
		assertEquals(seleccion.getClass(), song.getEstadoSong().getClass());
	}
	

}
