/**
 * 
 */
package presentation;

import service.ClientService;
import service.ClientServiceVip;
import service.IClientService;
import service.IClientServiceVip;

/**
 * @author Stagiaire
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration de l'interface
		IClientService s = new ClientService();
		//ClientService cs = new ClientService();
		IClientServiceVip cv = new ClientServiceVip();
		//utilisation de l'interface
		s.direBonjour();
		s.direAurevoir();
		//s.jeSuisVip();
		cv.direBonjour();
		cv.direAurevoir();
		cv.jeSuisVip();
	}

}
