package ar.edu.unq.po2.modelo1Parcial;

public class Bacilo extends Bacteria {

	private double longitud;
	private double edad;

	public Bacilo(double longitud, double edad) {
		this.longitud = longitud;
		this.edad = edad;
	}

	@Override
	public double consumoOxigeno() {

		if (this.getEdad() > 2) {
			return 3 * this.getLongitud() / this.getEdad();
		} else {
			return 3 * this.getLongitud();
		}

	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

}
