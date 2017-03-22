package service;

import metier.Circle;

public class CircleService implements Surface, IFXDrawable, IPrintable  {


	public void printMe(String text) {
		System.out.println(text);
		
	}

	@Override
	public String getShape() {
		return "ceci est un cercle";
	}

	@Override
	public double getArea() {
		Circle c = new Circle(5);
		return c.getRadius() * (c.getRadius() * 2);
	}

}
