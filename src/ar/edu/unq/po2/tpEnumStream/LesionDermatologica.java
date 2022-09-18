package ar.edu.unq.po2.tpEnumStream;

public enum LesionDermatologica {
	Rojo,Gris,Amarillo,Miel;
	
	private String descripcion;
	private int nivelDeRiesgo;
	private LesionDermatologica maduracion;
	
	LesionDermatologica(String string, int i, LesionDermatologica gris2) {
		// TODO Auto-generated constructor stub
	}

	public LesionDermatologica proximoColorDeMaduracion() {
		
	}
	
}
