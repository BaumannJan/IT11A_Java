package utilities;

import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import common.ConstantsBasePatterns;

public class DialogInputValidator {
	public static double dialogDouble(String message, String errMessage) {
		double output = 0.0;
		
		do {
			String input = JOptionPane.showInputDialog(message);
			if(!Pattern.matches(ConstantsBasePatterns.String_Pattern, input)) {
				output = Double.parseDouble(input);
			} else {
				JOptionPane.showMessageDialog(new JFrame(), errMessage);
			}
		}while(output == 0);
		
		return output;
	}
}
