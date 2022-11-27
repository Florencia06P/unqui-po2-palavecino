package ar.edu.unq.po2.parcialPrimeraFecha;

public class SecretariaAdapter implements Secretaria {
	private SecretariaInfraestructura secretaria;
	
	@Override
	public double montoTotal() {
		return getSecretaria().inversionTotal();
	}

	public SecretariaInfraestructura getSecretaria() {
		return secretaria;
	}

}
