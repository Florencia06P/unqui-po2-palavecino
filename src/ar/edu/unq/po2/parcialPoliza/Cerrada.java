package ar.edu.unq.po2.parcialPoliza;

public class Cerrada extends EstadoPoliza {

	@Override
	public void addItem(Poliza poliza, Item item) {
		poliza.getItems().add(item);
		poliza.addGastos(new GastoAdministrativo("Recargo por extension",item.getValor()* 0.3));;

	}

	@Override
	public void cerrarInventario(Poliza poliza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagar(Poliza poliza) {
		poliza.setMiEstado(new Vigente());

	}

	@Override
	public void cancelar(Poliza poliza) {
		// TODO Auto-generated method stub

	}

}
