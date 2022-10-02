package ar.edu.unq.po2.tp6;

public class Propiedad {
    String descripcion;
    String direccion;
    float valorFiscal;
    
    
    public Propiedad(String descripcion, String direccion, float valorFiscal) {
		
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
	public float getValorFiscal() {
        return valorFiscal;
    }
    public void setValorFiscal(float valorFiscal) {
        this.valorFiscal = valorFiscal;
    }

}