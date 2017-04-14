package dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import metier.Adresse;
import metier.Contact;

public class Dao implements IDao{
	//1. ouverture de l'unit� de persistance
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu") ;

	@Override
	public int ajouterAdresse(Adresse a) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(a);
		tx.commit();
		em.close();
		return a.getId();
	}

	@Override
	public int ajouterContactAdresse(Contact c, Adresse a) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		c.setAdresse(a);
		em.persist(c);
		tx.commit();
		em.close();
		return a.getId();
	}

	@Override
	public int modifierAdresse(Adresse a) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();		
		em.merge(a);
		tx.commit();
		em.close();
		return a.getId();
	}

	@Override
	public Collection<Contact> findAllContacts() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query q4 = em.createNamedQuery("Contact.findAll");
		List <Contact> lst = q4.getResultList();
		tx.commit();
		em.close();
		return lst;
	}

	@Override
	public Adresse findAdresse(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Adresse a = em.find(Adresse.class, id);		
		tx.commit();
		em.close();
		return a;
	}

	@Override
	public void deleteAdresse(Adresse a) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(a);	
		tx.commit();
		em.close();
	}}
