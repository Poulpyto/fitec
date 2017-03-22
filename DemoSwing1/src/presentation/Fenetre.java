/**
 * 
 */
package presentation;

import javax.swing.JFrame;

/**
 * @author Stagiaire
 *
 */
public class Fenetre extends JFrame {

	public Fenetre(String nom) {
		super(nom);
		setSize(800, 600);
	}
	
	
	public static void main(String[] args) {
		
		Fenetre f = new Fenetre("toto va a l'ecole");
		f.setVisible(true);
	}

}
