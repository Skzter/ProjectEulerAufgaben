package adsaufgabe1;

public class Testtreiber {
    public static void main (String[] args) {
	IInversionszahl invz = new Inversionszahl_vgoetze1();
	int inv;
	
	// Testfall 1
	String[] feld1 = {"aaa", "bba", "aba", "", "aab"};
	int inv1 = 5; 
	inv = invz.berechne(feld1);
	if (inv == inv1)
	    System.out.println("Testfall 1 erfolgreich");
	else
	    System.out.println("Fehler bei der Bearbeitung von Testfall 1 ("+inv+" statt "+inv1+")");
	

	
	// Testfall 2
	String[] feld2 = { "aba", "baaza", "cccba", "abab", "bab", "baaaa", "bazbab" };
	int inv2 = 9;
	inv = invz.berechne(feld2);
	if (inv == inv2)
	    System.out.println("Testfall 2 erfolgreich");
	else
	    System.out.println("Fehler bei der Bearbeitung von Testfall 2 ("+inv+" statt "+inv2+")");
    
    
    //Testfall 2
    String[] feld3 = { "aber" , "alle" , "als" , "alt" , "am" , "an" , "andere" , "auch" , "auf" , "aus" , "bauen" , "bei" , "bekommen" , "bleiben" , "brauchen" , "dann" , "das" , "den" , "denken" , "der" , "dich" , "die" , "ein  (eine  einer)" , "er" , "fahren" , "finden" , "Frau" , "ganz" , "geben" , "gehen" , "gern (e)" , "gro� (e)" , "haben" , "halten" , "Hand" , "Haus" , "hei�en" , "heute" , "ich" , "im" , "immer" , "ja" , "Jahr" , "kaufen" , "Kind" , "klein" , "kommen" , "lang (e)" , "laufen" , "leben (Leben)" , "machen" , "Mann" , "m�ssen" , "nehmen" , "neu" , "nicht" , "noch" , "O" , "P" , "Q" , "sagen" , "schnell" , "schon" , "sch�n" , "schreiben" , "Schule" , "sehen" , "sie" , "so" , "spielen" , "Tag" , "Uhr" , "Vater (Vati)" , "viel" , "von" , "was" , "Wasser" , "weit (weiter)" , "wenn" , "werden" , "wie" , "wieder" , "wir" };
    inv = invz.berechne(feld3);
    System.out.println(inv);
    }
}
