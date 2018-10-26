package it11a;

public class Ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double usd;
		final double COURSE = 1.19267800;

		final String aufforderung = "Geben Sie bitte eine Zahl ein";
		System.out.println(aufforderung);
		
		usd = Eingabe.readDouble();
		
		double eur =  usd * COURSE;
		double roundEur = (double) Math.round(eur*100) /100;
				
		System.out.println(usd + "$ = " + eur + "€" );
		System.out.println(usd + "$ = " + roundEur + "€" );
		
		System.out.printf("%3.2f", roundEur);
		

	}

}
