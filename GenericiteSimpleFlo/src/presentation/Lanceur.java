package presentation;

import metier.Paire;
import metier.PaireGenerique;

public class Lanceur {

	public static void main(String[] args) {
		
		// Exemple sans g�n�ricit�
		Paire p1 = new Paire("abc", "xyz");
		String x = (String) p1.getPremier();
		//Double y = (Double) p1.getSecond();	// => erreur non d�tect�e � la compilation
												// mais execution g�n�re une ClassCastException
												// Limites du Casting =====> solution = g�n�ricit� :) !
		
		System.out.println("x = " + x);
		//System.out.println("y =" + y);
		
		// Exemple avec g�n�ricit�
		PaireGenerique<String> p2 = new PaireGenerique<>("xyz", "abc");
		String a = p2.getPremier();
		//Double b = p2.getSecond(); 			// Erreur � la compilation
												// Type mismatch: cannot convert from String to Double
		String b = p2.getSecond();
		System.out.println(p2);
		
		PaireGenerique<Integer> p3 = new PaireGenerique<Integer>(12, 30);
		System.out.println(p3);
	}
}