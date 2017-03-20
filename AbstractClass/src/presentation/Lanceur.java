package presentation;

import metier.Compte;
import metier.CompteEpargne;
import metier.ComptePayant;
import metier.CompteSimple;

public class Lanceur {

	public static void main(String[] args) {

//		Compte c = new Compte(1, "compte 1", 10000 );
		CompteSimple cs = new CompteSimple(2, "testCompteSimple", 5000, 2000);
		CompteEpargne ce = new CompteEpargne(3, "testEpargne", 1000, 2.1f);
		ComptePayant cp = new ComptePayant(4, "test payant", 10000, (float)0.2);
		
	//	System.out.println(c);
		System.out.println(cs);
		System.out.println(ce);
		System.out.println(cp);
	//	System.out.println(c.getClass());
		System.out.println(cs.getClass());
		System.out.println(ce.getClass());
		System.out.println(cp.getClass());
//		c.verser(10f);
//		System.out.println(c);
//		c.retirer(25f);
//		System.out.println(c);
		cs.retirer(12f);
		System.out.println(cs);
		cs.retirer(99999999f);
		System.out.println(cs);
		cp.verser(10f);
		System.out.println(cp);
		cp.retirer(1111950f);
		System.out.println(cp);
		cp.retirer(50f);
		System.out.println(cp);
		cp.verser(100f);
		System.out.println(cp);
		ce.calculInterets();
		System.out.println(ce);
		System.out.println("nbre de compte -->");
		System.out.println(Compte.getNbcomptes());
	}
}
