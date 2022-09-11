package ar.edu.unq.po2.tp3;

public class Point{
	private int x;
	private int y;

	public int getX(){
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point moverPunto(int unX, int unY) {
		Point punto = new Point();
		punto.setX(unX);
		punto.setY(unY);

		return punto;
	}

	public Point sumarPuntos(Point punto) {
		Point nuevoPunto = new Point();
		nuevoPunto = this.x + punto.getX();

		nuevoPunto = this.y + punto.getY();

		return nuevoPunto;

	}
}
