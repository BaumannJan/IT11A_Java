package aufgaben;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Beinhaltet alle Aufgaben, welche keine eigene Klasse benoetigen.
 * @author Timon
 *
 */
public class Interlude {
	public static void main(String[] args) {
		aufg51Array();
	}
	
	/**
	 * Aufgabe 5.1 mit Schleife
	 */
	public static void aufg51Array() {
		String[][] list = {{ "Stadt","Land", "Gewaesser"}, {"Aachen", "Armenien", "Ammer"}, {"Berlin", "Bulgarien", "Bodensee"}};
		String output = "";
		for(int i = 0; i<list.length; i++) {
			for(int n = 0; n<3;n++) {
				output += list[i][n] + "\t";
			}
			output += "\n";
		}
		
		System.out.println(output);
	}
	
	public static void aufg51ArrayList() {
		ArrayList<ArrayList<String>> list = new ArrayList<>();
		list.add(new ArrayList<>(Arrays.asList("Stadt", "Land", "Gewaesser")));
		list.add(new ArrayList<>(Arrays.asList("Aachen", "Armenien", "Ammer")));
		list.add(new ArrayList<>(Arrays.asList("Berlin", "Bulgarien", "Bodensee")));
		
		System.out.println(list.get(0).get(0) + list.get(0).get(1) + list.get(0).get(2));
		
	}
	
}
