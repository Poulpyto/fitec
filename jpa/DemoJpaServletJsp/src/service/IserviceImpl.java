package service;

import java.util.Collection;

import dao.Dao;
import dao.IDao;
import metier.Adresse;
import metier.Contact;

public class IserviceImpl implements Iservice{

	private IDao idao = new Dao();
	
	@Override
	public int ajouterAdresse(Adresse a) {		
		return idao.ajouterAdresse(a);
	}

	@Override
	public int ajouterContactAdresse(Contact c, Adresse a) {
		// TODO Auto-generated method stub
		return idao.ajouterContactAdresse(c, a);
	}

	@Override
	public int modifierAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return idao.modifierAdresse(a);
	}

	@Override
	public Collection<Contact> findAllContacts() {
		// TODO Auto-generated method stub
		return idao.findAllContacts();
	}

	@Override
	public Adresse findAdresse(int id) {
		// TODO Auto-generated method stub
		return idao.findAdresse(id);
	}

	@Override
	public void deleteAdresse(Adresse a) {
		// TODO Auto-generated method stub
		idao.deleteAdresse(a);
	}

	
}
