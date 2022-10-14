package ar.edu.unq.po2.tpObserverTest;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpObserver.Contrincante;
import ar.edu.unq.po2.tpObserver.Deporte;
import ar.edu.unq.po2.tpObserver.IServidor;
import ar.edu.unq.po2.tpObserver.Partido;
import static org.mockito.Mockito.*;


class EncuentrosDeportivos {

	private IServidor servidor;
	//private Servidor1 servidor;
	private Partido partidoFutbol;
	private Contrincante contrincante1;
	private Contrincante contrincante2;

	@BeforeEach
	public void setUp() throws Exception {
		servidor = mock(IServidor.class);
		String resultado = "Gano Boca 2 a  0 Aldosivi";
		List<Contrincante> contrincantes = Arrays.asList(contrincante1, contrincante2);
		partidoFutbol = new Partido(resultado, contrincantes, Deporte.FUTBOL);
		contrincante1 = new Contrincante("Daniel");
		contrincante2 = new Contrincante("Eva");

	}

	@Test
	void testAgregarPartido() {
		verify(servidor).agregarPartido(partidoFutbol);

	}

}

//clases
//private AppMovil appMovil1;
// private AppMovil appMovil2;

//setUp

//List<Deporte> deportes = Arrays.asList(FUTBOL, TENIS);
// List<AppMovil> appMoviles = Arrays.asList(appMovil1, appMovil2);
//appMovil1 = new AppMovil();
// appMovil2 = new AppMovil();
