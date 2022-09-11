package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private double base;
	private double altura;

	// Constructor
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double area() {
		return base * altura;
	}

	public double perimetro() {
		return (2 * base) + (2 * altura);
	}

	public boolean esVertical(double x, double y) {
		Rectangulo rectangulo = new Rectangulo(base, altura);
		int ejeX = x;
		int ejeY = y;
		if (rectangulo.base == ejeX) {
			return true;
		}
		else {
	}
}
