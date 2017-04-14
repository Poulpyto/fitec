package presentation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Adresse;
import metier.Contact;
import metier.Film;
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
		Contact c = new Contact();
		c.setNom("durand");
		c.setPrenom("paul");
		c.setEmail("mey@youpiland.org");
		c.setAdresse(s); //lobjet doit etre sauver en base avant detre utilisé 
		//grace a cascade.persist
		LongMetrage lm = new LongMetrage();
		lm.setNomFilm("film1");
		lm.setCinema("pathé");
		Telefilm tf = new Telefilm();
		tf.setChaine("tf1");
		tf.setNomFilm("josephine");
		Set<Film> films = new HashSet<Film>();
		films.add(tf);
		films.add(lm);
		c.setFilms(films);
		Telefilm tf2 = new Telefilm();
		tf2.setChaine("fr3");
		tf2.setNomFilm("Mickey");
		
		
		//4: Persistence de l'objet metier
		//em.persist(c);
		//em.persist(lm);
		//em.persist(tf);
		em.persist(c);
		em.persist(tf2);
		//em.persist(s);
		//c.setAdresse(s);
		//5: validation de la transaction
		tx.commit();
		// recuper le film ayant pour valeur d'id 1
		Film f = em.find(Film.class, 3);
		System.out.println(f);
		//modifier le film ayant pour id 3 , le find dau dessus est obligatoire 
		//pour specifier le champ a modifier
		f.setNomFilm("film modifié");
		tx.begin();
		em.merge(f);
		tx.commit();
		//suppression du film aynt 1 pour id 3
		
		/*tx.begin();
		em.remove(tf2);
		tx.commit();*/
		//rechercher tot les film en bdd
		
		List<Film> listeFilm = em.createQuery("SELECT f from Film f").getResultList();
		for (Film fl : listeFilm)		
			System.out.println(fl);
		// recherche les films par nom de film
		Query q = em.createQuery("SELECT f from Film f where f.nomFilm = :leNom");
		q.setParameter("leNom", "film1");
		List<Film> listeFilm2 = q.getResultList();
		for (Film fl : listeFilm2)		
			System.out.println(fl);
		//chercher tout les films qui contiennent une lettre ou un mot
		Query q2 = em.createQuery("SELECT f from Film f where f.nomFilm LIKE :leNom2");
		q2.setParameter("leNom2", "%film%");
		List<Film> listeFilm3 = q2.getResultList();
		for (Film fl : listeFilm3)		
			System.out.println(fl);
		//exemple de getsingleresult
		Film f5 = (Film) em.createQuery("SELECT f FROM Film f where f.idFilm = 1").getSingleResult();
		System.out.println(f5);
		//exemple de jointure entre contact et adresse
		Query q3 = em.createQuery("SELECT c FROM Contact c LEFT JOIN c.adresse");
		List<Contact> listeC = q3.getResultList();
		for (Contact c2 : listeC)
			System.out.println(c2);
		// appel dune requete nommée
		Query q4 = em.createNamedQuery("Contact.findAll");
		List <Contact> lst = q4.getResultList();
		for (Contact ct: lst)
			System.out.println(ct);
		Query q5 = em.createNamedQuery("Adresse.findAll");
		List <Adresse> lst2 = q5.getResultList();
		for (Adresse ss : lst2)
			System.out.println(ss);
		Query q6 = em.createNamedQuery("Adresse.matchWord");
		q6.setParameter("rue", "%na%");
		List <Adresse> lst3 = q6.getResultList();
		for (Adresse sss : lst3){
			System.out.println("coucou");
			System.out.println(sss);
		}
		//6: fermeture de l'unité persistance
		em.close();
		emf.close();
		
	}

}
