package ar.edu.unq.po2.parcialPoliza;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public  class Poliza {
	private List<Item> items = new ArrayList<Item>();
	private EstadoPoliza miEstado;
	private List<GastoAdministrativo> gastos = new ArrayList<GastoAdministrativo>();
	private BonificacionService bonificacion;

	public Poliza() {
		this.setMiEstado(new Abierta());
	}
	public EstadoPoliza getMiEstado() {
		return miEstado;
	}

	public void setMiEstado(EstadoPoliza miEstado) {
		this.miEstado = miEstado;
	}

	public List<Item> getItems() {
		return items;
	}

	public List<GastoAdministrativo> getGastos() {
		return gastos;
	}

	public BonificacionService getBonificacion() {
		return bonificacion;
	}

	public double montoAsegurado() {
		return this.items.stream().mapToDouble(i -> i.getValor()).sum();
	}
	
	public double precio() {
		return this.montoAsegurado() * 0.075 + this.montoGastos();
	}
	
	public double montoGastos() {
		return this.gastos.stream().mapToDouble(g->g.getMonto()).sum();
	}
	
	public void addGastos(GastoAdministrativo gasto) {
		gastos.add(gasto);
	}
	
	public void addItem(Item item) {
		this.getMiEstado().addItem(this,item);
	}
	
	public void setGastos(List<GastoAdministrativo> gastos) {
		this.gastos = gastos;
	}
	public void cerrarInventario() {
		this.getMiEstado().cerrarInventario(this);
	}
	
	public void pagarPoliza() {
		this.getMiEstado().pagar(this);
	}
	
	public void cancelarPoliza() {
		this.getMiEstado().cancelar(this);
	}
	
	  public void eliminarGastos() {
	        this.gastos = new ArrayList<GastoAdministrativo>();
	    }
	
	public void bonificar(int codigo, String titular) {
		this.chequear(codigo);
		this.aplicarDescuento();
		this.anular(codigo);
		this.notificar(titular, codigo);
	}
	
	public void chequear(int codigo) {
		this.getBonificacion().codigoValido(codigo);
	}
	
	public void aplicarDescuento() {
		if(this.getMiEstado() instanceof Abierta) {
			this.addGastos(new GastoAdministrativo("Bonificacion administrativa", -500));
			
		}
		else if(this.getMiEstado() instanceof Cerrada) {
			this.eliminarMayorCosto();
		}
		else {
			if(this.getMiEstado() instanceof Vigente) {
				this.eliminarGastos();
			}
		}
	}
	
	public void eliminarMayorCosto() {
		this.gastos.remove(this.gastos.stream().max(Comparator.comparingDouble(gasto -> gasto.getMonto())));
	}
	
	public void anular(int codigo) {
		this.getBonificacion().anularCodigo(codigo);
	}
	
	public void notificar(String titular,int codigo) {
		this.getBonificacion().notificarTitular(titular,codigo);
	}
}
