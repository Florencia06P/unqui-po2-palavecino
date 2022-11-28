package ar.edu.unq.po2.parcialPoliza;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PolizaTest {

	private Poliza poliza;
	private Abierta estadoAbierto;
	private Cerrada estadoCerrado;
	private Vigente estadoVigente;
	private Item item;
	private GastoAdministrativo gasto;

	@BeforeEach
	void setUp() throws Exception {
		estadoAbierto=mock(Abierta.class);
		estadoCerrado=mock(Cerrada.class);
		estadoVigente=mock(Vigente.class);
		item= mock(Item.class);
		gasto = mock(GastoAdministrativo.class);
		
		poliza = new Poliza();
		
		poliza.addItem(item);
		poliza.addGastos(gasto);
	}

	@Test
	 void testEstadoAbierto() {
        assertEquals(Abierta.class, poliza.getMiEstado().getClass());
    }
	
	@Test
    void testCerrarInventario() {
        poliza.setMiEstado(estadoAbierto);
        poliza.cerrarInventario();
        verify(estadoAbierto).cerrarInventario(poliza);
    }
    
    @Test
    void testPagarPoliza() {
        poliza.setMiEstado(estadoCerrado);
        poliza.pagarPoliza();
        verify(estadoCerrado).pagar(poliza);
    }
    
    @Test
    void testCancelarPoliza() {
        poliza.setMiEstado(estadoVigente);
        poliza.cancelarPoliza();
        verify(estadoVigente).cancelar(poliza);
    }    

}
