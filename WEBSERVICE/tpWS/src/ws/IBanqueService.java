package ws;

import java.util.List;

import metier.Compte;

public interface IBanqueService {

	public double conversionEuroDollar(double montant);
	public Compte setCompte(int code);
	public List<Compte> getComptes();	
}
