package adsaufgabe1;


// Der Konstruktor der Klasse darf keine formalen Parameter (Argumente) 
// enthalten

public class Inversionszahl_vgoetze1 implements IInversionszahl {

    // Konstruktor ohne Argumente bitte belassen
    public Inversionszahl_vgoetze1() {

    }

    public int berechne(String[] feld) {
	// Hier steht Ihre Inversionsort-Implementation, die
	// die Inversionszahl ermittelt
    	int inversionszahl = 0;
    	for(int i = 1; i < feld.length; i++) {
    		String temp = feld[i];
    		int k = i;
    		while(k > 0 && vgl(temp, feld[k-1])) {
    			inversionszahl += 1;
    			feld[k] = feld[k-1];
    			k -= 1;
    		}
    		feld[k] = temp;	
    	}    	
    	return inversionszahl;
    }

    private int position_a(String wort) {
		int temp = wort.indexOf("a");
		if(temp == -1) {
			temp = 999999;
			return temp;
		}
    	return temp;
    }
    
    private int position_b(String wort) {
    	int temp = wort.lastIndexOf("b");
		if(temp == -1) {
			temp = -999999;
    	}
    	return temp;
    }
    
    private boolean vgl(String s, String t) {
    	if(position_a(s) < position_a(t)) {
    		return true;
    	} else if(position_a(s) == position_a(t)) {
    		if(position_b(s) == position_b(t)){
    			return false;
    		}else if(s.length() - position_b(s) < t.length() - position_b(t)) {
    			return true;
    		}
    	}
    	return false;
    }
    // Ggf. bietet es sich an, Hilfsmethoden zum Vergleich der
    // Strings als private Methode zu implementieren
}
