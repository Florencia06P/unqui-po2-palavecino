package ar.edu.unq.po2.tpdoubles;


public class PokerStatus {

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {

		if (this.esPoquer(carta1, carta2, carta3, carta4, carta5)) {
			return "Poquer";
		} else if (this.esColor(carta1, carta2, carta3, carta4, carta5)) {
			return "Color";
		} else if (this.esTrio(carta1, carta2, carta3, carta4, carta5)) {
			return "Trio";
		} else {
			return "Nada";
		}

	}

	public boolean esPoquer(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		return  ((carta1.valor == carta2.valor && carta2.valor == carta3.valor && carta3.valor == carta4.valor)
				|| (carta2.valor == carta3.valor && carta3.valor == carta4.valor && carta4.valor == carta5.valor)
				|| (carta1.valor == carta3.valor && carta3.valor == carta4.valor && carta4.valor == carta5.valor)
				|| (carta1.valor == carta2.valor && carta2.valor == carta4.valor && carta4.valor == carta5.valor)
				|| (carta1.valor == carta2.valor && carta2.valor == carta3.valor && carta3.valor == carta5.valor));
		

	}

	/*
	 * public Boolean verificarColor(Carta carta1, Carta carta2, Carta carta3, Carta
	 * carta4, Carta carta5) { return this.esColor(carta1,carta2, carta3,carta4,
	 * carta5);
	 * 
	 * }
	 */

	public boolean esColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		return (carta1.palo == carta2.palo && carta2.palo == carta3.palo && carta3.palo == carta4.palo
				&& carta4.palo == carta5.palo);
		
	}

	/*
	 * public Boolean verificarTrio(String carta1, String carta2, String carta3,
	 * String carta4, String carta5) { return this.esTrio(carta1,carta2,
	 * carta3,carta4, carta5);
	 * 
	 * }
	 */

	public boolean esTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {

		return (carta1.valor == carta2.valor && carta2.valor == carta3.valor)
				|| (carta3.valor == carta4.valor && carta4.valor == carta5.valor)
				|| (carta2.valor == carta3.valor && carta3.valor == carta4.valor)
				|| (carta1.valor == carta2.valor && carta2.valor == carta4.valor);
		
	}

	public boolean unaCartaEsSuperiorAOtra(Carta carta1, Carta carta2) {
		
		return carta1.valor > carta2.valor;
	}

	public boolean sonDelMismoPalo(Carta carta1, Carta carta2) {
		
		return carta1.palo == carta2.palo;
	}
	
	

}
