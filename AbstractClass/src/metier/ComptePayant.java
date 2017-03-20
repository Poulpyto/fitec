package metier;

public class ComptePayant extends Compte {
	private float	pourcentage;

	/**
	 * @param pourcentage
	 */
	public ComptePayant(float pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}
	

	/**
	 * @return the pourcentage
	 */
	public float getPourcentage() {
		return pourcentage;
	}


	/**
	 * @param pourcentage the pourcentage to set
	 */
	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}


	/**
	 * @param id
	 * @param nom
	 * @param solde
	 * @param pourcentage
	 */
	public ComptePayant(int id, String nom, float solde, float pourcentage) {
		super(id, nom, solde);
		this.pourcentage = pourcentage;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte Payant [ " + super.toString() + 
				"pourcentage = " + pourcentage + "]";	
	}
	/**
	 * methode verser override de Compte
	 */
	public float	verser(float mt){
		if ((pourcentage * mt / 100) < this.solde + mt)
			this.solde = (mt + this.solde) - ((pourcentage * mt) /100);
		return this.solde;
	}
	/**
	 *  methode retirer override de Compte
	 */
	public float	retirer(float mt){
		if ((this.solde - mt) - (pourcentage * mt) / 100 >= 0)
			this.solde = (this.solde - mt ) -((pourcentage * mt) /100);
		return this.solde;
		}
}
