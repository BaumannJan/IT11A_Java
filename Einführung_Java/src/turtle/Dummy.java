package turtle;

import java.util.Scanner;

import ch.aplu.turtle.Turtle;

public class Dummy {

	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Turtle t = new Turtle();
		TurtleKeyListener keyListener = new TurtleKeyListener(t);
		
		t.getFrame().addKeyListener(keyListener);
		
		System.out.println("WASD \n" + "[w: forward] \n" + "[a: turn left] \n" + "[s: back] \n" + "[d: turn right] \n");
		t._getPos();

		while (true) {

			char c1 = input.nextLine().charAt(0);
			switch (c1) {
			case 'w':
				t.forward(50);
				break;

			case 'a':
				t.left(90);
				break;

			case 's':
				t.left(180);
				t.forward(50);
				break;

			case 'd':
				t.left(270);
				break;

			}
		}
	}

}
