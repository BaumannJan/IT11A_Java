package done;

public class Kursumwandlung_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double EUROKURS = 1.1409;
		double euro, dollar, dollarGerundet;
		
		//System.out.println("Bitte geben sie die Euro an");
		//euro =  Eingabe.readDouble();								<-- hier wird dann nach Eingabe gefragt, anstatt dass man das Argument aus der Konfiguration nimmt
		euro = Double.parseDouble(args[0]);
		System.out.printf("Sie haben %6.2f Euro angegeben. \n", euro); //-> Das war eine prinf übung ist aber total unnötig
		dollar = euro * EUROKURS;
		dollarGerundet = (double) Math.round(dollar * 100) / 100;

		System.out.println("Die " + euro + " Euro entsprechen " + dollarGerundet + " Dollar.");


	}

}
