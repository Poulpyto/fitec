package metier;

import java.io.Serializable;

/**
 * Classe Compte qui sert à définir un compte.
 * 
 * @author Stagiaire
 * @version 1.0
 */

public class Compte implements Serializable {

	private int idCompte; // l'identifiant du compte
	private String nomCompte; // le nom du compte
	private long solde; // le solde du compte
	
	
	/**
	 * Première méthode Constructeur de Compte (sans paramètres).
	 */
	public Compte() {
		super();
	}

	/**
	 * Deuxième méthode Constructeur de Compte.
	 * 
	 * @param idCompte : l'identifiant du compte
	 * @param nomCompte : le nom du compte
	 */
	public Compte(int idCompte, String nomCompte) {
		super();
		this.idCompte = idCompte;
		this.nomCompte = nomCompte;
	}

	/**
	 * Troisième méthode Constructeur de Compte
	 * 
	 * @param idCompte : l'identifiant du compte
	 * @param nomCompte : le nom du compte
	 * @param solde : le solde du compte
	 */
	public Compte(int idCompte, String nomCompte, long solde) {
		super();
		this.idCompte = idCompte;
		this.nomCompte = nomCompte;
		this.solde = solde;
	}

	/**
	 * Getter de l'attribut idCompte.
	 * @return l'identifiant du compte
	 */
	public int getIdCompte() {
		return idCompte;
	}

	/**
	 * Setter de l'attribut idCompte.
	 * @param idCompte : l'identifiant du compte
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	/**
	 * Getter de l'attribut nomCompte.
	 * @return le nom du compte
	 */
	public String getNomCompte() {
		return nomCompte;
	}

	/**
	 * Setter de l'attribut nomCompte.
	 * @param nomCompte : le nom du compte
	 */
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}

	/**
	 * Getter de l'attribut solde.
	 * @return le solde du compte
	 */
	public long getSolde() {
		return solde;
	}

	/**
	 * Setter de l'attribut solde
	 * @param solde : le solde du compte
	 */
	public void setSolde(long solde) {
		this.solde = solde;
	}

	/**
	 * Méthode d'affichage de Compte.
	 * @see java.lang.Object#toString()
	 * @return l'identifiant, le nom et le solde du compte.
	 */
	@Override
	public String toString() {
		return "Compte [Identifiant = " + idCompte + " | Nom = " + nomCompte + " | Solde = " + solde + "]";
	}

	
	
}
