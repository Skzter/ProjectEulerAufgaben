package SmallestMultiple;

public class haupt {

	public static void main(String[] args) {
		int wert = 1;
		int sum = 0;
		while(true) {
			if(wert%1 == 0 && wert%2 == 0 && wert%3 == 0 && wert%4 == 0 && wert%5 == 0 && wert%6 == 0 && wert%7 == 0 && wert%8 == 0 && wert%9 == 0 && wert%10 == 0 && wert%11 == 0 && wert%12 == 0 && wert%13 == 0 && wert%14 == 0 && wert%15 == 0 && wert%16 == 0 && wert%17 == 0 && wert%18 == 0 && wert%19 == 0 && wert%20 == 0) {
				sum = wert;
				break;
		}
		wert++;
			
		}
		System.out.println(sum);
	}

}
