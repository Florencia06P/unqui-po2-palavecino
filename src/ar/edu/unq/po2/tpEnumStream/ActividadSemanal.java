package ar.edu.unq.po2.tpEnumStream;

public class ActividadSemanal {
 DiaDeLaSemana diaDeLaSemana;
 Double horaDeInicio;
 Double duracion;
 Deporte deporte;
 
 
 public int costoDeActividadSemanal() {
	if ((diaDeLaSemana == DiaDeLaSemana.Lunes) || 
			(diaDeLaSemana == DiaDeLaSemana.Martes) ||
			(diaDeLaSemana == DiaDeLaSemana.Miercoles)) {
		return 500 + (200 * deporte.complejidad);
	}
	else { return 1000 + (200 * deporte.complejidad);}
 }
}
