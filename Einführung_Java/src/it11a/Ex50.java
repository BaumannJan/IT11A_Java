package it11a;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ausgabe = "Ausgabe: ";
		String ampel[];
		ampel = new String[3];
		
			ampel[0] = "red";
			ampel[1] = "yellow";
			ampel[2] = "green";
			
			for(int i = 0; i < ampel.length; i++) {
				if (i != 0)
					ausgabe+= "                   ";
				ausgabe+=ampel[i] +"\n";
			}
			JOptionPane.showMessageDialog(new JFrame(), ausgabe);
		}
	}