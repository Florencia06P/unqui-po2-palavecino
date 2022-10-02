package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.stream.DoubleStream;


public class Banco {

	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<SolicitudCredito> solicitudes = new ArrayList<SolicitudCredito>();

	public void agregarsolicitudDeCredito(SolicitudCredito solicitud) {
		solicitudes.add(solicitud);

	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public double montoTotalADesembolsar() {
		
		 DoubleStream montos= this.montosSolicitudes();
		
		double montoTotal = 0;

		for (int i = 0; i < solicitudes.size(); i++) {
			if (solicitudes.get(i).esAceptable()) {
				montos.forEach(monto-> monto.sum()){
				
					return montoTotal;
				}
				}
			
				
				
				
			}
		
		}
	
	public DoubleStream montosSolicitudes(){
		ArrayList<SolicitudCredito> solicitudes = new ArrayList<SolicitudCredito>();
		DoubleStream montos =  solicitudes.stream().mapToDouble(solicitud->solicitud.getMontoSolicitado()); 
		
		//for (int i=0; i < montos.size(); i++) {}
			
		return montos;
	}
	

}