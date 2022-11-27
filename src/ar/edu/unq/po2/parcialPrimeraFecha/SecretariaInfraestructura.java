package ar.edu.unq.po2.parcialPrimeraFecha;

import java.util.List;

public class SecretariaInfraestructura {
	private List<Obra> obras;
	
	public double inversionTotal(){
		return this.obras.stream().mapToDouble(o-> o.inversionTotal()).sum();
	}
}
