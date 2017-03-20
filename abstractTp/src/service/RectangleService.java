package service;
import metier.Rectangle;


public class RectangleService{
	
	public float perimetre(Rectangle r){
		return ((float) 2 * (r.getLongueur() + r.getLargeur()));
	}

	
	public float surface(Rectangle r) {
		return (float) (r.getLongueur() * r.getLargeur());
	}

/*	@Override
	public String toString() {
		Rectangle r = new Rectangle();
		return "Le rectangle de longueur " + r.getLongueur() + " et de largeur " + r.getLargeur();
	}*/
	
}
