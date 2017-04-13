package presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Adresse;
import metier.Contact;
import metier.LongMetrage;
import metier.Telefilm;

public class Lanceur {

	public static void main(String[] args) {
		// 1: ouverture de l'unité de persistence
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// 2:ouverture de la transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//3: creatin objet metier
		Adresse s = new Adresse();
		s.setVille("lyon");
		s.setNumRue("120 rue massena");
		s.setCodePostal("69006");
		//Contact c = new Contact();
		//c.setNom("durand");
		//c.setPrenom("paul");
		//c.setEmail("mey@youpiland.org");
		//c.setAdresse(s); //lobjet doit etre sauver en base avant detre utilisé grace a cascade.persist
		LongMetrage lm = new LongMetrage();
		lm.setNomFilm("film1");
		lm.setCinema("pathé");
		Telefilm tf = new Telefilm();
		tf.setChaine("tf1");
		tf.setNomFilm("josephine");
		//4: Persistence de l'objet metier
		//em.persist(c);
		em.persist(lm);
		em.persist(tf);
		//em.persist(s);
		//c.setAdresse(s);
		//5: validation de la transaction
		tx.commit();
		
		//6: fermeture de l'unité persistance
		em.close();
		emf.close();
		
	}

}
