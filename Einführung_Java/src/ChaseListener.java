package aWorkingprogress;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import ch.aplu.turtle.Turtle;

public class ChaseListener implements KeyListener{
	
	private Turtle player;
	
	public ChaseListener(Turtle turtle) {
		this.player = turtle;
	}
	
	@Override
	public void keyPressed(KeyEvent evt) {
		if (TurtleChase.spielerIstAmZug) {
			
			int keyCode = evt.getKeyCode();
		
			switch (keyCode) {
				case KeyEvent.VK_LEFT : 
					this.player.left(90);
					break;
				case KeyEvent.VK_RIGHT : 
					this.player.right(90);
					break;
				case KeyEvent.VK_UP : 
					this.player.left(0);
					break;
				case KeyEvent.VK_DOWN : 
					this.player.left(180);
					break;
			}
			
			this.player.forward(20);
			TurtleChase.spielerIstAmZug = false;

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
}