package ar.edu.unq.po2.tpStateYStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testMaquinaDeJuego {
	
	MaquinaDeJuego maquina;
	InicioJuego inicioJuego;
	IngresoFicha ingresoFicha;
	SesionParaUnJugador sesionUnJugador;
	SesionParaDosJugadores sesionDosJugadores;

	@BeforeEach
	void setUp() throws Exception {
		maquina = new MaquinaDeJuego();
		inicioJuego = new InicioJuego();
		ingresoFicha = new IngresoFicha();
		sesionUnJugador = new SesionParaUnJugador();
		sesionDosJugadores = new SesionParaDosJugadores();
		
	}

	@Test
	void testGetEstadoInicial() {
		assertEquals(inicioJuego.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testPresionarInicio() {
		maquina.presionarBotonInicio();
		assertEquals(ingresoFicha.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testIngresarFichaPeroNoPuedoPorqueNoPresioneInicio() {
		maquina.ingresarFicha();
		assertNotEquals(sesionUnJugador.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testIngresarFichaCorrectamente() {
		maquina.presionarBotonInicio();
		maquina.ingresarFicha();
		assertEquals(sesionUnJugador.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testCambiarADosJugadores() {
		maquina.presionarBotonInicio();
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		assertEquals(sesionDosJugadores.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testJugar() {
		maquina.presionarBotonInicio();
		maquina.ingresarFicha();
		maquina.jugar();
		assertEquals(inicioJuego.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testJugarConDosJugadores() {
		maquina.presionarBotonInicio();
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		maquina.jugar();
		assertEquals(inicioJuego.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testNoPuedeJugarPorqueNoIngresoFicha() {
		maquina.presionarBotonInicio();
		maquina.jugar();
		assertEquals(ingresoFicha.getClass(), maquina.getEstadoMaquina().getClass());
	}

}
