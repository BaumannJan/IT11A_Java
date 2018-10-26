package aufgaben;

import java.util.Scanner;

import utilities.ConsoleInputValidator;
/**
 * Aufgabe 3.1, 3.2
 * @author Timon Schaich
 *
 */
public class KursUmrechner {
	
	static final double US_KURS = 1.1407;
	
	public static void main(String[] args) {
		System.out.println("Bitte geben sie den Betrag in Euro ein:");
		double betrag = ConsoleInputValidator.scanDouble();
		
		double dollar = (double) Math.round(betrag*US_KURS*100)/100;
		System.out.println("Euro: "+betrag+"\nDollar: " + dollar + "$");
	}
}
