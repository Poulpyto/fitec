package metier;

public class CompteEpargne extends Compte {
	private float	taux;

	/**
	 * @param id
	 * @param nom
	 * @param solde
	 * @param taux
	 */
	public CompteEpargne(int id, String nom, float solde, float taux) {
		super(id, nom, solde);
		this.taux = taux;
	}

	/**
	 * @return the taux
	 */
	public float getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(float taux) {
		this.taux = taux;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  "Compte Epargne [ " + super.toString() + 
				"taux = " + taux + "]";	
	}
	/**
	 * calcul interets
	 * @return interets calculés
	 */
	public float	calculInterets(){
		System.out.println(solde * taux);
		return solde * taux;
	}

	@Override
	public float retirer(float mt) {
		if (this.solde - mt >= 0)
			return this.solde = this.solde - mt;
		else
			return this.solde;
	}
}