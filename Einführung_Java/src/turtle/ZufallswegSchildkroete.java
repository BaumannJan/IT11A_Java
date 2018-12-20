package turtle;

import java.util.Random;

import ch.aplu.turtle.Turtle;

public class ZufallswegSchildkroete {

	static Random r = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int l = 300;
		final int turn = 90;
		final int degree = 180;
		final int movement = 50;

		Turtle bonny = new Turtle();
		Turtle clyde = new Turtle(bonny);

		bonny.setPenColor(Turtle.BLACK);
		bonny.setColor(Turtle.BLACK);
		clyde.setPenColor(Turtle.GREEN);
		clyde.setColor(Turtle.GREEN);

		bonny.setPos(150, -150);
		clyde.setPos(-149, 100);

		bonny.speed(99900);
		clyde.speed(99900);

		for (int i = 1; i < 5; i++) {
			bonny.forward(l);
			bonny.left(turn);
		}

		clyde.right(turn);
		clyde.forward(movement);

		while ((clyde._getX() * clyde._getX() < 150 * 150 && clyde._getY() * clyde._getY() < 150 * 150)) {
			clyde.forward(movement * Math.random());
			clyde.left(degree * Math.random());
		}

	}

}
