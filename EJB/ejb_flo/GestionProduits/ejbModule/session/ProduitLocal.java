package session;

import java.util.List;

import javax.ejb.Local;

import metier.Produit;

@Local
public interface ProduitLocal {

	public int ajouterProduit(Produit p);

	public Produit modifierProduit(Produit p);

	public void supprimerProduit(Produit p);

	public Produit getProdiut(int id);

	public List<Produit> findAllProduits();

}
