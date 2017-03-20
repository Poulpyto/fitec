package metier;

public class Carre extends Form{

	private int	cote;
	public Carre() {
		// TODO Auto-generated constructor stub
	}
	
	public Carre(int cote) {
		super();
		this.cote = cote;
	}

	public int getCote() {
		return cote;
	}
	public void setCote(int cote) {
		this.cote = cote;
	}
	@Override
	public String toString() {
		return "le carre ayant " + this.getCote() + " en valeur de coté ";
	}
	
}
