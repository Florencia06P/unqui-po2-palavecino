package ar.edu.unq.po2.parcialPoliza;

public abstract class EstadoPoliza {
	public abstract void addItem(Poliza poliza, Item item);
	public abstract void cerrarInventario(Poliza poliza);
	public abstract void pagar(Poliza poliza);
	public abstract void cancelar(Poliza poliza);
	
}
