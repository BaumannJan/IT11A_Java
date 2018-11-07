package done;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("Bitte geben sie einen String an");
		String string1 = Eingabe.readString();
		System.out.println("Bitte geben sie einen zweiten String an");
		String string2 = Eingabe.readString();
		*/
		//Zum testen kann man mit arg0 und Argumenten arbeiten, wenn das Programm laufen soll muss dieser Teil auskommentiert werden und der eingabe Teil wieder rein
		
		String string1 = args[0];
		String string2 = args[1];
		
		System.out.println("String1 ist: " + string1);
		System.out.println("String2 ist: " + string2);
		
		//Funktion charAt Funktion um einen Charakter aus dem String heraus zu nehmen
		System.out.println("charAt Funktion - das dritte Zeichen von dem ersten String: " + string1.charAt(2));
		System.out.println("charAt Funktion - das zweite Zeichen von dem zweiten String: " + string2.charAt(1));
		
		//Überprüft ob in dem String das gleiche steht wie in den Klammern
		System.out.println("Überprüft ob String1 gleich \"Hallo\" ist: " + string1.equals("Hallo"));
		System.out.println("Überprüft ob String2 gleich \"Test\" ist: " + string2.equals("Test"));
		
		//Verknüpft beide Strings einfach miteinander
		System.out.println("Verbindet beide Stings zusammen: " + string1.concat(string2));
		
		//Schreibt den String komplett Upper Case (also alles in Großbuchstaben)
		System.out.println("Schreibt den ersten String in Großbuchstaben: " + string1.toUpperCase());
		System.out.println("Schreibt den zweiten String in Großbuchstaben: " + string2.toUpperCase());
		
		//Gibt die Länge der Strings aus
		System.out.println("Die Länge des ersten Strings beträgt " + string1.length() + " Zeichen.");
		System.out.println("Die Länge des zweiten Strings beträgt " + string2.length() + " Zeichen.");
		
		//schneidet einen Teil aus dem String heraus und gibt diesen an
		System.out.println("Nimmt die ersten zwei Zeichen aus dem ersten String und gibt diese aus: " + string1.substring(0, 2));
		System.out.println("Nimmt das zweite und dritte Zeichen aus dem ersten String und gibt diese aus: " + string1.substring(1, 3));
		
		

	}

}
