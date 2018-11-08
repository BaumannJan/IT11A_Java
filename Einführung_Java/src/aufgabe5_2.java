package done;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class aufgabe5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "http://www.berufsschule-freising.de:8080/index.html";
		
		StringTokenizer st2 = new StringTokenizer(url, ":// | :");
		
        ArrayList<String> urlList = new ArrayList<String>();
		
		while (st2.hasMoreElements()) {
			urlList.add(st2.nextToken());
		}
		
		System.out.println("Ganze URL: " + url);
		System.out.println("Protokoll: " + urlList.get(0));
		System.out.println("Port: " + urlList.get(2));
	
	}
}