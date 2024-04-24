package LargestSum;
import java.io.File;
import java.util.Scanner;

public class haupt {

	public static void main(String[] args) throws Exception {
		File Datei = new File("/home/vincent/Uni/2.Semester/AOP/seminar/ProjectEulerAufgaben/src/LargestSum/zahl.txt");
		//File Datei = new File("E:\\Uni\\programmiershit\\eclipse-shit\\eclipse\\ProjectEulerAufgaben\\src\\LargestSum\\zahl.txt");
		Scanner input = new Scanner(Datei);
		
		int sum = 0;
		int rest = 0;
		int uebertrag = 0;
		short[][] zahlen = new short[100][50];
		long[] erg = new long[50];
		
		//Einlesen der Datei in zahlen-array
		for(int i = 0; i < 100; i++) {
			String line = input.next();
			for(int j = 0; j < 50; j++) {
				zahlen[i][j] = (short)Character.getNumericValue(line.charAt(j));
			}
		}

		for(int i = 49; i > -1; i--) {
			sum = 0;
			for(int j = 0; j < 100; j++) {
				sum += zahlen[j][i];
			}
			
			sum += rest;
			uebertrag = sum % 10;
			if(i == 0) {
				erg[i] = sum;
			}else {
				erg[i] = uebertrag;
			}
			rest = (sum - uebertrag) / 10;
		}

		System.out.println("");
		
		for(int i = 0; i < 50; i++) {
			System.out.print(erg[i]);
		}
		System.out.println("");	
		
		input.close();
	}
}
