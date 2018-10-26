package it11a;

public class Ex210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DEKLARATION
		int schul1, schul2, ex1, ex2, anzahl;
		double notenSchnitt;
		int zeugnisNote;

		// IMPLEMENTIERUNG
		schul1 = 2;
		schul2 = 3;
		ex1 = 4;
		ex2 = 2;
		anzahl = 6;
		notenSchnitt = (float) (schul1 * 2 + schul2 * 2 + ex1 + ex2) / anzahl;
		zeugnisNote = (int) (notenSchnitt + 0.5);

		// AUSGABE
		System.out.println(" 1. Schulaufgabe:\t  " + schul1);
		System.out.println(" 2. Schulaufgabe:\t  " + schul2);
		System.out.println(" 1. EX: \t\t  " + ex1);
		System.out.println(" 2. EX: \t\t  " + ex2);
		System.out.println("__________________________________________");
		System.out.println(" Notenschnitt =\t\t" + notenSchnitt);
		System.out.println(" Zeugnisnote  = \t" + zeugnisNote);

	}
}
