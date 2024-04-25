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
    	/*
    	for(int i = 1; i < feld.length; i++) {
    		String temp = feld[i];
    		int k = i;
    		while(k > 1 && feld[k-1] > temp) {
    			feld[k] = feld[k-1];
    			k -= 1;
    		}
    		feld[k] = temp;
    			 
    		
    	}
    	*/
    	
    	for(int i = 0; i < feld.length; i++) {
    		System.out.println(feld[i].indexOf("b"));
    	}
    
    	return 0;
    }
    
    private int ausgabe(String wort) {
		return 0;
    }

    // Ggf. bietet es sich an, Hilfsmethoden zum Vergleich der
    // Strings als private Methode zu implementieren
}
