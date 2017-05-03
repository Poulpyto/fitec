package session;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.Produit;

/**
 * Session Bean implementation class ProduitEJBImpl
 */
@Stateless
@LocalBean
public class ProduitEJBImpl implements ProduitRemote, ProduitLocal {

	
	@PersistenceContext(name="ejb-pu")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public ProduitEJBImpl() {

    }

	@Override
	public int ajouterProduit(Produit p) {

		em.persist(p);
		
		return p.getId();
	}

	@Override
	public Produit modifierProduit(Produit p) {

		em.merge(p);

		return p;
	}

	@Override
	public void supprimerProduit(Produit p) {
		
		em.remove(em.find(Produit.class, p.getId()));
		
	}

	@Override
	public Produit getProdiut(int id) {
		
		return em.find(Produit.class, id);
	}

	@Override
	public List<Produit> findAllProduits() {
		
		Query q = em.createQuery("SELECT p FROM Produit p ORDER BY p.id");
		
		return q.getResultList();
	}

}
