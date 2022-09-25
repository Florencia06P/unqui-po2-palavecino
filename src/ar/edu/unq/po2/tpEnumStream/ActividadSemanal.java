package ar.edu.unq.po2.tpEnumStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ActividadSemanal {
	DiaDeLaSemana diaDeLaSemana;
	Double horaDeInicio;
	Double duracion;
	Deporte deporte;

	public int costoDeActividadSemanal() {
		if ((diaDeLaSemana == DiaDeLaSemana.Lunes) || (diaDeLaSemana == DiaDeLaSemana.Martes)
				|| (diaDeLaSemana == DiaDeLaSemana.Miercoles)) {
			return 500 + (200 * deporte.complejidad);
		} else {
			return 1000 + (200 * deporte.complejidad);
		}
	}

	public List<ActividadSemanal> todasLasActFutbol() {
		List<ActividadSemanal> listaFutbol = new ArrayList<ActividadSemanal>();
		Stream<ActividadSemanal> stream = listaFutbol.stream();
		return stream.filter(s -> s.deporte == Deporte.FUTBOL).toList();

	}

	public List<ActividadSemanal> todasLasActDeComplejidad(int complej) {
		List<ActividadSemanal> listaComplejidad = new ArrayList<ActividadSemanal>();
		Stream<ActividadSemanal> stream = listaComplejidad.stream();
		return stream.filter(s -> s.deporte.complejidad == complej).toList();
	}
	
	public DoubleStream horasActividades() {
		List<ActividadSemanal> lista = new ArrayList<ActividadSemanal>();
		Stream<ActividadSemanal> stream = lista.stream();
		return stream.mapToDouble(act->act.duracion);
	}
	
	public double horasTotalesActividades() {
		return this.horasActividades().sum();
	}
	
	
	public IntStream costoDeActividadesPara(Deporte deporte) {
		List<ActividadSemanal> lista = new ArrayList<ActividadSemanal>();
		Stream<ActividadSemanal> stream = lista.stream();
		return stream.filter(act->act.deporte == deporte)
				.mapToInt(act->act.costoDeActividadSemanal());
	}
	
	public ActividadSemanal actividadDeMenorCostoPara(Deporte deporte) {
		ActividadSemanal actividad = Stream.of(this.costoDeActividadesPara(deporte))
				.min(Comparator.comparing(ActividadSemanal::costoDeActividadesPara(deporte)));
	
		return actividad;
	}
}
