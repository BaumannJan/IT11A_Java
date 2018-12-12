package aufgaben;

import java.awt.Color;
import java.util.Random;

import ch.aplu.turtle.Turtle;
import ch.aplu.util.GPanel;

public class Schleifen {
	private static Random r = new Random();
	public static void main(String[] args) {
		background();
	}
	
	private void setTurtle() {
				Turtle john = new Turtle();
		john.speed(1900);
		double xMove = 10;
		double yMove = 11;
		boolean x = true;
		for (int i = 0; i < 1000; i++) {
			if (x) {
				john.forward(xMove);
				xMove+=3;
				john.left(90);
				x = false;
			} else {
				john.forward(yMove);
				yMove+=2;
				john.left(90);
				x = true;
			}

		}
	}
	
	private static void background()  {
		float maxCoord = 1;
		GPanel panel = new GPanel();
		for(int i = 0; true;i++) {
			panel.setColor(getRandomColor());
			double xMin = Math.random();
			double xMax = Math.random();
			double yMax = Math.random();
			double yMin = Math.random();

			panel.fillRectangle(xMin, yMin, xMax, yMax);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Sleep failed");
			}
		}
	}
	
	public static Color getRandomColor() {
		int red = r.nextInt(255);
		int green = r.nextInt(255);
		int blue = r.nextInt(255);
		return new Color(red, green, blue);
	}
}
