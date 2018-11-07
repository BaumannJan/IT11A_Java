package done;

public class Noten {

	public static void main(String[] args) {

		String[] bz = { "sehr gut", "gut", "befriedigend", "ausreichend", "mangelhaft", "ungegügend" };

		int schul1, schul2, ex1, ex2, anzahl, note;
		double notenschnitt;

		schul1 = 2;
		schul2 = 3;
		ex1 = 4;
		ex2 = 2;
		anzahl = 6;
		notenschnitt = (double) (schul1 * 2 + schul2 * 2 + ex1 + ex2) / anzahl;
		note = (int) (notenschnitt + 0.5);

		System.out.println(" 1.Schulaufgabe: " + schul1);
		System.out.println(" 2.Schulaufgabe: " + schul2);
		System.out.println(" 1.Ex: " + ex1);
		System.out.println(" 2.Ex: " + ex2);
		System.out.println("-------------------------------------------------------------");
		System.out.println(" Notenschnitt =" + notenschnitt);
		System.out.println(" note = " + note);
		System.out.println(" In Schriftform = " + bz[note - 1]);

	}

}