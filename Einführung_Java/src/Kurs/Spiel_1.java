package Kurs;

public class Spiel_1 {

	public static void main(String[] args) 
	{
		String spiel[][];
		spiel= new String [3][3];
		//Wertzuweisung
		spiel[0][0]="Stadt";
		spiel[1][0]="Land";
		spiel[2][0]="Gewässer";
		spiel[0][1]="Aachen";
		spiel[1][1]="Armenien";
		spiel[2][1]="Ammer";
		spiel[0][2]="Berlin";
		spiel[1][2]="Bulgarien";
		spiel[2][2]="Bodensee";
		//Ausgabe
		System.out.println(spiel[0][0] + "\t\t" + spiel[1][0] + "\t\t" + spiel[2][0] + "\n" 
						 + spiel[0][1] + "\t\t" + spiel[1][1] +  "\t"  + spiel[2][1] + "\n" 
                         + spiel[0][2] + "\t\t" + spiel[1][2] +  "\t"  + spiel[2][2]);

	}

}
