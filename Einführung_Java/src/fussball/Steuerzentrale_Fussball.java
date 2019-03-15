package fussball;

public class Steuerzentrale_Fussball {

	public static void main(String[] args) 
	{
		
		Fussballer [] mannschaft = new Fussballer[11];
		
		Fussballer fb1 = new Fussballer();
		Fussballer fb2 = new Fussballer();
		Fussballer fb3 = new Fussballer();
		
		mannschaft[0] = fb1;
		mannschaft[1] = fb2;	
		mannschaft[2] = fb3;

		fb1.position = "Stuermer";
		fb1.name = "Thomas";
		fb1.groesse = 195;
		fb1.verein = "Bayern";
		fb1.nationalitaet = "Deutscher";
		
		fb2.position = "Mittelfeld";
		fb2.name = "Leon";
		fb2.groesse = 182;
		fb2.verein = "Bayern";
		fb2.nationalitaet = "Deutscher";
		
		fb3.position = "Stuermer";
		fb3.name = "Robert";
		fb3.groesse = 190;
		fb3.verein = "Bayern";
		fb3.nationalitaet = "Pole";
		
		for (int i = 0; i<3; i++)
		{
			System.out.println("Der Spieler spielt für den Verein "  + mannschaft[i].verein);
			System.out.println("Der Spieler heisst "  + mannschaft[i].name);
			System.out.println("Der Spieler hat die Position "  + mannschaft[i].position);
			  mannschaft[i].laufen();
		   	  mannschaft[i].foulen();
		}
			
	}

}
