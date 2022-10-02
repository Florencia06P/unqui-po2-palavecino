package ar.edu.unq.po2.tp6;

public class Propiedad {
    String descripcion;
    String direccion;
    double valorFiscal;
    
    
    public Propiedad(String descripcion, String direccion, double valorFiscal) {
		
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
	public double getValorFiscal() {
        return valorFiscal;
    }
    public void setValorFiscal(float valorFiscal) {
        this.valorFiscal = valorFiscal;
    }

}