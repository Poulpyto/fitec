package metier;

public class CompteSimple extends Compte {
	private float	decouvert;

	/**
	 * @param decouvert
	 */
	public CompteSimple(float decouvert) {
		super();
		this.decouvert = decouvert;
	}
	/**
	 * @param id
	 * @param nom
	 * @param solde
	 * @param decouvert
	 */
	public CompteSimple(int id, String nom, float solde, float decouvert) {
		super(id, nom, solde);
		this.decouvert = decouvert;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte Simple [ " + super.toString() + 
				"Découvert = " + decouvert + "]";
	}
	/**
	 * @return the decouvert
	 */
	public float getDecouvert() {
		return decouvert;
	}
	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}
	/**
	 * methode retirer override de Compte
	 */
	public float retirer(float mt){
			if (mt - this.solde <= decouvert)
				this.solde = this.solde - mt;
			return this.solde;
	}
	
}

