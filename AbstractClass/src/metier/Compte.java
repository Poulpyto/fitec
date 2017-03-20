package metier;

public abstract class Compte {

	private int			id;
	private String		nom;
	protected float		solde;
	private static int	nbComptes;
	
	/**
	 * 
	 */
	public Compte() {
		super();
		nbComptes += 1;
	}
	/**
	 * @param id
	 * @param nom
	 * @param solde
	 */
	public Compte(int id, String nom, float solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.solde = solde;
		nbComptes = nbComptes + 1;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the solde
	 */
	public float getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(float solde) {
		this.solde = solde;
	}
	/**
	 * @return the nbcomptes
	 */
	public static int getNbcomptes() {
		return nbComptes;
	}
	/**
	 * @param nbcomptes the nbcomptes to set
	 */
	public static void setNbcomptes(int nbcomptes) {
		Compte.nbComptes = nbcomptes;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [id=" + this.id + ", nom=" + this.nom + ", solde=" + this.solde + "]";
	}
	/**
	 * methode verser
	 * @param mt montant a verser
	 * @return solde apres versement
	 */
	public float	verser(float mt){
		if (mt > 0)
			return this.solde = this.solde + mt;
		return solde;
	}
	/**
	 * methode retirer
	 * @param mt montant a retirer
	 * @return solde apres retrait
	 */
	public abstract float retirer(float mt);
/*	public float	retirer(float mt){
	public abstract float retirer(float mt);
	if (this.solde - mt >= 0)
			return this.solde = this.solde - mt;
		else
			return this.solde;
	}*/
}
