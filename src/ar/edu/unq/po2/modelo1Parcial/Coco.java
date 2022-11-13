package ar.edu.unq.po2.modelo1Parcial;

public class Coco extends Bacteria {

	private double radio;

	public Coco(double radio) {
		this.radio = radio;
	}

	@Override
	public double consumoOxigeno() {

		return 2 * radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
