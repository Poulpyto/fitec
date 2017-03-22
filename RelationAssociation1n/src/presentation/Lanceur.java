package presentation;

import java.util.Collection;

import metier.Personne;
import metier.Voiture;
import service.IService;
import service.Service;

public class Lanceur {

	public static void main(String[] args) {
		//service
		IService service = new Service();
		//personne
		Personne p = new Personne();
		p.setIdPersonne(1);
		p.setNomPersonne("toto");
		p.setPrenomPersonne("bobby");
		//voiture
		Voiture v = new Voiture();
		v.setCouleur("bleu");
		v.setIdVoiture(1);
		v.setMarque("bentley");
		Voiture v2 = new Voiture();
		v2.setCouleur("rouge");
		v2.setIdVoiture(2);
		v2.setMarque("renault");
		
		System.out.println(p);
		
		service.ajouterVoiture(p, v);
		service.ajouterVoiture(p, v2);
		System.out.println(p);
	}

}


