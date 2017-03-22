package presentation;

import metier.Circle;
import metier.Rectangle;
import metier.Square;


public class Lanceur {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10, 5);
		System.out.println("rectangle a " + r1.getWidth() + " width et " + r1.getHeight() + " height");
		Square s1 = new Square(10);
		System.out.println("carre a "+ s1.getCote() + " de cote");
		Circle c1 = new Circle(5);
		System.out.println("le cercle a pour radius : " + c1.getRadius());
	}

}
