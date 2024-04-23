package LargestSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File Datei = new File("/home/vincent/Uni/2.Semester/AOP/seminar/ProjectEulerAufgaben/src/LargestSum/test.txt");
		//File DateiW = new File("E:\\Uni\\programmiershit\\eclipse-shit\\eclipse\\ProjectEulerAufgaben\\src\\LargestSum\\zahl.txt");
		Scanner input = new Scanner(Datei);
		
		short[][] zahlen = new short[4][3];
		int sum = 0;
		int rest = 0;
		int uebertrag = 0;
		int[] erg = new int[3];
		
		for(int i = 0; i < 4; i++) {
			String line = input.next();
			for(int j = 0; j < 3; j++) {
				zahlen[i][j] = (short)Character.getNumericValue(line.charAt(j));
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(zahlen[i][j]);
			}
			System.out.println("");
		}
		
		for(int i = 2; i > -1; i--) {
			sum = 0;
			for(int j = 0; j < 4; j++) {
				sum += zahlen[j][i];
			}
			System.out.print("sum: " + sum);
			sum += rest;
			System.out.print(" sum + rest: " + sum);
			uebertrag = sum % 10;
			System.out.print(" uebertrag: " + uebertrag);
			if(i == 0) {
				erg[i] = sum;
			}else {
				erg[i] = uebertrag;
			}
			rest = (sum - uebertrag) / 10;
			System.out.print(" rest: " + rest);
			System.out.println("");
		}
		System.out.println("");
	
		for(int i = 0; i < 3; i++) {
			System.out.print(erg[i]);
		}
	}
}
