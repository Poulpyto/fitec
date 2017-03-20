/**
 * 
 */
package service;

/**
 * @author Stagiaire
 *
 */
public class ClientService implements IClientService {

	/* (non-Javadoc)
	 * @see service.IClientService#direBonjour()
	 */
	@Override
	public void direBonjour() {
		System.out.println("Bonjour");

	}

	/* (non-Javadoc)
	 * @see service.IClientService#direAurevoir()
	 */
	@Override
	public void direAurevoir() {
		System.out.println("Au revoir");

	}

	/* (non-Javadoc)
	 * @see service.IClientService#jeSuisVip()
	 */
	/*@Override
	public void jeSuisVip() {
		System.out.println("Je suis VIP");

	}*/

}
