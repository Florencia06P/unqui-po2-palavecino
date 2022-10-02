package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class Banco {

	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<SolicitudCredito> solicitudes = new ArrayList<SolicitudCredito>();

	public void agregarsolicitudDeCredito(SolicitudCredito solicitud) {
		solicitudes.add(solicitud);

	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public float montoTotalADesembolsar() {
		float montoTotal;

		for (int i = 0; i < solicitudes.size(); i++) {
			if (solicitudes.get(i).esAceptable()) {
				
				//return montoTotal +=this.getMontoSolicitado();
			}
		}
	}

}