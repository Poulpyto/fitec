package metier;
/**
 * Classe Compte qui sert à définir un compte
 * @author floM
 * @version 1.0
 */
public class Compte {
	
	private int		idCompte;
	private String	nomCompte;
	private long	solde;
	/**
	 * @return the idCompte
	 */
	public int getIdCompte() {
		return idCompte;
	}
	/**
	 * @param idCompte the idCompte to set
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	/**
	 * @return the nomCompte
	 */
	public String getNomCompte() {
		return nomCompte;
	}
	/**
	 * @param nomCompte the nomCompte to set
	 */
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}
	/**
	 * @return the solde
	 */
	public long getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(long solde) {
		this.solde = solde;
	}
	/**
	 * @param idCompte id du compte
	 * @param nomCompte nom du compte
	 * @param solde solde du compte
	 */
	public Compte(int idCompte, String nomCompte, long solde) {
		super();
		this.idCompte = idCompte;
		this.nomCompte = nomCompte;
		this.solde = solde;
	}
	/**
	 * methode d'affichage toString();
	 */
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", nomCompte=" + nomCompte + ", solde=" + solde + "]";
	}

	
}
