package Project500;

public class haupt {

	public static void main(String[] args) {
		int teiler = 0;
		double zahl = Math.pow(2, 30);
		for(int z = 1; z <= zahl; z++) {
			if(zahl % z == 0) {
				teiler += 1;
			}
		}
		System.out.println(teiler);
		//System.out.println(teiler%500500507);
	}

}
