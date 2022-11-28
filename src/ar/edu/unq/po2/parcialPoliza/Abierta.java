package ar.edu.unq.po2.parcialPoliza;

public class Abierta extends EstadoPoliza {

	@Override
	public void addItem(Poliza poliza, Item item) {
		poliza.getItems().add(item);
		
	}

	@Override
	public void cerrarInventario(Poliza poliza) {
		poliza.setMiEstado(new Cerrada());
		
	}

	@Override
	public void pagar(Poliza poliza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelar(Poliza poliza) {
		// TODO Auto-generated method stub
		
	}

}
