/**
 * 
 */
package presentation;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import metier.Personne;

/**
 * @author Stagiaire
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creer un tableau de personnes n'acceptant pas de doublon
		//1.declaration de la collection
		SortedSet<Personne> set = new TreeSet<Personne>(
				new Comparator<Personne>() {
//algo de tri qui doit etre defini au debut
					@Override
					public int compare(Personne o1, Personne o2) {
						if (o1.getNom().equals(o2.getNom()))
						{
							return o1.getPrenom().compareTo(o2.getPrenom());
						}
						else
						{
							return o1.getNom().compareTo(o2.getNom());
						}
					}
		});
		//2.creation des objet personnes
		Personne a = new Personne(1, "toto", "eddy");
		Personne b = new Personne(2, "tutu", "flo");
		Personne c = new Personne(3, "toto", "truc");
		Personne d = new Personne(4, "tata", "bidule");
		Personne e = new Personne(5, "toto", "eddy");
		//3.ajout des personnes a la collection
		
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		//4.parcourir et afficher la collection
		for (Personne p : set)
		{
			
			System.out.println(p);
		}
	}

}
