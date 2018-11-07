package done;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Eingabe_Ausgabe_Swing {

	public static void main(String[] args) {
		
		
		
		String string1 = JOptionPane.showInputDialog("Bitte geben sie einen String an");
		String string2 = JOptionPane.showInputDialog("Bitte geben sie einen zweiten String an");
		
		String result = "";
		
		result += "String1 ist: " + string1 + "\n";
		result += "String2 ist: " + string2 + "\n";
		result += "\n";
		
		//Funktion charAt Funktion um einen Charakter aus dem String heraus zu nehmen
		result += "charAt Funktion - das dritte Zeichen von dem ersten String: " + string1.charAt(2) + "\n";
		result += "charAt Funktion - das zweite Zeichen von dem zweiten String: " + string2.charAt(1) + "\n";
		result += "\n";

		//�berpr�ft ob in dem String das gleiche steht wie in den Klammern
		result += "�berpr�ft ob String1 gleich \"Hallo\" ist: " + string1.equals("Hallo") + "\n";
		result += "�berpr�ft ob String2 gleich \"Test\" ist: " + string2.equals("Test") + "\n";
		result += "\n";

		//Verkn�pft beide Strings einfach miteinander
		result += "Verbindet beide Stings zusammen: " + string1.concat(string2) + "\n";
		result += "\n";

		//Schreibt den String komplett Upper Case (also alles in Gro�buchstaben)
		result += "Schreibt den ersten String in Gro�buchstaben: " + string1.toUpperCase() + "\n";
		result += "Schreibt den zweiten String in Gro�buchstaben: " + string2.toUpperCase() + "\n";
		result += "\n";

		//Gibt die L�nge der Strings aus
		result += "Die L�nge des ersten Strings betr�gt " + string1.length() + " Zeichen.\n";
		result += "Die L�nge des zweiten Strings betr�gt " + string2.length() + " Zeichen.\n";
		result += "\n";

		//schneidet einen Teil aus dem String heraus und gibt diesen an
		result += "Nimmt die ersten zwei Zeichen aus dem ersten String und gibt diese aus: " + string1.substring(0, 2) + "\n";
		result += "Nimmt das zweite und dritte Zeichen aus dem ersten String und gibt diese aus: " + string1.substring(1, 3) + "\n";
		result += "\n";

		JOptionPane.showMessageDialog(new JFrame(), result);
		
	}
}