package it11a;
import javax.swing.*;

public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ortBeschreibung;
		String newPLZ;
		int laenge;
		String newOrt;
		
		String ort = JOptionPane.showInputDialog("Bitte 'Moosburg' eingeben");
		
		// JOptionPane.showMessageDialog(new JFrame(), "Knopf gedrückt");
		JOptionPane.showMessageDialog(new JFrame(), ort);
		
		
		String plz = JOptionPane.showInputDialog("Bitte 'PLZ' eingeben");
		
		ort = ort.toUpperCase();
		
		ortBeschreibung = plz.concat(" "+ ort);
	
		
		JOptionPane.showMessageDialog(new JFrame(), ortBeschreibung);
		
		laenge = ortBeschreibung.length();
		
		newPLZ = ortBeschreibung.substring(0, 5);
		newOrt = ortBeschreibung.substring(5, laenge);
		
		JOptionPane.showMessageDialog(new JFrame(), newPLZ);
		JOptionPane.showMessageDialog(new JFrame(), newOrt);
	}

}
