package it11a;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wert1, wert2;
		int summe;
		int multi;
		int mod;
		double div;

		wert1 = 6;
		wert2 = 3;

		summe = wert1 + wert2;
		multi = wert1 * wert2;
		div = wert1 / wert2;
		mod = wert1 % wert2;

		System.out.println("Die Berechnung wurde durchgeführt");

		System.out.println(wert1 + " + " + wert2 + " = " + summe);
		System.out.println(wert1 + " * " + wert2 + " = " + multi);
		System.out.println(wert1 + " / " + wert2 + " = " + div);
		System.out.println(wert1 + " % " + wert2 + " = " + mod);

	}
}