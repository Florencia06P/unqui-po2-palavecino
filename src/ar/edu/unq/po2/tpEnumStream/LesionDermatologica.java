package ar.edu.unq.po2.tpEnumStream;

public enum LesionDermatologica {
	Rojo, Gris, Amarillo, Miel;

	private String descripcion;
	private int nivelDeRiesgo;
	private LesionDermatologica maduracion;

	LesionDermatologica(String unaDescripcion, int unNivel, LesionDermatologica color) {
		this.descripcion = unaDescripcion;
		this.nivelDeRiesgo = unNivel;
		this.maduracion = color;

	}

	public LesionDermatologica proximoColorDeMaduracion() {
		if (maduracion == LesionDermatologica.Rojo) {
			return Gris;
		}
		if (maduracion == LesionDermatologica.Gris) {
			return Amarillo;
		}
		if (maduracion == LesionDermatologica.Amarillo) {
			return Miel;
		}
		if (maduracion == LesionDermatologica.Miel) {
			return Rojo;
		}
	}

}
