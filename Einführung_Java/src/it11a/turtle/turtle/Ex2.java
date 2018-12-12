package turtle;

import java.awt.Color;
import java.util.Random;

import ch.aplu.util.GPanel;

public class Ex2 {

	public static Random r = new Random();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		GPanel panel = new GPanel();
		for (int i = 0; 30 < 31; i++) {

			

			double xmin, xmax, ymin, ymax;
			xmin = Math.random();
			xmax = Math.random();
			ymin = Math.random();
			ymax = Math.random();

			panel.setColor(rdmColor());
			panel.fillRectangle(xmin, ymin, xmax, ymax);
			Thread.sleep(1);
		}
	}

	public static Color rdmColor() {
		int red = r.nextInt(255);
		int green = r.nextInt(255);
		int blue = r.nextInt(255);
		return new Color(red, green, blue);

	}

}
