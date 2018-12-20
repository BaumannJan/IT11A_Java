package turtle;

import java.awt.geom.Point2D;

import ch.aplu.turtle.Turtle;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D.Double pos = new Point2D.Double(0.0, 0.0);
		Turtle jack = new Turtle();

		jack.setPos(pos);

		for (int i = 0; i < 99; i++) {

			jack.speed(Double.MAX_VALUE);

			int deltalang = 5;
			int deltakurz = 8;
			int kurz = 15;
			int lang = 15;

			kurz += deltakurz * i;
			lang += deltalang * i;

			jack.forward(kurz);
			jack.left(90);
			jack.forward(lang);
			jack.left(90);

		}
	}

}
