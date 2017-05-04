package presentation;

import java.util.List;

import webservice.BanqueService;
import webservice.BanqueWS;
import webservice.Compte;

public class Lanceur {

	public static void main(String[] args) {
		
		BanqueService banqueservice = new BanqueWS().getBanqueServicePort();
		System.out.println("CONVERSION");
		System.out.println(banqueservice.conversionED(100));
		System.out.println("CONSULTER 1 COMPTE");
		Compte c = banqueservice.getonecompte(3);
		System.out.println(c);
		System.out.println("LISTE COMPTE");
		List<Compte> l = banqueservice.getallcompte();
		for (Compte cp : l)
			System.out.println(cp);
	}

}
