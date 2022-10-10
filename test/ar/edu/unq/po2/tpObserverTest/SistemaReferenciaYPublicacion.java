package ar.edu.unq.po2.tpObserverTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpObserver.Articulo;
import ar.edu.unq.po2.tpObserver.Investigador;


//import static org.mockito.Mockito.*;


class SistemaReferenciaYPublicacion {
	private SistemaReferenciaYPublicacion sistema;
	private Articulo articulo1;
	private Articulo articulo2;
	private Investigador investigador;
	private String aviso;

	@BeforeEach
	public void setUp() throws Exception {
		sistema = new SistemaReferenciaYPublicacion();
		List<String> palabrasClaves1 = Arrays.asList("atmosfera", "tierra", "planeta");
		List<String> palabrasClaves2 = Arrays.asList("vacuna", "covid", "paciente");
		articulo1 = new Articulo("La atmósfera de la Tierra tiene fecha de caducidad", "Kasumi Ozaki",
				"Universidad de Toho", "Japon", palabrasClaves1);
		articulo2= new Articulo("La vacuna del Covid","Homero Simpson","Universidad Unq", "Argentina", palabrasClaves2);
		investigador = new Investigador();
		aviso = "Ha ingresado una nueva conferencia que puede ser de su interes";
		
		
	
		
	}
	/*public ArrayList<Articulo> articulos(){
		ArrayList<Articulo> articulos = new ArrayList <Articulo>();
		sistema.cargarArticulo(articulo1);
		sistema.cargarArticulo(articulo2);
		return articulos;
		}
		*/
	@Test
	void testAgregarArticulos() {
		ArrayList<Articulo> articulos1 = sistema.cargarArticulo(articulo1);
		ArrayList<Articulo> articulos2 = sistema.cargarArticulo(articulo2);
		//assertEquals(sistema.agregarArticulo(articulo1));
		assertEquals(Arrays.asList(articulo1),articulos1);
		assertEquals(Arrays.asList(articulo2),articulos2);
	}

	private ArrayList<Articulo> cargarArticulo(Articulo articulo12) {
		
		ArrayList<Articulo> articuloss = new ArrayList <Articulo>();
		articuloss.add(articulo12);
		
		return articuloss;
		
	}
	
	@Test
	void testNotificaciones() {
		ArrayList<String> avisos = investigador.recibirAviso(aviso);
		assertEquals(Arrays.asList(aviso),avisos);
	}

	
	

}
