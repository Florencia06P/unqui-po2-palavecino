package ar.edu.unq.po2.tp3;

public class Cuadrado {
	private double lado;
	

	//Constructor
	public Cuadrado(double lado) {
	        this.lado = lado;
	        
	}
	
	public double area() {
		return lado*lado;
	}
	
	
	public double perimetro() {
		return 4*lado;
	}
}
