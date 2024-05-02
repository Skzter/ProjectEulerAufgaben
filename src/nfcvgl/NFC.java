package nfcvgl;
import java.io.File;
import java.util.Scanner;

public class NFC {

	public static void main(String[] args) throws Exception {
		File Datei1 = new File("/home/vincent/Uni/2.Semester/AOP/seminar/ProjectEulerAufgaben/src/nfcvgl/vincentneu.txt");
		File Datei2 = new File("/home/vincent/Uni/2.Semester/AOP/seminar/ProjectEulerAufgaben/src/nfcvgl/vincentkarte.txt");
		//File Datei3 = new File("");
		Scanner input = new Scanner(Datei1);
		Scanner input2 = new Scanner(Datei2);
		
		String[] daten1 = new String[607];
		String[] daten2 = new String[607];
		
		for(int i = 0; i < 607; i++) {
			String line1 = input.nextLine();
			String line2 = input2.nextLine();
			if(line1.equals("") == true && line2.equals("") == true) {
				daten1[i] = " ";
				daten2[i] = " ";
				continue;
			}
			daten1[i] = line1;
			daten2[i] = line2;
		}
		
		for(int i = 0; i < 607; i++) {
			if (daten1[i].equals(daten2[i]) == false) {
				System.out.println("Neu: " + daten1[i] + " --- Vincent: " + daten2[i] + " -> Zeile " + i);
			}
		}
		
		
		// 2C 1A 00 00 -> 00 00 1A 2C
		String test = "2C 1A 00 00";
		System.out.println(test.replaceAll(" ", ""));
		
		System.out.println((double)Integer.parseInt(umdrehen(test.replaceAll(" ", "")), 16)/1000 + "€ ");
		input.close();
		input2.close();
	}
	
	static private String umdrehen(String s) {
		String out = "";
		for(int i = s.length() - 2; i >= 0; i -= 2) {
			out += s.charAt(i);
			out += s.charAt(i+1);
		}
		return out;
	}
	
};