package done;

public class Division {

	public static void main(String[] args) {
		
		float wert1,wert2,div;
		double mod,test;
		
		wert1 = 10.5f;
		wert2 = 15f;
		test = 5;
		
		div = wert1 / wert2;
		mod = wert1 % wert2;
		test %= 4;
		
		System.out.println(wert1 + " / " + wert2 + " = " + div);
		System.out.println(wert1 + " % " + wert2 + " = " + mod);
		System.out.println(test);
		
	}
	
}