package turtle;

import java.awt.Color;
import java.util.Random;

import ch.aplu.util.GPanel;

public class Cube {

	static Random r = new Random();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int dice;
		int count = 0;
		Random r = new Random();
		GPanel panel = new GPanel();

		do {
			dice = r.nextInt(6) + 1;
			drawDice(panel, dice, count);
			count++;
			Thread.sleep(200);
			System.out.println(dice);
		} while (dice != 9);

		System.out.println("Anzahl Würfel " + count);
	}

	private static void drawDice(GPanel panel, int n, int count) {

		double l = 0.06;
		double d = l + 0.02;
		int augenFaktor = 8;

		double xmin = 0.01 + count % (int)(1/d) * d;
		double ymin = 0.01 + count / (int)(1/d) * d;
		double xmax = xmin + l;
		double ymax = ymin + l;

		panel.setColor(new Color(0, 0, 0));
		panel.fillRectangle(xmin - 0.002, ymin - 0.002, xmax + 0.002, ymax + 0.002);

		panel.setColor(rdmColor());
		panel.fillRectangle(xmin, ymin, xmax, ymax);

		panel.setColor(new Color(0, 0, 0));
		if (n != 1) {
			panel.pos(xmin + l / 4, ymin + l / 4);
			panel.fillCircle(l / augenFaktor);
			panel.pos(xmax - l / 4, ymax - l / 4);
			panel.fillCircle(l / augenFaktor);
		}

		if (n > 3) {
			panel.pos(xmin + l / 4 * 3, ymin + l / 4);
			panel.fillCircle(l / augenFaktor);
			panel.pos(xmin + l / 4, ymin + l / 4 * 3);
			panel.fillCircle(l / augenFaktor);
		}
		if (n % 2 == 1) {
			panel.pos(xmin + l / 2, ymin + l / 2);
			panel.fillCircle(l / augenFaktor);
		}
		if (n == 6) {
			panel.pos(xmax - l / 4, ymax - l / 2);
			panel.fillCircle(l / augenFaktor);
			panel.pos(xmax - l / 4 * 3, ymax - l / 2);
			panel.fillCircle(l / augenFaktor);
		}
	}

	public static Color rdmColor() {
		int red = r.nextInt(255);
		int green = r.nextInt(255);
		int blue = r.nextInt(255);
		return new Color(red, green, blue);
	}

}
