package done;

import aWorkingprogress.Eingabe;

public class Kursumwandlung_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double EUROKURS = 1.1409;
		double euro, dollar, dollarGerundet;
		
		System.out.println("Bitte geben sie die Euro an");
		euro = Eingabe.readDouble();
		System.out.printf("Sie haben %6.2f Euro angegeben. \n", euro); //-> Das war eine prinf übung ist aber total unnötig
		dollar = euro * EUROKURS;
		dollarGerundet = (double) Math.round(dollar * 100) / 100;

		System.out.println("Die " + euro + " Euro entsprechen " + dollarGerundet + " Dollar.");


	}

}
