package service;

import java.util.Collection;

import dao.Dao;
import dao.IClientDao;
import metier.Client;

public class ClientService implements IClientService,IClientServiceVip {

	// declarer un attribut dao pour dialoguer avc dao
	private IClientDao idao = new Dao();
	
	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		System.out.println("BONJOUR");

	}

	@Override
	public void direAurevoir() {
		// TODO Auto-generated method stub
		System.out.println("AU REVOIR");
	}

	@Override
	public void jesuisVip() {
		// TODO Auto-generated method stub
		System.out.println("JE SUIS VIP");
	}

	@Override
	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub
		idao.ajouterClient(c);
	}

	@Override
	public void modifierClient(int id, String nom, String prenom) {
		// TODO Auto-generated method stub
		idao.modifierClient(id, nom, prenom);
	}

	@Override
	public void supprimerClient(int id) {
		// TODO Auto-generated method stub
		idao.supprimerClient(id);
	}

	@Override
	public Collection<Client> listerClient() {
		// TODO Auto-generated method stub
		return idao.listerClient();
	}

	@Override
	public Collection<Client> chercherParMC(String mc) {
		// TODO Auto-generated method stub
		return idao.chercherParMC(mc);
	}

	@Override
	public Client trouverClient(int id) {
		// TODO Auto-generated method stub
		return idao.trouverClient(id);
	}

	@Override
	public void ajouterYeux(String couleur) {
		// TODO Auto-generated method stub
		idao.ajouterYeux(couleur);
	}

}
