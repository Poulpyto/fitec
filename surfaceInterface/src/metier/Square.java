package metier;

public class Square extends Rectangle {

	double cote;

	public Square(double cote) {
		super(cote, cote);
		this.cote = cote;
	}

	public double getCote() {
		return this.cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}
	
}
