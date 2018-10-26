package utilities;

import java.util.Scanner;
import java.util.regex.Pattern;

import common.ConstantsBasePatterns;

/**
 * Validates the Input used by the Class Scanner.
 * @author Timon
 *
 */
public class ConsoleInputValidator {
	
	/**
	 * Gets, validates and Parses the String as Double
	 * @param input
	 * @return output double
	 */
	public static double scanDouble() {
		double output = 0;
		Scanner sc = new Scanner(System.in);
		do {
			String input = sc.next();
			if (!Pattern.matches(ConstantsBasePatterns.String_Pattern, input)) {
				output = Double.parseDouble(input);
			} else {
				System.out.println("Bitte geben sie eine gültige Zahl ein...");
			}
		} while (output == 0);

		return output;
	}
	
	/**
	 *Gets, validates and Parses the String as Integer
	 * @param input
	 * @return output integer
	 */
	public static double scanInteger() {
		int output = 0;
		Scanner sc = new Scanner(System.in);
		do {
			String input = sc.next();
			if (!Pattern.matches(ConstantsBasePatterns.String_Pattern, input)) {
				output = Integer.parseInt(input);
			} else {
				System.out.println("Bitte geben sie eine gültige Zahl ein...");
			}

		} while (output == 0);
		return output;
	}
	
}
