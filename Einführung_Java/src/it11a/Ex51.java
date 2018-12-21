package it11a;

public class Ex51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String slf[][] = new String[3][3];
		slf[0][0] = "Stadt";
		slf[0][1] = "Land    ";
		slf[0][2] = "Gewaesser";
		
		slf[1][0] = "Aachen";
		slf[1][1] = "Armenien";
		slf[1][2] = "Ammer";
		
		slf[2][0] = "Berlin";
		slf[2][1] = "Bulgarien";
		slf[2][2] = "Bodensee";
		
		for (int i = 0; i < slf.length; i++) {
		    for (int j = 0; j < slf[i].length; j++) {
		    	
		        System.out.print(slf[i][j] + "\t\t");
		    } 
		    System.out.println();
		}
	}

}
