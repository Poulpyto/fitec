package service;

import metier.Compte;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public class CompteService {
		/*
		 * ajouter de largent sur son compte
		 */
		public long ajouter(long montant, Compte c){
			if (montant >= 0)
				c.setSolde(c.getSolde() + montant);
				
		//stem.out.println(c.getNomCompte() + " a ajouter " + montant + "\nton solde mis a jour: " + newsolde);
			return c.getSolde();
		}
		/*
		 * retirer, 2 cas : soit t'es trop pauvre et tu t'en va, 
		 * soit t'as assez et tu peux retirer
		 */
		public long retirer(long montant, Compte c) throws MontantNegatifException, SoldeInsuffisantException{
			if (montant >= 0)
			{
				if (montant <= c.getSolde())
				{
					c.setSolde(c.getSolde() - montant);
				}
				else
					throw new SoldeInsuffisantException("SOLDE INSUFFISANT");
				//tem.out.println("acces refuser, solde insuffisant");
			}
			else
				throw new MontantNegatifException("MONTANT NEGATIF");
			return c.getSolde();
		}
		/*
		 * connaitre son solde
		 */
		public long solde(Compte c){
			return c.getSolde();		
		}
}
