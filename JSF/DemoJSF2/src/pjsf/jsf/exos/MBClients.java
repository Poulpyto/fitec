package pjsf.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mbclients", eager= true)
@SessionScoped
public class MBClients {
	ArrayList<Client> clients = new ArrayList<Client>();
	private Client clientCourant;
	
	
	
	public Client getClientCourant() {
		return clientCourant;
	}

	public void setClientCourant(Client clientCourant) {
		this.clientCourant = clientCourant;
	}

	public MBClients(){
		System.out.println("Constructeur MBClients");
		clients.add(new Client("marin", "florent"));
		clients.add(new Client("marin", "toto"));
	}

	public ArrayList<Client> getClients() {
		System.out.println("getter mbclients");
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	public String select(Client client){
		this.clientCourant= client;
		System.out.println("select: "+client.getPrenom());
		return "client";
	}
	public String delete()
	{
		System.out.println("client supprimer: "+clientCourant.getNom());
		clients.remove(clientCourant);
		return "clients";
	}
	private String nom;
	private String prenom;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String add(String nom, String prenom)
	{
		Client newClient = new Client(nom, prenom);
		System.out.println("client ajouter: "+ newClient.getNom());
		clients.add(newClient);
		return "clients";
	}
	
}
	