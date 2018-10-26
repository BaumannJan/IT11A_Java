package it11a;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int schul1, schul2, ex1, ex2, anzahl;
		double notenschnitt;

		schul1 = 2;
		schul2 = 3;

		ex1 = 4;
		ex2 = 2;
		anzahl = 6;
		notenschnitt = (float) (schul1 * 2 + schul2 * 2 + ex1 + ex2) / anzahl;
		System.out.println(" 1. Schulaufgabe:\t  " + schul1);
		System.out.println(" 2. Schulaufgabe:\t  " + schul2);
		System.out.println(" 1. EX: \t\t  " + ex1);
		System.out.println(" 2. EX: \t\t  " + ex2);
		System.out.println("___________________________");
		System.out.println(" Notenschnitt =\t\t" + notenschnitt);
	}
}
