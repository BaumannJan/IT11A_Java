package fussball;

public class Fussballer 
{
	//Attribute
	private String position,name,verein,nationalitaet;
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVerein() {
		return verein;
	}

	public void setVerein(String verein) {
		this.verein = verein;
	}

	public String getNationalitaet() {
		return nationalitaet;
	}

	public void setNationalitaet(String nationalitaet) {
		this.nationalitaet = nationalitaet;
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	private int groesse; //in cm
	
	//Methoden
		public void passen()
	{
		System.out.println("Traumpass!");
	}
	
	public void laufen()
	{
		System.out.println("Der Spieler " + name + " rennt wie ne Gazelle!");
	}
	
	public void schiessen()
	{
		System.out.println("Tor!");
	}
	
	public void foulen()
	{
		System.out.println("Blutgraetsche");
	}
}
