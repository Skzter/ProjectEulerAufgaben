package LargestSum;
import java.io.File;
import java.util.Scanner;

public class haupt {

	public static void main(String[] args) throws Exception {
		File Datei = new File("/home/vincent/Uni/2.Semester/AOP/seminar/ProjectEulerAufgaben/src/LargestSum/zahl.txt");
		Scanner input = new Scanner(Datei);
		
		int sum = 0;
		int rest = 0;
		int uebertrag = 0;
		
		/*
		for(int i = 3; i >= 0; i--) {
			while(input.hasNextLine()) {
				sum += Character.getNumericValue(input.nextLine().charAt(i));
			}
			System.out.println(sum);
			System.out.println(i);

			
			System.out.println(i);
			System.out.println("Summe " + sum);
			rest = sum % 10;
			uebertrag = sum - rest;
			System.out.println("Rest " + rest);
			System.out.println("Rest " + uebertrag);
			*/
		for(int i = 0; i < 3; i++) {
			while(input.hasNextLine()) {
				sum += Character.getNumericValue(input.nextLine().charAt(i));
			}
			System.out.println(sum);
		}
	}
}
