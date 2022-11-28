package ar.edu.unq.po2.parcialPoliza;



public class Vigente extends EstadoPoliza {

	@Override
	public void addItem(Poliza poliza, Item item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cerrarInventario(Poliza poliza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagar(Poliza poliza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelar(Poliza poliza) {
		poliza.eliminarGastos();
		poliza.setMiEstado(new Abierta());

	}

}
