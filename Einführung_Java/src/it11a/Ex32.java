package it11a;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int usd = 1;
		final double COURSE = 1.19267800;
		
		double eur =  usd * COURSE;
		double roundEur = (double) Math.round(eur*100) /100;
				
		System.out.println(usd + ".00$ = " + eur + "€" );
		System.out.println(usd + ".00$ = " + roundEur + "€" );
	}

}
