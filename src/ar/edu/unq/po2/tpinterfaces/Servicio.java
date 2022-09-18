package ar.edu.unq.po2.tpinterfaces;

public class Servicio extends Factura{
	Double costoPorUnidadConsumida;
	Double cantidadDeUnidadesConsumidas;
	

	public Servicio(double d, double i) {
		this.costoPorUnidadConsumida = d;
		this.cantidadDeUnidadesConsumidas = i;
	}


	


	@Override
	public Double montoAPagar() {
		
		return this.getCostoPorUnidadConsumida() * this.getCantidadDeUnidadesConsumidas();
	}


	public Double getCostoPorUnidadConsumida() {
		return costoPorUnidadConsumida;
	}


	public void setCostoPorUnidadConsumida(Double costoPorUnidadConsumida) {
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
	}


	public Double getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}


	public void setCantidadDeUnidadesConsumidas(int cantidadDeUnidadesConsumidas) {
		this.cantidadDeUnidadesConsumidas = (double) cantidadDeUnidadesConsumidas;
	}

}
