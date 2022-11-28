package ar.edu.unq.po2.parcialPrimerFechaTest;

import static org.junit.jupiter.api.Assertions.*;

//import static org.mockito.Mockito.mock;

import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.Arrays;

import ar.edu.unq.po2.parcialPrimeraFecha.Empleado;
import ar.edu.unq.po2.parcialPrimeraFecha.Programa;
import ar.edu.unq.po2.parcialPrimeraFecha.Proyecto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProgramaTest {

	private Programa p1; // SUT
	private Programa p2; // SUT
	private Proyecto ampliacionRed;
	private Proyecto construccPozo;
	private Proyecto conexionRed;
	private Empleado lider;
	private Empleado e1;
	private Empleado e2;

	@BeforeEach
	void setUp() throws Exception {

		ampliacionRed = mock(Proyecto.class);
		construccPozo = mock(Proyecto.class);
		conexionRed = mock(Proyecto.class);
		e1 = mock(Empleado.class);
		e2 = mock(Empleado.class);

		p1 = new Programa("MasAguaPotable", e1, 200.000);
		p1.addObras(ampliacionRed);
		p2 = new Programa("MasExtraccion", e2, 120.000);

		p2.addObras(construccPozo);
		p2.addObras(conexionRed);
		p1.addObras(p2);
		when(ampliacionRed.getFechaInicio()).thenReturn(LocalDate.of(2022, 5, 6));
		when(construccPozo.getFechaInicio()).thenReturn(LocalDate.of(2022, 4, 6));
		when(conexionRed.getFechaInicio()).thenReturn(LocalDate.of(2022, 11, 9));
		
		when(ampliacionRed.inversionTotal()).thenReturn(105.000);
		when(construccPozo.inversionTotal()).thenReturn(50.000);
		when(conexionRed.inversionTotal()).thenReturn(25.000);

	}

	@Test
	void testFechaInicio() {
		assertEquals(LocalDate.of(2022, 4, 6), p1.getFechaInicio());
		assertEquals(LocalDate.of(2022, 4, 6), p2.getFechaInicio());
	}
	
  
	@Test
	void testInversionTotal() {
		assertEquals(500.000,p1.inversionTotal());
	}

}
