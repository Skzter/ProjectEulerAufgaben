package LargestSum;
import java.io.File;
import java.util.Scanner;

public class haupt {

	public static void main(String[] args) throws Exception {
		//File Datei = new File("/home/vincent/Uni/2.Semester/AOP/seminar/ProjectEulerAufgaben/src/LargestSum/zahl.txt");
		File DateiW = new File("E:\\Uni\\programmiershit\\eclipse-shit\\eclipse\\ProjectEulerAufgaben\\src\\LargestSum\\zahl.txt");
		Scanner input = new Scanner(DateiW);
		
		int sum = 0;
		int rest = 0;
		int uebertrag = 0;
		short[][] zahlen = new short[100][50];
		long[] erg = new long[50];
		int[][] test = new int[4][7];
		int[] test_erg = new int[7];
		
		//Einlesen der Datei in zahlen-array
		for(int i = 0; i < 100; i++) {
			String line = input.next();
			for(int j = 0; j < 50; j++) {
				zahlen[i][j] = (short)Character.getNumericValue(line.charAt(j));
			}
		}
		/*
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(test[i][j]);
			}
			System.out.println("");
			
		}
		*/
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 50; j++) {
				System.out.print(zahlen[i][j]);
			}
			System.out.println("");
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
		/*
		for(int j = 6; j >= 0; j--) {
			sum = 0;
			for(int i = 0; i < 4; i++) {
				System.out.print(test[i][j]);
				sum += test[i][j];
			}
			System.out.println("");
			System.out.print(j + " sum: " + sum);
			sum += rest;
			System.out.print(" sum+rest: " + sum);
			uebertrag = sum % 10;
			System.out.print(" uebertrag: " + uebertrag);
			if(j == 0) {
				test_erg[j] = sum;
			}else {
				test_erg[j] = uebertrag;
			}
			rest = sum - uebertrag;
			System.out.println(" rest: " + rest);
		}
		*/
		System.out.println("");
		
		for(int i = 0; i < 50; i++) {
			System.out.print(erg[i]);
		}
		System.out.println("");		
		/*
		sum = 0;
		for(int z = 0; z < 100; z++) {
			sum += zahlen[z][46];
		}
		System.out.println("Test");
		System.out.println(sum);
		*/
	}
}
