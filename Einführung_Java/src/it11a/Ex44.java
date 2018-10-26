package it11a;

public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "85368Moosburg";
		String text2 = "85368Moosburg";
		String plz = "85368";
		String ort = "Moosburg";
		
		int i = 3;
		text.charAt(i);
		text.equals(text2);
		
		System.out.println(i);
		
		if (text.contains(plz)) {
			System.out.println("PLZ im Text.");
		}
		
		String plzort = plz.concat(ort);
		System.out.println(plzort);
		
		System.out.println(ort.toUpperCase());
		
		int laenge = text.length();
		System.out.println(laenge);
		
		String sub = text.substring(5);
		System.out.println(sub);
	}
}