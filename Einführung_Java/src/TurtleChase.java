package aWorkingprogress;

import java.util.Random;

import ch.aplu.turtle.Turtle;

public class TurtleChase {

	public static void main(String[] args) throws InterruptedException {

		Turtle prey = new Turtle();
		Turtle hunter = new Turtle(prey);

		hunter.getFrame().addKeyListener(new ChaseListener(hunter));

		prey.setPos(0, 40);
		prey.setColor("blue");
		hunter.setColor("red");

		int ZugZaehler = 0;

		do {
			// Lass der Turtle kurz überlegungszeit:
			Thread.sleep(100);

			moveRandom(prey);

			checkPosition(prey);

			if (turtlesTouch(prey, hunter))
				break;

			// Spieler ist jetzt am Zug
			spielerIstAmZug = true;

			// Move Your Turtle
			// Es wird überprüft ob der Spieler am Zug ist - busy loop
			while (spielerIstAmZug) {
				Thread.sleep(50);
			}

			checkPosition(hunter);

			ZugZaehler += 1;

		} while (!turtlesTouch(prey, hunter));

		System.out.println("You Won! It took you " + ZugZaehler + " Moves!");
		Thread.sleep(3000);
		System.exit(0);

	}

	public static boolean spielerIstAmZug = false;

	private static Random randomgenerator = new Random();

	private static boolean turtlesTouch(Turtle erste, Turtle zweite) {
		return ((erste._getX() - zweite._getX()) * (erste._getX() - zweite._getX())
				+ (erste._getY() - zweite._getY()) * (erste._getY() - zweite._getY()) <= 29 * 29);
	}

	private static void checkPosition(Turtle turtleToProof) {
		if (turtleToProof._getX() > 200) {
			turtleToProof.setPos(-200, turtleToProof._getY());
		} else if (turtleToProof.getX() < -200) {
			turtleToProof.setPos(200, turtleToProof._getY());
		}
		if (turtleToProof._getY() > 200) {
			turtleToProof.setPos(turtleToProof._getX(), -200);
		} else if (turtleToProof.getY() < -200) {
			turtleToProof.setPos(turtleToProof._getX(), 200);
		}
	}

	private static void moveRandom(Turtle turtleToMoove) {
		int zufallszahl = randomgenerator.nextInt(4);

		switch (zufallszahl) {
		case 1:
			turtleToMoove.left(90);
			break;
		case 2:
			turtleToMoove.right(90);
			break;
		case 3:
			turtleToMoove.left(180);
			break;
		}
		turtleToMoove.forward(20);
	}

}
