package service;


import java.util.ArrayList;
import java.util.Collection;

import metier.Personne;
import metier.Voiture;

public class Service implements IService {

	@Override
	public void ajouterVoiture(Personne p, Voiture v) {
		Collection <Voiture> col = p.getMesVoitures();
		col.add(v);
		p.setMesVoitures(col);
		v.setProprietaire(p);
		
	}

	@Override
	public Collection<Voiture> afficheVoiture(Personne p) {
		return p.getMesVoitures();
	}

}
