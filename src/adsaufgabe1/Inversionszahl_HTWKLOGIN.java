package adsaufgabe1;


// Der Konstruktor der Klasse darf keine formalen Parameter (Argumente) 
// enthalten

public class Inversionszahl_HTWKLOGIN implements IInversionszahl {

    // Konstruktor ohne Argumente bitte belassen
    public Inversionszahl_HTWKLOGIN() {

    }

    public int berechne(String[] feld) {
	// Hier steht Ihre Inversionsort-Implementation, die
	// die Inversionszahl ermittelt
    	for(int i = 1; i < feld.length; i++) {
    		String temp = feld[i];
    		int k = i;
    		while(k > 1 && feld[k-1] > temp) {
    			feld[k] = feld[k-1];
    			k -= 1;
    		}
    		feld[k] = temp;
    			 
    		
    	}

	return 0;
    }

    // Ggf. bietet es sich an, Hilfsmethoden zum Vergleich der
    // Strings als private Methode zu implementieren
}
