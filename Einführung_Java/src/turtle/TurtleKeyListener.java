package turtle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import ch.aplu.turtle.Turtle;

public class TurtleKeyListener implements KeyListener {

	private final Turtle turtle;

	TurtleKeyListener(Turtle turtle) {
		this.turtle = turtle;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button pressed: " + e.getKeyCode() + " = char " + (char) e.getKeyCode());
		
		switch ((char) e.getKeyCode()) {
		case 'W':
			turtle.forward(50);
			break;
		case 'A':
			turtle.left(90);
			break;
		case 'S':
			turtle.left(180);
			turtle.forward(50);
			break;
		case 'D':
			turtle.left(270);
			break;
		case 'K':
			this.kaka();
			break;
		}
	}
	
	private void kaka() {
		double tx = turtle._getX();
		double ty = turtle._getY();
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
