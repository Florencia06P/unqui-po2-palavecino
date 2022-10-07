package ar.edu.unq.po2.tpdoubles;



public class PokerStatus  {

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		if(this.esPoquer(carta1, carta2, carta3, carta4, carta5)) {
		return "Poquer";
		}
		else if(this.esColor(carta1, carta2, carta3, carta4, carta5)) {
			return "Color";
		}
		else if (this.esTrio(carta1, carta2, carta3, carta4, carta5)){
			return "Trio";
		}
		else {return "Nada";}
	

}

public boolean esPoquer(String carta1, String carta2, String carta3, String carta4, String carta5) {
	 if(carta1.charAt(0) == carta2.charAt(0) && 
			 carta2.charAt(0)==carta3.charAt(0) && 
			 carta3.charAt(0)== carta4.charAt(0)) { return true; }
	 else {return false;}
}

public Boolean verificarColor(String carta1, String carta2, String carta3, String carta4, String carta5) {
	return this.esColor(carta1,carta2, carta3,carta4, carta5);
	
}

public boolean esColor(String carta1, String carta2, String carta3, String carta4, String carta5) {
	if(carta1.charAt(carta1.length()-1) == carta2.charAt(carta2.length()-1) && 
			carta2.charAt(carta2.length()-1)==carta3.charAt(carta3.length()-1) && 
			carta3.charAt(carta3.length()-1)== carta4.charAt(carta4.length()-1) &&
			carta4.charAt(carta4.length()-1) == carta5.charAt(carta5.length()-1)) { return true; }
	 else {return false;}
}

public Boolean verificarTrio(String carta1, String carta2, String carta3, String carta4, String carta5) {
	return this.esTrio(carta1,carta2, carta3,carta4, carta5);
	
}

private boolean esTrio(String carta1, String carta2, String carta3, String carta4, String carta5) {
	
	 if(carta1.charAt(0) == carta2.charAt(0)&& 
	    carta2.charAt(0)==carta3.charAt(0) ||
	    carta3.charAt(0)== carta4.charAt(0) &&
	    carta4.charAt(0) == carta5.charAt(0)||
	    carta2.charAt(0)==carta3.charAt(0) &&
	    carta3.charAt(0)== carta4.charAt(0)
	    )
	     { return true; }
	 else {return false;}
}
}
