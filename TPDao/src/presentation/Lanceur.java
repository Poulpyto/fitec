package presentation;

import java.util.ArrayList;
import java.util.Collection;

import metier.Client;
import service.ClientService;
import service.IClientService;
import service.IClientServiceVip;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// déclaration de l'interface
		IClientService s = new ClientService();
		IClientServiceVip sv = new ClientService();
		Client c = new Client();
		Collection<Client> col = new ArrayList<Client>();
		
		//declaration de la classe;
		//ClientService cs = new ClientService();
		System.out.println("--------------CLIENT NORMAL-------------------------------");		
		// utilisation de l'interface
		s.direAurevoir();
		s.direBonjour();
		//s.jesuisVip();
		System.out.println("--------------CLIENT VIP---------------------------------");
		sv.direBonjour();
		sv.direAurevoir();
		sv.jesuisVip();
		//c.setNom("totiti");
		//c.setPrenom("opmtorin");
		//s.modifierClient(2, "new", "test");
		/*// lister client
		col = s.listerClient();
		for (Client cli : col)
			System.out.println(cli);*/
		//Client client = s.trouverClient(5);
		//System.out.println(client);
		//s.ajouterClient(c);
		//s.supprimerClient(5);
		//utilisation de la classe
		/*cs.direAurevoir();
		cs.direBonjour();
		cs.jesuisVip();*/
		Collection <Client> col2 = s.chercherParMC("o");
		for(Client cli1 : col2)
		{
			System.out.println(cli1);
		}
		s.ajouterYeux("rouge");
	}

}
