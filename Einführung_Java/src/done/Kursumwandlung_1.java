package done;

public class Kursumwandlung_1 {

	public static void main(String[] args) {

		final double EUROKURS = 1.1409f;
		double euro, dollar, dollarGerundet;

		euro = 23.27d;
		dollar = euro * EUROKURS;
		dollarGerundet = (double) Math.round(dollar * 100) / 100;

		System.out.println("Die " + euro + " Euro entsprechen " + dollarGerundet + " Dollar.");

	}

}
