package metier;

public class Rectangle extends Form {
	private int	longueur;
	private int	largeur;
	
	
	public Rectangle() {
		super();
	}

	public Rectangle(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	@Override
	public String toString() {
		return "Le rectangle de longueur " + this.getLongueur() + " et de largeur " + this.getLargeur();
	}
	
}
