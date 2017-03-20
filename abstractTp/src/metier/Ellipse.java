package metier;

public class Ellipse extends Form {

	private int	grandAxe, petitAxe;
	
	public Ellipse() {
		// TODO Auto-generated constructor stub
	}
	public Ellipse(int grandAxe, int petitAxe) {
		super();
		this.grandAxe = grandAxe;
		this.petitAxe = petitAxe;
	}
	public int getGrandAxe() {
		return grandAxe;
	}
	public void setGrandAxe(int grandAxe) {
		this.grandAxe = grandAxe;
	}
	public int getPetitAxe() {
		return petitAxe;
	}
	public void setPetitAxe(int petitAxe) {
		this.petitAxe = petitAxe;
	}
	@Override
	public String toString() {
		return ("l'ellipse de grand axe" + this.getGrandAxe() + ", de petit axe " + this.getPetitAxe());
	}
}
