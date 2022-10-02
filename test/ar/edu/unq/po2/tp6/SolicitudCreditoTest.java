package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudCreditoTest {

	private Banco bancoSanter;
	private SolicitudCredito solicitudPersonal;
	private Cliente clienteSol;
	private Cliente clienteLuis;
	private SolicitudCredito solicitudHipotecaria;
	private Propiedad propiedadPlaya;

	@BeforeEach
	public void setUp() throws Exception {
		clienteSol = new Cliente("Sol", "Lopez", "calle siempreViva 123", 25, 50.000, 600.000);
		clienteLuis = new Cliente("Luis", "Gonzalez", "calle Alcanfor 13", 54, 150.000, 1800.000);
		propiedadPlaya= new Propiedad ("departamento de Playa", "MarAzul 321", 100.000);

		solicitudPersonal = new SolicitudCreditoPersonal(clienteSol,125.500,12);
		solicitudHipotecaria = new SolicitudCreditoHipotecario(clienteSol,60.000,12,propiedadPlaya);
		bancoSanter = new Banco();
		bancoSanter.agregarCliente(clienteSol);
		bancoSanter.agregarCliente(clienteLuis);
		bancoSanter.agregarsolicitudDeCredito(solicitudHipotecaria);
		bancoSanter.agregarsolicitudDeCredito(solicitudPersonal);
	}

	@Test
	void testSolicitud() {
		// boolean solicitud = solicitudPersonal.esAceptable();
		assertTrue(solicitudPersonal.esAceptable());
		assertTrue(solicitudHipotecaria.esAceptable());
	}
	
	@Test
	void testBanco() {
		
		double montoADesembolsar = bancoSanter.montoTotalADesembolsar();
		assertEquals(montoADesembolsar, 185.500);
		//assertEquals(bancoSanter.clientes,ArrayList(clienteSol,clienteLuis));
	}
	
	

}
