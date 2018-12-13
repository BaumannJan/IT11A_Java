package aufgaben;

import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import common.ConstantsBasePatterns;
import utilities.ConsoleInputValidator;

/**
 * Aufgabe 3.1, 3.2
 * 
 * @author Timon Schaich
 *
 */
public class KursUmrechner {

	static final double US_KURS = 1.1407;

	public static void main(String[] args) {
		/** Aufgabe 3.2 */
//		aufg32();
		/** Aufgabe 4.5 */
		aufg45();
	}
	
	/**
	 * Aufgabe 3.1, 3.2
	 */
	private static void aufg32() {
		System.out.println("Bitte geben sie den Betrag in Euro ein:");
		double betrag = ConsoleInputValidator.scanDouble();

		double dollar = (double) Math.round(betrag * US_KURS * 100) / 100;
		System.out.println("Euro: " + betrag + "\nDollar: " + dollar + "$");

	}
	
	/**
	 * Aufgabe 4.5
	 */
	private static void aufg45() {
		double output = 0.0;
		
		do {
			String input = JOptionPane.showInputDialog("Geben sie die Zahlen ein");
			if (!Pattern.matches(ConstantsBasePatterns.String_Pattern, input)) {
				output = Double.parseDouble(input);
			} else {
				JOptionPane.showMessageDialog(new JFrame(), "Bitte geben sie nur eine Zahl ein.");
			}
		} while (output == 0);
		double dollar = (double) Math.round(output * US_KURS * 100) / 100;
		
		JOptionPane.showMessageDialog(new JFrame(), dollar + "$");
		
	}
}
