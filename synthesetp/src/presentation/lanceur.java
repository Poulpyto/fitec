package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import metier.Compte;
import service.CompteService;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;
/**
 * Classse de demarrage de lapplication
 * @author floM
 * @version 1.0
 *
 */
public class lanceur {
	/**
	 * la methode main est chargée en memoire au demarrage
	 * de lapplication et peut donc etre utilisée avant
	 *  la creation de tout objet
	 * @param args arguments de la methode main
	 */
	public static void main(String[] args) {
			
		int choix = 0;
	//	int	i = 0;
		Scanner clavier = new Scanner(System.in);
	//	CompteService cs = new CompteService();
	//		while (i < 2)
		//	{
				Compte c = new Compte(1, "florent", 10);
				CompteService cs = new CompteService();
				//System.out.println(c);
				//Scanner scan = new Scanner(System.in);
/*				System.out.println("quel est votre id de compte?");
				int nId = scan.nextInt();
				System.out.println("quel est votre nom?");
				scan.nextLine();
				String leNom = scan.nextLine();
				System.out.println("quel est votre solde?");
				long leSolde = scan.nextLong();
				/**
				 * compte créé grace a l'entree standard
				 */
	//			Compte c2 = new Compte(nId, leNom, leSolde);
				/**
				 * affichage
				 */
			
				while (choix != 4)
				{
				System.out.println("choisissez une action de 1 a 4");
				choix = clavier.nextInt();
				switch (choix)
				{
				case 1:
				{
				System.out.println("saisir id compte");
				c.setIdCompte(clavier.nextInt());
				System.out.println("saisir nom de compte");
				c.setNomCompte(clavier.next());
				System.out.println("saisir solde");
				c.setSolde(clavier.nextLong());
				System.out.println(c);
				break;
				}
				case 2:
				{
				System.out.println("saisir montant a crediter");
				cs.ajouter(clavier.nextLong(), c);
				System.out.println(c);
				break;
				}
				case 3:
				{
					try{
				System.out.println("saisir montant a retirer");
					cs.retirer(clavier.nextLong(), c);
				} catch (MontantNegatifException | SoldeInsuffisantException e) {
					System.out.println(e.getMessage());
				}//affiche mon message derreur
				//e.printStackTrace(); // affichage systeme standard
					catch (InputMismatchException e){
						System.out.println("PROBLEME DE SAISIE");
					}
				}
				System.out.println(c);
				break;
				
				case 4:
				{
					System.out.println("fin");
					break;
				}
				default: System.out.println("reessaye on t'as dit 1 a 4!");
				
					}
				//	i++;
		//	}
				clavier.close();
	}
	}
}

