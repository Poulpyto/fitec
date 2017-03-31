package dao;

import java.util.Collection;

import metier.Client;

public interface IClientDao {
	public void 				ajouterClient(Client c);
	public void					modifierClient(int id, String nom, String prenom);
	public void 				supprimerClient(int id);
	public Collection<Client>	listerClient();
	public Collection<Client>	chercherParMC(String mc);//recherche par mot clef au niveau du nom
	public Client				trouverClient(int id);
	public void					ajouterYeux(String couleur);
}
