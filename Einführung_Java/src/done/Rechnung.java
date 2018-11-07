package done;

public class Rechnung {
	public static void main(String args[]) {
		int wert1, wert2;
		int summe, differenz, produkt;
		wert1 = 6;
		wert2 = 3;
		summe = wert1 + wert2;
		differenz = wert1 - wert2;
		produkt = wert1 * wert2;
		System.out.println("Die Berechnung wurde durchgeführt");
		System.out.println(wert1 + " + " + wert2 + " = " + summe);
		System.out.println("Subtraktion:");
		System.out.println(wert1 + " - " + wert2 + " = " + differenz);
		System.out.println("Multiplikation:");
		System.out.println(wert1 + " * " + wert2 + " = " + produkt);
	} // Blockende Methode
} // Blockende Klasse
